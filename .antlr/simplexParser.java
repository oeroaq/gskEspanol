// Generated from /home/owr2o112oo7/Documentos/Unal/Lenguajes de programacion/Proyecto Final/simplex.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simplexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MAS=2, MENOS=3, MULT=4, DIV=5, POTENCIA=6, PUNTO=7, IGUAL=8, LETRA=9, 
		COMA=10, SALTOLINEA=11, BLANCO=12, DIGITO=13, PARABIERTO=14, PARCERRADO=15, 
		MAYOR=16, MENOR=17, DOSPUNTOS=18, EXPONENCIAL=19, IMPRIMIR=20, MAXI=21, 
		MINI=22, FUNCION=23, RESTRICCIONES=24, RESOLVER=25, CON=26, SENO=27, COSENO=28, 
		TANGENTE=29, EULER=30, LOGARITMO=31, COMENTARIO=32;
	public static final int
		RULE_iniciar = 0, RULE_programa = 1, RULE_expresion = 2, RULE_problema = 3, 
		RULE_restricionVariable = 4, RULE_desigualdadVariable = 5, RULE_restriccion = 6, 
		RULE_desigualdad = 7, RULE_funcionTrans = 8, RULE_funcion = 9, RULE_funcionDef = 10, 
		RULE_polinomio = 11, RULE_monomioAdd = 12, RULE_monomio = 13, RULE_expMAT = 14, 
		RULE_variable = 15, RULE_identificador = 16, RULE_numero = 17, RULE_trigonometrica = 18, 
		RULE_decimal = 19, RULE_exponencial = 20, RULE_entero = 21, RULE_mayorIgual = 22, 
		RULE_menorIgual = 23;
	public static final String[] ruleNames = {
		"iniciar", "programa", "expresion", "problema", "restricionVariable", 
		"desigualdadVariable", "restriccion", "desigualdad", "funcionTrans", "funcion", 
		"funcionDef", "polinomio", "monomioAdd", "monomio", "expMAT", "variable", 
		"identificador", "numero", "trigonometrica", "decimal", "exponencial", 
		"entero", "mayorIgual", "menorIgual"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'_'", "'+'", "'-'", "'*'", "'/'", "'**'", "'.'", "'='", null, "','", 
		null, null, null, "'('", "')'", "'>'", "'<'", "':'", null, null, null, 
		null, null, null, null, "'con'", "'sen'", "'cos'", "'tan'", "'exp'", "'ln'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "MAS", "MENOS", "MULT", "DIV", "POTENCIA", "PUNTO", "IGUAL", 
		"LETRA", "COMA", "SALTOLINEA", "BLANCO", "DIGITO", "PARABIERTO", "PARCERRADO", 
		"MAYOR", "MENOR", "DOSPUNTOS", "EXPONENCIAL", "IMPRIMIR", "MAXI", "MINI", 
		"FUNCION", "RESTRICCIONES", "RESOLVER", "CON", "SENO", "COSENO", "TANGENTE", 
		"EULER", "LOGARITMO", "COMENTARIO"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "simplex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public simplexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IniciarContext extends ParserRuleContext {
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public IniciarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iniciar; }
	}

	public final IniciarContext iniciar() throws RecognitionException {
		IniciarContext _localctx = new IniciarContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_iniciar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			programa();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(simplexParser.EOF, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << LETRA) | (1L << SALTOLINEA) | (1L << DIGITO) | (1L << PARABIERTO) | (1L << IMPRIMIR) | (1L << MAXI) | (1L << MINI) | (1L << SENO) | (1L << COSENO) | (1L << TANGENTE) | (1L << EULER) | (1L << LOGARITMO) | (1L << COMENTARIO))) != 0)) {
				{
				{
				setState(50);
				expresion();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SaltarContext extends ExpresionContext {
		public TerminalNode SALTOLINEA() { return getToken(simplexParser.SALTOLINEA, 0); }
		public SaltarContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	public static class ProblemasExpresadosContext extends ExpresionContext {
		public ProblemaContext problema() {
			return getRuleContext(ProblemaContext.class,0);
		}
		public ProblemasExpresadosContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	public static class ImprimirExprContext extends ExpresionContext {
		public TerminalNode IMPRIMIR() { return getToken(simplexParser.IMPRIMIR, 0); }
		public TerminalNode PARABIERTO() { return getToken(simplexParser.PARABIERTO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARCERRADO() { return getToken(simplexParser.PARCERRADO, 0); }
		public ImprimirExprContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	public static class CalcularContext extends ExpresionContext {
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public CalcularContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	public static class ComentariosContext extends ExpresionContext {
		public TerminalNode COMENTARIO() { return getToken(simplexParser.COMENTARIO, 0); }
		public ComentariosContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	public static class AsignarContext extends ExpresionContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(simplexParser.IGUAL, 0); }
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public AsignarContext(ExpresionContext ctx) { copyFrom(ctx); }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expresion);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AsignarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				identificador();
				setState(59);
				match(IGUAL);
				setState(60);
				expMAT(0);
				}
				break;
			case 2:
				_localctx = new CalcularContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				expMAT(0);
				}
				break;
			case 3:
				_localctx = new ImprimirExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(IMPRIMIR);
				setState(64);
				match(PARABIERTO);
				setState(65);
				expresion();
				setState(66);
				match(PARCERRADO);
				}
				break;
			case 4:
				_localctx = new SaltarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(SALTOLINEA);
				}
				break;
			case 5:
				_localctx = new ProblemasExpresadosContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				problema();
				}
				break;
			case 6:
				_localctx = new ComentariosContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
				match(COMENTARIO);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProblemaContext extends ParserRuleContext {
		public ProblemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problema; }
	 
		public ProblemaContext() { }
		public void copyFrom(ProblemaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ProblemasContext extends ProblemaContext {
		public RestriccionContext restriccion() {
			return getRuleContext(RestriccionContext.class,0);
		}
		public RestricionVariableContext restricionVariable() {
			return getRuleContext(RestricionVariableContext.class,0);
		}
		public TerminalNode RESOLVER() { return getToken(simplexParser.RESOLVER, 0); }
		public TerminalNode SALTOLINEA() { return getToken(simplexParser.SALTOLINEA, 0); }
		public List<FuncionTransContext> funcionTrans() {
			return getRuleContexts(FuncionTransContext.class);
		}
		public FuncionTransContext funcionTrans(int i) {
			return getRuleContext(FuncionTransContext.class,i);
		}
		public ProblemasContext(ProblemaContext ctx) { copyFrom(ctx); }
	}

	public final ProblemaContext problema() throws RecognitionException {
		ProblemaContext _localctx = new ProblemaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_problema);
		int _la;
		try {
			_localctx = new ProblemasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				funcionTrans();
				}
				}
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MAXI || _la==MINI );
			setState(78);
			restriccion();
			setState(79);
			restricionVariable();
			setState(80);
			match(RESOLVER);
			setState(81);
			match(SALTOLINEA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestricionVariableContext extends ParserRuleContext {
		public RestricionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restricionVariable; }
	 
		public RestricionVariableContext() { }
		public void copyFrom(RestricionVariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RestriccionesVariablesContext extends RestricionVariableContext {
		public TerminalNode CON() { return getToken(simplexParser.CON, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(simplexParser.DOSPUNTOS, 0); }
		public List<TerminalNode> SALTOLINEA() { return getTokens(simplexParser.SALTOLINEA); }
		public TerminalNode SALTOLINEA(int i) {
			return getToken(simplexParser.SALTOLINEA, i);
		}
		public List<DesigualdadVariableContext> desigualdadVariable() {
			return getRuleContexts(DesigualdadVariableContext.class);
		}
		public DesigualdadVariableContext desigualdadVariable(int i) {
			return getRuleContext(DesigualdadVariableContext.class,i);
		}
		public RestriccionesVariablesContext(RestricionVariableContext ctx) { copyFrom(ctx); }
	}

	public final RestricionVariableContext restricionVariable() throws RecognitionException {
		RestricionVariableContext _localctx = new RestricionVariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_restricionVariable);
		int _la;
		try {
			_localctx = new RestriccionesVariablesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(CON);
			setState(84);
			match(DOSPUNTOS);
			setState(85);
			match(SALTOLINEA);
			setState(89); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				desigualdadVariable();
				setState(87);
				match(SALTOLINEA);
				}
				}
				setState(91); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETRA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesigualdadVariableContext extends ParserRuleContext {
		public DesigualdadVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desigualdadVariable; }
	 
		public DesigualdadVariableContext() { }
		public void copyFrom(DesigualdadVariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DesigualdadesVariablesContext extends DesigualdadVariableContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(simplexParser.IGUAL, 0); }
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public DesigualdadesVariablesContext(DesigualdadVariableContext ctx) { copyFrom(ctx); }
	}
	public static class DesigualdadesVariablesMenorIgualContext extends DesigualdadVariableContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MenorIgualContext menorIgual() {
			return getRuleContext(MenorIgualContext.class,0);
		}
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public DesigualdadesVariablesMenorIgualContext(DesigualdadVariableContext ctx) { copyFrom(ctx); }
	}
	public static class DesigualdadesVariablesMayorIgualContext extends DesigualdadVariableContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MayorIgualContext mayorIgual() {
			return getRuleContext(MayorIgualContext.class,0);
		}
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public DesigualdadesVariablesMayorIgualContext(DesigualdadVariableContext ctx) { copyFrom(ctx); }
	}

	public final DesigualdadVariableContext desigualdadVariable() throws RecognitionException {
		DesigualdadVariableContext _localctx = new DesigualdadVariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_desigualdadVariable);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DesigualdadesVariablesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				variable();
				setState(94);
				match(IGUAL);
				setState(95);
				expMAT(0);
				}
				break;
			case 2:
				_localctx = new DesigualdadesVariablesMayorIgualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				variable();
				setState(98);
				mayorIgual();
				setState(99);
				expMAT(0);
				}
				break;
			case 3:
				_localctx = new DesigualdadesVariablesMenorIgualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(101);
				variable();
				setState(102);
				menorIgual();
				setState(103);
				expMAT(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestriccionContext extends ParserRuleContext {
		public RestriccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restriccion; }
	 
		public RestriccionContext() { }
		public void copyFrom(RestriccionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RestriccionesContext extends RestriccionContext {
		public TerminalNode RESTRICCIONES() { return getToken(simplexParser.RESTRICCIONES, 0); }
		public TerminalNode DOSPUNTOS() { return getToken(simplexParser.DOSPUNTOS, 0); }
		public List<TerminalNode> SALTOLINEA() { return getTokens(simplexParser.SALTOLINEA); }
		public TerminalNode SALTOLINEA(int i) {
			return getToken(simplexParser.SALTOLINEA, i);
		}
		public List<DesigualdadContext> desigualdad() {
			return getRuleContexts(DesigualdadContext.class);
		}
		public DesigualdadContext desigualdad(int i) {
			return getRuleContext(DesigualdadContext.class,i);
		}
		public RestriccionesContext(RestriccionContext ctx) { copyFrom(ctx); }
	}

	public final RestriccionContext restriccion() throws RecognitionException {
		RestriccionContext _localctx = new RestriccionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_restriccion);
		int _la;
		try {
			_localctx = new RestriccionesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(RESTRICCIONES);
			setState(108);
			match(DOSPUNTOS);
			setState(109);
			match(SALTOLINEA);
			setState(113); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				desigualdad();
				setState(111);
				match(SALTOLINEA);
				}
				}
				setState(115); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << LETRA) | (1L << DIGITO) | (1L << PARABIERTO) | (1L << SENO) | (1L << COSENO) | (1L << TANGENTE) | (1L << EULER) | (1L << LOGARITMO))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesigualdadContext extends ParserRuleContext {
		public DesigualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desigualdad; }
	 
		public DesigualdadContext() { }
		public void copyFrom(DesigualdadContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DesigualdadesMayorIgualContext extends DesigualdadContext {
		public PolinomioContext polinomio() {
			return getRuleContext(PolinomioContext.class,0);
		}
		public MayorIgualContext mayorIgual() {
			return getRuleContext(MayorIgualContext.class,0);
		}
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public DesigualdadesMayorIgualContext(DesigualdadContext ctx) { copyFrom(ctx); }
	}
	public static class DesigualdadesContext extends DesigualdadContext {
		public PolinomioContext polinomio() {
			return getRuleContext(PolinomioContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(simplexParser.IGUAL, 0); }
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public DesigualdadesContext(DesigualdadContext ctx) { copyFrom(ctx); }
	}
	public static class DesigualdadesMenorIgualContext extends DesigualdadContext {
		public PolinomioContext polinomio() {
			return getRuleContext(PolinomioContext.class,0);
		}
		public MenorIgualContext menorIgual() {
			return getRuleContext(MenorIgualContext.class,0);
		}
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public DesigualdadesMenorIgualContext(DesigualdadContext ctx) { copyFrom(ctx); }
	}

	public final DesigualdadContext desigualdad() throws RecognitionException {
		DesigualdadContext _localctx = new DesigualdadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_desigualdad);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DesigualdadesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				polinomio();
				setState(118);
				match(IGUAL);
				setState(119);
				expMAT(0);
				}
				break;
			case 2:
				_localctx = new DesigualdadesMayorIgualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				polinomio();
				setState(122);
				mayorIgual();
				setState(123);
				expMAT(0);
				}
				break;
			case 3:
				_localctx = new DesigualdadesMenorIgualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				polinomio();
				setState(126);
				menorIgual();
				setState(127);
				expMAT(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionTransContext extends ParserRuleContext {
		public FuncionTransContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionTrans; }
	 
		public FuncionTransContext() { }
		public void copyFrom(FuncionTransContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncionTransfContext extends FuncionTransContext {
		public Token operacion;
		public TerminalNode DOSPUNTOS() { return getToken(simplexParser.DOSPUNTOS, 0); }
		public List<TerminalNode> SALTOLINEA() { return getTokens(simplexParser.SALTOLINEA); }
		public TerminalNode SALTOLINEA(int i) {
			return getToken(simplexParser.SALTOLINEA, i);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public TerminalNode MAXI() { return getToken(simplexParser.MAXI, 0); }
		public TerminalNode MINI() { return getToken(simplexParser.MINI, 0); }
		public FuncionTransfContext(FuncionTransContext ctx) { copyFrom(ctx); }
	}

	public final FuncionTransContext funcionTrans() throws RecognitionException {
		FuncionTransContext _localctx = new FuncionTransContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcionTrans);
		int _la;
		try {
			_localctx = new FuncionTransfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			((FuncionTransfContext)_localctx).operacion = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==MAXI || _la==MINI) ) {
				((FuncionTransfContext)_localctx).operacion = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(132);
			match(DOSPUNTOS);
			setState(133);
			match(SALTOLINEA);
			setState(134);
			funcion();
			setState(135);
			match(SALTOLINEA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
	 
		public FuncionContext() { }
		public void copyFrom(FuncionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncionesContext extends FuncionContext {
		public FuncionDefContext funcionDef() {
			return getRuleContext(FuncionDefContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(simplexParser.IGUAL, 0); }
		public PolinomioContext polinomio() {
			return getRuleContext(PolinomioContext.class,0);
		}
		public FuncionesContext(FuncionContext ctx) { copyFrom(ctx); }
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcion);
		try {
			_localctx = new FuncionesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			funcionDef();
			setState(138);
			match(IGUAL);
			setState(139);
			polinomio();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionDefContext extends ParserRuleContext {
		public FuncionDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionDef; }
	 
		public FuncionDefContext() { }
		public void copyFrom(FuncionDefContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DefinirFuncionContext extends FuncionDefContext {
		public TerminalNode FUNCION() { return getToken(simplexParser.FUNCION, 0); }
		public TerminalNode PARABIERTO() { return getToken(simplexParser.PARABIERTO, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public TerminalNode PARCERRADO() { return getToken(simplexParser.PARCERRADO, 0); }
		public List<TerminalNode> COMA() { return getTokens(simplexParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(simplexParser.COMA, i);
		}
		public DefinirFuncionContext(FuncionDefContext ctx) { copyFrom(ctx); }
	}

	public final FuncionDefContext funcionDef() throws RecognitionException {
		FuncionDefContext _localctx = new FuncionDefContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcionDef);
		int _la;
		try {
			_localctx = new DefinirFuncionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(FUNCION);
			setState(142);
			match(PARABIERTO);
			setState(143);
			variable();
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(144);
				match(COMA);
				setState(145);
				variable();
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(151);
			match(PARCERRADO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PolinomioContext extends ParserRuleContext {
		public PolinomioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_polinomio; }
	 
		public PolinomioContext() { }
		public void copyFrom(PolinomioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PolinomiosContext extends PolinomioContext {
		public MonomioContext monomio() {
			return getRuleContext(MonomioContext.class,0);
		}
		public List<MonomioAddContext> monomioAdd() {
			return getRuleContexts(MonomioAddContext.class);
		}
		public MonomioAddContext monomioAdd(int i) {
			return getRuleContext(MonomioAddContext.class,i);
		}
		public PolinomiosContext(PolinomioContext ctx) { copyFrom(ctx); }
	}
	public static class MenosMonPolinomiosContext extends PolinomioContext {
		public TerminalNode MENOS() { return getToken(simplexParser.MENOS, 0); }
		public MonomioContext monomio() {
			return getRuleContext(MonomioContext.class,0);
		}
		public MenosMonPolinomiosContext(PolinomioContext ctx) { copyFrom(ctx); }
	}
	public static class MenosPolinomiosContext extends PolinomioContext {
		public TerminalNode MENOS() { return getToken(simplexParser.MENOS, 0); }
		public MonomioContext monomio() {
			return getRuleContext(MonomioContext.class,0);
		}
		public List<MonomioAddContext> monomioAdd() {
			return getRuleContexts(MonomioAddContext.class);
		}
		public MonomioAddContext monomioAdd(int i) {
			return getRuleContext(MonomioAddContext.class,i);
		}
		public MenosPolinomiosContext(PolinomioContext ctx) { copyFrom(ctx); }
	}
	public static class MonPolinomiosContext extends PolinomioContext {
		public MonomioContext monomio() {
			return getRuleContext(MonomioContext.class,0);
		}
		public MonPolinomiosContext(PolinomioContext ctx) { copyFrom(ctx); }
	}

	public final PolinomioContext polinomio() throws RecognitionException {
		PolinomioContext _localctx = new PolinomioContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_polinomio);
		int _la;
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new MenosPolinomiosContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(MENOS);
				setState(154);
				monomio();
				setState(156); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(155);
					monomioAdd();
					}
					}
					setState(158); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MAS || _la==MENOS );
				}
				break;
			case 2:
				_localctx = new MenosMonPolinomiosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(MENOS);
				setState(161);
				monomio();
				}
				break;
			case 3:
				_localctx = new PolinomiosContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				monomio();
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(163);
					monomioAdd();
					}
					}
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MAS || _la==MENOS );
				}
				break;
			case 4:
				_localctx = new MonPolinomiosContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				monomio();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonomioAddContext extends ParserRuleContext {
		public MonomioAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monomioAdd; }
	 
		public MonomioAddContext() { }
		public void copyFrom(MonomioAddContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MasMonomioContext extends MonomioAddContext {
		public TerminalNode MAS() { return getToken(simplexParser.MAS, 0); }
		public MonomioContext monomio() {
			return getRuleContext(MonomioContext.class,0);
		}
		public MasMonomioContext(MonomioAddContext ctx) { copyFrom(ctx); }
	}
	public static class MenosMonomioContext extends MonomioAddContext {
		public TerminalNode MENOS() { return getToken(simplexParser.MENOS, 0); }
		public MonomioContext monomio() {
			return getRuleContext(MonomioContext.class,0);
		}
		public MenosMonomioContext(MonomioAddContext ctx) { copyFrom(ctx); }
	}

	public final MonomioAddContext monomioAdd() throws RecognitionException {
		MonomioAddContext _localctx = new MonomioAddContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_monomioAdd);
		try {
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
				_localctx = new MasMonomioContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(MAS);
				setState(172);
				monomio();
				}
				break;
			case MENOS:
				_localctx = new MenosMonomioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(MENOS);
				setState(174);
				monomio();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonomioContext extends ParserRuleContext {
		public MonomioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_monomio; }
	 
		public MonomioContext() { }
		public void copyFrom(MonomioContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MonomioMinimoContext extends MonomioContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MonomioMinimoContext(MonomioContext ctx) { copyFrom(ctx); }
	}
	public static class NumeroMonomioContext extends MonomioContext {
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public NumeroMonomioContext(MonomioContext ctx) { copyFrom(ctx); }
	}

	public final MonomioContext monomio() throws RecognitionException {
		MonomioContext _localctx = new MonomioContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_monomio);
		try {
			setState(181);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new MonomioMinimoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				numero();
				setState(178);
				variable();
				}
				break;
			case 2:
				_localctx = new NumeroMonomioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				expMAT(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpMATContext extends ParserRuleContext {
		public ExpMATContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expMAT; }
	 
		public ExpMATContext() { }
		public void copyFrom(ExpMATContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MenosExpMATContext extends ExpMATContext {
		public TerminalNode MENOS() { return getToken(simplexParser.MENOS, 0); }
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public MenosExpMATContext(ExpMATContext ctx) { copyFrom(ctx); }
	}
	public static class NumerosContext extends ExpMATContext {
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public NumerosContext(ExpMATContext ctx) { copyFrom(ctx); }
	}
	public static class OperPotenciaContext extends ExpMATContext {
		public List<ExpMATContext> expMAT() {
			return getRuleContexts(ExpMATContext.class);
		}
		public ExpMATContext expMAT(int i) {
			return getRuleContext(ExpMATContext.class,i);
		}
		public TerminalNode POTENCIA() { return getToken(simplexParser.POTENCIA, 0); }
		public OperPotenciaContext(ExpMATContext ctx) { copyFrom(ctx); }
	}
	public static class IdentificadoresContext extends ExpMATContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public IdentificadoresContext(ExpMATContext ctx) { copyFrom(ctx); }
	}
	public static class OperSumaContext extends ExpMATContext {
		public Token operador;
		public List<ExpMATContext> expMAT() {
			return getRuleContexts(ExpMATContext.class);
		}
		public ExpMATContext expMAT(int i) {
			return getRuleContext(ExpMATContext.class,i);
		}
		public TerminalNode MAS() { return getToken(simplexParser.MAS, 0); }
		public TerminalNode MENOS() { return getToken(simplexParser.MENOS, 0); }
		public OperSumaContext(ExpMATContext ctx) { copyFrom(ctx); }
	}
	public static class OperMatematicaParentesisContext extends ExpMATContext {
		public TerminalNode PARABIERTO() { return getToken(simplexParser.PARABIERTO, 0); }
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public TerminalNode PARCERRADO() { return getToken(simplexParser.PARCERRADO, 0); }
		public OperMatematicaParentesisContext(ExpMATContext ctx) { copyFrom(ctx); }
	}
	public static class DecimalesContext extends ExpMATContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public DecimalesContext(ExpMATContext ctx) { copyFrom(ctx); }
	}
	public static class TrigonometricasContext extends ExpMATContext {
		public TrigonometricaContext trigonometrica() {
			return getRuleContext(TrigonometricaContext.class,0);
		}
		public TrigonometricasContext(ExpMATContext ctx) { copyFrom(ctx); }
	}
	public static class OperMultContext extends ExpMATContext {
		public Token operador;
		public List<ExpMATContext> expMAT() {
			return getRuleContexts(ExpMATContext.class);
		}
		public ExpMATContext expMAT(int i) {
			return getRuleContext(ExpMATContext.class,i);
		}
		public TerminalNode MULT() { return getToken(simplexParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(simplexParser.DIV, 0); }
		public OperMultContext(ExpMATContext ctx) { copyFrom(ctx); }
	}

	public final ExpMATContext expMAT() throws RecognitionException {
		return expMAT(0);
	}

	private ExpMATContext expMAT(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpMATContext _localctx = new ExpMATContext(_ctx, _parentState);
		ExpMATContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expMAT, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new OperMatematicaParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(184);
				match(PARABIERTO);
				setState(185);
				expMAT(0);
				setState(186);
				match(PARCERRADO);
				}
				break;
			case 2:
				{
				_localctx = new NumerosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				entero();
				}
				break;
			case 3:
				{
				_localctx = new DecimalesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				decimal(0);
				}
				break;
			case 4:
				{
				_localctx = new IdentificadoresContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				identificador();
				}
				break;
			case 5:
				{
				_localctx = new MenosExpMATContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(MENOS);
				setState(192);
				expMAT(2);
				}
				break;
			case 6:
				{
				_localctx = new TrigonometricasContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				trigonometrica();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(205);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new OperPotenciaContext(new ExpMATContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expMAT);
						setState(196);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(197);
						match(POTENCIA);
						setState(198);
						expMAT(10);
						}
						break;
					case 2:
						{
						_localctx = new OperMultContext(new ExpMATContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expMAT);
						setState(199);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(200);
						((OperMultContext)_localctx).operador = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((OperMultContext)_localctx).operador = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(201);
						expMAT(9);
						}
						break;
					case 3:
						{
						_localctx = new OperSumaContext(new ExpMATContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expMAT);
						setState(202);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(203);
						((OperSumaContext)_localctx).operador = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MAS || _la==MENOS) ) {
							((OperSumaContext)_localctx).operador = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(204);
						expMAT(8);
						}
						break;
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariablesContext extends VariableContext {
		public List<TerminalNode> LETRA() { return getTokens(simplexParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(simplexParser.LETRA, i);
		}
		public VariablesContext(VariableContext ctx) { copyFrom(ctx); }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable);
		int _la;
		try {
			_localctx = new VariablesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				match(LETRA);
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETRA );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> LETRA() { return getTokens(simplexParser.LETRA); }
		public TerminalNode LETRA(int i) {
			return getToken(simplexParser.LETRA, i);
		}
		public List<TerminalNode> DIGITO() { return getTokens(simplexParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(simplexParser.DIGITO, i);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_identificador);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(LETRA);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << LETRA) | (1L << DIGITO))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumeroContext extends ParserRuleContext {
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
	 
		public NumeroContext() { }
		public void copyFrom(NumeroContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumerosPolContext extends NumeroContext {
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public NumerosPolContext(NumeroContext ctx) { copyFrom(ctx); }
	}
	public static class DecimalesPolContext extends NumeroContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public DecimalesPolContext(NumeroContext ctx) { copyFrom(ctx); }
	}
	public static class ExpresionMatematicaContext extends NumeroContext {
		public TerminalNode PARABIERTO() { return getToken(simplexParser.PARABIERTO, 0); }
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public TerminalNode PARCERRADO() { return getToken(simplexParser.PARCERRADO, 0); }
		public ExpresionMatematicaContext(NumeroContext ctx) { copyFrom(ctx); }
	}
	public static class NoNumeroContext extends NumeroContext {
		public NoNumeroContext(NumeroContext ctx) { copyFrom(ctx); }
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_numero);
		try {
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new ExpresionMatematicaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(PARABIERTO);
				setState(223);
				expMAT(0);
				setState(224);
				match(PARCERRADO);
				}
				break;
			case 2:
				_localctx = new DecimalesPolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				decimal(0);
				}
				break;
			case 3:
				_localctx = new NumerosPolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				entero();
				}
				break;
			case 4:
				_localctx = new NoNumeroContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrigonometricaContext extends ParserRuleContext {
		public TrigonometricaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigonometrica; }
	 
		public TrigonometricaContext() { }
		public void copyFrom(TrigonometricaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CosenosContext extends TrigonometricaContext {
		public TerminalNode COSENO() { return getToken(simplexParser.COSENO, 0); }
		public TerminalNode PARABIERTO() { return getToken(simplexParser.PARABIERTO, 0); }
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public TerminalNode PARCERRADO() { return getToken(simplexParser.PARCERRADO, 0); }
		public CosenosContext(TrigonometricaContext ctx) { copyFrom(ctx); }
	}
	public static class LogaritmosContext extends TrigonometricaContext {
		public TerminalNode LOGARITMO() { return getToken(simplexParser.LOGARITMO, 0); }
		public TerminalNode PARABIERTO() { return getToken(simplexParser.PARABIERTO, 0); }
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public TerminalNode PARCERRADO() { return getToken(simplexParser.PARCERRADO, 0); }
		public LogaritmosContext(TrigonometricaContext ctx) { copyFrom(ctx); }
	}
	public static class EulerianosContext extends TrigonometricaContext {
		public TerminalNode EULER() { return getToken(simplexParser.EULER, 0); }
		public TerminalNode PARABIERTO() { return getToken(simplexParser.PARABIERTO, 0); }
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public TerminalNode PARCERRADO() { return getToken(simplexParser.PARCERRADO, 0); }
		public EulerianosContext(TrigonometricaContext ctx) { copyFrom(ctx); }
	}
	public static class SenosContext extends TrigonometricaContext {
		public TerminalNode SENO() { return getToken(simplexParser.SENO, 0); }
		public TerminalNode PARABIERTO() { return getToken(simplexParser.PARABIERTO, 0); }
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public TerminalNode PARCERRADO() { return getToken(simplexParser.PARCERRADO, 0); }
		public SenosContext(TrigonometricaContext ctx) { copyFrom(ctx); }
	}
	public static class TangentesContext extends TrigonometricaContext {
		public TerminalNode TANGENTE() { return getToken(simplexParser.TANGENTE, 0); }
		public TerminalNode PARABIERTO() { return getToken(simplexParser.PARABIERTO, 0); }
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public TerminalNode PARCERRADO() { return getToken(simplexParser.PARCERRADO, 0); }
		public TangentesContext(TrigonometricaContext ctx) { copyFrom(ctx); }
	}

	public final TrigonometricaContext trigonometrica() throws RecognitionException {
		TrigonometricaContext _localctx = new TrigonometricaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_trigonometrica);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SENO:
				_localctx = new SenosContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(SENO);
				setState(232);
				match(PARABIERTO);
				setState(233);
				expMAT(0);
				setState(234);
				match(PARCERRADO);
				}
				break;
			case COSENO:
				_localctx = new CosenosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(COSENO);
				setState(237);
				match(PARABIERTO);
				setState(238);
				expMAT(0);
				setState(239);
				match(PARCERRADO);
				}
				break;
			case TANGENTE:
				_localctx = new TangentesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				match(TANGENTE);
				setState(242);
				match(PARABIERTO);
				setState(243);
				expMAT(0);
				setState(244);
				match(PARCERRADO);
				}
				break;
			case EULER:
				_localctx = new EulerianosContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				match(EULER);
				setState(247);
				match(PARABIERTO);
				setState(248);
				expMAT(0);
				setState(249);
				match(PARCERRADO);
				}
				break;
			case LOGARITMO:
				_localctx = new LogaritmosContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				match(LOGARITMO);
				setState(252);
				match(PARABIERTO);
				setState(253);
				expMAT(0);
				setState(254);
				match(PARCERRADO);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalContext extends ParserRuleContext {
		public DecimalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimal; }
	 
		public DecimalContext() { }
		public void copyFrom(DecimalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalesPurosContext extends DecimalContext {
		public List<EnteroContext> entero() {
			return getRuleContexts(EnteroContext.class);
		}
		public EnteroContext entero(int i) {
			return getRuleContext(EnteroContext.class,i);
		}
		public TerminalNode PUNTO() { return getToken(simplexParser.PUNTO, 0); }
		public DecimalesPurosContext(DecimalContext ctx) { copyFrom(ctx); }
	}
	public static class EntrosCientificosContext extends DecimalContext {
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public ExponencialContext exponencial() {
			return getRuleContext(ExponencialContext.class,0);
		}
		public EntrosCientificosContext(DecimalContext ctx) { copyFrom(ctx); }
	}
	public static class DecimalesCientificosContext extends DecimalContext {
		public DecimalContext decimal() {
			return getRuleContext(DecimalContext.class,0);
		}
		public ExponencialContext exponencial() {
			return getRuleContext(ExponencialContext.class,0);
		}
		public DecimalesCientificosContext(DecimalContext ctx) { copyFrom(ctx); }
	}

	public final DecimalContext decimal() throws RecognitionException {
		return decimal(0);
	}

	private DecimalContext decimal(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DecimalContext _localctx = new DecimalContext(_ctx, _parentState);
		DecimalContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_decimal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new DecimalesPurosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(259);
				entero();
				setState(260);
				match(PUNTO);
				setState(261);
				entero();
				}
				break;
			case 2:
				{
				_localctx = new EntrosCientificosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(263);
				entero();
				setState(264);
				exponencial();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DecimalesCientificosContext(new DecimalContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_decimal);
					setState(268);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(269);
					exponencial();
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExponencialContext extends ParserRuleContext {
		public ExponencialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exponencial; }
	 
		public ExponencialContext() { }
		public void copyFrom(ExponencialContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExponencialesNegativosContext extends ExponencialContext {
		public TerminalNode EXPONENCIAL() { return getToken(simplexParser.EXPONENCIAL, 0); }
		public TerminalNode MENOS() { return getToken(simplexParser.MENOS, 0); }
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public ExponencialesNegativosContext(ExponencialContext ctx) { copyFrom(ctx); }
	}
	public static class ExponencialesUSContext extends ExponencialContext {
		public TerminalNode EXPONENCIAL() { return getToken(simplexParser.EXPONENCIAL, 0); }
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public ExponencialesUSContext(ExponencialContext ctx) { copyFrom(ctx); }
	}
	public static class ExponencialesPositivosContext extends ExponencialContext {
		public TerminalNode EXPONENCIAL() { return getToken(simplexParser.EXPONENCIAL, 0); }
		public TerminalNode MAS() { return getToken(simplexParser.MAS, 0); }
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public ExponencialesPositivosContext(ExponencialContext ctx) { copyFrom(ctx); }
	}

	public final ExponencialContext exponencial() throws RecognitionException {
		ExponencialContext _localctx = new ExponencialContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_exponencial);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				_localctx = new ExponencialesUSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				match(EXPONENCIAL);
				setState(276);
				entero();
				}
				break;
			case 2:
				_localctx = new ExponencialesNegativosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(EXPONENCIAL);
				setState(278);
				match(MENOS);
				setState(279);
				entero();
				}
				break;
			case 3:
				_localctx = new ExponencialesPositivosContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(EXPONENCIAL);
				setState(281);
				match(MAS);
				setState(282);
				entero();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnteroContext extends ParserRuleContext {
		public List<TerminalNode> DIGITO() { return getTokens(simplexParser.DIGITO); }
		public TerminalNode DIGITO(int i) {
			return getToken(simplexParser.DIGITO, i);
		}
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_entero);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(286); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(285);
					match(DIGITO);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(288); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MayorIgualContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(simplexParser.MAYOR, 0); }
		public TerminalNode IGUAL() { return getToken(simplexParser.IGUAL, 0); }
		public MayorIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayorIgual; }
	}

	public final MayorIgualContext mayorIgual() throws RecognitionException {
		MayorIgualContext _localctx = new MayorIgualContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mayorIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(MAYOR);
			setState(291);
			match(IGUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenorIgualContext extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(simplexParser.MENOR, 0); }
		public TerminalNode IGUAL() { return getToken(simplexParser.IGUAL, 0); }
		public MenorIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menorIgual; }
	}

	public final MenorIgualContext menorIgual() throws RecognitionException {
		MenorIgualContext _localctx = new MenorIgualContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_menorIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(MENOR);
			setState(294);
			match(IGUAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expMAT_sempred((ExpMATContext)_localctx, predIndex);
		case 19:
			return decimal_sempred((DecimalContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expMAT_sempred(ExpMATContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean decimal_sempred(DecimalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u012b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\7\3\66\n\3\f\3\16\39\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4J\n\4\3\5\6\5M\n\5\r\5\16\5N\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\6\6\\\n\6\r\6\16\6]\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\b\3\b\3\b\3\b\3\b\3\b\6\b"+
		"t\n\b\r\b\16\bu\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0084"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u0095\n\f\f\f\16\f\u0098\13\f\3\f\3\f\3\r\3\r\3\r\6\r\u009f\n\r\r\r"+
		"\16\r\u00a0\3\r\3\r\3\r\3\r\6\r\u00a7\n\r\r\r\16\r\u00a8\3\r\5\r\u00ac"+
		"\n\r\3\16\3\16\3\16\3\16\5\16\u00b2\n\16\3\17\3\17\3\17\3\17\5\17\u00b8"+
		"\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c5"+
		"\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d0\n\20\f\20"+
		"\16\20\u00d3\13\20\3\21\6\21\u00d6\n\21\r\21\16\21\u00d7\3\22\3\22\7\22"+
		"\u00dc\n\22\f\22\16\22\u00df\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u00e8\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0103\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u010d\n"+
		"\25\3\25\3\25\7\25\u0111\n\25\f\25\16\25\u0114\13\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u011e\n\26\3\27\6\27\u0121\n\27\r\27\16\27"+
		"\u0122\3\30\3\30\3\30\3\31\3\31\3\31\3\31\2\4\36(\32\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\2\6\3\2\27\30\3\2\6\7\3\2\4\5\5\2\3"+
		"\3\13\13\17\17\2\u013d\2\62\3\2\2\2\4\67\3\2\2\2\6I\3\2\2\2\bL\3\2\2\2"+
		"\nU\3\2\2\2\fk\3\2\2\2\16m\3\2\2\2\20\u0083\3\2\2\2\22\u0085\3\2\2\2\24"+
		"\u008b\3\2\2\2\26\u008f\3\2\2\2\30\u00ab\3\2\2\2\32\u00b1\3\2\2\2\34\u00b7"+
		"\3\2\2\2\36\u00c4\3\2\2\2 \u00d5\3\2\2\2\"\u00d9\3\2\2\2$\u00e7\3\2\2"+
		"\2&\u0102\3\2\2\2(\u010c\3\2\2\2*\u011d\3\2\2\2,\u0120\3\2\2\2.\u0124"+
		"\3\2\2\2\60\u0127\3\2\2\2\62\63\5\4\3\2\63\3\3\2\2\2\64\66\5\6\4\2\65"+
		"\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\29\67\3\2\2"+
		"\2:;\7\2\2\3;\5\3\2\2\2<=\5\"\22\2=>\7\n\2\2>?\5\36\20\2?J\3\2\2\2@J\5"+
		"\36\20\2AB\7\26\2\2BC\7\20\2\2CD\5\6\4\2DE\7\21\2\2EJ\3\2\2\2FJ\7\r\2"+
		"\2GJ\5\b\5\2HJ\7\"\2\2I<\3\2\2\2I@\3\2\2\2IA\3\2\2\2IF\3\2\2\2IG\3\2\2"+
		"\2IH\3\2\2\2J\7\3\2\2\2KM\5\22\n\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2"+
		"\2\2OP\3\2\2\2PQ\5\16\b\2QR\5\n\6\2RS\7\33\2\2ST\7\r\2\2T\t\3\2\2\2UV"+
		"\7\34\2\2VW\7\24\2\2W[\7\r\2\2XY\5\f\7\2YZ\7\r\2\2Z\\\3\2\2\2[X\3\2\2"+
		"\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^\13\3\2\2\2_`\5 \21\2`a\7\n\2\2ab\5"+
		"\36\20\2bl\3\2\2\2cd\5 \21\2de\5.\30\2ef\5\36\20\2fl\3\2\2\2gh\5 \21\2"+
		"hi\5\60\31\2ij\5\36\20\2jl\3\2\2\2k_\3\2\2\2kc\3\2\2\2kg\3\2\2\2l\r\3"+
		"\2\2\2mn\7\32\2\2no\7\24\2\2os\7\r\2\2pq\5\20\t\2qr\7\r\2\2rt\3\2\2\2"+
		"sp\3\2\2\2tu\3\2\2\2us\3\2\2\2uv\3\2\2\2v\17\3\2\2\2wx\5\30\r\2xy\7\n"+
		"\2\2yz\5\36\20\2z\u0084\3\2\2\2{|\5\30\r\2|}\5.\30\2}~\5\36\20\2~\u0084"+
		"\3\2\2\2\177\u0080\5\30\r\2\u0080\u0081\5\60\31\2\u0081\u0082\5\36\20"+
		"\2\u0082\u0084\3\2\2\2\u0083w\3\2\2\2\u0083{\3\2\2\2\u0083\177\3\2\2\2"+
		"\u0084\21\3\2\2\2\u0085\u0086\t\2\2\2\u0086\u0087\7\24\2\2\u0087\u0088"+
		"\7\r\2\2\u0088\u0089\5\24\13\2\u0089\u008a\7\r\2\2\u008a\23\3\2\2\2\u008b"+
		"\u008c\5\26\f\2\u008c\u008d\7\n\2\2\u008d\u008e\5\30\r\2\u008e\25\3\2"+
		"\2\2\u008f\u0090\7\31\2\2\u0090\u0091\7\20\2\2\u0091\u0096\5 \21\2\u0092"+
		"\u0093\7\f\2\2\u0093\u0095\5 \21\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2"+
		"\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\7\21\2\2\u009a\27\3\2\2\2\u009b\u009c\7\5\2"+
		"\2\u009c\u009e\5\34\17\2\u009d\u009f\5\32\16\2\u009e\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00ac\3\2"+
		"\2\2\u00a2\u00a3\7\5\2\2\u00a3\u00ac\5\34\17\2\u00a4\u00a6\5\34\17\2\u00a5"+
		"\u00a7\5\32\16\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3"+
		"\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ac\5\34\17\2\u00ab"+
		"\u009b\3\2\2\2\u00ab\u00a2\3\2\2\2\u00ab\u00a4\3\2\2\2\u00ab\u00aa\3\2"+
		"\2\2\u00ac\31\3\2\2\2\u00ad\u00ae\7\4\2\2\u00ae\u00b2\5\34\17\2\u00af"+
		"\u00b0\7\5\2\2\u00b0\u00b2\5\34\17\2\u00b1\u00ad\3\2\2\2\u00b1\u00af\3"+
		"\2\2\2\u00b2\33\3\2\2\2\u00b3\u00b4\5$\23\2\u00b4\u00b5\5 \21\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b8\5\36\20\2\u00b7\u00b3\3\2\2\2\u00b7\u00b6\3"+
		"\2\2\2\u00b8\35\3\2\2\2\u00b9\u00ba\b\20\1\2\u00ba\u00bb\7\20\2\2\u00bb"+
		"\u00bc\5\36\20\2\u00bc\u00bd\7\21\2\2\u00bd\u00c5\3\2\2\2\u00be\u00c5"+
		"\5,\27\2\u00bf\u00c5\5(\25\2\u00c0\u00c5\5\"\22\2\u00c1\u00c2\7\5\2\2"+
		"\u00c2\u00c5\5\36\20\4\u00c3\u00c5\5&\24\2\u00c4\u00b9\3\2\2\2\u00c4\u00be"+
		"\3\2\2\2\u00c4\u00bf\3\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5\u00d1\3\2\2\2\u00c6\u00c7\f\13\2\2\u00c7\u00c8\7"+
		"\b\2\2\u00c8\u00d0\5\36\20\f\u00c9\u00ca\f\n\2\2\u00ca\u00cb\t\3\2\2\u00cb"+
		"\u00d0\5\36\20\13\u00cc\u00cd\f\t\2\2\u00cd\u00ce\t\4\2\2\u00ce\u00d0"+
		"\5\36\20\n\u00cf\u00c6\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cc\3\2\2\2"+
		"\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\37"+
		"\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d6\7\13\2\2\u00d5\u00d4\3\2\2\2"+
		"\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8!\3"+
		"\2\2\2\u00d9\u00dd\7\13\2\2\u00da\u00dc\t\5\2\2\u00db\u00da\3\2\2\2\u00dc"+
		"\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de#\3\2\2\2"+
		"\u00df\u00dd\3\2\2\2\u00e0\u00e1\7\20\2\2\u00e1\u00e2\5\36\20\2\u00e2"+
		"\u00e3\7\21\2\2\u00e3\u00e8\3\2\2\2\u00e4\u00e8\5(\25\2\u00e5\u00e8\5"+
		",\27\2\u00e6\u00e8\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e7\u00e4\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8%\3\2\2\2\u00e9\u00ea\7\35\2\2"+
		"\u00ea\u00eb\7\20\2\2\u00eb\u00ec\5\36\20\2\u00ec\u00ed\7\21\2\2\u00ed"+
		"\u0103\3\2\2\2\u00ee\u00ef\7\36\2\2\u00ef\u00f0\7\20\2\2\u00f0\u00f1\5"+
		"\36\20\2\u00f1\u00f2\7\21\2\2\u00f2\u0103\3\2\2\2\u00f3\u00f4\7\37\2\2"+
		"\u00f4\u00f5\7\20\2\2\u00f5\u00f6\5\36\20\2\u00f6\u00f7\7\21\2\2\u00f7"+
		"\u0103\3\2\2\2\u00f8\u00f9\7 \2\2\u00f9\u00fa\7\20\2\2\u00fa\u00fb\5\36"+
		"\20\2\u00fb\u00fc\7\21\2\2\u00fc\u0103\3\2\2\2\u00fd\u00fe\7!\2\2\u00fe"+
		"\u00ff\7\20\2\2\u00ff\u0100\5\36\20\2\u0100\u0101\7\21\2\2\u0101\u0103"+
		"\3\2\2\2\u0102\u00e9\3\2\2\2\u0102\u00ee\3\2\2\2\u0102\u00f3\3\2\2\2\u0102"+
		"\u00f8\3\2\2\2\u0102\u00fd\3\2\2\2\u0103\'\3\2\2\2\u0104\u0105\b\25\1"+
		"\2\u0105\u0106\5,\27\2\u0106\u0107\7\t\2\2\u0107\u0108\5,\27\2\u0108\u010d"+
		"\3\2\2\2\u0109\u010a\5,\27\2\u010a\u010b\5*\26\2\u010b\u010d\3\2\2\2\u010c"+
		"\u0104\3\2\2\2\u010c\u0109\3\2\2\2\u010d\u0112\3\2\2\2\u010e\u010f\f\4"+
		"\2\2\u010f\u0111\5*\26\2\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112"+
		"\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113)\3\2\2\2\u0114\u0112\3\2\2\2"+
		"\u0115\u0116\7\25\2\2\u0116\u011e\5,\27\2\u0117\u0118\7\25\2\2\u0118\u0119"+
		"\7\5\2\2\u0119\u011e\5,\27\2\u011a\u011b\7\25\2\2\u011b\u011c\7\4\2\2"+
		"\u011c\u011e\5,\27\2\u011d\u0115\3\2\2\2\u011d\u0117\3\2\2\2\u011d\u011a"+
		"\3\2\2\2\u011e+\3\2\2\2\u011f\u0121\7\17\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123-\3\2\2\2"+
		"\u0124\u0125\7\22\2\2\u0125\u0126\7\n\2\2\u0126/\3\2\2\2\u0127\u0128\7"+
		"\23\2\2\u0128\u0129\7\n\2\2\u0129\61\3\2\2\2\32\67IN]ku\u0083\u0096\u00a0"+
		"\u00a8\u00ab\u00b1\u00b7\u00c4\u00cf\u00d1\u00d7\u00dd\u00e7\u0102\u010c"+
		"\u0112\u011d\u0122";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}