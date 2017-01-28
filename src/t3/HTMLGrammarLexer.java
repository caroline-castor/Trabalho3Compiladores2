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
		ABRE_CHAVES=8, FECHA_CHAVES=9, TABELA=10, WS=11, COMENTARIO=12, CADEIA=13, 
		IDENT=14, BORDER=15, NUMERO=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INICIO", "LINHA", "COLUNA", "DATA", "DOIS_PONTOS", "PONTO_VIRGULA", "ASPAS_DUPLAS", 
		"ABRE_CHAVES", "FECHA_CHAVES", "TABELA", "WS", "COMENTARIO", "CADEIA", 
		"IDENT", "BORDER", "NUMERO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'inicio'", "'linha'", "'coluna'", "'data'", "':'", "';'", "'\"'", 
		"'{'", "'}'", "'tabela'", null, null, null, null, "'border'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INICIO", "LINHA", "COLUNA", "DATA", "DOIS_PONTOS", "PONTO_VIRGULA", 
		"ASPAS_DUPLAS", "ABRE_CHAVES", "FECHA_CHAVES", "TABELA", "WS", "COMENTARIO", 
		"CADEIA", "IDENT", "BORDER", "NUMERO"
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


	   public static String grupo="551503, 586773";
	   String msg_error="";
	   PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();  


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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u008c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\7\rS\n\r\f\r\16\rV"+
		"\13\r\3\r\5\rY\n\r\3\r\5\r\\\n\r\3\r\3\r\3\r\7\ra\n\r\f\r\16\rd\13\r\3"+
		"\r\3\r\3\16\3\16\7\16j\n\16\f\16\16\16m\13\16\3\16\3\16\3\16\7\16r\n\16"+
		"\f\16\16\16u\13\16\3\16\5\16x\n\16\3\17\3\17\7\17|\n\17\f\17\16\17\177"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\6\21\u0089\n\21\r\21\16"+
		"\21\u008a\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22\3\2\b\5\2\13\f\17\17\"\"\4\2\13\f\17\17\5\2"+
		"\f\f\17\17))\5\2\f\f\17\17$$\5\2C\\aac|\6\2\62;C\\aac|\u0094\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5*\3\2"+
		"\2\2\7\60\3\2\2\2\t\67\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21B"+
		"\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27M\3\2\2\2\31P\3\2\2\2\33w\3\2\2\2\35"+
		"y\3\2\2\2\37\u0080\3\2\2\2!\u0088\3\2\2\2#$\7k\2\2$%\7p\2\2%&\7k\2\2&"+
		"\'\7e\2\2\'(\7k\2\2()\7q\2\2)\4\3\2\2\2*+\7n\2\2+,\7k\2\2,-\7p\2\2-.\7"+
		"j\2\2./\7c\2\2/\6\3\2\2\2\60\61\7e\2\2\61\62\7q\2\2\62\63\7n\2\2\63\64"+
		"\7w\2\2\64\65\7p\2\2\65\66\7c\2\2\66\b\3\2\2\2\678\7f\2\289\7c\2\29:\7"+
		"v\2\2:;\7c\2\2;\n\3\2\2\2<=\7<\2\2=\f\3\2\2\2>?\7=\2\2?\16\3\2\2\2@A\7"+
		"$\2\2A\20\3\2\2\2BC\7}\2\2C\22\3\2\2\2DE\7\177\2\2E\24\3\2\2\2FG\7v\2"+
		"\2GH\7c\2\2HI\7d\2\2IJ\7g\2\2JK\7n\2\2KL\7c\2\2L\26\3\2\2\2MN\t\2\2\2"+
		"NO\b\f\2\2O\30\3\2\2\2PT\7}\2\2QS\n\3\2\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2"+
		"\2TU\3\2\2\2UX\3\2\2\2VT\3\2\2\2WY\7\17\2\2XW\3\2\2\2XY\3\2\2\2Y[\3\2"+
		"\2\2Z\\\7\f\2\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]b\7\177\2\2^_\7\f\2\2"+
		"_a\4\13\f\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2"+
		"\2ef\b\r\3\2f\32\3\2\2\2gk\7)\2\2hj\n\4\2\2ih\3\2\2\2jm\3\2\2\2ki\3\2"+
		"\2\2kl\3\2\2\2ln\3\2\2\2mk\3\2\2\2nx\7)\2\2os\7$\2\2pr\n\5\2\2qp\3\2\2"+
		"\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vx\7$\2\2wg\3\2\2"+
		"\2wo\3\2\2\2x\34\3\2\2\2y}\t\6\2\2z|\t\7\2\2{z\3\2\2\2|\177\3\2\2\2}{"+
		"\3\2\2\2}~\3\2\2\2~\36\3\2\2\2\177}\3\2\2\2\u0080\u0081\7d\2\2\u0081\u0082"+
		"\7q\2\2\u0082\u0083\7t\2\2\u0083\u0084\7f\2\2\u0084\u0085\7g\2\2\u0085"+
		"\u0086\7t\2\2\u0086 \3\2\2\2\u0087\u0089\4\62;\2\u0088\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\"\3\2\2\2"+
		"\f\2TX[bksw}\u008a\4\3\f\2\3\r\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}