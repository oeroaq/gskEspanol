from simplexVisitor import simplexVisitor
from simplexParser import simplexParser
from cvxopt.modeling import *
from cvxopt import solvers
import math


class simplexExpand(simplexVisitor):
    def __init__(self):
        self.memory = {}
        self.VariablesFuncionesFunciones = {}
        self.FuncionObjetivoContador = 0
        self.FuncionObjetivo = {}
        self.OperacionMaxMin = None
        self.Restricciones = []

    def resetSelf(self):
        self.VariablesFunciones = {}
        self.FuncionObjetivoContador = 0
        self.FuncionObjetivo = {}
        self.OperacionMaxMin = None
        self.Restricciones = []

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
        if self.visit(ctx.problema()):
            self.resolverSimplex()

    def resolverSimplex(self):
        solvers.options['show_progress'] = False
        lp = op(self.FuncionObjetivo[0], self.Restricciones)
        lp.solve()
        if lp.status == "optimal":
            print("\nLa solucion que se ha encontrado es optima")
        zz = 0
        if self.OperacionMaxMin == simplexParser.MAXI:
            zz = -lp.objective.value()[0]
        else:
            zz = lp.objective.value()[0]
        print("La funcion objetivo tiene un valor de %.2f"%zz)
        for var in self.VariablesFunciones:
            print("La variable %s tiene un valor de  %.2f" %(var,self.VariablesFunciones[var].value[0]))

    def visitProblemas(self, ctx):
        for FuncionObjetivo in ctx.funcionTrans():
            if not self.visit(FuncionObjetivo):
                return None
        if self.visit(ctx.restriccion()):
            if self.visit(ctx.restricionVariable()):
                return 1
        return None

    '''
        Define el arbol para la definicion de las restricciones
    '''

    def visitRestriccionesVariables(self, ctx):
        for noigualdad in ctx.desigualdadVariable():
            restriccion = self.visit(noigualdad)
            if restriccion:
                self.Restricciones.append(restriccion)
            else:
                self.resetSelf()
                return None
        return 1

    def visitDesigualdadesVariables(self, ctx):
        var = self.visit(ctx.variable())
        if var in self.VariablesFunciones:
            numero = self.visit(ctx.expMAT())
            if numero or numero == 0:
                return self.VariablesFunciones[var] == numero
            else:
                print("\tEn la condicion %s." % (ctx.getText()))
                return None
        return None

    def visitDesigualdadesVariablesMayorIgual(self, ctx):
        var = self.visit(ctx.variable())
        if var in self.VariablesFunciones:
            numero = self.visit(ctx.expMAT())
            if numero or numero == 0:
                restriccion = self.VariablesFunciones[var] >= numero
                return restriccion
            else:
                print("\tEn la condicion %s." % (ctx.getText()))
                return None
        return None

    def visitDesigualdadesVariablesMenorIgual(self, ctx):
        var = self.visit(ctx.variable())
        if var in self.VariablesFunciones:
            numero = self.visit(ctx.expMAT())
            if numero or numero == 0:
                return self.VariablesFunciones[var] <= numero
            else:
                print("\tEn la condicion %s." % (ctx.getText()))
                return None
        return None

    def visitRestricciones(self, ctx):
        for noigualdad in ctx.desigualdad():
            restriccion = self.visit(noigualdad)
            if restriccion:
                self.Restricciones.append(restriccion)
            else:
                self.resetSelf()
                return None
        return 1

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
                if self.OperacionMaxMin == simplexParser.MAXI:
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
            self.OperacionMaxMin = ctx.operacion.type
            if self.OperacionMaxMin == simplexParser.MAXI:
                self.FuncionObjetivo[self.FuncionObjetivoContador] = -FObjetivo
            else:
                self.FuncionObjetivo[self.FuncionObjetivoContador] = FObjetivo
            self.FuncionObjetivoContador += 1
            return 1
        self.resetSelf()
        return None

    def visitFunciones(self, ctx):
        self.visit(ctx.funcionDef())
        polinomio = self.visit(ctx.polinomio())
        if polinomio or polinomio == 0:
            return polinomio
        print("\tEn la declaracion de la funcion a maximizar.")
        return None

    def visitDefinirFuncion(self, ctx):
        self.resetSelf()
        for var in ctx.variable():
            v = self.visit(var)
            self.VariablesFunciones[v] = variable(1, v)
        return 0

    def visitPolinomios(self, ctx):
        c, v = self.visit(ctx.monomio())
        if c and v:
            if v in self.VariablesFunciones:
                polinomio = c * self.VariablesFunciones[v]
            elif v == "0C":
                polinomio = c
            else:
                return None
            for monomio in ctx.monomioAdd():
                c, v = self.visit(monomio)
                if c and v:
                    if v in self.VariablesFunciones:
                        polinomio += c * self.VariablesFunciones[v]
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
            if v in self.VariablesFunciones:
                return c * self.VariablesFunciones[v]
            elif v == "0C":
                return c
        return None

    def visitMenosPolinomios(self, ctx):
        c, v = self.visit(ctx.monomio())
        if c and v:
            if v in self.VariablesFunciones:
                polinomio = -c * self.VariablesFunciones[v]
            elif v == "0C":
                polinomio = -c
            else:
                return None
            for monomio in ctx.monomioAdd():
                c, v = self.visit(monomio)
                if c and v:
                    if v in self.VariablesFunciones:
                        polinomio += c * self.VariablesFunciones[v]
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
            if v in self.VariablesFunciones:
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
