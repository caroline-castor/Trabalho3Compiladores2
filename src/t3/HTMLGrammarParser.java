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
		INICIO=1, LINHA=2, COLUNA=3, COLUNA_TITULO=4, LISTA=5, LISTA2=6, DATA=7, 
		DOIS_PONTOS=8, PONTO_VIRGULA=9, ASPAS_DUPLAS=10, ABRE_CHAVES=11, FECHA_CHAVES=12, 
		TABELA=13, TIPO=14, LINK=15, URL=16, IDENT=17, WS=18, COMENTARIO=19, CADEIA=20, 
		NUMERO=21, ASTERISCO=22;
	public static final int
		RULE_programa = 0, RULE_listaOrdenada = 1, RULE_listaNOrdenada = 2, RULE_link = 3, 
		RULE_url = 4, RULE_tipoMarcador = 5, RULE_tabela = 6, RULE_linha = 7, 
		RULE_coluna = 8, RULE_coluna_cabecalho = 9, RULE_data = 10, RULE_item = 11;
	public static final String[] ruleNames = {
		"programa", "listaOrdenada", "listaNOrdenada", "link", "url", "tipoMarcador", 
		"tabela", "linha", "coluna", "coluna_cabecalho", "data", "item"
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

	@Override
	public String getGrammarFileName() { return "HTMLGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static String grupo="551503, 586773";
	   String msg_error="";
	   

	public HTMLGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(HTMLGrammarParser.INICIO, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public List<TabelaContext> tabela() {
			return getRuleContexts(TabelaContext.class);
		}
		public TabelaContext tabela(int i) {
			return getRuleContext(TabelaContext.class,i);
		}
		public List<ListaOrdenadaContext> listaOrdenada() {
			return getRuleContexts(ListaOrdenadaContext.class);
		}
		public ListaOrdenadaContext listaOrdenada(int i) {
			return getRuleContext(ListaOrdenadaContext.class,i);
		}
		public List<ListaNOrdenadaContext> listaNOrdenada() {
			return getRuleContexts(ListaNOrdenadaContext.class);
		}
		public ListaNOrdenadaContext listaNOrdenada(int i) {
			return getRuleContext(ListaNOrdenadaContext.class,i);
		}
		public List<LinkContext> link() {
			return getRuleContexts(LinkContext.class);
		}
		public LinkContext link(int i) {
			return getRuleContext(LinkContext.class,i);
		}
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
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(INICIO);
			setState(25);
			match(ABRE_CHAVES);
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LISTA) | (1L << LISTA2) | (1L << TABELA) | (1L << LINK))) != 0)) {
				{
				setState(30);
				switch (_input.LA(1)) {
				case TABELA:
					{
					setState(26);
					tabela();
					}
					break;
				case LISTA:
					{
					setState(27);
					listaOrdenada();
					}
					break;
				case LISTA2:
					{
					setState(28);
					listaNOrdenada();
					}
					break;
				case LINK:
					{
					setState(29);
					link();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(35);
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

	public static class ListaOrdenadaContext extends ParserRuleContext {
		public TerminalNode LISTA() { return getToken(HTMLGrammarParser.LISTA, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public TipoMarcadorContext tipoMarcador() {
			return getRuleContext(TipoMarcadorContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ListaOrdenadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaOrdenada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterListaOrdenada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitListaOrdenada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitListaOrdenada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaOrdenadaContext listaOrdenada() throws RecognitionException {
		ListaOrdenadaContext _localctx = new ListaOrdenadaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listaOrdenada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(LISTA);
			setState(38);
			match(ABRE_CHAVES);
			setState(39);
			tipoMarcador();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASTERISCO) {
				{
				{
				setState(40);
				item();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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

	public static class ListaNOrdenadaContext extends ParserRuleContext {
		public TerminalNode LISTA2() { return getToken(HTMLGrammarParser.LISTA2, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public TipoMarcadorContext tipoMarcador() {
			return getRuleContext(TipoMarcadorContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public ListaNOrdenadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaNOrdenada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterListaNOrdenada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitListaNOrdenada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitListaNOrdenada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaNOrdenadaContext listaNOrdenada() throws RecognitionException {
		ListaNOrdenadaContext _localctx = new ListaNOrdenadaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listaNOrdenada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(LISTA2);
			setState(49);
			match(ABRE_CHAVES);
			setState(50);
			tipoMarcador();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASTERISCO) {
				{
				{
				setState(51);
				item();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
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

	public static class LinkContext extends ParserRuleContext {
		public TerminalNode LINK() { return getToken(HTMLGrammarParser.LINK, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitLink(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitLink(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(LINK);
			setState(60);
			match(ABRE_CHAVES);
			setState(61);
			data();
			setState(62);
			url();
			setState(63);
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

	public static class UrlContext extends ParserRuleContext {
		public TerminalNode URL() { return getToken(HTMLGrammarParser.URL, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(HTMLGrammarParser.DOIS_PONTOS, 0); }
		public TerminalNode CADEIA() { return getToken(HTMLGrammarParser.CADEIA, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(HTMLGrammarParser.PONTO_VIRGULA, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(URL);
			setState(66);
			match(DOIS_PONTOS);
			setState(67);
			match(CADEIA);
			setState(68);
			match(PONTO_VIRGULA);
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

	public static class TipoMarcadorContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(HTMLGrammarParser.TIPO, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(HTMLGrammarParser.DOIS_PONTOS, 0); }
		public TerminalNode CADEIA() { return getToken(HTMLGrammarParser.CADEIA, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(HTMLGrammarParser.PONTO_VIRGULA, 0); }
		public TipoMarcadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoMarcador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterTipoMarcador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitTipoMarcador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitTipoMarcador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoMarcadorContext tipoMarcador() throws RecognitionException {
		TipoMarcadorContext _localctx = new TipoMarcadorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipoMarcador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(TIPO);
			setState(71);
			match(DOIS_PONTOS);
			setState(72);
			match(CADEIA);
			setState(73);
			match(PONTO_VIRGULA);
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
		public TerminalNode TABELA() { return getToken(HTMLGrammarParser.TABELA, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public List<LinhaContext> linha() {
			return getRuleContexts(LinhaContext.class);
		}
		public LinhaContext linha(int i) {
			return getRuleContext(LinhaContext.class,i);
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
		enterRule(_localctx, 12, RULE_tabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(TABELA);
			setState(76);
			match(ABRE_CHAVES);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINHA) {
				{
				{
				setState(77);
				linha();
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
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

	public static class LinhaContext extends ParserRuleContext {
		public TerminalNode LINHA() { return getToken(HTMLGrammarParser.LINHA, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public List<ColunaContext> coluna() {
			return getRuleContexts(ColunaContext.class);
		}
		public ColunaContext coluna(int i) {
			return getRuleContext(ColunaContext.class,i);
		}
		public List<Coluna_cabecalhoContext> coluna_cabecalho() {
			return getRuleContexts(Coluna_cabecalhoContext.class);
		}
		public Coluna_cabecalhoContext coluna_cabecalho(int i) {
			return getRuleContext(Coluna_cabecalhoContext.class,i);
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
		enterRule(_localctx, 14, RULE_linha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(LINHA);
			setState(86);
			match(ABRE_CHAVES);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLUNA || _la==COLUNA_TITULO) {
				{
				setState(89);
				switch (_input.LA(1)) {
				case COLUNA:
					{
					setState(87);
					coluna();
					}
					break;
				case COLUNA_TITULO:
					{
					setState(88);
					coluna_cabecalho();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
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

	public static class ColunaContext extends ParserRuleContext {
		public TerminalNode COLUNA() { return getToken(HTMLGrammarParser.COLUNA, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
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
		enterRule(_localctx, 16, RULE_coluna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(COLUNA);
			setState(97);
			match(ABRE_CHAVES);
			setState(98);
			data();
			setState(99);
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

	public static class Coluna_cabecalhoContext extends ParserRuleContext {
		public TerminalNode COLUNA_TITULO() { return getToken(HTMLGrammarParser.COLUNA_TITULO, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public Coluna_cabecalhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coluna_cabecalho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterColuna_cabecalho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitColuna_cabecalho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitColuna_cabecalho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Coluna_cabecalhoContext coluna_cabecalho() throws RecognitionException {
		Coluna_cabecalhoContext _localctx = new Coluna_cabecalhoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_coluna_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(COLUNA_TITULO);
			setState(102);
			match(ABRE_CHAVES);
			setState(103);
			data();
			setState(104);
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

	public static class DataContext extends ParserRuleContext {
		public int expr;
		public TerminalNode DATA() { return getToken(HTMLGrammarParser.DATA, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(HTMLGrammarParser.DOIS_PONTOS, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(HTMLGrammarParser.PONTO_VIRGULA, 0); }
		public TerminalNode CADEIA() { return getToken(HTMLGrammarParser.CADEIA, 0); }
		public ListaOrdenadaContext listaOrdenada() {
			return getRuleContext(ListaOrdenadaContext.class,0);
		}
		public ListaNOrdenadaContext listaNOrdenada() {
			return getRuleContext(ListaNOrdenadaContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(DATA);
			setState(107);
			match(DOIS_PONTOS);
			setState(120);
			switch (_input.LA(1)) {
			case CADEIA:
				{
				setState(108);
				match(CADEIA);
				((DataContext)_localctx).expr =  1;
				}
				break;
			case LISTA:
				{
				setState(110);
				listaOrdenada();
				((DataContext)_localctx).expr =  2;
				}
				break;
			case LISTA2:
				{
				setState(113);
				listaNOrdenada();
				((DataContext)_localctx).expr =  2;
				}
				break;
			case LINK:
				{
				setState(116);
				link();
				((DataContext)_localctx).expr = 2;
				}
				break;
			case PONTO_VIRGULA:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(122);
			match(PONTO_VIRGULA);
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

	public static class ItemContext extends ParserRuleContext {
		public int expr = 0;
		public TerminalNode ASTERISCO() { return getToken(HTMLGrammarParser.ASTERISCO, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(HTMLGrammarParser.PONTO_VIRGULA, 0); }
		public List<TerminalNode> CADEIA() { return getTokens(HTMLGrammarParser.CADEIA); }
		public TerminalNode CADEIA(int i) {
			return getToken(HTMLGrammarParser.CADEIA, i);
		}
		public List<ListaOrdenadaContext> listaOrdenada() {
			return getRuleContexts(ListaOrdenadaContext.class);
		}
		public ListaOrdenadaContext listaOrdenada(int i) {
			return getRuleContext(ListaOrdenadaContext.class,i);
		}
		public List<ListaNOrdenadaContext> listaNOrdenada() {
			return getRuleContexts(ListaNOrdenadaContext.class);
		}
		public ListaNOrdenadaContext listaNOrdenada(int i) {
			return getRuleContext(ListaNOrdenadaContext.class,i);
		}
		public List<LinkContext> link() {
			return getRuleContexts(LinkContext.class);
		}
		public LinkContext link(int i) {
			return getRuleContext(LinkContext.class,i);
		}
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ASTERISCO);
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LISTA) | (1L << LISTA2) | (1L << LINK) | (1L << CADEIA))) != 0)) {
				{
				setState(130);
				switch (_input.LA(1)) {
				case CADEIA:
					{
					setState(125);
					match(CADEIA);
					((ItemContext)_localctx).expr = 1;
					}
					break;
				case LISTA:
					{
					setState(127);
					listaOrdenada();
					}
					break;
				case LISTA2:
					{
					setState(128);
					listaNOrdenada();
					}
					break;
				case LINK:
					{
					setState(129);
					link();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(PONTO_VIRGULA);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u008c\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\3\2\7\2!\n\2\f\2\16\2$\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\7\bQ\n\b\f\b\16\bT\13\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\7\t\\\n\t\f\t\16\t_\13\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f{\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0085\n"+
		"\r\f\r\16\r\u0088\13\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\2\2\u0090\2\32\3\2\2\2\4\'\3\2\2\2\6\62\3\2\2\2\b=\3\2\2\2\nC\3\2\2\2"+
		"\fH\3\2\2\2\16M\3\2\2\2\20W\3\2\2\2\22b\3\2\2\2\24g\3\2\2\2\26l\3\2\2"+
		"\2\30~\3\2\2\2\32\33\7\3\2\2\33\"\7\r\2\2\34!\5\16\b\2\35!\5\4\3\2\36"+
		"!\5\6\4\2\37!\5\b\5\2 \34\3\2\2\2 \35\3\2\2\2 \36\3\2\2\2 \37\3\2\2\2"+
		"!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%&\7\16\2\2&\3\3"+
		"\2\2\2\'(\7\7\2\2()\7\r\2\2)-\5\f\7\2*,\5\30\r\2+*\3\2\2\2,/\3\2\2\2-"+
		"+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\7\16\2\2\61\5\3\2\2\2"+
		"\62\63\7\b\2\2\63\64\7\r\2\2\648\5\f\7\2\65\67\5\30\r\2\66\65\3\2\2\2"+
		"\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\7\16\2\2<\7\3"+
		"\2\2\2=>\7\21\2\2>?\7\r\2\2?@\5\26\f\2@A\5\n\6\2AB\7\16\2\2B\t\3\2\2\2"+
		"CD\7\22\2\2DE\7\n\2\2EF\7\26\2\2FG\7\13\2\2G\13\3\2\2\2HI\7\20\2\2IJ\7"+
		"\n\2\2JK\7\26\2\2KL\7\13\2\2L\r\3\2\2\2MN\7\17\2\2NR\7\r\2\2OQ\5\20\t"+
		"\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\16"+
		"\2\2V\17\3\2\2\2WX\7\4\2\2X]\7\r\2\2Y\\\5\22\n\2Z\\\5\24\13\2[Y\3\2\2"+
		"\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`a\7\16"+
		"\2\2a\21\3\2\2\2bc\7\5\2\2cd\7\r\2\2de\5\26\f\2ef\7\16\2\2f\23\3\2\2\2"+
		"gh\7\6\2\2hi\7\r\2\2ij\5\26\f\2jk\7\16\2\2k\25\3\2\2\2lm\7\t\2\2mz\7\n"+
		"\2\2no\7\26\2\2o{\b\f\1\2pq\5\4\3\2qr\b\f\1\2r{\3\2\2\2st\5\6\4\2tu\b"+
		"\f\1\2u{\3\2\2\2vw\5\b\5\2wx\b\f\1\2x{\3\2\2\2y{\3\2\2\2zn\3\2\2\2zp\3"+
		"\2\2\2zs\3\2\2\2zv\3\2\2\2zy\3\2\2\2{|\3\2\2\2|}\7\13\2\2}\27\3\2\2\2"+
		"~\u0086\7\30\2\2\177\u0080\7\26\2\2\u0080\u0085\b\r\1\2\u0081\u0085\5"+
		"\4\3\2\u0082\u0085\5\6\4\2\u0083\u0085\5\b\5\2\u0084\177\3\2\2\2\u0084"+
		"\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088"+
		"\u0086\3\2\2\2\u0089\u008a\7\13\2\2\u008a\31\3\2\2\2\f \"-8R[]z\u0084"+
		"\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}