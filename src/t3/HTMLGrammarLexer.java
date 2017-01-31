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
		INICIO=1, LINHA=2, COLUNA=3, COLUNA_TITULO=4, LISTA=5, LISTA2=6, DATA=7, 
		DOIS_PONTOS=8, PONTO_VIRGULA=9, ASPAS_DUPLAS=10, ABRE_CHAVES=11, FECHA_CHAVES=12, 
		TABELA=13, TIPO=14, LINK=15, URL=16, IDENT=17, WS=18, COMENTARIO=19, CADEIA=20, 
		NUMERO=21, ASTERISCO=22;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INICIO", "LINHA", "COLUNA", "COLUNA_TITULO", "LISTA", "LISTA2", "DATA", 
		"DOIS_PONTOS", "PONTO_VIRGULA", "ASPAS_DUPLAS", "ABRE_CHAVES", "FECHA_CHAVES", 
		"TABELA", "TIPO", "LINK", "URL", "IDENT", "WS", "COMENTARIO", "CADEIA", 
		"NUMERO", "ASTERISCO"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'inicio'", "'linha'", "'coluna'", "'coluna-titulo'", "'listaOrdenada'", 
		"'listaNaoOrdenada'", "'data'", "':'", "';'", "'\"'", "'{'", "'}'", "'tabela'", 
		"'tipo'", "'link'", "'url'", null, null, null, null, null, "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INICIO", "LINHA", "COLUNA", "COLUNA_TITULO", "LISTA", "LISTA2", 
		"DATA", "DOIS_PONTOS", "PONTO_VIRGULA", "ASPAS_DUPLAS", "ABRE_CHAVES", 
		"FECHA_CHAVES", "TABELA", "TIPO", "LINK", "URL", "IDENT", "WS", "COMENTARIO", 
		"CADEIA", "NUMERO", "ASTERISCO"
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
		case 17:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		case 18:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\30\u00c9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\23\3\23\3\23\3\24\3\24\7\24\u009c\n\24\f\24\16\24\u009f\13\24\3"+
		"\24\5\24\u00a2\n\24\3\24\5\24\u00a5\n\24\3\24\3\24\3\24\7\24\u00aa\n\24"+
		"\f\24\16\24\u00ad\13\24\3\24\3\24\3\25\3\25\7\25\u00b3\n\25\f\25\16\25"+
		"\u00b6\13\25\3\25\3\25\3\25\7\25\u00bb\n\25\f\25\16\25\u00be\13\25\3\25"+
		"\5\25\u00c1\n\25\3\26\6\26\u00c4\n\26\r\26\16\26\u00c5\3\27\3\27\2\2\30"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\7\5\2\62;C\\c|\5\2\13\f\17\17"+
		"\"\"\4\2\13\f\17\17\5\2\f\f\17\17))\5\2\f\f\17\17$$\u00d0\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\66\3\2\2"+
		"\2\7<\3\2\2\2\tC\3\2\2\2\13Q\3\2\2\2\r_\3\2\2\2\17p\3\2\2\2\21u\3\2\2"+
		"\2\23w\3\2\2\2\25y\3\2\2\2\27{\3\2\2\2\31}\3\2\2\2\33\177\3\2\2\2\35\u0086"+
		"\3\2\2\2\37\u008b\3\2\2\2!\u0090\3\2\2\2#\u0094\3\2\2\2%\u0096\3\2\2\2"+
		"\'\u0099\3\2\2\2)\u00c0\3\2\2\2+\u00c3\3\2\2\2-\u00c7\3\2\2\2/\60\7k\2"+
		"\2\60\61\7p\2\2\61\62\7k\2\2\62\63\7e\2\2\63\64\7k\2\2\64\65\7q\2\2\65"+
		"\4\3\2\2\2\66\67\7n\2\2\678\7k\2\289\7p\2\29:\7j\2\2:;\7c\2\2;\6\3\2\2"+
		"\2<=\7e\2\2=>\7q\2\2>?\7n\2\2?@\7w\2\2@A\7p\2\2AB\7c\2\2B\b\3\2\2\2CD"+
		"\7e\2\2DE\7q\2\2EF\7n\2\2FG\7w\2\2GH\7p\2\2HI\7c\2\2IJ\7/\2\2JK\7v\2\2"+
		"KL\7k\2\2LM\7v\2\2MN\7w\2\2NO\7n\2\2OP\7q\2\2P\n\3\2\2\2QR\7n\2\2RS\7"+
		"k\2\2ST\7u\2\2TU\7v\2\2UV\7c\2\2VW\7Q\2\2WX\7t\2\2XY\7f\2\2YZ\7g\2\2Z"+
		"[\7p\2\2[\\\7c\2\2\\]\7f\2\2]^\7c\2\2^\f\3\2\2\2_`\7n\2\2`a\7k\2\2ab\7"+
		"u\2\2bc\7v\2\2cd\7c\2\2de\7P\2\2ef\7c\2\2fg\7q\2\2gh\7Q\2\2hi\7t\2\2i"+
		"j\7f\2\2jk\7g\2\2kl\7p\2\2lm\7c\2\2mn\7f\2\2no\7c\2\2o\16\3\2\2\2pq\7"+
		"f\2\2qr\7c\2\2rs\7v\2\2st\7c\2\2t\20\3\2\2\2uv\7<\2\2v\22\3\2\2\2wx\7"+
		"=\2\2x\24\3\2\2\2yz\7$\2\2z\26\3\2\2\2{|\7}\2\2|\30\3\2\2\2}~\7\177\2"+
		"\2~\32\3\2\2\2\177\u0080\7v\2\2\u0080\u0081\7c\2\2\u0081\u0082\7d\2\2"+
		"\u0082\u0083\7g\2\2\u0083\u0084\7n\2\2\u0084\u0085\7c\2\2\u0085\34\3\2"+
		"\2\2\u0086\u0087\7v\2\2\u0087\u0088\7k\2\2\u0088\u0089\7r\2\2\u0089\u008a"+
		"\7q\2\2\u008a\36\3\2\2\2\u008b\u008c\7n\2\2\u008c\u008d\7k\2\2\u008d\u008e"+
		"\7p\2\2\u008e\u008f\7m\2\2\u008f \3\2\2\2\u0090\u0091\7w\2\2\u0091\u0092"+
		"\7t\2\2\u0092\u0093\7n\2\2\u0093\"\3\2\2\2\u0094\u0095\t\2\2\2\u0095$"+
		"\3\2\2\2\u0096\u0097\t\3\2\2\u0097\u0098\b\23\2\2\u0098&\3\2\2\2\u0099"+
		"\u009d\7}\2\2\u009a\u009c\n\4\2\2\u009b\u009a\3\2\2\2\u009c\u009f\3\2"+
		"\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a2\7\17\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3"+
		"\2\2\2\u00a2\u00a4\3\2\2\2\u00a3\u00a5\7\f\2\2\u00a4\u00a3\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00ab\7\177\2\2\u00a7\u00a8\7"+
		"\f\2\2\u00a8\u00aa\4\13\f\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ae\3\2\2\2\u00ad\u00ab\3\2"+
		"\2\2\u00ae\u00af\b\24\3\2\u00af(\3\2\2\2\u00b0\u00b4\7)\2\2\u00b1\u00b3"+
		"\n\5\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00c1\7)"+
		"\2\2\u00b8\u00bc\7$\2\2\u00b9\u00bb\n\6\2\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2"+
		"\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\7$\2\2\u00c0\u00b0\3\2\2\2\u00c0"+
		"\u00b8\3\2\2\2\u00c1*\3\2\2\2\u00c2\u00c4\4\62;\2\u00c3\u00c2\3\2\2\2"+
		"\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6,\3"+
		"\2\2\2\u00c7\u00c8\7,\2\2\u00c8.\3\2\2\2\13\2\u009d\u00a1\u00a4\u00ab"+
		"\u00b4\u00bc\u00c0\u00c5\4\3\23\2\3\24\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}