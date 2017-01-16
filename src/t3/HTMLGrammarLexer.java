// Generated from C:\Users\Carol\Desktop\T3\src\t3\HTMLGrammar.g4 by ANTLR 4.5.3
package t3;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIO=1, LINHA=2, COLUNA=3, DATA=4, DOIS_PONTOS=5, PONTO_VIRGULA=6, ASPAS_DUPLAS=7, 
		ABRE_CHAVES=8, FECHA_CHAVES=9, TABELA=10, WS=11, COMENTARIO=12, CADEIA=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INICIO", "LINHA", "COLUNA", "DATA", "DOIS_PONTOS", "PONTO_VIRGULA", "ASPAS_DUPLAS", 
		"ABRE_CHAVES", "FECHA_CHAVES", "TABELA", "WS", "COMENTARIO", "CADEIA"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'inicio'", "'linha'", "'coluna'", "'data'", "':'", "';'", "'\"'", 
		"'{'", "'}'", "'tabela'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INICIO", "LINHA", "COLUNA", "DATA", "DOIS_PONTOS", "PONTO_VIRGULA", 
		"ASPAS_DUPLAS", "ABRE_CHAVES", "FECHA_CHAVES", "TABELA", "WS", "COMENTARIO", 
		"CADEIA"
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


	public HTMLGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "HTMLGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 10:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\f\3\r\3\r\7\rM\n\r\f\r\16\rP\13\r\3\r\5\rS\n\r\3\r\5\rV\n\r\3\r"+
		"\3\r\3\r\7\r[\n\r\f\r\16\r^\13\r\3\r\3\r\3\16\3\16\7\16d\n\16\f\16\16"+
		"\16g\13\16\3\16\3\16\3\16\7\16l\n\16\f\16\16\16o\13\16\3\16\5\16r\n\16"+
		"\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\3\2\6\5\2\13\f\17\17\"\"\4\2\13\f\17\17\5\2\f\f\17\17))\5\2\f\f\17\17"+
		"$$y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5$\3\2\2\2\7*\3\2\2\2\t\61\3"+
		"\2\2\2\13\66\3\2\2\2\r8\3\2\2\2\17:\3\2\2\2\21<\3\2\2\2\23>\3\2\2\2\25"+
		"@\3\2\2\2\27G\3\2\2\2\31J\3\2\2\2\33q\3\2\2\2\35\36\7k\2\2\36\37\7p\2"+
		"\2\37 \7k\2\2 !\7e\2\2!\"\7k\2\2\"#\7q\2\2#\4\3\2\2\2$%\7n\2\2%&\7k\2"+
		"\2&\'\7p\2\2\'(\7j\2\2()\7c\2\2)\6\3\2\2\2*+\7e\2\2+,\7q\2\2,-\7n\2\2"+
		"-.\7w\2\2./\7p\2\2/\60\7c\2\2\60\b\3\2\2\2\61\62\7f\2\2\62\63\7c\2\2\63"+
		"\64\7v\2\2\64\65\7c\2\2\65\n\3\2\2\2\66\67\7<\2\2\67\f\3\2\2\289\7=\2"+
		"\29\16\3\2\2\2:;\7$\2\2;\20\3\2\2\2<=\7}\2\2=\22\3\2\2\2>?\7\177\2\2?"+
		"\24\3\2\2\2@A\7v\2\2AB\7c\2\2BC\7d\2\2CD\7g\2\2DE\7n\2\2EF\7c\2\2F\26"+
		"\3\2\2\2GH\t\2\2\2HI\b\f\2\2I\30\3\2\2\2JN\7}\2\2KM\n\3\2\2LK\3\2\2\2"+
		"MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QS\7\17\2\2RQ\3\2\2"+
		"\2RS\3\2\2\2SU\3\2\2\2TV\7\f\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2W\\\7\177"+
		"\2\2XY\7\f\2\2Y[\4\13\f\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_"+
		"\3\2\2\2^\\\3\2\2\2_`\b\r\3\2`\32\3\2\2\2ae\7)\2\2bd\n\4\2\2cb\3\2\2\2"+
		"dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hr\7)\2\2im\7$\2\2j"+
		"l\n\5\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2"+
		"pr\7$\2\2qa\3\2\2\2qi\3\2\2\2r\34\3\2\2\2\n\2NRU\\emq\4\3\f\2\3\r\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}