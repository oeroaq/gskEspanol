from simplexVisitor import simplexVisitor
from simplexParser import simplexParser


class simplexExpand(simplexVisitor):
    def __init__(self):
        self.memory = {}
        self.RCount = 0
        self.SCount = 0
        self.CVariables = []
        self.R = {}
        self.RV = {}
        self.X = {}
        self.O = None
        self.Variables = []

    def resetSelf(self):
        self.memory = {}
        self.RCount = 0
        self.SCount = 0
        self.CVariables = []
        self.R = {}
        self.RV = {}
        self.X = {}
        self.O = None
        self.Variables = []

    def resolverSimplex(self):
        self.R["0Z"] = self.X
        for var in self.CVariables:
            self.R["0Z"][var] *= -1
        valor = (0, -1)
        if self.O == simplexParser.MINI:
            for i in range(self.RCount):
                self.R["0Z"]["0R" + str(i)] = (0, -1)
                valor = (0, 1)
        for i in range(self.RCount):
            fila = "0F" + str(i)
            filaTmp = self.multiplicarFila(self.R[fila], valor)
            self.R["0Z"] = self.sumarFilas(self.R["0Z"],filaTmp)
        for v in self.Variables:
            minimo = float("inf")
            maximo = - float("inf")
            columna = None
            for item in self.Variables:
                tupla = self.R["0Z"][item]
                tmp = tupla[0] + tupla[1]
                if self.O == simplexParser.MAXI:
                    if tmp < minimo:
                        minimo = tmp
                        columna = item
                else:
                    if tmp > maximo:
                        maximo = tmp
                        columna = item
            
            minimo = float("inf")
            maximo = - float("inf")
            fila = None
            for item in self.R:
                if item != "0Z":
                    if self.R[item][columna]:
                        tmp = self.R[item]["0C"]/self.R[item][columna]
                        if tmp > 0:
                            if self.O == simplexParser.MAXI:
                                if tmp < minimo:
                                    minimo = tmp
                                    fila = item
                            else:
                                if tmp > maximo:
                                    maximo = tmp
                                    fila = item
            pivote = self.R[fila][columna]
            self.R[fila] = self.multiplicarFila(self.R[fila], 1/pivote)
            for item in self.R:
                if item != fila:
                    tuplaTmp = None
                    if item != "0Z":
                        tuplaTmp = -self.R[item][columna]
                    else:
                        tuplaTmp = (-self.R["0Z"][columna][0],-self.R["0Z"][columna][1])
                    filaTmp = self.multiplicarFila(self.R[fila], tuplaTmp)
                    self.R[item] = self.sumarFilas(self.R[item],filaTmp)
        variables = {'OZ':None}
        for item in self.Variables:
            variables[item] = 0.0
        for item in self.R:
            for columna in self.R[item]:
                valor = self.R[item]["0C"]
                if columna == "0Z":
                    variables[columna] = valor
                elif self.R[item][columna] == 1:
                    variables[columna] = valor
        
        print("Funcion:\n\tfuncion (%s) = %s\n"% (", ".join(self.Variables), variables["0Z"][0]))
        print("Vaiables:")
        for item in self.Variables:
            if item != "0Z":
                print("\tVariable %s = %s"% (item, variables[item]))
        '''for item in self.R:
            print(self.R[item])'''
    def multiplicarFila(self, fila, valor):
        resultado = {}
        if type(valor) is tuple:
            for item in fila:
                resultado[item] = (valor[0] * fila[item],
                                   valor[1] * fila[item])
        else:
            for item in fila:
                resultado[item] = fila[item] * valor
        return resultado

    def sumarFilas(self, filaA, filaB):
        resultado = {}
        for item in filaA:
            if type(filaA[item]) is tuple:
                if type(filaB[item]) is tuple:
                    resultado[item] = (filaA[item][0] + filaB[item][0], filaA[item][1] + filaB[item][1])
                else:
                    resultado[item] = (filaA[item][0] + filaB[item], filaA[item][1])
            else:
                if type(filaB[item]) is tuple:
                    resultado[item] = (filaA[item] + filaB[item][0], filaB[item][1])
                else:
                    resultado[item] = filaA[item] + filaB[item]
        return resultado

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
        print("Error:\n\tLa evaluacion de la expresion: '%s' no se puede calcular." % (
            ctx.expMAT(0).getText(), ctx.expMAT(1).getText()))
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
        if self.visit(ctx.problema()) != -1:
            self.resolverSimplex()

    def visitProblemas(self, ctx):
        if self.visit(ctx.funcionTrans()) != -1:
            if self.visit(ctx.restriccion()) != -1:
                if self.visit(ctx.restricionVariable()) != -1:
                    return 0
        return -1

    '''
        Define el arbol para la definicion de las restricciones
    '''

    def visitRestriccionesVariables(self, ctx):
        for desigualdad in ctx.desigualdadVariable():
            V, R = self.visit(desigualdad)
            if V and R:
                self.RV[V] = R
            else:
                self.resetSelf()
                return -1
        variables = []
        for var in self.Variables:
            if var not in self.CVariables:
                variables.append(var)
        if not len(variables):
            return 0
        print("Error:\n\tNo se definieron las condiciones para las variables: '%s'." %
              "', '".join(variables))
        return -1

    def visitDesigualdadesVariables(self, ctx):
        variable = self.visit(ctx.variable())
        if variable in self.Variables:
            if variable not in self.CVariables:
                self.CVariables.append(variable)
            else:
                print(
                    "Cuidado!:\n\tLa condicion para la variable '%s' ya habia sido definida, se sobreescribe." % variable)
            restriccion = {}
            if ctx.tipo.type == simplexParser.MAYOR:
                restriccion["tipo"] = ">"
            elif ctx.tipo.type == simplexParser.MENOR:
                restriccion["tipo"] = "<"
            else:
                restriccion["tipo"] = "="
            numero = self.visit(ctx.expMAT())
            if numero or numero == 0:
                restriccion["0C"] = numero
                return variable, restriccion
            else:
                print(numero)
                print("\tEn la restriccion numero %s." % (self.RCount + 1))
                return None, None
        print(self.X[variable])
        print("Error:\n\tLa variable '%s' no esta definida en la funcion." % variable)
        print("\tEn la condicion numero %s" % (self.RCount + 1))
        return None, None

    def visitDesigualdadesVariablesMayorIgual(self, ctx):
        variable = self.visit(ctx.variable())
        if variable in self.Variables:
            if variable not in self.CVariables:
                self.CVariables.append(variable)
            else:
                print(
                    "Cuidado!:\n\tLa condicion para la variable '%s' ya habia sido definida, se sobreescribe." % variable)
            restriccion = {}
            restriccion["tipo"] = ">="
            numero = self.visit(ctx.expMAT())
            if numero or numero == 0:
                restriccion["0C"] = numero
                return variable, restriccion
            else:
                print("\tEn la restriccion numero %s." % (self.RCount + 1))
                return None, None
        return None, None

    def visitDesigualdadesVariablesMenorIgual(self, ctx):
        variable = self.visit(ctx.variable())
        if variable in self.Variables:
            if variable not in self.CVariables:
                self.CVariables.append(variable)
            else:
                print(
                    "Cuidado!:\n\tLa condicion para la variable '%s' ya habia sido definida, se sobreescribe." % variable)
            restriccion = {}
            restriccion["tipo"] = "<="
            numero = self.visit(ctx.expMAT())
            if numero or numero == 0:
                restriccion["0C"] = numero
                return variable, restriccion
            else:
                print("\tEn la restriccion numero %s." % (self.RCount + 1))
                return None, None
        return None, None

    def visitRestricciones(self, ctx):
        for noigualdad in ctx.desigualdad():
            restriccion = self.visit(noigualdad)
            if restriccion != -1:
                R = "0R" + str(self.RCount)
                S = "0S" + str(self.SCount)
                self.X[R] = (0, 1)
                self.X[S] = 0
                for item in self.R:
                    self.R[item][R] = 0
                    self.R[item][S] = 0
                self.R["0F" + str(self.RCount)] = restriccion
                self.RCount += 1
                self.SCount += 1
            else:
                self.resetSelf()
                return -1
        return 0

    def visitDesigualdades(self, ctx):
        restriccion = self.polinomioRestriccion(ctx)
        if restriccion != -1:
            R = "0R" + str(self.RCount)
            S = "0S" + str(self.SCount)
            if ctx.tipo.type == simplexParser.MAYOR:
                restriccion[R] = 1
                restriccion[S] = -1
            elif ctx.tipo.type == simplexParser.MENOR:
                restriccion[R] = 0
                restriccion[S] = 1
            else:
                restriccion[R] = 1
                restriccion[S] = 0
            numero = self.visit(ctx.expMAT())
            if numero or numero == 0:
                restriccion["0C"] += numero
            else:
                print("\tEn la restriccion numero %s." % (self.RCount + 1))
                return -1
        return restriccion

    def visitDesigualdadesMayorIgual(self, ctx):
        restriccion = self.polinomioRestriccion(ctx)
        if restriccion != -1:
            R = "0R" + str(self.RCount)
            S = "0S" + str(self.SCount)
            restriccion[R] = 1
            restriccion[S] = -1
            numero = self.visit(ctx.expMAT())
            if numero or numero == 0:
                restriccion["0C"] += numero
            else:
                print("\tEn la restriccion numero %s." % (self.RCount + 1))
                return -1
        return restriccion

    def visitDesigualdadesMenorIgual(self, ctx):
        restriccion = self.polinomioRestriccion(ctx)
        if restriccion != -1:
            R = "0R" + str(self.RCount)
            S = "0S" + str(self.SCount)
            restriccion[R] = 0
            restriccion[S] = 1
            numero = self.visit(ctx.expMAT())
            if numero or numero == 0:
                restriccion["0C"] += numero
            else:
                print("\tEn la restriccion numero %s." % (self.RCount + 1))
                return -1
        return restriccion

    def polinomioRestriccion(self, ctx):
        polinomio = self.visit(ctx.polinomio())
        if polinomio:
            restriccion = {}
            for X in self.X:
                restriccion[X] = 0
            for monomio in polinomio:
                if monomio in self.X:
                    restriccion[monomio] = polinomio[monomio]
                else:
                    print("Error en la restriccion %s: \n\tLa variable '%s' no se encuentra definida en la funcion" % (
                        (self.RCount + 1), monomio))
                    self.resetSelf()
                    return -1
            return restriccion
        print("\tEn la restriccion numero %s." % (self.RCount + 1))
        return -1
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
                    print(
                        "Error en la declaracion de la funcion a maximizar: \n\t La variable '%s' no se encuentra definida en la funcion" % monomio)
                    return -1
            return 0
        print("\tEn la declaracion de la funcion a maximizar.")
        return -1

    def visitDefinirFuncion(self, ctx):
        self.resetSelf()
        self.X["0Z"] = 1
        for var in ctx.variable():
            variable = self.visit(var)
            self.X[variable] = 0
            self.Variables.append(variable)
        self.X["0C"] = 0
        return 0

    def visitVariables(self, ctx):
        return ctx.getText()
