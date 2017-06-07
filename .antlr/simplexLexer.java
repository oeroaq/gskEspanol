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
		MINI=22, FUNCION=23, RESTRICCIONES=24, RESOLVER=25, CON=26, SENO=27, COSENO=28, 
		TANGENTE=29, EULER=30, LOGARITMO=31, COMENTARIO=32;
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
		"FUNCION", "RESTRICCIONES", "RESOLVER", "CON", "SENO", "COSENO", "TANGENTE", 
		"EULER", "LOGARITMO", "COMENTARIO"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00f7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\5\fZ\n\f\3\f\3\f\3\r\6\r_\n\r\r\r\16\r`\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25~\n\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u008c"+
		"\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27"+
		"\u009a\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00a6"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u00b7\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00c9\n\32\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3!\3!\7!\u00e4\n!\f!\16!\u00e7\13!\3!\3!\3!\3!\7!"+
		"\u00ed\n!\f!\16!\u00f0\13!\3!\3!\5!\u00f4\n!\3!\3!\3\u00ee\2\"\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3"+
		"\2\7\4\2C\\c|\4\2\13\13\"\"\3\2\62;\4\2GGgg\4\2\f\f\17\17\2\u0102\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\t"+
		"I\3\2\2\2\13K\3\2\2\2\rM\3\2\2\2\17P\3\2\2\2\21R\3\2\2\2\23T\3\2\2\2\25"+
		"V\3\2\2\2\27Y\3\2\2\2\31^\3\2\2\2\33d\3\2\2\2\35f\3\2\2\2\37h\3\2\2\2"+
		"!j\3\2\2\2#l\3\2\2\2%n\3\2\2\2\'p\3\2\2\2)}\3\2\2\2+\u008b\3\2\2\2-\u0099"+
		"\3\2\2\2/\u00a5\3\2\2\2\61\u00b6\3\2\2\2\63\u00c8\3\2\2\2\65\u00ca\3\2"+
		"\2\2\67\u00ce\3\2\2\29\u00d2\3\2\2\2;\u00d6\3\2\2\2=\u00da\3\2\2\2?\u00de"+
		"\3\2\2\2A\u00f3\3\2\2\2CD\7a\2\2D\4\3\2\2\2EF\7-\2\2F\6\3\2\2\2GH\7/\2"+
		"\2H\b\3\2\2\2IJ\7,\2\2J\n\3\2\2\2KL\7\61\2\2L\f\3\2\2\2MN\7,\2\2NO\7,"+
		"\2\2O\16\3\2\2\2PQ\7\60\2\2Q\20\3\2\2\2RS\7?\2\2S\22\3\2\2\2TU\t\2\2\2"+
		"U\24\3\2\2\2VW\7.\2\2W\26\3\2\2\2XZ\7\17\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2"+
		"\2\2[\\\7\f\2\2\\\30\3\2\2\2]_\t\3\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`"+
		"a\3\2\2\2ab\3\2\2\2bc\b\r\2\2c\32\3\2\2\2de\t\4\2\2e\34\3\2\2\2fg\7*\2"+
		"\2g\36\3\2\2\2hi\7+\2\2i \3\2\2\2jk\7@\2\2k\"\3\2\2\2lm\7>\2\2m$\3\2\2"+
		"\2no\7<\2\2o&\3\2\2\2pq\t\5\2\2q(\3\2\2\2rs\7k\2\2st\7o\2\2tu\7r\2\2u"+
		"v\7t\2\2vw\7k\2\2wx\7o\2\2xy\7k\2\2y~\7t\2\2z{\7k\2\2{|\7o\2\2|~\7r\2"+
		"\2}r\3\2\2\2}z\3\2\2\2~*\3\2\2\2\177\u0080\7o\2\2\u0080\u0081\7c\2\2\u0081"+
		"\u0082\7z\2\2\u0082\u0083\7k\2\2\u0083\u0084\7o\2\2\u0084\u0085\7k\2\2"+
		"\u0085\u0086\7|\2\2\u0086\u0087\7c\2\2\u0087\u008c\7t\2\2\u0088\u0089"+
		"\7o\2\2\u0089\u008a\7c\2\2\u008a\u008c\7z\2\2\u008b\177\3\2\2\2\u008b"+
		"\u0088\3\2\2\2\u008c,\3\2\2\2\u008d\u008e\7o\2\2\u008e\u008f\7k\2\2\u008f"+
		"\u0090\7p\2\2\u0090\u0091\7k\2\2\u0091\u0092\7o\2\2\u0092\u0093\7k\2\2"+
		"\u0093\u0094\7|\2\2\u0094\u0095\7c\2\2\u0095\u009a\7t\2\2\u0096\u0097"+
		"\7o\2\2\u0097\u0098\7k\2\2\u0098\u009a\7p\2\2\u0099\u008d\3\2\2\2\u0099"+
		"\u0096\3\2\2\2\u009a.\3\2\2\2\u009b\u009c\7h\2\2\u009c\u009d\7w\2\2\u009d"+
		"\u009e\7p\2\2\u009e\u009f\7e\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7q\2\2"+
		"\u00a1\u00a6\7p\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4\7w\2\2\u00a4\u00a6"+
		"\7p\2\2\u00a5\u009b\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a6\60\3\2\2\2\u00a7"+
		"\u00a8\7t\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7u\2\2\u00aa\u00ab\7v\2\2"+
		"\u00ab\u00ac\7t\2\2\u00ac\u00ad\7k\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af"+
		"\7i\2\2\u00af\u00b0\7k\2\2\u00b0\u00b7\7t\2\2\u00b1\u00b2\7t\2\2\u00b2"+
		"\u00b3\7g\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b7\7t\2\2"+
		"\u00b6\u00a7\3\2\2\2\u00b6\u00b1\3\2\2\2\u00b7\62\3\2\2\2\u00b8\u00b9"+
		"\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bc\7q\2\2\u00bc"+
		"\u00bd\7n\2\2\u00bd\u00be\7x\2\2\u00be\u00bf\7g\2\2\u00bf\u00c9\7t\2\2"+
		"\u00c0\u00c1\7t\2\2\u00c1\u00c2\7g\2\2\u00c2\u00c3\7u\2\2\u00c3\u00c4"+
		"\7q\2\2\u00c4\u00c9\7n\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7g\2\2\u00c7"+
		"\u00c9\7u\2\2\u00c8\u00b8\3\2\2\2\u00c8\u00c0\3\2\2\2\u00c8\u00c5\3\2"+
		"\2\2\u00c9\64\3\2\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd"+
		"\7p\2\2\u00cd\66\3\2\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1"+
		"\7p\2\2\u00d18\3\2\2\2\u00d2\u00d3\7e\2\2\u00d3\u00d4\7q\2\2\u00d4\u00d5"+
		"\7u\2\2\u00d5:\3\2\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9"+
		"\7p\2\2\u00d9<\3\2\2\2\u00da\u00db\7g\2\2\u00db\u00dc\7z\2\2\u00dc\u00dd"+
		"\7r\2\2\u00dd>\3\2\2\2\u00de\u00df\7n\2\2\u00df\u00e0\7p\2\2\u00e0@\3"+
		"\2\2\2\u00e1\u00e5\7%\2\2\u00e2\u00e4\n\6\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00f4\3\2"+
		"\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\7%\2\2\u00e9\u00ea\7%\2\2\u00ea\u00ee"+
		"\3\2\2\2\u00eb\u00ed\13\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2"+
		"\u00ee\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00f2\7%\2\2\u00f2\u00f4\7%\2\2\u00f3\u00e1\3\2\2\2\u00f3"+
		"\u00e8\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b!\2\2\u00f6B\3\2\2\2\16"+
		"\2Y`}\u008b\u0099\u00a5\u00b6\u00c8\u00e5\u00ee\u00f3\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}