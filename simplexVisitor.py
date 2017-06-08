# Generated from simplex.g4 by ANTLR 4.6
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .simplexParser import simplexParser
else:
    from simplexParser import simplexParser

# This class defines a complete generic visitor for a parse tree produced by simplexParser.

class simplexVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by simplexParser#iniciar.
    def visitIniciar(self, ctx:simplexParser.IniciarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#programa.
    def visitPrograma(self, ctx:simplexParser.ProgramaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#asignar.
    def visitAsignar(self, ctx:simplexParser.AsignarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#calcular.
    def visitCalcular(self, ctx:simplexParser.CalcularContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#imprimirExpr.
    def visitImprimirExpr(self, ctx:simplexParser.ImprimirExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#saltar.
    def visitSaltar(self, ctx:simplexParser.SaltarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#problemasExpresados.
    def visitProblemasExpresados(self, ctx:simplexParser.ProblemasExpresadosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#comentarios.
    def visitComentarios(self, ctx:simplexParser.ComentariosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#multiObjetivos.
    def visitMultiObjetivos(self, ctx:simplexParser.MultiObjetivosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#resolverProblemas.
    def visitResolverProblemas(self, ctx:simplexParser.ResolverProblemasContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#problemas.
    def visitProblemas(self, ctx:simplexParser.ProblemasContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#restriccionesVariables.
    def visitRestriccionesVariables(self, ctx:simplexParser.RestriccionesVariablesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#desigualdadesVariables.
    def visitDesigualdadesVariables(self, ctx:simplexParser.DesigualdadesVariablesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#desigualdadesVariablesMayorIgual.
    def visitDesigualdadesVariablesMayorIgual(self, ctx:simplexParser.DesigualdadesVariablesMayorIgualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#desigualdadesVariablesMenorIgual.
    def visitDesigualdadesVariablesMenorIgual(self, ctx:simplexParser.DesigualdadesVariablesMenorIgualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#restricciones.
    def visitRestricciones(self, ctx:simplexParser.RestriccionesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#desigualdades.
    def visitDesigualdades(self, ctx:simplexParser.DesigualdadesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#desigualdadesMayorIgual.
    def visitDesigualdadesMayorIgual(self, ctx:simplexParser.DesigualdadesMayorIgualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#desigualdadesMenorIgual.
    def visitDesigualdadesMenorIgual(self, ctx:simplexParser.DesigualdadesMenorIgualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#funcionTransf.
    def visitFuncionTransf(self, ctx:simplexParser.FuncionTransfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#funciones.
    def visitFunciones(self, ctx:simplexParser.FuncionesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#definirFuncion.
    def visitDefinirFuncion(self, ctx:simplexParser.DefinirFuncionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#nombrefuncion.
    def visitNombrefuncion(self, ctx:simplexParser.NombrefuncionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#menosPolinomios.
    def visitMenosPolinomios(self, ctx:simplexParser.MenosPolinomiosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#menosMonPolinomios.
    def visitMenosMonPolinomios(self, ctx:simplexParser.MenosMonPolinomiosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#polinomios.
    def visitPolinomios(self, ctx:simplexParser.PolinomiosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#monPolinomios.
    def visitMonPolinomios(self, ctx:simplexParser.MonPolinomiosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#masMonomio.
    def visitMasMonomio(self, ctx:simplexParser.MasMonomioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#menosMonomio.
    def visitMenosMonomio(self, ctx:simplexParser.MenosMonomioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#monomioMinimo.
    def visitMonomioMinimo(self, ctx:simplexParser.MonomioMinimoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#numeroMonomio.
    def visitNumeroMonomio(self, ctx:simplexParser.NumeroMonomioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#menosExpMAT.
    def visitMenosExpMAT(self, ctx:simplexParser.MenosExpMATContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#numeros.
    def visitNumeros(self, ctx:simplexParser.NumerosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#operPotencia.
    def visitOperPotencia(self, ctx:simplexParser.OperPotenciaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#identificadores.
    def visitIdentificadores(self, ctx:simplexParser.IdentificadoresContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#operSuma.
    def visitOperSuma(self, ctx:simplexParser.OperSumaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#operMatematicaParentesis.
    def visitOperMatematicaParentesis(self, ctx:simplexParser.OperMatematicaParentesisContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#decimales.
    def visitDecimales(self, ctx:simplexParser.DecimalesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#trigonometricas.
    def visitTrigonometricas(self, ctx:simplexParser.TrigonometricasContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#operMult.
    def visitOperMult(self, ctx:simplexParser.OperMultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#variables.
    def visitVariables(self, ctx:simplexParser.VariablesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#identificador.
    def visitIdentificador(self, ctx:simplexParser.IdentificadorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#expresionMatematica.
    def visitExpresionMatematica(self, ctx:simplexParser.ExpresionMatematicaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#decimalesPol.
    def visitDecimalesPol(self, ctx:simplexParser.DecimalesPolContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#numerosPol.
    def visitNumerosPol(self, ctx:simplexParser.NumerosPolContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#noNumero.
    def visitNoNumero(self, ctx:simplexParser.NoNumeroContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#senos.
    def visitSenos(self, ctx:simplexParser.SenosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#cosenos.
    def visitCosenos(self, ctx:simplexParser.CosenosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#tangentes.
    def visitTangentes(self, ctx:simplexParser.TangentesContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#eulerianos.
    def visitEulerianos(self, ctx:simplexParser.EulerianosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#logaritmos.
    def visitLogaritmos(self, ctx:simplexParser.LogaritmosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#decimalesPuros.
    def visitDecimalesPuros(self, ctx:simplexParser.DecimalesPurosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#entrosCientificos.
    def visitEntrosCientificos(self, ctx:simplexParser.EntrosCientificosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#decimalesCientificos.
    def visitDecimalesCientificos(self, ctx:simplexParser.DecimalesCientificosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#exponencialesUS.
    def visitExponencialesUS(self, ctx:simplexParser.ExponencialesUSContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#exponencialesNegativos.
    def visitExponencialesNegativos(self, ctx:simplexParser.ExponencialesNegativosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#exponencialesPositivos.
    def visitExponencialesPositivos(self, ctx:simplexParser.ExponencialesPositivosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#entero.
    def visitEntero(self, ctx:simplexParser.EnteroContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#mayorIgual.
    def visitMayorIgual(self, ctx:simplexParser.MayorIgualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by simplexParser#menorIgual.
    def visitMenorIgual(self, ctx:simplexParser.MenorIgualContext):
        return self.visitChildren(ctx)



del simplexParser