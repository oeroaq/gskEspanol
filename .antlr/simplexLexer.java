// Generated from /home/owr2o112oo7/Documentos/Unal/Lenguajes de programacion/Proyecto Final/simplex.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class simplexLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "MAS", "MENOS", "MULT", "DIV", "POTENCIA", "PUNTO", "IGUAL", "LETRA", 
		"COMA", "SALTOLINEA", "BLANCO", "DIGITO", "PARABIERTO", "PARCERRADO", 
		"MAYOR", "MENOR", "DOSPUNTOS", "EXPONENCIAL", "IMPRIMIR", "MAXI", "MINI", 
		"RESTRICCIONES", "RESOLVER", "CON", "SENO", "COSENO", "TANGENTE", "EULER", 
		"LOGARITMO", "COMENTARIO"
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


	public simplexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "simplex.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u00e9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\5\fX\n\f\3\f\3\f\3\r\6\r]\n\r\r\r\16\r^\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25|\n\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u008a\n\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u0098\n\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u00a9\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u00bb\n\31\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\37\3\37\3\37\3 \3 \7 \u00d6\n \f \16 \u00d9\13 \3 \3 \3 \3 \7"+
		" \u00df\n \f \16 \u00e2\13 \3 \3 \5 \u00e6\n \3 \3 \3\u00e0\2!\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!\3\2"+
		"\7\4\2C\\c|\4\2\13\13\"\"\3\2\62;\4\2GGgg\4\2\f\f\17\17\2\u00f3\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13"+
		"I\3\2\2\2\rK\3\2\2\2\17N\3\2\2\2\21P\3\2\2\2\23R\3\2\2\2\25T\3\2\2\2\27"+
		"W\3\2\2\2\31\\\3\2\2\2\33b\3\2\2\2\35d\3\2\2\2\37f\3\2\2\2!h\3\2\2\2#"+
		"j\3\2\2\2%l\3\2\2\2\'n\3\2\2\2){\3\2\2\2+\u0089\3\2\2\2-\u0097\3\2\2\2"+
		"/\u00a8\3\2\2\2\61\u00ba\3\2\2\2\63\u00bc\3\2\2\2\65\u00c0\3\2\2\2\67"+
		"\u00c4\3\2\2\29\u00c8\3\2\2\2;\u00cc\3\2\2\2=\u00d0\3\2\2\2?\u00e5\3\2"+
		"\2\2AB\7a\2\2B\4\3\2\2\2CD\7-\2\2D\6\3\2\2\2EF\7/\2\2F\b\3\2\2\2GH\7,"+
		"\2\2H\n\3\2\2\2IJ\7\61\2\2J\f\3\2\2\2KL\7,\2\2LM\7,\2\2M\16\3\2\2\2NO"+
		"\7\60\2\2O\20\3\2\2\2PQ\7?\2\2Q\22\3\2\2\2RS\t\2\2\2S\24\3\2\2\2TU\7."+
		"\2\2U\26\3\2\2\2VX\7\17\2\2WV\3\2\2\2WX\3\2\2\2XY\3\2\2\2YZ\7\f\2\2Z\30"+
		"\3\2\2\2[]\t\3\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2"+
		"`a\b\r\2\2a\32\3\2\2\2bc\t\4\2\2c\34\3\2\2\2de\7*\2\2e\36\3\2\2\2fg\7"+
		"+\2\2g \3\2\2\2hi\7@\2\2i\"\3\2\2\2jk\7>\2\2k$\3\2\2\2lm\7<\2\2m&\3\2"+
		"\2\2no\t\5\2\2o(\3\2\2\2pq\7k\2\2qr\7o\2\2rs\7r\2\2st\7t\2\2tu\7k\2\2"+
		"uv\7o\2\2vw\7k\2\2w|\7t\2\2xy\7k\2\2yz\7o\2\2z|\7r\2\2{p\3\2\2\2{x\3\2"+
		"\2\2|*\3\2\2\2}~\7o\2\2~\177\7c\2\2\177\u0080\7z\2\2\u0080\u0081\7k\2"+
		"\2\u0081\u0082\7o\2\2\u0082\u0083\7k\2\2\u0083\u0084\7|\2\2\u0084\u0085"+
		"\7c\2\2\u0085\u008a\7t\2\2\u0086\u0087\7o\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u008a\7z\2\2\u0089}\3\2\2\2\u0089\u0086\3\2\2\2\u008a,\3\2\2\2\u008b"+
		"\u008c\7o\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f\7k\2\2"+
		"\u008f\u0090\7o\2\2\u0090\u0091\7k\2\2\u0091\u0092\7|\2\2\u0092\u0093"+
		"\7c\2\2\u0093\u0098\7t\2\2\u0094\u0095\7o\2\2\u0095\u0096\7k\2\2\u0096"+
		"\u0098\7p\2\2\u0097\u008b\3\2\2\2\u0097\u0094\3\2\2\2\u0098.\3\2\2\2\u0099"+
		"\u009a\7t\2\2\u009a\u009b\7g\2\2\u009b\u009c\7u\2\2\u009c\u009d\7v\2\2"+
		"\u009d\u009e\7t\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1"+
		"\7i\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a9\7t\2\2\u00a3\u00a4\7t\2\2\u00a4"+
		"\u00a5\7g\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a9\7t\2\2"+
		"\u00a8\u0099\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9\60\3\2\2\2\u00aa\u00ab"+
		"\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7u\2\2\u00ad\u00ae\7q\2\2\u00ae"+
		"\u00af\7n\2\2\u00af\u00b0\7x\2\2\u00b0\u00b1\7g\2\2\u00b1\u00bb\7t\2\2"+
		"\u00b2\u00b3\7t\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7u\2\2\u00b5\u00b6"+
		"\7q\2\2\u00b6\u00bb\7n\2\2\u00b7\u00b8\7t\2\2\u00b8\u00b9\7g\2\2\u00b9"+
		"\u00bb\7u\2\2\u00ba\u00aa\3\2\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b7\3\2"+
		"\2\2\u00bb\62\3\2\2\2\u00bc\u00bd\7e\2\2\u00bd\u00be\7q\2\2\u00be\u00bf"+
		"\7p\2\2\u00bf\64\3\2\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3"+
		"\7p\2\2\u00c3\66\3\2\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7q\2\2\u00c6\u00c7"+
		"\7u\2\2\u00c78\3\2\2\2\u00c8\u00c9\7v\2\2\u00c9\u00ca\7c\2\2\u00ca\u00cb"+
		"\7p\2\2\u00cb:\3\2\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7z\2\2\u00ce\u00cf"+
		"\7r\2\2\u00cf<\3\2\2\2\u00d0\u00d1\7n\2\2\u00d1\u00d2\7p\2\2\u00d2>\3"+
		"\2\2\2\u00d3\u00d7\7%\2\2\u00d4\u00d6\n\6\2\2\u00d5\u00d4\3\2\2\2\u00d6"+
		"\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00e6\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\7%\2\2\u00db\u00dc\7%\2\2\u00dc\u00e0"+
		"\3\2\2\2\u00dd\u00df\13\2\2\2\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2"+
		"\u00e0\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0"+
		"\3\2\2\2\u00e3\u00e4\7%\2\2\u00e4\u00e6\7%\2\2\u00e5\u00d3\3\2\2\2\u00e5"+
		"\u00da\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b \2\2\u00e8@\3\2\2\2\r"+
		"\2W^{\u0089\u0097\u00a8\u00ba\u00d7\u00e0\u00e5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}