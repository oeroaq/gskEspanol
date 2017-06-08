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
		MINI=22, RESTRICCIONES=23, RESOLVER=24, CON=25, SENO=26, COSENO=27, TANGENTE=28, 
		EULER=29, LOGARITMO=30, COMENTARIO=31;
	public static final int
		RULE_iniciar = 0, RULE_programa = 1, RULE_expresion = 2, RULE_multiobjetivo = 3, 
		RULE_resolver = 4, RULE_problema = 5, RULE_restricionVariable = 6, RULE_desigualdadVariable = 7, 
		RULE_restriccion = 8, RULE_desigualdad = 9, RULE_funcionTrans = 10, RULE_funcion = 11, 
		RULE_funcionDef = 12, RULE_nombrefuncion = 13, RULE_polinomio = 14, RULE_monomioAdd = 15, 
		RULE_monomio = 16, RULE_expMAT = 17, RULE_variable = 18, RULE_identificador = 19, 
		RULE_numero = 20, RULE_trigonometrica = 21, RULE_decimal = 22, RULE_exponencial = 23, 
		RULE_entero = 24, RULE_mayorIgual = 25, RULE_menorIgual = 26;
	public static final String[] ruleNames = {
		"iniciar", "programa", "expresion", "multiobjetivo", "resolver", "problema", 
		"restricionVariable", "desigualdadVariable", "restriccion", "desigualdad", 
		"funcionTrans", "funcion", "funcionDef", "nombrefuncion", "polinomio", 
		"monomioAdd", "monomio", "expMAT", "variable", "identificador", "numero", 
		"trigonometrica", "decimal", "exponencial", "entero", "mayorIgual", "menorIgual"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'_'", "'+'", "'-'", "'*'", "'/'", "'**'", "'.'", "'='", null, "','", 
		null, null, null, "'('", "')'", "'>'", "'<'", "':'", null, null, null, 
		null, null, null, "'con'", "'sen'", "'cos'", "'tan'", "'exp'", "'ln'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "MAS", "MENOS", "MULT", "DIV", "POTENCIA", "PUNTO", "IGUAL", 
		"LETRA", "COMA", "SALTOLINEA", "BLANCO", "DIGITO", "PARABIERTO", "PARCERRADO", 
		"MAYOR", "MENOR", "DOSPUNTOS", "EXPONENCIAL", "IMPRIMIR", "MAXI", "MINI", 
		"RESTRICCIONES", "RESOLVER", "CON", "SENO", "COSENO", "TANGENTE", "EULER", 
		"LOGARITMO", "COMENTARIO"
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
			setState(54);
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
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOS) | (1L << LETRA) | (1L << SALTOLINEA) | (1L << DIGITO) | (1L << PARABIERTO) | (1L << IMPRIMIR) | (1L << MAXI) | (1L << MINI) | (1L << SENO) | (1L << COSENO) | (1L << TANGENTE) | (1L << EULER) | (1L << LOGARITMO) | (1L << COMENTARIO))) != 0)) {
				{
				{
				setState(56);
				expresion();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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
		public MultiobjetivoContext multiobjetivo() {
			return getRuleContext(MultiobjetivoContext.class,0);
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new AsignarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				identificador();
				setState(65);
				match(IGUAL);
				setState(66);
				expMAT(0);
				}
				break;
			case 2:
				_localctx = new CalcularContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				expMAT(0);
				}
				break;
			case 3:
				_localctx = new ImprimirExprContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				match(IMPRIMIR);
				setState(70);
				match(PARABIERTO);
				setState(71);
				expresion();
				setState(72);
				match(PARCERRADO);
				}
				break;
			case 4:
				_localctx = new SaltarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(SALTOLINEA);
				}
				break;
			case 5:
				_localctx = new ProblemasExpresadosContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				multiobjetivo();
				}
				break;
			case 6:
				_localctx = new ComentariosContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(76);
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

	public static class MultiobjetivoContext extends ParserRuleContext {
		public MultiobjetivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiobjetivo; }
	 
		public MultiobjetivoContext() { }
		public void copyFrom(MultiobjetivoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultiObjetivosContext extends MultiobjetivoContext {
		public Token operacion;
		public TerminalNode DOSPUNTOS() { return getToken(simplexParser.DOSPUNTOS, 0); }
		public ResolverContext resolver() {
			return getRuleContext(ResolverContext.class,0);
		}
		public TerminalNode MAXI() { return getToken(simplexParser.MAXI, 0); }
		public TerminalNode MINI() { return getToken(simplexParser.MINI, 0); }
		public List<TerminalNode> SALTOLINEA() { return getTokens(simplexParser.SALTOLINEA); }
		public TerminalNode SALTOLINEA(int i) {
			return getToken(simplexParser.SALTOLINEA, i);
		}
		public List<ProblemaContext> problema() {
			return getRuleContexts(ProblemaContext.class);
		}
		public ProblemaContext problema(int i) {
			return getRuleContext(ProblemaContext.class,i);
		}
		public MultiObjetivosContext(MultiobjetivoContext ctx) { copyFrom(ctx); }
	}

	public final MultiobjetivoContext multiobjetivo() throws RecognitionException {
		MultiobjetivoContext _localctx = new MultiobjetivoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_multiobjetivo);
		int _la;
		try {
			int _alt;
			_localctx = new MultiObjetivosContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((MultiObjetivosContext)_localctx).operacion = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==MAXI || _la==MINI) ) {
				((MultiObjetivosContext)_localctx).operacion = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(80);
			match(DOSPUNTOS);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				match(SALTOLINEA);
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
			setState(87); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(86);
				problema();
				}
				}
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LETRA );
			setState(91);
			resolver();
			setState(93); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(92);
					match(SALTOLINEA);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(95); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ResolverContext extends ParserRuleContext {
		public ResolverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resolver; }
	 
		public ResolverContext() { }
		public void copyFrom(ResolverContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ResolverProblemasContext extends ResolverContext {
		public TerminalNode RESOLVER() { return getToken(simplexParser.RESOLVER, 0); }
		public ResolverProblemasContext(ResolverContext ctx) { copyFrom(ctx); }
	}

	public final ResolverContext resolver() throws RecognitionException {
		ResolverContext _localctx = new ResolverContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_resolver);
		try {
			_localctx = new ResolverProblemasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(RESOLVER);
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
		public ProblemasContext(ProblemaContext ctx) { copyFrom(ctx); }
	}

	public final ProblemaContext problema() throws RecognitionException {
		ProblemaContext _localctx = new ProblemaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_problema);
		try {
			_localctx = new ProblemasContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			funcionTrans();
			setState(100);
			restriccion();
			setState(101);
			restricionVariable();
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
		enterRule(_localctx, 12, RULE_restricionVariable);
		int _la;
		try {
			int _alt;
			_localctx = new RestriccionesVariablesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(CON);
			setState(104);
			match(DOSPUNTOS);
			setState(106); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(105);
				match(SALTOLINEA);
				}
				}
				setState(108); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
			setState(116); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(110);
					desigualdadVariable();
					setState(112); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(111);
						match(SALTOLINEA);
						}
						}
						setState(114); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SALTOLINEA );
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		enterRule(_localctx, 14, RULE_desigualdadVariable);
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new DesigualdadesVariablesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				variable();
				setState(121);
				match(IGUAL);
				setState(122);
				expMAT(0);
				}
				break;
			case 2:
				_localctx = new DesigualdadesVariablesMayorIgualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				variable();
				setState(125);
				mayorIgual();
				setState(126);
				expMAT(0);
				}
				break;
			case 3:
				_localctx = new DesigualdadesVariablesMenorIgualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				variable();
				setState(129);
				menorIgual();
				setState(130);
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
		enterRule(_localctx, 16, RULE_restriccion);
		int _la;
		try {
			_localctx = new RestriccionesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(RESTRICCIONES);
			setState(135);
			match(DOSPUNTOS);
			setState(137); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(136);
				match(SALTOLINEA);
				}
				}
				setState(139); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(141);
				desigualdad();
				setState(143); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(142);
					match(SALTOLINEA);
					}
					}
					setState(145); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SALTOLINEA );
				}
				}
				setState(149); 
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
		enterRule(_localctx, 18, RULE_desigualdad);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new DesigualdadesContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				polinomio();
				setState(152);
				match(IGUAL);
				setState(153);
				expMAT(0);
				}
				break;
			case 2:
				_localctx = new DesigualdadesMayorIgualContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				polinomio();
				setState(156);
				mayorIgual();
				setState(157);
				expMAT(0);
				}
				break;
			case 3:
				_localctx = new DesigualdadesMenorIgualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				polinomio();
				setState(160);
				menorIgual();
				setState(161);
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
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public List<TerminalNode> SALTOLINEA() { return getTokens(simplexParser.SALTOLINEA); }
		public TerminalNode SALTOLINEA(int i) {
			return getToken(simplexParser.SALTOLINEA, i);
		}
		public FuncionTransfContext(FuncionTransContext ctx) { copyFrom(ctx); }
	}

	public final FuncionTransContext funcionTrans() throws RecognitionException {
		FuncionTransContext _localctx = new FuncionTransContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcionTrans);
		int _la;
		try {
			_localctx = new FuncionTransfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			funcion();
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				match(SALTOLINEA);
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SALTOLINEA );
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
		enterRule(_localctx, 22, RULE_funcion);
		try {
			_localctx = new FuncionesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			funcionDef();
			setState(172);
			match(IGUAL);
			setState(173);
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
		public NombrefuncionContext nombrefuncion() {
			return getRuleContext(NombrefuncionContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_funcionDef);
		int _la;
		try {
			_localctx = new DefinirFuncionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			nombrefuncion();
			setState(176);
			match(PARABIERTO);
			setState(177);
			variable();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(178);
				match(COMA);
				setState(179);
				variable();
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(185);
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

	public static class NombrefuncionContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public NombrefuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombrefuncion; }
	}

	public final NombrefuncionContext nombrefuncion() throws RecognitionException {
		NombrefuncionContext _localctx = new NombrefuncionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_nombrefuncion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			variable();
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
		enterRule(_localctx, 28, RULE_polinomio);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new MenosPolinomiosContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(MENOS);
				setState(190);
				monomio();
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(191);
					monomioAdd();
					}
					}
					setState(194); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MAS || _la==MENOS );
				}
				break;
			case 2:
				_localctx = new MenosMonPolinomiosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(MENOS);
				setState(197);
				monomio();
				}
				break;
			case 3:
				_localctx = new PolinomiosContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				monomio();
				setState(200); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(199);
					monomioAdd();
					}
					}
					setState(202); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==MAS || _la==MENOS );
				}
				break;
			case 4:
				_localctx = new MonPolinomiosContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
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
		enterRule(_localctx, 30, RULE_monomioAdd);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
				_localctx = new MasMonomioContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(MAS);
				setState(208);
				monomio();
				}
				break;
			case MENOS:
				_localctx = new MenosMonomioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(MENOS);
				setState(210);
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
		enterRule(_localctx, 32, RULE_monomio);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new MonomioMinimoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				numero();
				setState(214);
				variable();
				}
				break;
			case 2:
				_localctx = new NumeroMonomioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_expMAT, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				_localctx = new OperMatematicaParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(220);
				match(PARABIERTO);
				setState(221);
				expMAT(0);
				setState(222);
				match(PARCERRADO);
				}
				break;
			case 2:
				{
				_localctx = new NumerosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				entero();
				}
				break;
			case 3:
				{
				_localctx = new DecimalesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(225);
				decimal(0);
				}
				break;
			case 4:
				{
				_localctx = new IdentificadoresContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(226);
				identificador();
				}
				break;
			case 5:
				{
				_localctx = new MenosExpMATContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(MENOS);
				setState(228);
				expMAT(2);
				}
				break;
			case 6:
				{
				_localctx = new TrigonometricasContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(229);
				trigonometrica();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(243);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(241);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new OperPotenciaContext(new ExpMATContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expMAT);
						setState(232);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(233);
						match(POTENCIA);
						setState(234);
						expMAT(10);
						}
						break;
					case 2:
						{
						_localctx = new OperMultContext(new ExpMATContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expMAT);
						setState(235);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(236);
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
						setState(237);
						expMAT(9);
						}
						break;
					case 3:
						{
						_localctx = new OperSumaContext(new ExpMATContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expMAT);
						setState(238);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(239);
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
						setState(240);
						expMAT(8);
						}
						break;
					}
					} 
				}
				setState(245);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 36, RULE_variable);
		int _la;
		try {
			_localctx = new VariablesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(246);
				match(LETRA);
				}
				}
				setState(249); 
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
		enterRule(_localctx, 38, RULE_identificador);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(LETRA);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(252);
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
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 40, RULE_numero);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ExpresionMatematicaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(258);
				match(PARABIERTO);
				setState(259);
				expMAT(0);
				setState(260);
				match(PARCERRADO);
				}
				break;
			case 2:
				_localctx = new DecimalesPolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				decimal(0);
				}
				break;
			case 3:
				_localctx = new NumerosPolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(263);
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
		enterRule(_localctx, 42, RULE_trigonometrica);
		try {
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SENO:
				_localctx = new SenosContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(SENO);
				setState(268);
				match(PARABIERTO);
				setState(269);
				expMAT(0);
				setState(270);
				match(PARCERRADO);
				}
				break;
			case COSENO:
				_localctx = new CosenosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(COSENO);
				setState(273);
				match(PARABIERTO);
				setState(274);
				expMAT(0);
				setState(275);
				match(PARCERRADO);
				}
				break;
			case TANGENTE:
				_localctx = new TangentesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				match(TANGENTE);
				setState(278);
				match(PARABIERTO);
				setState(279);
				expMAT(0);
				setState(280);
				match(PARCERRADO);
				}
				break;
			case EULER:
				_localctx = new EulerianosContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				match(EULER);
				setState(283);
				match(PARABIERTO);
				setState(284);
				expMAT(0);
				setState(285);
				match(PARCERRADO);
				}
				break;
			case LOGARITMO:
				_localctx = new LogaritmosContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(287);
				match(LOGARITMO);
				setState(288);
				match(PARABIERTO);
				setState(289);
				expMAT(0);
				setState(290);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_decimal, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new DecimalesPurosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(295);
				entero();
				setState(296);
				match(PUNTO);
				setState(297);
				entero();
				}
				break;
			case 2:
				{
				_localctx = new EntrosCientificosContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299);
				entero();
				setState(300);
				exponencial();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DecimalesCientificosContext(new DecimalContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_decimal);
					setState(304);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(305);
					exponencial();
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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
		enterRule(_localctx, 46, RULE_exponencial);
		try {
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				_localctx = new ExponencialesUSContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(EXPONENCIAL);
				setState(312);
				entero();
				}
				break;
			case 2:
				_localctx = new ExponencialesNegativosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				match(EXPONENCIAL);
				setState(314);
				match(MENOS);
				setState(315);
				entero();
				}
				break;
			case 3:
				_localctx = new ExponencialesPositivosContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				match(EXPONENCIAL);
				setState(317);
				match(MAS);
				setState(318);
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
		enterRule(_localctx, 48, RULE_entero);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(321);
					match(DIGITO);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(324); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 50, RULE_mayorIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			match(MAYOR);
			setState(327);
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
		enterRule(_localctx, 52, RULE_menorIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(MENOR);
			setState(330);
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
		case 17:
			return expMAT_sempred((ExpMATContext)_localctx, predIndex);
		case 22:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u014f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5"+
		"\3\5\3\5\6\5U\n\5\r\5\16\5V\3\5\6\5Z\n\5\r\5\16\5[\3\5\3\5\6\5`\n\5\r"+
		"\5\16\5a\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\6\bm\n\b\r\b\16\bn\3\b\3"+
		"\b\6\bs\n\b\r\b\16\bt\6\bw\n\b\r\b\16\bx\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0087\n\t\3\n\3\n\3\n\6\n\u008c\n\n\r\n\16\n\u008d"+
		"\3\n\3\n\6\n\u0092\n\n\r\n\16\n\u0093\6\n\u0096\n\n\r\n\16\n\u0097\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a6\n\13"+
		"\3\f\3\f\6\f\u00aa\n\f\r\f\16\f\u00ab\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\7\16\u00b7\n\16\f\16\16\16\u00ba\13\16\3\16\3\16\3\17\3\17\3"+
		"\20\3\20\3\20\6\20\u00c3\n\20\r\20\16\20\u00c4\3\20\3\20\3\20\3\20\6\20"+
		"\u00cb\n\20\r\20\16\20\u00cc\3\20\5\20\u00d0\n\20\3\21\3\21\3\21\3\21"+
		"\5\21\u00d6\n\21\3\22\3\22\3\22\3\22\5\22\u00dc\n\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00e9\n\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f4\n\23\f\23\16\23\u00f7\13\23"+
		"\3\24\6\24\u00fa\n\24\r\24\16\24\u00fb\3\25\3\25\7\25\u0100\n\25\f\25"+
		"\16\25\u0103\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u010c\n\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0127\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0131\n\30\3\30\3\30\7\30"+
		"\u0135\n\30\f\30\16\30\u0138\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\5\31\u0142\n\31\3\32\6\32\u0145\n\32\r\32\16\32\u0146\3\33\3\33"+
		"\3\33\3\34\3\34\3\34\3\34\2\4$.\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\66\2\6\3\2\27\30\3\2\6\7\3\2\4\5\5\2\3\3\13\13\17"+
		"\17\2\u0165\28\3\2\2\2\4=\3\2\2\2\6O\3\2\2\2\bQ\3\2\2\2\nc\3\2\2\2\fe"+
		"\3\2\2\2\16i\3\2\2\2\20\u0086\3\2\2\2\22\u0088\3\2\2\2\24\u00a5\3\2\2"+
		"\2\26\u00a7\3\2\2\2\30\u00ad\3\2\2\2\32\u00b1\3\2\2\2\34\u00bd\3\2\2\2"+
		"\36\u00cf\3\2\2\2 \u00d5\3\2\2\2\"\u00db\3\2\2\2$\u00e8\3\2\2\2&\u00f9"+
		"\3\2\2\2(\u00fd\3\2\2\2*\u010b\3\2\2\2,\u0126\3\2\2\2.\u0130\3\2\2\2\60"+
		"\u0141\3\2\2\2\62\u0144\3\2\2\2\64\u0148\3\2\2\2\66\u014b\3\2\2\289\5"+
		"\4\3\29\3\3\2\2\2:<\5\6\4\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@"+
		"\3\2\2\2?=\3\2\2\2@A\7\2\2\3A\5\3\2\2\2BC\5(\25\2CD\7\n\2\2DE\5$\23\2"+
		"EP\3\2\2\2FP\5$\23\2GH\7\26\2\2HI\7\20\2\2IJ\5\6\4\2JK\7\21\2\2KP\3\2"+
		"\2\2LP\7\r\2\2MP\5\b\5\2NP\7!\2\2OB\3\2\2\2OF\3\2\2\2OG\3\2\2\2OL\3\2"+
		"\2\2OM\3\2\2\2ON\3\2\2\2P\7\3\2\2\2QR\t\2\2\2RT\7\24\2\2SU\7\r\2\2TS\3"+
		"\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XZ\5\f\7\2YX\3\2\2\2Z[\3"+
		"\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]_\5\n\6\2^`\7\r\2\2_^\3\2\2\2`"+
		"a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\t\3\2\2\2cd\7\32\2\2d\13\3\2\2\2ef\5\26"+
		"\f\2fg\5\22\n\2gh\5\16\b\2h\r\3\2\2\2ij\7\33\2\2jl\7\24\2\2km\7\r\2\2"+
		"lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2ov\3\2\2\2pr\5\20\t\2qs\7\r\2"+
		"\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vp\3\2\2\2wx\3\2\2"+
		"\2xv\3\2\2\2xy\3\2\2\2y\17\3\2\2\2z{\5&\24\2{|\7\n\2\2|}\5$\23\2}\u0087"+
		"\3\2\2\2~\177\5&\24\2\177\u0080\5\64\33\2\u0080\u0081\5$\23\2\u0081\u0087"+
		"\3\2\2\2\u0082\u0083\5&\24\2\u0083\u0084\5\66\34\2\u0084\u0085\5$\23\2"+
		"\u0085\u0087\3\2\2\2\u0086z\3\2\2\2\u0086~\3\2\2\2\u0086\u0082\3\2\2\2"+
		"\u0087\21\3\2\2\2\u0088\u0089\7\31\2\2\u0089\u008b\7\24\2\2\u008a\u008c"+
		"\7\r\2\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0095\3\2\2\2\u008f\u0091\5\24\13\2\u0090\u0092\7"+
		"\r\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u008f\3\2\2\2\u0096\u0097\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\23\3\2\2\2\u0099\u009a"+
		"\5\36\20\2\u009a\u009b\7\n\2\2\u009b\u009c\5$\23\2\u009c\u00a6\3\2\2\2"+
		"\u009d\u009e\5\36\20\2\u009e\u009f\5\64\33\2\u009f\u00a0\5$\23\2\u00a0"+
		"\u00a6\3\2\2\2\u00a1\u00a2\5\36\20\2\u00a2\u00a3\5\66\34\2\u00a3\u00a4"+
		"\5$\23\2\u00a4\u00a6\3\2\2\2\u00a5\u0099\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5"+
		"\u00a1\3\2\2\2\u00a6\25\3\2\2\2\u00a7\u00a9\5\30\r\2\u00a8\u00aa\7\r\2"+
		"\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac"+
		"\3\2\2\2\u00ac\27\3\2\2\2\u00ad\u00ae\5\32\16\2\u00ae\u00af\7\n\2\2\u00af"+
		"\u00b0\5\36\20\2\u00b0\31\3\2\2\2\u00b1\u00b2\5\34\17\2\u00b2\u00b3\7"+
		"\20\2\2\u00b3\u00b8\5&\24\2\u00b4\u00b5\7\f\2\2\u00b5\u00b7\5&\24\2\u00b6"+
		"\u00b4\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bc\7\21\2\2\u00bc"+
		"\33\3\2\2\2\u00bd\u00be\5&\24\2\u00be\35\3\2\2\2\u00bf\u00c0\7\5\2\2\u00c0"+
		"\u00c2\5\"\22\2\u00c1\u00c3\5 \21\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3"+
		"\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00d0\3\2\2\2\u00c6"+
		"\u00c7\7\5\2\2\u00c7\u00d0\5\"\22\2\u00c8\u00ca\5\"\22\2\u00c9\u00cb\5"+
		" \21\2\u00ca\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00d0\5\"\22\2\u00cf\u00bf\3"+
		"\2\2\2\u00cf\u00c6\3\2\2\2\u00cf\u00c8\3\2\2\2\u00cf\u00ce\3\2\2\2\u00d0"+
		"\37\3\2\2\2\u00d1\u00d2\7\4\2\2\u00d2\u00d6\5\"\22\2\u00d3\u00d4\7\5\2"+
		"\2\u00d4\u00d6\5\"\22\2\u00d5\u00d1\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6"+
		"!\3\2\2\2\u00d7\u00d8\5*\26\2\u00d8\u00d9\5&\24\2\u00d9\u00dc\3\2\2\2"+
		"\u00da\u00dc\5$\23\2\u00db\u00d7\3\2\2\2\u00db\u00da\3\2\2\2\u00dc#\3"+
		"\2\2\2\u00dd\u00de\b\23\1\2\u00de\u00df\7\20\2\2\u00df\u00e0\5$\23\2\u00e0"+
		"\u00e1\7\21\2\2\u00e1\u00e9\3\2\2\2\u00e2\u00e9\5\62\32\2\u00e3\u00e9"+
		"\5.\30\2\u00e4\u00e9\5(\25\2\u00e5\u00e6\7\5\2\2\u00e6\u00e9\5$\23\4\u00e7"+
		"\u00e9\5,\27\2\u00e8\u00dd\3\2\2\2\u00e8\u00e2\3\2\2\2\u00e8\u00e3\3\2"+
		"\2\2\u00e8\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00f5\3\2\2\2\u00ea\u00eb\f\13\2\2\u00eb\u00ec\7\b\2\2\u00ec\u00f4\5"+
		"$\23\f\u00ed\u00ee\f\n\2\2\u00ee\u00ef\t\3\2\2\u00ef\u00f4\5$\23\13\u00f0"+
		"\u00f1\f\t\2\2\u00f1\u00f2\t\4\2\2\u00f2\u00f4\5$\23\n\u00f3\u00ea\3\2"+
		"\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00f0\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6%\3\2\2\2\u00f7\u00f5\3\2\2\2"+
		"\u00f8\u00fa\7\13\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\'\3\2\2\2\u00fd\u0101\7\13\2\2\u00fe"+
		"\u0100\t\5\2\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102)\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0105"+
		"\7\20\2\2\u0105\u0106\5$\23\2\u0106\u0107\7\21\2\2\u0107\u010c\3\2\2\2"+
		"\u0108\u010c\5.\30\2\u0109\u010c\5\62\32\2\u010a\u010c\3\2\2\2\u010b\u0104"+
		"\3\2\2\2\u010b\u0108\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c"+
		"+\3\2\2\2\u010d\u010e\7\34\2\2\u010e\u010f\7\20\2\2\u010f\u0110\5$\23"+
		"\2\u0110\u0111\7\21\2\2\u0111\u0127\3\2\2\2\u0112\u0113\7\35\2\2\u0113"+
		"\u0114\7\20\2\2\u0114\u0115\5$\23\2\u0115\u0116\7\21\2\2\u0116\u0127\3"+
		"\2\2\2\u0117\u0118\7\36\2\2\u0118\u0119\7\20\2\2\u0119\u011a\5$\23\2\u011a"+
		"\u011b\7\21\2\2\u011b\u0127\3\2\2\2\u011c\u011d\7\37\2\2\u011d\u011e\7"+
		"\20\2\2\u011e\u011f\5$\23\2\u011f\u0120\7\21\2\2\u0120\u0127\3\2\2\2\u0121"+
		"\u0122\7 \2\2\u0122\u0123\7\20\2\2\u0123\u0124\5$\23\2\u0124\u0125\7\21"+
		"\2\2\u0125\u0127\3\2\2\2\u0126\u010d\3\2\2\2\u0126\u0112\3\2\2\2\u0126"+
		"\u0117\3\2\2\2\u0126\u011c\3\2\2\2\u0126\u0121\3\2\2\2\u0127-\3\2\2\2"+
		"\u0128\u0129\b\30\1\2\u0129\u012a\5\62\32\2\u012a\u012b\7\t\2\2\u012b"+
		"\u012c\5\62\32\2\u012c\u0131\3\2\2\2\u012d\u012e\5\62\32\2\u012e\u012f"+
		"\5\60\31\2\u012f\u0131\3\2\2\2\u0130\u0128\3\2\2\2\u0130\u012d\3\2\2\2"+
		"\u0131\u0136\3\2\2\2\u0132\u0133\f\4\2\2\u0133\u0135\5\60\31\2\u0134\u0132"+
		"\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"/\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7\25\2\2\u013a\u0142\5\62\32"+
		"\2\u013b\u013c\7\25\2\2\u013c\u013d\7\5\2\2\u013d\u0142\5\62\32\2\u013e"+
		"\u013f\7\25\2\2\u013f\u0140\7\4\2\2\u0140\u0142\5\62\32\2\u0141\u0139"+
		"\3\2\2\2\u0141\u013b\3\2\2\2\u0141\u013e\3\2\2\2\u0142\61\3\2\2\2\u0143"+
		"\u0145\7\17\2\2\u0144\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0144\3"+
		"\2\2\2\u0146\u0147\3\2\2\2\u0147\63\3\2\2\2\u0148\u0149\7\22\2\2\u0149"+
		"\u014a\7\n\2\2\u014a\65\3\2\2\2\u014b\u014c\7\23\2\2\u014c\u014d\7\n\2"+
		"\2\u014d\67\3\2\2\2!=OV[antx\u0086\u008d\u0093\u0097\u00a5\u00ab\u00b8"+
		"\u00c4\u00cc\u00cf\u00d5\u00db\u00e8\u00f3\u00f5\u00fb\u0101\u010b\u0126"+
		"\u0130\u0136\u0141\u0146";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}