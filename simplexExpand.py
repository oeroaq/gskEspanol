from simplexVisitor import simplexVisitor
from simplexParser import simplexParser


class simplexExpand(simplexVisitor):
    def __init__(self):
        self.memory = {}
        self.RCount = 0
        self.R = {}
        self.X = {}
        self.O = None

    def resetSelf(self):
        self.memory = {}
        self.RCount = 0
        self.R = {}
        self.X = {}
        self.O = None

    def visitImprimirExpr(self, ctx):
        valor = self.visit(ctx.expresion())
        print(valor)
        return 0

    def visitIdentificadores(self, ctx):
        nombre = ctx.identificador().getText()
        if nombre in self.memory:
            return self.memory[nombre]
        return None

    def visitAsignar(self, ctx):
        nombre = ctx.identificador().getText()
        valor = self.visit(ctx.expMAT())
        self.memory[nombre] = valor
        return valor

    def visitNumeros(self, ctx):
        return int(ctx.entero().getText())

    def visitDecimales(self, ctx):
        return float(ctx.decimal().getText())

    def visitOperMult(self, ctx):
        izquierda = self.visit(ctx.expMAT(0))
        derecha = self.visit(ctx.expMAT(1))
        if ctx.operador.type == simplexParser.MULT:
            return izquierda * derecha
        if derecha != 0:
            return izquierda / derecha
        else:
            var = ctx.expMAT(1).getText()
            mensaje = ""
            if str(var) == "0":
                mensaje = "No se puede dividir por cero."
            else:
                mensaje = "La evaluacion de la expresion o variable '%s' no puede ser cero." % var
            print("Error Division por cero: \n\t%s" % mensaje)

    def visitOperSuma(self, ctx):
        izquierda = self.visit(ctx.expMAT(0))
        derecha = self.visit(ctx.expMAT(1))
        if ctx.operador.type == simplexParser.MAS:
            return izquierda + derecha
        return izquierda - derecha

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
        if numero:
            return -numero
        return numero

    def visitNumeroMonomio(self, ctx):
        coeficiente = self.visit(ctx.expMAT())
        if coeficiente:
            return coeficiente, "COEF1"
        return None

    def visitMonomioMinimo(self, ctx):
        coeficiente = self.visit(ctx.e)
        variable = ctx.variable().getText()
        return coeficiente, variable

    def visitMenosMonomio(self, ctx):
        coeficiente, variable = self.visit(ctx.monomio())
        return -coeficiente, variable

    def visitExpFuncion(self, ctx):
        print(ctx.getText())
        return self.visit(ctx.funcion())

    def visitExpresionMatematica(self, ctx):
        return self.visit(ctx.expMAT())

    def visitNumerosPol(self, ctx):
        return int(ctx.entero().getText())

    def visitDecimalesPol(self, ctx):
        return float(ctx.decimal().getText())

    def visitNoNumero(self, ctx):
        return 1

    def visitPolinomios(self, ctx):
        c, v = self.visit(ctx.monomio())
        polinomio = {v: c}
        for monomio in ctx.monomioAdd():
            c, v = self.visit(monomio)
            if v in polinomio:
                polinomio[v] += c
            else:
                polinomio[v] = c
        return polinomio

    def visitMonPolinomios(self, ctx):
        c, v = self.visit(ctx.monomio())
        return {v: c}

    def visitProblemasExpresados(self, ctx):
        self.visit(ctx.problema())

    def visitProblemas(self, ctx):
        if self.visit(ctx.funcionTrans()) != -1:
            if self.visit(ctx.restriccion()) != -1:
                print(self.X)
                print(self.R)
        return -1

    '''
        Define el arbol para la definicion de las restricciones
    '''

    def visitRestricciones(self, ctx):
        for noigualdad in ctx.desigualdad():
            restriccion = self.visit(noigualdad)
            if restriccion != -1:
                variable = "0X" + str(self.RCount)
                self.X[variable] = 0
                self.R["0R" + str(self.RCount)] = restriccion
                self.RCount += 1
                numero = self.visit(ctx.expMAT())
            else:
                self.resetSelf()
                return -1
        return 0

    def visitDesigualdades(self, ctx):
        restriccion = self.polinomioRestriccion(ctx)
        if restriccion != -1:
            variable = "0X" + str(self.RCount)
            if ctx.tipo.type == simplexParser.MAYOR:
                restriccion[variable] = -1
            elif ctx.tipo.type == simplexParser.MENOR:
                restriccion[variable] = 1
            else:
                restriccion[variable] = 0
        return restriccion

    def visitDesigualdadesMayorIgual(self, ctx):
        restriccion = self.polinomioRestriccion(ctx)
        if restriccion != -1:
            variable = "0X" + str(self.RCount)
            restriccion[variable] = -1
        return restriccion

    def visitDesigualdadesMenorIgual(self, ctx):
        restriccion = self.polinomioRestriccion(ctx)
        if restriccion != -1:
            variable = "0X" + str(self.RCount)
            restriccion[variable] = 1
        return restriccion
    
    def ma

    def polinomioRestriccion(self, ctx):
        polinomio = self.visit(ctx.polinomio())
        restriccion = {}
        for X in self.X:
            restriccion[X] = 0
        for monomio in polinomio:
            if monomio in self.X:
                restriccion[monomio] = polinomio[monomio]
            else:
                print("Error en la restriccion %s: \n\t La variable '%s' no se encuentra definida en la funcion" % ((self.RCount +1), monomio))
                self.resetSelf()
                return -1
        return restriccion
    '''
        Define el arbol para la definicion de la funion a maximizar o minimizar
    '''

    def visitFuncionTransf(self, ctx):
        if self.visit(ctx.funcion()) != -1:
            self.O = ctx.operacion.type
            return 0
        self.resetSelf()
        return -1

    def visitFunciones(self, ctx):
        self.visit(ctx.funcionDef())
        polinomio = self.visit(ctx.polinomio())
        for monomio in polinomio:
            if monomio in self.X:
                self.X[monomio] = polinomio[monomio]
            else:
                self.resetSelf()
                print(
                    "Error en la declaracion de la funcion a maximizar: \n\t La variable '%s' no se encuentra definida en la funcion" % monomio)
                return -1
        return 0

    def visitDefinirFuncion(self, ctx):
        self.X = {}
        for var in ctx.variable():
            variable = self.visit(var)
            self.X[variable] = 0
        self.X["COEF1"] = 0
        return 0

    def visitVariables(self, ctx):
        return ctx.getText()
