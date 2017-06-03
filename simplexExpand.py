from simplexVisitor import simplexVisitor
from simplexParser import simplexParser


class simplexExpand(simplexVisitor):
    def __init__(self):
        self.memory = {}
        self.matrix = []
        self.X = {}

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
        return izquierda ** derecha

    def visitOperMatematicaParentesis(self, ctx):
        return self.visit(ctx.expMAT())

    def visitMenosExpMAT(self, ctx):
        return -self.visit(ctx.expMAT())

    def visitNumeroMonomio(self, ctx):
        coeficiente = self.visit(ctx.expMAT())
        return coeficiente, "COEF1"

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

    def visitDefinirFuncion(self, ctx):
        conteo = 0
        X = {"COEF1": {"COEF": 0}}
        for var in ctx.variable():
            self.X[var.getText()] = {}
            self.X[var.getText()]["ID"] = conteo
            self.X[var.getText()]["COEF"] = 0
            conteo += 1
        return X

    def visitPolinomios(self, ctx):
        c,v = self.visit(ctx.monomio())
        polinomio = {v:c}
        for monomio in ctx.monomioAdd():
            c,v = self.visit(monomio)
            if v in polinomio:
                polinomio[v] += c
            else:
                polinomio[v] = c
        return polinomio

    def visitMonPolinomios(self, ctx):
        c,v = self.visit(ctx.monomio())
        return {v:c}

    def visitFunciones(self, ctx):
        X = self.visit(ctx.funcionDef())
        polinomio = self.visit(ctx.polinomio())
        print(polinomio)

    def visitProblemasExpresados(self, ctx):
        print(ctx.getText())
