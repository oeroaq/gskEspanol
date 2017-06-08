from simplexVisitor import simplexVisitor
from simplexParser import simplexParser
from cvxopt.modeling import *
from cvxopt import solvers
import math


class simplexExpand(simplexVisitor):
    def __init__(self):
        self.memory = {}
        self.FuncionObjetivoNombre = None
        self.FuncionObjetivoMAXI = None
        self.FuncionObjetivo = {}
        self.defFunObjetivo = None

    def resetSelf(self):
        self.FuncionObjetivoNombre = None
        self.FuncionObjetivoMAXI = None
        self.FuncionObjetivo = {}

    def visitImprimirExpr(self, ctx):
        valor = self.visit(ctx.expresion())
        print(valor)
        return 0

    def visitIdentificadores(self, ctx):
        nombre = ctx.identificador().getText()
        if nombre in self.memory:
            return self.memory[nombre]
        print("Error:\n\tLa variable '%s' no esta definida" % nombre)
        return None

    def visitAsignar(self, ctx):
        nombre = ctx.identificador().getText()
        valor = self.visit(ctx.expMAT())
        if valor:
            self.memory[nombre] = valor
            return valor
        print("\tNo se pudo inicializar la variable '%s'." % nombre)

    def visitNumeros(self, ctx):
        return int(ctx.entero().getText())

    def visitDecimales(self, ctx):
        return float(ctx.decimal().getText())

    def visitOperMult(self, ctx):
        izquierda = self.visit(ctx.expMAT(0))
        derecha = self.visit(ctx.expMAT(1))
        if derecha and izquierda:
            if ctx.operador.type == simplexParser.MULT:
                return izquierda * derecha
            if derecha != 0 and str(derecha) != "0":
                return izquierda / derecha
        print("Error:\n\tLa evaluacion de la expresion: '%s/%s' no se puede calcular." %
              (ctx.expMAT(0).getText(), ctx.expMAT(1).getText()))
        return None

    def visitOperSuma(self, ctx):
        izquierda = self.visit(ctx.expMAT(0))
        derecha = self.visit(ctx.expMAT(1))
        if derecha and izquierda:
            if ctx.operador.type == simplexParser.MAS:
                return izquierda + derecha
            return izquierda - derecha
        return None

    def visitOperPotencia(self, ctx):
        izquierda = self.visit(ctx.expMAT(0))
        derecha = self.visit(ctx.expMAT(1))
        if derecha and izquierda:
            return izquierda ** derecha
        return None

    def visitOperMatematicaParentesis(self, ctx):
        return self.visit(ctx.expMAT())

    def visitMenosExpMAT(self, ctx):
        numero = self.visit(ctx.expMAT())
        if numero or numero == 0:
            return -numero
        return numero

    def visitVariables(self, ctx):
        return ctx.getText()

    def visitTrigonometricas(self, ctx):
        return self.visit(ctx.trigonometrica())

    def visitSenos(self, ctx):
        numero = self.visit(ctx.expMAT())
        return math.sin(numero)

    def visitCosenos(self, ctx):
        numero = self.visit(ctx.expMAT())
        return math.cos(numero)

    def visitTangentes(self, ctx):
        numero = self.visit(ctx.expMAT())
        return math.tan(numero)

    def visitEulerianos(self, ctx):
        numero = self.visit(ctx.expMAT())
        return math.exp(numero)

    def visitLogaritmos(self, ctx):
        numero = self.visit(ctx.expMAT())
        return math.log(numero)

    def visitNumeroMonomio(self, ctx):
        coeficiente = self.visit(ctx.expMAT())
        if coeficiente:
            return coeficiente, "0C"
        return coeficiente, None

    def visitExpresionMatematica(self, ctx):
        return self.visit(ctx.expMAT())

    def visitNumerosPol(self, ctx):
        return int(ctx.entero().getText())

    def visitDecimalesPol(self, ctx):
        return float(ctx.decimal().getText())

    def visitNoNumero(self, ctx):
        return 1

    def visitProblemasExpresados(self, ctx):
        self.visit(ctx.multiobjetivo())

    def resolverSimplex(self, funcionObjetivo):
        solvers.options['show_progress'] = False
        lp = op(self.FuncionObjetivo[funcionObjetivo]["FuncionObjetivo"],
                self.FuncionObjetivo[funcionObjetivo]["Resticciones"])
        lp.solve()
        return lp

    def visitMultiObjetivos(self, ctx):
        if ctx.operacion.type == simplexParser.MAXI:
            self.FuncionObjetivoMAXI = "MAXI"
        for problema in ctx.problema():
            self.FuncionObjetivoNombre = self.visit(problema)
            if self.FuncionObjetivoNombre:
                self.FuncionObjetivo[self.FuncionObjetivoNombre]["Solucion"] = self.resolverSimplex(
                    self.FuncionObjetivoNombre)
                self.FuncionObjetivoNombre = None
        self.visit(ctx.resolver())

    def visitResolverProblemas(self, ctx):
        funciones = list(self.FuncionObjetivo.keys())
        if len(funciones) == 1:
            print("----------------------------------------------------------------------------------------")
            print("------------------------------------MODELO UNICO----------------------------------------")
            print("----------------------------------------------------------------------------------------\n")
            self.FuncionObjetivoNombre = funciones[0]
            if self.FuncionObjetivo[self.FuncionObjetivoNombre]["Solucion"].status == "optimal":
                print("\nLa solucion que se ha encontrado es optima")
            zz = 0
            if self.FuncionObjetivoMAXI:
                zz = - \
                    self.FuncionObjetivo[self.FuncionObjetivoNombre]["Solucion"].objective.value()[
                        0]
            else:
                zz = self.FuncionObjetivo[self.FuncionObjetivoNombre]["Solucion"].objective.value()[
                    0]
            print("La funcion objetivo %s tiene un valor de %.2f" %
                  (self.FuncionObjetivoNombre, zz))
            self.memory[self.FuncionObjetivoNombre] = zz
            for var in self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"]:
                print("La variable %s tiene un valor de  %.2f" % (
                    var, self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"][var].value[0]))
                self.memory[var] = self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"][var].value[0]
            print("----------------------------------------------------------------------------------------\n")

        else:
            print("----------------------------------------------------------------------------------------")
            print("------------------------------MULTIPLES MODELOS-----------------------------------------")
            print("----------------------------------------------------------------------------------------\n")
            soluciones = {}
            for funcion in funciones:
                soluciones[funcion] = {}
                zz = 0
                if self.FuncionObjetivoMAXI:
                    zz = - \
                        self.FuncionObjetivo[funcion]["Solucion"].objective.value()[
                            0]
                else:
                    zz = self.FuncionObjetivo[funcion]["Solucion"].objective.value()[
                        0]
                soluciones[funcion]["Z"] = zz   
                soluciones[funcion]["EC"] = self.FuncionObjetivo[funcion]["Funcion"]
                soluciones[funcion]["V"] = {}
                for var in self.FuncionObjetivo[funcion]["Variables"]:
                    soluciones[funcion]["V"][var] = self.FuncionObjetivo[funcion]["Variables"][var].value[0]
                soluciones[funcion]["V"]["0C"] = 1
            pareto = []
            hiper = {}
            for funcion in funciones:
                hiper[funcion] = {}
                for fun in funciones:
                    hiper[funcion]["0S" + fun] = self.evaluar(
                        soluciones[funcion]["EC"], soluciones[fun]["V"])
            for f in funciones:
                meig = True
                for funcion in hiper:
                    mi = True
                    m = False
                    for fun in hiper[funcion]:
                        if self.FuncionObjetivoMAXI:
                            mi = mi and (hiper[f][fun] >= hiper[funcion][fun])
                            m = m or (hiper[f][fun] > hiper[funcion][fun])
                        else:
                            mi = mi and (hiper[f][fun] <= hiper[funcion][fun])
                            m = m or (hiper[f][fun] < hiper[funcion][fun])
                    meig = meig and mi
                if meig and m:
                    pareto.append(f)
            print("La optimizacion esta dada por la funcion:")
            for fun in pareto:
                print("\t'%s' = %.2f con las variables:" %
                      (fun, soluciones[fun]["Z"]))
                for var in soluciones[fun]["V"]:
                    if var != '0C':
                        print("\t\t'%s' = %.2f" % (var, soluciones[fun]["V"][var]))
            if self.FuncionObjetivoMAXI:
                print("\tcuya solucion maximiza a todas las funciones objetivo.")
            else:
                print("\tcuya solucion minimiza a todas las funciones objetivo.")
            print("----------------------------------------------------------------------------------------\n")
        self.FuncionObjetivoNombre = None
        self.FuncionObjetivo = {}

    def evaluar(self, funcion, parametros):
        resultado = 0
        for variable in parametros:
            if variable in funcion:
                resultado += funcion[variable] * parametros[variable]
        return resultado

    def visitProblemas(self, ctx):
        self.FuncionObjetivoNombre = self.visit(ctx.funcionTrans())
        if self.FuncionObjetivoNombre:
            self.FuncionObjetivo[self.FuncionObjetivoNombre]["Resticciones"] = [
            ]
            restriccion = self.visit(ctx.restriccion())
            if restriccion:
                self.FuncionObjetivo[self.FuncionObjetivoNombre]["Resticciones"] = restriccion
            restriccion = self.visit(ctx.restricionVariable())
            if restriccion:
                self.FuncionObjetivo[self.FuncionObjetivoNombre]["Resticciones"] += restriccion
            return self.FuncionObjetivoNombre
        return None

    '''
        Define el arbol para la definicion de las restricciones
    '''

    def visitRestriccionesVariables(self, ctx):
        Restricciones = []
        for noigualdad in ctx.desigualdadVariable():
            restriccion = self.visit(noigualdad)
            if restriccion:
                Restricciones.append(restriccion)
            else:
                self.resetSelf()
                return None
        return Restricciones

    def visitDesigualdadesVariables(self, ctx):
        var = self.visit(ctx.variable())
        if var in self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"]:
            numero = self.visit(ctx.expMAT())
            if numero or numero == 0:
                return self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"][var] == numero
            else:
                print("\tEn la condicion %s." % (ctx.getText()))
                return None
        return None

    def visitDesigualdadesVariablesMayorIgual(self, ctx):
        var = self.visit(ctx.variable())
        if var in self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"]:
            numero = self.visit(ctx.expMAT())
            if numero or numero == 0:
                restriccion = self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"][var] >= numero
                return restriccion
            else:
                print("\tEn la condicion %s." % (ctx.getText()))
                return None
        return None

    def visitDesigualdadesVariablesMenorIgual(self, ctx):
        var = self.visit(ctx.variable())
        if var in self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"]:
            numero = self.visit(ctx.expMAT())
            if numero or numero == 0:
                return self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"][var] <= numero
            else:
                print("\tEn la condicion %s." % (ctx.getText()))
                return None
        return None

    def visitRestricciones(self, ctx):
        Restricciones = []
        for noigualdad in ctx.desigualdad():
            restriccion = self.visit(noigualdad)
            if restriccion:
                Restricciones.append(restriccion)
            else:
                self.resetSelf()
                return None
        return Restricciones

    def visitDesigualdades(self, ctx):
        restriccion = self.visit(ctx.polinomio())
        if restriccion or restriccion == 0:
            numero = self.visit(ctx.expMAT())
            if numero or numero == 0:
                return restriccion == numero
            else:
                print("\tEn la restriccion %s." % (ctx.getText()))
                return None
        return restriccion

    def visitDesigualdadesMayorIgual(self, ctx):
        restriccion = self.visit(ctx.polinomio())
        if restriccion or restriccion == 0:
            numero = self.visit(ctx.expMAT())
            if numero or numero == 0:
                if self.FuncionObjetivoMAXI:
                    return (-restriccion) <= numero
                return restriccion >= numero
            else:
                print("\tEn la restriccion %s." % (ctx.getText()))
                return None
        return restriccion

    def visitDesigualdadesMenorIgual(self, ctx):
        restriccion = self.visit(ctx.polinomio())
        if restriccion or restriccion == 0:
            numero = self.visit(ctx.expMAT())
            if numero or numero == 0:
                return restriccion <= numero
            else:
                print("\tEn la restriccion %s." % (ctx.getText()))
                return None
        return restriccion

    '''
        Define el arbol para la definicion de la funion a maximizar o minimizar
    '''

    def visitFuncionTransf(self, ctx):
        FObjetivo = self.visit(ctx.funcion())
        if FObjetivo:
            if self.FuncionObjetivoMAXI:
                self.FuncionObjetivo[self.FuncionObjetivoNombre]["FuncionObjetivo"] = -FObjetivo
            else:
                self.FuncionObjetivo[self.FuncionObjetivoNombre]["FuncionObjetivo"] = FObjetivo
            return self.FuncionObjetivoNombre
        self.resetSelf()
        return None

    def visitFunciones(self, ctx):
        self.visit(ctx.funcionDef())
        self.defFunObjetivo = True
        polinomio = self.visit(ctx.polinomio())
        if polinomio or polinomio == 0:
            self.defFunObjetivo = None
            return polinomio
        print("\tEn la declaracion de la funcion.")
        return None

    def visitDefinirFuncion(self, ctx):
        self.FuncionObjetivoNombre = self.visit(ctx.nombrefuncion())
        if self.FuncionObjetivoNombre:
            if self.FuncionObjetivoNombre in self.FuncionObjetivo:
                print("Advertencia:\n\tLa funcion '%s' ya se habia definido anteriormente, se sobreescribe.\n" %
                      self.FuncionObjetivoNombre)
            self.FuncionObjetivo[self.FuncionObjetivoNombre] = {}
            self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"] = {}
            for var in ctx.variable():
                v = self.visit(var)
                self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"][v] = variable(
                    1, v)
            return self.FuncionObjetivoNombre
        return None

    def visitPolinomios(self, ctx):
        c, v = self.visit(ctx.monomio())
        if c and v:
            if self.defFunObjetivo:
                self.FuncionObjetivo[self.FuncionObjetivoNombre]["Funcion"] = {
                }
                self.FuncionObjetivo[self.FuncionObjetivoNombre]["Funcion"][v] = c
            if v in self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"]:
                polinomio = c * \
                    self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"][v]
            elif v == "0C":
                polinomio = c
            else:
                return None
            for monomio in ctx.monomioAdd():
                c, v = self.visit(monomio)
                if c and v:
                    if self.defFunObjetivo:
                        if v in self.FuncionObjetivo[self.FuncionObjetivoNombre]["Funcion"]:
                            self.FuncionObjetivo[self.FuncionObjetivoNombre]["Funcion"][v] += c
                        else:
                            self.FuncionObjetivo[self.FuncionObjetivoNombre]["Funcion"][v] = c
                    if v in self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"]:
                        polinomio += c * \
                            self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"][v]
                    elif v == "0C":
                        polinomio += c
                    else:
                        return None
                else:
                    return None
            return polinomio
        return None

    def visitMonPolinomios(self, ctx):
        c, v = self.visit(ctx.monomio())
        if c and v:
            if self.defFunObjetivo:
                self.FuncionObjetivo[self.FuncionObjetivoNombre]["Funcion"] = {
                }
                self.FuncionObjetivo[self.FuncionObjetivoNombre]["Funcion"][v] = c
            if v in self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"]:
                return c * self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"][v]
            elif v == "0C":
                return c
        return None

    def visitMenosPolinomios(self, ctx):
        c, v = self.visit(ctx.monomio())
        if c and v:
            if self.defFunObjetivo:
                self.FuncionObjetivo[self.FuncionObjetivoNombre]["Funcion"] = {
                }
                self.FuncionObjetivo[self.FuncionObjetivoNombre]["Funcion"][v] = -c
            if v in self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"]:
                polinomio = -c * \
                    self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"][v]
            elif v == "0C":
                polinomio = -c
            else:
                return None
            for monomio in ctx.monomioAdd():
                c, v = self.visit(monomio)
                if c and v:
                    if self.defFunObjetivo:
                        if v in self.FuncionObjetivo[self.FuncionObjetivoNombre]["Funcion"]:
                            self.FuncionObjetivo[self.FuncionObjetivoNombre]["Funcion"][v] += c
                        else:
                            self.FuncionObjetivo[self.FuncionObjetivoNombre]["Funcion"][v] = c
                    if v in self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"]:
                        polinomio += c * \
                            self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"][v]
                    elif v == "0C":
                        polinomio += c
                    else:
                        return None
                else:
                    return None
            return polinomio
        return None

    def visitMenosMonPolinomios(self, ctx):
        c, v = self.visit(ctx.monomio())
        if c and v:
            if self.defFunObjetivo:
                self.FuncionObjetivo[self.FuncionObjetivoNombre]["Funcion"] = {
                }
                self.FuncionObjetivo[self.FuncionObjetivoNombre]["Funcion"][v] = -c
            if v in self.FuncionObjetivo[self.FuncionObjetivoNombre]["Variables"]:
                return -c
            elif v == "0C":
                return -c
        return None

    def visitMonomioMinimo(self, ctx):
        coeficiente = self.visit(ctx.numero())
        variable = ctx.variable().getText()
        if variable and coeficiente:
            return coeficiente, variable
        return None, None

    def visitMenosMonomio(self, ctx):
        coeficiente, variable = self.visit(ctx.monomio())
        if variable and coeficiente:
            return -coeficiente, variable
        return None, None

    def visitMasMonomio(self, ctx):
        return self.visit(ctx.monomio())
