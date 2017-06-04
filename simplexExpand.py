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
        print("Error:\n\tLa variable '%s' no esta definida" % nombre)
        return None

    def visitAsignar(self, ctx):
        nombre = ctx.identificador().getText()
        valor = self.visit(ctx.expMAT())
        if valor:
            self.memory[nombre] = valor
            return valor
        print("Error:\n\tNo se pudo inicializar la variable '%s'." % nombre)

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
            if derecha != 0:
                return izquierda / derecha
            var = ctx.expMAT(1).getText()
            mensaje = ""
            if str(var) != "0":
                mensaje = "Error: \n\tNo se puede dividir por cero."
            else:
                mensaje = "Error: \n\tLa evaluacion de la expresion o variable '%s' no puede ser cero." % var
            print(mensaje)
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
        if numero:
            return -numero
        return numero

    def visitNumeroMonomio(self, ctx):
        coeficiente = self.visit(ctx.expMAT())
        if coeficiente:
            return coeficiente, "0C"
        return coeficiente, None

    def visitMonomioMinimo(self, ctx):
        coeficiente = self.visit(ctx.e)
        variable = ctx.variable().getText()
        if variable and coeficiente:
            return coeficiente, variable
        return None, None

    def visitMenosMonomio(self, ctx):
        coeficiente, variable = self.visit(ctx.monomio())
        if variable and coeficiente:
            return -coeficiente, variable
        return None, None

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
        if c and v:
            polinomio = {v: c}
            for monomio in ctx.monomioAdd():
                c, v = self.visit(monomio)
                if c and v:
                    if v in polinomio:
                        polinomio[v] += c
                    else:
                        polinomio[v] = c
                else:
                    return None
            return polinomio
        return None

    def visitMonPolinomios(self, ctx):
        c, v = self.visit(ctx.monomio())
        if c and v:
            return {v: c}
        return None

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
            else:
                print("\tEn la restriccion numero %s." % (self.RCount+1))
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
            numero = self.visit(ctx.expMAT())
            if numero:
                restriccion["0C"] += numero 
            else:
                return -1
        return restriccion

    def visitDesigualdadesMayorIgual(self, ctx):
        restriccion = self.polinomioRestriccion(ctx)
        if restriccion != -1:
            variable = "0X" + str(self.RCount)
            restriccion[variable] = -1
            numero = self.visit(ctx.expMAT())
            if numero:
                restriccion["0C"] += numero 
            else:
                return -1
        return restriccion

    def visitDesigualdadesMenorIgual(self, ctx):
        restriccion = self.polinomioRestriccion(ctx)
        if restriccion != -1:
            variable = "0X" + str(self.RCount)
            restriccion[variable] = 1
            numero = self.visit(ctx.expMAT())
            if numero:
                restriccion["0C"] += numero 
            else:
                return -1
        return restriccion


    def polinomioRestriccion(self, ctx):
        polinomio = self.visit(ctx.polinomio())
        restriccion = {}
        for X in self.X:
            restriccion[X] = 0
        for monomio in polinomio:
            if monomio in self.X:
                restriccion[monomio] = polinomio[monomio]
            else:
                print("Error en la restriccion %s: \n\t La variable '%s' no se encuentra definida en la funcion" % (
                    (self.RCount + 1), monomio))
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
        if polinomio:
            for monomio in polinomio:
                if monomio in self.X:
                    self.X[monomio] = polinomio[monomio]
                else:
                    self.resetSelf()
                    print("Error en la declaracion de la funcion a maximizar: \n\t La variable '%s' no se encuentra definida en la funcion" % monomio)
                    return -1
            return 0
        print("\tEn la declaracion de la funcion a maximizar.")
        return -1

    def visitDefinirFuncion(self, ctx):
        self.X = {}
        for var in ctx.variable():
            variable = self.visit(var)
            self.X[variable] = 0
        self.X["0C"] = 0
        return 0

    def visitVariables(self, ctx):
        return ctx.getText()
