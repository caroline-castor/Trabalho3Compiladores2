// Generated from C:\Users\Carol\Desktop\T3\src\t3\HTMLGrammar.g4 by ANTLR 4.5.3
package t3;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HTMLGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INICIO=1, LINHA=2, COLUNA=3, DATA=4, DOIS_PONTOS=5, PONTO_VIRGULA=6, ASPAS_DUPLAS=7, 
		ABRE_CHAVES=8, FECHA_CHAVES=9, TABELA=10, WS=11, COMENTARIO=12, CADEIA=13;
	public static final int
		RULE_inicio = 0, RULE_programa = 1, RULE_tabela = 2, RULE_linha = 3, RULE_coluna = 4;
	public static final String[] ruleNames = {
		"inicio", "programa", "tabela", "linha", "coluna"
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

	@Override
	public String getGrammarFileName() { return "HTMLGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HTMLGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InicioContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(HTMLGrammarParser.INICIO, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(INICIO);
			setState(11);
			match(ABRE_CHAVES);
			setState(12);
			programa();
			setState(13);
			match(FECHA_CHAVES);
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
		public TerminalNode TABELA() { return getToken(HTMLGrammarParser.TABELA, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public TabelaContext tabela() {
			return getRuleContext(TabelaContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			match(TABELA);
			setState(16);
			match(ABRE_CHAVES);
			setState(17);
			tabela();
			setState(18);
			match(FECHA_CHAVES);
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

	public static class TabelaContext extends ParserRuleContext {
		public TerminalNode LINHA() { return getToken(HTMLGrammarParser.LINHA, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public LinhaContext linha() {
			return getRuleContext(LinhaContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public TerminalNode COLUNA() { return getToken(HTMLGrammarParser.COLUNA, 0); }
		public ColunaContext coluna() {
			return getRuleContext(ColunaContext.class,0);
		}
		public TabelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterTabela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitTabela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitTabela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TabelaContext tabela() throws RecognitionException {
		TabelaContext _localctx = new TabelaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tabela);
		try {
			setState(30);
			switch (_input.LA(1)) {
			case LINHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(LINHA);
				setState(21);
				match(ABRE_CHAVES);
				setState(22);
				linha();
				setState(23);
				match(FECHA_CHAVES);
				}
				break;
			case COLUNA:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(COLUNA);
				setState(26);
				match(ABRE_CHAVES);
				setState(27);
				coluna();
				setState(28);
				match(FECHA_CHAVES);
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

	public static class LinhaContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(HTMLGrammarParser.DATA, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(HTMLGrammarParser.DOIS_PONTOS, 0); }
		public List<TerminalNode> ASPAS_DUPLAS() { return getTokens(HTMLGrammarParser.ASPAS_DUPLAS); }
		public TerminalNode ASPAS_DUPLAS(int i) {
			return getToken(HTMLGrammarParser.ASPAS_DUPLAS, i);
		}
		public TerminalNode CADEIA() { return getToken(HTMLGrammarParser.CADEIA, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(HTMLGrammarParser.PONTO_VIRGULA, 0); }
		public List<TabelaContext> tabela() {
			return getRuleContexts(TabelaContext.class);
		}
		public TabelaContext tabela(int i) {
			return getRuleContext(TabelaContext.class,i);
		}
		public LinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitLinha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitLinha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinhaContext linha() throws RecognitionException {
		LinhaContext _localctx = new LinhaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_linha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(DATA);
			setState(33);
			match(DOIS_PONTOS);
			setState(34);
			match(ASPAS_DUPLAS);
			setState(35);
			match(CADEIA);
			setState(36);
			match(ASPAS_DUPLAS);
			setState(37);
			match(PONTO_VIRGULA);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINHA || _la==COLUNA) {
				{
				{
				setState(38);
				tabela();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ColunaContext extends ParserRuleContext {
		public TerminalNode DATA() { return getToken(HTMLGrammarParser.DATA, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(HTMLGrammarParser.DOIS_PONTOS, 0); }
		public List<TerminalNode> ASPAS_DUPLAS() { return getTokens(HTMLGrammarParser.ASPAS_DUPLAS); }
		public TerminalNode ASPAS_DUPLAS(int i) {
			return getToken(HTMLGrammarParser.ASPAS_DUPLAS, i);
		}
		public TerminalNode CADEIA() { return getToken(HTMLGrammarParser.CADEIA, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(HTMLGrammarParser.PONTO_VIRGULA, 0); }
		public List<TabelaContext> tabela() {
			return getRuleContexts(TabelaContext.class);
		}
		public TabelaContext tabela(int i) {
			return getRuleContext(TabelaContext.class,i);
		}
		public ColunaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coluna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterColuna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitColuna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitColuna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColunaContext coluna() throws RecognitionException {
		ColunaContext _localctx = new ColunaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_coluna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(DATA);
			setState(45);
			match(DOIS_PONTOS);
			setState(46);
			match(ASPAS_DUPLAS);
			setState(47);
			match(CADEIA);
			setState(48);
			match(ASPAS_DUPLAS);
			setState(49);
			match(PONTO_VIRGULA);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINHA || _la==COLUNA) {
				{
				{
				setState(50);
				tabela();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17;\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4!\n\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\7\5*\n\5\f\5\16\5-\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\66\n\6\f"+
		"\6\16\69\13\6\3\6\2\2\7\2\4\6\b\n\2\28\2\f\3\2\2\2\4\21\3\2\2\2\6 \3\2"+
		"\2\2\b\"\3\2\2\2\n.\3\2\2\2\f\r\7\3\2\2\r\16\7\n\2\2\16\17\5\4\3\2\17"+
		"\20\7\13\2\2\20\3\3\2\2\2\21\22\7\f\2\2\22\23\7\n\2\2\23\24\5\6\4\2\24"+
		"\25\7\13\2\2\25\5\3\2\2\2\26\27\7\4\2\2\27\30\7\n\2\2\30\31\5\b\5\2\31"+
		"\32\7\13\2\2\32!\3\2\2\2\33\34\7\5\2\2\34\35\7\n\2\2\35\36\5\n\6\2\36"+
		"\37\7\13\2\2\37!\3\2\2\2 \26\3\2\2\2 \33\3\2\2\2!\7\3\2\2\2\"#\7\6\2\2"+
		"#$\7\7\2\2$%\7\t\2\2%&\7\17\2\2&\'\7\t\2\2\'+\7\b\2\2(*\5\6\4\2)(\3\2"+
		"\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,\t\3\2\2\2-+\3\2\2\2./\7\6\2\2/\60"+
		"\7\7\2\2\60\61\7\t\2\2\61\62\7\17\2\2\62\63\7\t\2\2\63\67\7\b\2\2\64\66"+
		"\5\6\4\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\13\3\2\2"+
		"\29\67\3\2\2\2\5 +\67";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}