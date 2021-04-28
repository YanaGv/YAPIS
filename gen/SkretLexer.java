// Generated from D:/work/yapis/src/main/java\Skret.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SkretLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, RETURN=12, PARAM=13, ID=14, WS=15, NUM=16, TYPE=17, 
		OP=18, ADD=19, DELETE=20, BINARY_OP=21, COMPARE_OP=22, ASSIG=23, LANDING=24, 
		DOT=25, RANGE=26, IF=27, ELSE=28, IN=29, OUT=30, STREAM_OP=31, ELEMENT_POINTER=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "RETURN", "PARAM", "ID", "WS", "NUM", "TYPE", "OP", 
			"ADD", "DELETE", "BINARY_OP", "COMPARE_OP", "ASSIG", "LANDING", "DOT", 
			"RANGE", "IF", "ELSE", "IN", "OUT", "STREAM_OP", "ELEMENT_POINTER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'<'", "';'", "'>'", "'->'", "'('", "')'", "','", "'{'", 
			"'}'", "'havefun'", null, null, null, null, null, null, null, "'add'", 
			"'delete'", null, null, "'='", "'_'", "'.'", "'range'", "'?'", "'else'", 
			"'in'", "'out'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"RETURN", "PARAM", "ID", "WS", "NUM", "TYPE", "OP", "ADD", "DELETE", 
			"BINARY_OP", "COMPARE_OP", "ASSIG", "LANDING", "DOT", "RANGE", "IF", 
			"ELSE", "IN", "OUT", "STREAM_OP", "ELEMENT_POINTER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public SkretLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Skret.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00e4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\rt\n\r\3"+
		"\16\3\16\5\16x\n\16\3\16\3\16\3\17\6\17}\n\17\r\17\16\17~\3\17\7\17\u0082"+
		"\n\17\f\17\16\17\u0085\13\17\3\17\5\17\u0088\n\17\3\20\6\20\u008b\n\20"+
		"\r\20\16\20\u008c\3\20\3\20\3\21\6\21\u0092\n\21\r\21\16\21\u0093\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00a2\n\22"+
		"\3\22\3\22\3\22\5\22\u00a7\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\5\26\u00b9\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\5\27\u00c0\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3 \3 \5 \u00de\n \3 \3 \3!\3!\3!\2\2\"\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"\3\2\7\3\2"+
		"c|\5\2\13\f\17\17\"\"\3\2\62;\5\2,-//^^\4\2>>@@\2\u00f0\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\3C\3\2\2\2\5H\3\2\2\2\7J\3\2\2\2\tL\3\2\2\2\13"+
		"N\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2\21U\3\2\2\2\23W\3\2\2\2\25Y\3\2\2\2\27"+
		"[\3\2\2\2\31s\3\2\2\2\33u\3\2\2\2\35|\3\2\2\2\37\u008a\3\2\2\2!\u0091"+
		"\3\2\2\2#\u00a6\3\2\2\2%\u00a8\3\2\2\2\'\u00aa\3\2\2\2)\u00ae\3\2\2\2"+
		"+\u00b5\3\2\2\2-\u00bf\3\2\2\2/\u00c1\3\2\2\2\61\u00c3\3\2\2\2\63\u00c5"+
		"\3\2\2\2\65\u00c7\3\2\2\2\67\u00cd\3\2\2\29\u00cf\3\2\2\2;\u00d4\3\2\2"+
		"\2=\u00d7\3\2\2\2?\u00dd\3\2\2\2A\u00e1\3\2\2\2CD\7o\2\2DE\7c\2\2EF\7"+
		"k\2\2FG\7p\2\2G\4\3\2\2\2HI\7>\2\2I\6\3\2\2\2JK\7=\2\2K\b\3\2\2\2LM\7"+
		"@\2\2M\n\3\2\2\2NO\7/\2\2OP\7@\2\2P\f\3\2\2\2QR\7*\2\2R\16\3\2\2\2ST\7"+
		"+\2\2T\20\3\2\2\2UV\7.\2\2V\22\3\2\2\2WX\7}\2\2X\24\3\2\2\2YZ\7\177\2"+
		"\2Z\26\3\2\2\2[\\\7j\2\2\\]\7c\2\2]^\7x\2\2^_\7g\2\2_`\7h\2\2`a\7w\2\2"+
		"ab\7p\2\2b\30\3\2\2\2cd\7t\2\2de\7g\2\2ef\7v\2\2fg\7w\2\2gh\7t\2\2hi\7"+
		"p\2\2ij\3\2\2\2jk\5\37\20\2kl\5\35\17\2lt\3\2\2\2mn\7t\2\2no\7g\2\2op"+
		"\7v\2\2pq\7w\2\2qr\7t\2\2rt\7p\2\2sc\3\2\2\2sm\3\2\2\2t\32\3\2\2\2uw\5"+
		"#\22\2vx\5\37\20\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\5\35\17\2z\34\3\2\2"+
		"\2{}\t\2\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0083\3\2"+
		"\2\2\u0080\u0082\5!\21\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2"+
		"\2\2\u0086\u0088\5A!\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\36"+
		"\3\2\2\2\u0089\u008b\t\3\2\2\u008a\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\20"+
		"\2\2\u008f \3\2\2\2\u0090\u0092\t\4\2\2\u0091\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\"\3\2\2\2\u0095"+
		"\u00a1\7]\2\2\u0096\u0097\7g\2\2\u0097\u0098\7n\2\2\u0098\u0099\7g\2\2"+
		"\u0099\u009a\7o\2\2\u009a\u009b\7g\2\2\u009b\u009c\7p\2\2\u009c\u00a2"+
		"\7v\2\2\u009d\u009e\7n\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7u\2\2\u00a0"+
		"\u00a2\7v\2\2\u00a1\u0096\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\u00a3\3\2"+
		"\2\2\u00a3\u00a7\7_\2\2\u00a4\u00a5\7]\2\2\u00a5\u00a7\7_\2\2\u00a6\u0095"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7$\3\2\2\2\u00a8\u00a9\t\5\2\2\u00a9"+
		"&\3\2\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7f\2\2\u00ac\u00ad\7f\2\2\u00ad"+
		"(\3\2\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7n\2\2\u00b1"+
		"\u00b2\7g\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7g\2\2\u00b4*\3\2\2\2\u00b5"+
		"\u00b8\5\37\20\2\u00b6\u00b9\5)\25\2\u00b7\u00b9\5\'\24\2\u00b8\u00b6"+
		"\3\2\2\2\u00b8\u00b7\3\2\2\2\u00b9,\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb\u00c0"+
		"\7?\2\2\u00bc\u00bd\7>\2\2\u00bd\u00c0\7@\2\2\u00be\u00c0\t\6\2\2\u00bf"+
		"\u00ba\3\2\2\2\u00bf\u00bc\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0.\3\2\2\2"+
		"\u00c1\u00c2\7?\2\2\u00c2\60\3\2\2\2\u00c3\u00c4\7a\2\2\u00c4\62\3\2\2"+
		"\2\u00c5\u00c6\7\60\2\2\u00c6\64\3\2\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9"+
		"\7c\2\2\u00c9\u00ca\7p\2\2\u00ca\u00cb\7i\2\2\u00cb\u00cc\7g\2\2\u00cc"+
		"\66\3\2\2\2\u00cd\u00ce\7A\2\2\u00ce8\3\2\2\2\u00cf\u00d0\7g\2\2\u00d0"+
		"\u00d1\7n\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7g\2\2\u00d3:\3\2\2\2\u00d4"+
		"\u00d5\7k\2\2\u00d5\u00d6\7p\2\2\u00d6<\3\2\2\2\u00d7\u00d8\7q\2\2\u00d8"+
		"\u00d9\7w\2\2\u00d9\u00da\7v\2\2\u00da>\3\2\2\2\u00db\u00de\5;\36\2\u00dc"+
		"\u00de\5=\37\2\u00dd\u00db\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e0\5\37\20\2\u00e0@\3\2\2\2\u00e1\u00e2\5\63\32\2\u00e2"+
		"\u00e3\5!\21\2\u00e3B\3\2\2\2\17\2sw~\u0083\u0087\u008c\u0093\u00a1\u00a6"+
		"\u00b8\u00bf\u00dd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}