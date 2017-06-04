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
		MINI=22, FUNCION=23, RESTRICCIONES=24, RESOLVER=25, CON=26, COMENTARIO=27;
	public static final int
		RULE_iniciar = 0, RULE_programa = 1, RULE_expresion = 2, RULE_problema = 3, 
		RULE_restricionVariable = 4, RULE_desigualdadVariable = 5, RULE_restriccion = 6, 
		RULE_desigualdad = 7, RULE_funcionTrans = 8, RULE_funcion = 9, RULE_funcionDef = 10, 
		RULE_polinomio = 11, RULE_monomioAdd = 12, RULE_monomio = 13, RULE_expMAT = 14, 
		RULE_variable = 15, RULE_identificador = 16, RULE_numero = 17, RULE_decimal = 18, 
		RULE_exponencial = 19, RULE_entero = 20, RULE_mayorIgual = 21, RULE_menorIgual = 22;
	public static final String[] ruleNames = {
		"iniciar", "programa", "expresion", "problema", "restricionVariable", 
		"desigualdadVariable", "restriccion", "desigualdad", "funcionTrans", "funcion", 
		"funcionDef", "polinomio", "monomioAdd", "monomio", "expMAT", "variable", 
		"identificador", "numero", "decimal", "exponencial", "entero", "mayorIgual", 
		"menorIgual"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'_'", "'+'", "'-'", "'*'", "'/'", "'**'", "'.'", "'='", null, "','", 
		null, null, null, "'('", "')'", "'>'", "'<'", "':'", null, null, null, 
		null, null, null, null, "'con'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "MAS", "MENOS", "MULT", "DIV", "POTENCIA", "PUNTO", "IGUAL", 
		"LETRA", "COMA", "SALTOLINEA", "BLANCO", "DIGITO", "PARABIERTO", "PARCERRADO", 
		"MAYOR", "MENOR", "DOSPUNTOS", "EXPONENCIAL", "IMPRIMIR", "MAXI", "MINI", 
		"FUNCION", "RESTRICCIONES", "RESOLVER", "CON", "COMENTARIO"
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
			setState(46);
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
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << LETRA) | (1L << SALTOLINEA) | (1L << DIGITO) | (1L << PARABIERTO) | (1L << IMPRIMIR) | (1L << MAXI) | (1L << MINI))) != 0)) {
				{
				{
				setState(48);
				expresion();
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(54);
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AsignarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				identificador();
				setState(57);
				match(IGUAL);
				setState(58);
				expMAT(0);
				}
				break;
			case 2:
				_localctx = new CalcularContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				expMAT(0);
				}
				break;
			case 3:
				_localctx = new ImprimirExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(IMPRIMIR);
				setState(62);
				match(PARABIERTO);
				setState(63);
				expresion();
				setState(64);
				match(PARCERRADO);
				}
				break;
			case 4:
				_localctx = new SaltarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(SALTOLINEA);
				}
				break;
			case 5:
				_localctx = new ProblemasExpresadosContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(67);
				problema();
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
		public FuncionTransContext funcionTrans() {
			return getRuleContext(FuncionTransContext.class,0);
		}
		public RestriccionContext restriccion() {
			return getRuleContext(RestriccionContext.class,0);
		}
		public RestricionVariableContext restricionVariable() {
			return getRuleContext(RestricionVariableContext.class,0);
		}
		public TerminalNode RESOLVER() { return getToken(simplexParser.RESOLVER, 0); }
		public TerminalNode SALTOLINEA() { return getToken(simplexParser.SALTOLINEA, 0); }
		public ProblemasContext(ProblemaContext ctx) { copyFrom(ctx); }
	}

	public final ProblemaContext problema() throws RecognitionException {
		ProblemaContext _localctx = new ProblemaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_problema);
		try {
			_localctx = new ProblemasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			funcionTrans();
			setState(71);
			restriccion();
			setState(72);
			restricionVariable();
			setState(73);
			match(RESOLVER);
			setState(74);
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
			setState(76);
			match(CON);
			setState(77);
			match(DOSPUNTOS);
			setState(78);
			match(SALTOLINEA);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(79);
				desigualdadVariable();
				setState(80);
				match(SALTOLINEA);
				}
				}
				setState(84); 
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
		public Token tipo;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public TerminalNode MENOR() { return getToken(simplexParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(simplexParser.MAYOR, 0); }
		public TerminalNode IGUAL() { return getToken(simplexParser.IGUAL, 0); }
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
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new DesigualdadesVariablesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				variable();
				setState(87);
				((DesigualdadesVariablesContext)_localctx).tipo = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAYOR) | (1L << MENOR))) != 0)) ) {
					((DesigualdadesVariablesContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(88);
				expMAT(0);
				}
				break;
			case 2:
				_localctx = new DesigualdadesVariablesMayorIgualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				variable();
				setState(91);
				mayorIgual();
				setState(92);
				expMAT(0);
				}
				break;
			case 3:
				_localctx = new DesigualdadesVariablesMenorIgualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				variable();
				setState(95);
				menorIgual();
				setState(96);
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
			setState(100);
			match(RESTRICCIONES);
			setState(101);
			match(DOSPUNTOS);
			setState(102);
			match(SALTOLINEA);
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(103);
				desigualdad();
				setState(104);
				match(SALTOLINEA);
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << LETRA) | (1L << DIGITO) | (1L << PARABIERTO))) != 0) );
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
		public Token tipo;
		public PolinomioContext polinomio() {
			return getRuleContext(PolinomioContext.class,0);
		}
		public ExpMATContext expMAT() {
			return getRuleContext(ExpMATContext.class,0);
		}
		public TerminalNode MENOR() { return getToken(simplexParser.MENOR, 0); }
		public TerminalNode MAYOR() { return getToken(simplexParser.MAYOR, 0); }
		public TerminalNode IGUAL() { return getToken(simplexParser.IGUAL, 0); }
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
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new DesigualdadesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				polinomio();
				setState(111);
				((DesigualdadesContext)_localctx).tipo = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IGUAL) | (1L << MAYOR) | (1L << MENOR))) != 0)) ) {
					((DesigualdadesContext)_localctx).tipo = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(112);
				expMAT(0);
				}
				break;
			case 2:
				_localctx = new DesigualdadesMayorIgualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				polinomio();
				setState(115);
				mayorIgual();
				setState(116);
				expMAT(0);
				}
				break;
			case 3:
				_localctx = new DesigualdadesMenorIgualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				polinomio();
				setState(119);
				menorIgual();
				setState(120);
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
			setState(124);
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
			setState(125);
			match(DOSPUNTOS);
			setState(126);
			match(SALTOLINEA);
			setState(127);
			funcion();
			setState(128);
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
			setState(130);
			funcionDef();
			setState(131);
			match(IGUAL);
			setState(132);
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
			setState(134);
			match(FUNCION);
			setState(135);
			match(PARABIERTO);
			setState(136);
			variable();
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(137);
				match(COMA);
				setState(138);
				variable();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
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
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PolinomiosContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				monomio();
				setState(148); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(147);
					monomioAdd();
					}
					}
					setState(150); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MAS || _la==MENOS );
				}
				break;
			case 2:
				_localctx = new MonPolinomiosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
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
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
				_localctx = new MasMonomioContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(MAS);
				setState(156);
				monomio();
				}
				break;
			case MENOS:
				_localctx = new MenosMonomioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(MENOS);
				setState(158);
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
		public NumeroContext e;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new MonomioMinimoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				((MonomioMinimoContext)_localctx).e = numero();
				setState(162);
				variable();
				}
				break;
			case 2:
				_localctx = new NumeroMonomioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new OperMatematicaParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(168);
				match(PARABIERTO);
				setState(169);
				expMAT(0);
				setState(170);
				match(PARCERRADO);
				}
				break;
			case 2:
				{
				_localctx = new NumerosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				entero();
				}
				break;
			case 3:
				{
				_localctx = new DecimalesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(173);
				decimal(0);
				}
				break;
			case 4:
				{
				_localctx = new IdentificadoresContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(174);
				identificador();
				}
				break;
			case 5:
				{
				_localctx = new MenosExpMATContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(175);
				match(MENOS);
				setState(176);
				expMAT(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(188);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new OperPotenciaContext(new ExpMATContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expMAT);
						setState(179);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(180);
						match(POTENCIA);
						setState(181);
						expMAT(9);
						}
						break;
					case 2:
						{
						_localctx = new OperMultContext(new ExpMATContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expMAT);
						setState(182);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(183);
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
						setState(184);
						expMAT(8);
						}
						break;
					case 3:
						{
						_localctx = new OperSumaContext(new ExpMATContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expMAT);
						setState(185);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(186);
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
						setState(187);
						expMAT(7);
						}
						break;
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
			setState(194); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(193);
				match(LETRA);
				}
				}
				setState(196); 
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
			setState(198);
			match(LETRA);
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
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
				setState(204);
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
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new ExpresionMatematicaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(PARABIERTO);
				setState(206);
				expMAT(0);
				setState(207);
				match(PARCERRADO);
				}
				break;
			case 2:
				_localctx = new DecimalesPolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				decimal(0);
				}
				break;
			case 3:
				_localctx = new NumerosPolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_decimal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new DecimalesPurosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(215);
				entero();
				setState(216);
				match(PUNTO);
				setState(217);
				entero();
				}
				break;
			case 2:
				{
				_localctx = new EntrosCientificosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				entero();
				setState(220);
				exponencial();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DecimalesCientificosContext(new DecimalContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_decimal);
					setState(224);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(225);
					exponencial();
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		enterRule(_localctx, 38, RULE_exponencial);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new ExponencialesUSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				match(EXPONENCIAL);
				setState(232);
				entero();
				}
				break;
			case 2:
				_localctx = new ExponencialesNegativosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(EXPONENCIAL);
				setState(234);
				match(MENOS);
				setState(235);
				entero();
				}
				break;
			case 3:
				_localctx = new ExponencialesPositivosContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(EXPONENCIAL);
				setState(237);
				match(MAS);
				setState(238);
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
		enterRule(_localctx, 40, RULE_entero);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(241);
					match(DIGITO);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(244); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
		enterRule(_localctx, 42, RULE_mayorIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(MAYOR);
			setState(247);
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
		enterRule(_localctx, 44, RULE_menorIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(MENOR);
			setState(250);
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
		case 18:
			return decimal_sempred((DecimalContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expMAT_sempred(ExpMATContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00ff\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\7\3\64\n\3\f\3\16\3\67\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\4G\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\6\6U\n\6\r\6\16\6V\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7e\n\7\3\b\3\b\3\b\3\b\3\b\3\b\6\bm\n\b\r\b\16\bn\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u008e\n\f\f\f\16\f\u0091\13\f"+
		"\3\f\3\f\3\r\3\r\6\r\u0097\n\r\r\r\16\r\u0098\3\r\5\r\u009c\n\r\3\16\3"+
		"\16\3\16\3\16\5\16\u00a2\n\16\3\17\3\17\3\17\3\17\5\17\u00a8\n\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b4\n\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00bf\n\20\f\20\16\20\u00c2\13"+
		"\20\3\21\6\21\u00c5\n\21\r\21\16\21\u00c6\3\22\3\22\7\22\u00cb\n\22\f"+
		"\22\16\22\u00ce\13\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d7\n"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e1\n\24\3\24\3\24"+
		"\7\24\u00e5\n\24\f\24\16\24\u00e8\13\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u00f2\n\25\3\26\6\26\u00f5\n\26\r\26\16\26\u00f6\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\2\4\36&\31\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\2\7\4\2\n\n\22\23\3\2\27\30\3\2\6\7\3\2\4\5\5\2\3\3"+
		"\13\13\17\17\2\u0108\2\60\3\2\2\2\4\65\3\2\2\2\6F\3\2\2\2\bH\3\2\2\2\n"+
		"N\3\2\2\2\fd\3\2\2\2\16f\3\2\2\2\20|\3\2\2\2\22~\3\2\2\2\24\u0084\3\2"+
		"\2\2\26\u0088\3\2\2\2\30\u009b\3\2\2\2\32\u00a1\3\2\2\2\34\u00a7\3\2\2"+
		"\2\36\u00b3\3\2\2\2 \u00c4\3\2\2\2\"\u00c8\3\2\2\2$\u00d6\3\2\2\2&\u00e0"+
		"\3\2\2\2(\u00f1\3\2\2\2*\u00f4\3\2\2\2,\u00f8\3\2\2\2.\u00fb\3\2\2\2\60"+
		"\61\5\4\3\2\61\3\3\2\2\2\62\64\5\6\4\2\63\62\3\2\2\2\64\67\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\668\3\2\2\2\67\65\3\2\2\289\7\2\2\39\5\3\2\2"+
		"\2:;\5\"\22\2;<\7\n\2\2<=\5\36\20\2=G\3\2\2\2>G\5\36\20\2?@\7\26\2\2@"+
		"A\7\20\2\2AB\5\6\4\2BC\7\21\2\2CG\3\2\2\2DG\7\r\2\2EG\5\b\5\2F:\3\2\2"+
		"\2F>\3\2\2\2F?\3\2\2\2FD\3\2\2\2FE\3\2\2\2G\7\3\2\2\2HI\5\22\n\2IJ\5\16"+
		"\b\2JK\5\n\6\2KL\7\33\2\2LM\7\r\2\2M\t\3\2\2\2NO\7\34\2\2OP\7\24\2\2P"+
		"T\7\r\2\2QR\5\f\7\2RS\7\r\2\2SU\3\2\2\2TQ\3\2\2\2UV\3\2\2\2VT\3\2\2\2"+
		"VW\3\2\2\2W\13\3\2\2\2XY\5 \21\2YZ\t\2\2\2Z[\5\36\20\2[e\3\2\2\2\\]\5"+
		" \21\2]^\5,\27\2^_\5\36\20\2_e\3\2\2\2`a\5 \21\2ab\5.\30\2bc\5\36\20\2"+
		"ce\3\2\2\2dX\3\2\2\2d\\\3\2\2\2d`\3\2\2\2e\r\3\2\2\2fg\7\32\2\2gh\7\24"+
		"\2\2hl\7\r\2\2ij\5\20\t\2jk\7\r\2\2km\3\2\2\2li\3\2\2\2mn\3\2\2\2nl\3"+
		"\2\2\2no\3\2\2\2o\17\3\2\2\2pq\5\30\r\2qr\t\2\2\2rs\5\36\20\2s}\3\2\2"+
		"\2tu\5\30\r\2uv\5,\27\2vw\5\36\20\2w}\3\2\2\2xy\5\30\r\2yz\5.\30\2z{\5"+
		"\36\20\2{}\3\2\2\2|p\3\2\2\2|t\3\2\2\2|x\3\2\2\2}\21\3\2\2\2~\177\t\3"+
		"\2\2\177\u0080\7\24\2\2\u0080\u0081\7\r\2\2\u0081\u0082\5\24\13\2\u0082"+
		"\u0083\7\r\2\2\u0083\23\3\2\2\2\u0084\u0085\5\26\f\2\u0085\u0086\7\n\2"+
		"\2\u0086\u0087\5\30\r\2\u0087\25\3\2\2\2\u0088\u0089\7\31\2\2\u0089\u008a"+
		"\7\20\2\2\u008a\u008f\5 \21\2\u008b\u008c\7\f\2\2\u008c\u008e\5 \21\2"+
		"\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\21\2\2"+
		"\u0093\27\3\2\2\2\u0094\u0096\5\34\17\2\u0095\u0097\5\32\16\2\u0096\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u009c\5\34\17\2\u009b\u0094\3\2\2\2\u009b\u009a\3"+
		"\2\2\2\u009c\31\3\2\2\2\u009d\u009e\7\4\2\2\u009e\u00a2\5\34\17\2\u009f"+
		"\u00a0\7\5\2\2\u00a0\u00a2\5\34\17\2\u00a1\u009d\3\2\2\2\u00a1\u009f\3"+
		"\2\2\2\u00a2\33\3\2\2\2\u00a3\u00a4\5$\23\2\u00a4\u00a5\5 \21\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a8\5\36\20\2\u00a7\u00a3\3\2\2\2\u00a7\u00a6\3"+
		"\2\2\2\u00a8\35\3\2\2\2\u00a9\u00aa\b\20\1\2\u00aa\u00ab\7\20\2\2\u00ab"+
		"\u00ac\5\36\20\2\u00ac\u00ad\7\21\2\2\u00ad\u00b4\3\2\2\2\u00ae\u00b4"+
		"\5*\26\2\u00af\u00b4\5&\24\2\u00b0\u00b4\5\"\22\2\u00b1\u00b2\7\5\2\2"+
		"\u00b2\u00b4\5\36\20\3\u00b3\u00a9\3\2\2\2\u00b3\u00ae\3\2\2\2\u00b3\u00af"+
		"\3\2\2\2\u00b3\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00c0\3\2\2\2\u00b5"+
		"\u00b6\f\n\2\2\u00b6\u00b7\7\b\2\2\u00b7\u00bf\5\36\20\13\u00b8\u00b9"+
		"\f\t\2\2\u00b9\u00ba\t\4\2\2\u00ba\u00bf\5\36\20\n\u00bb\u00bc\f\b\2\2"+
		"\u00bc\u00bd\t\5\2\2\u00bd\u00bf\5\36\20\t\u00be\u00b5\3\2\2\2\u00be\u00b8"+
		"\3\2\2\2\u00be\u00bb\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\37\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c5\7\13\2"+
		"\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7!\3\2\2\2\u00c8\u00cc\7\13\2\2\u00c9\u00cb\t\6\2\2\u00ca"+
		"\u00c9\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd#\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\7\20\2\2\u00d0\u00d1"+
		"\5\36\20\2\u00d1\u00d2\7\21\2\2\u00d2\u00d7\3\2\2\2\u00d3\u00d7\5&\24"+
		"\2\u00d4\u00d7\5*\26\2\u00d5\u00d7\3\2\2\2\u00d6\u00cf\3\2\2\2\u00d6\u00d3"+
		"\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d5\3\2\2\2\u00d7%\3\2\2\2\u00d8"+
		"\u00d9\b\24\1\2\u00d9\u00da\5*\26\2\u00da\u00db\7\t\2\2\u00db\u00dc\5"+
		"*\26\2\u00dc\u00e1\3\2\2\2\u00dd\u00de\5*\26\2\u00de\u00df\5(\25\2\u00df"+
		"\u00e1\3\2\2\2\u00e0\u00d8\3\2\2\2\u00e0\u00dd\3\2\2\2\u00e1\u00e6\3\2"+
		"\2\2\u00e2\u00e3\f\4\2\2\u00e3\u00e5\5(\25\2\u00e4\u00e2\3\2\2\2\u00e5"+
		"\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\'\3\2\2\2"+
		"\u00e8\u00e6\3\2\2\2\u00e9\u00ea\7\25\2\2\u00ea\u00f2\5*\26\2\u00eb\u00ec"+
		"\7\25\2\2\u00ec\u00ed\7\5\2\2\u00ed\u00f2\5*\26\2\u00ee\u00ef\7\25\2\2"+
		"\u00ef\u00f0\7\4\2\2\u00f0\u00f2\5*\26\2\u00f1\u00e9\3\2\2\2\u00f1\u00eb"+
		"\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2)\3\2\2\2\u00f3\u00f5\7\17\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7+\3\2\2\2\u00f8\u00f9\7\22\2\2\u00f9\u00fa\7\n\2\2\u00fa-\3"+
		"\2\2\2\u00fb\u00fc\7\23\2\2\u00fc\u00fd\7\n\2\2\u00fd/\3\2\2\2\27\65F"+
		"Vdn|\u008f\u0098\u009b\u00a1\u00a7\u00b3\u00be\u00c0\u00c6\u00cc\u00d6"+
		"\u00e0\u00e6\u00f1\u00f6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}