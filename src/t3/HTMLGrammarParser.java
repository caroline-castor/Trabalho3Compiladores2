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
		RULE_programa = 0, RULE_listaOrdenada = 1, RULE_listaNOrdenada = 2, RULE_tipoMarcador = 3, 
		RULE_tabela = 4, RULE_linha = 5, RULE_coluna = 6, RULE_coluna_cabecalho = 7, 
		RULE_link = 8, RULE_url = 9, RULE_data = 10, RULE_item = 11;
	public static final String[] ruleNames = {
		"programa", "listaOrdenada", "listaNOrdenada", "tipoMarcador", "tabela", 
		"linha", "coluna", "coluna_cabecalho", "link", "url", "data", "item"
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LISTA) | (1L << LISTA2) | (1L << TABELA))) != 0)) {
				{
				setState(29);
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
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
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
			setState(36);
			match(LISTA);
			setState(37);
			match(ABRE_CHAVES);
			setState(38);
			tipoMarcador();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASTERISCO) {
				{
				{
				setState(39);
				item();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
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
			setState(47);
			match(LISTA2);
			setState(48);
			match(ABRE_CHAVES);
			setState(49);
			tipoMarcador();
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ASTERISCO) {
				{
				{
				setState(50);
				item();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
		enterRule(_localctx, 6, RULE_tipoMarcador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(TIPO);
			setState(59);
			match(DOIS_PONTOS);
			setState(60);
			match(CADEIA);
			setState(61);
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
		enterRule(_localctx, 8, RULE_tabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(TABELA);
			setState(64);
			match(ABRE_CHAVES);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINHA) {
				{
				{
				setState(65);
				linha();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
		enterRule(_localctx, 10, RULE_linha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(LINHA);
			setState(74);
			match(ABRE_CHAVES);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLUNA || _la==COLUNA_TITULO) {
				{
				setState(77);
				switch (_input.LA(1)) {
				case COLUNA:
					{
					setState(75);
					coluna();
					}
					break;
				case COLUNA_TITULO:
					{
					setState(76);
					coluna_cabecalho();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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
		enterRule(_localctx, 12, RULE_coluna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(COLUNA);
			setState(85);
			match(ABRE_CHAVES);
			setState(86);
			data();
			setState(87);
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
		enterRule(_localctx, 14, RULE_coluna_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(COLUNA_TITULO);
			setState(90);
			match(ABRE_CHAVES);
			setState(91);
			data();
			setState(92);
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
		enterRule(_localctx, 16, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(LINK);
			setState(95);
			match(ABRE_CHAVES);
			setState(96);
			url();
			setState(97);
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
		public List<TerminalNode> DOIS_PONTOS() { return getTokens(HTMLGrammarParser.DOIS_PONTOS); }
		public TerminalNode DOIS_PONTOS(int i) {
			return getToken(HTMLGrammarParser.DOIS_PONTOS, i);
		}
		public TerminalNode CADEIA() { return getToken(HTMLGrammarParser.CADEIA, 0); }
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
		enterRule(_localctx, 18, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(URL);
			setState(100);
			match(DOIS_PONTOS);
			setState(101);
			match(CADEIA);
			setState(102);
			match(DOIS_PONTOS);
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
			setState(104);
			match(DATA);
			setState(105);
			match(DOIS_PONTOS);
			setState(109);
			switch (_input.LA(1)) {
			case CADEIA:
				{
				setState(106);
				match(CADEIA);
				}
				break;
			case LISTA:
				{
				setState(107);
				listaOrdenada();
				}
				break;
			case LISTA2:
				{
				setState(108);
				listaNOrdenada();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(111);
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
		public TerminalNode ASTERISCO() { return getToken(HTMLGrammarParser.ASTERISCO, 0); }
		public TerminalNode CADEIA() { return getToken(HTMLGrammarParser.CADEIA, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(HTMLGrammarParser.PONTO_VIRGULA, 0); }
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
			setState(113);
			match(ASTERISCO);
			setState(114);
			match(CADEIA);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LISTA || _la==LISTA2) {
				{
				setState(117);
				switch (_input.LA(1)) {
				case LISTA:
					{
					setState(115);
					listaOrdenada();
					}
					break;
				case LISTA2:
					{
					setState(116);
					listaNOrdenada();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\177\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4"+
		"\66\n\4\f\4\16\49\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6E\n"+
		"\6\f\6\16\6H\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7P\n\7\f\7\16\7S\13\7\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\fp\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\7\rx\n\r\f\r\16\r{\13\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\2\2~\2\32\3\2\2\2\4&\3\2\2\2\6\61\3\2\2\2\b<\3\2\2\2\nA\3\2\2\2"+
		"\fK\3\2\2\2\16V\3\2\2\2\20[\3\2\2\2\22`\3\2\2\2\24e\3\2\2\2\26j\3\2\2"+
		"\2\30s\3\2\2\2\32\33\7\3\2\2\33!\7\r\2\2\34 \5\n\6\2\35 \5\4\3\2\36 \5"+
		"\6\4\2\37\34\3\2\2\2\37\35\3\2\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2"+
		"!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$%\7\16\2\2%\3\3\2\2\2&\'\7\7\2\2\'(\7"+
		"\r\2\2(,\5\b\5\2)+\5\30\r\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-/"+
		"\3\2\2\2.,\3\2\2\2/\60\7\16\2\2\60\5\3\2\2\2\61\62\7\b\2\2\62\63\7\r\2"+
		"\2\63\67\5\b\5\2\64\66\5\30\r\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2"+
		"\2\678\3\2\2\28:\3\2\2\29\67\3\2\2\2:;\7\16\2\2;\7\3\2\2\2<=\7\20\2\2"+
		"=>\7\n\2\2>?\7\26\2\2?@\7\13\2\2@\t\3\2\2\2AB\7\17\2\2BF\7\r\2\2CE\5\f"+
		"\7\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\16"+
		"\2\2J\13\3\2\2\2KL\7\4\2\2LQ\7\r\2\2MP\5\16\b\2NP\5\20\t\2OM\3\2\2\2O"+
		"N\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\7\16\2\2"+
		"U\r\3\2\2\2VW\7\5\2\2WX\7\r\2\2XY\5\26\f\2YZ\7\16\2\2Z\17\3\2\2\2[\\\7"+
		"\6\2\2\\]\7\r\2\2]^\5\26\f\2^_\7\16\2\2_\21\3\2\2\2`a\7\21\2\2ab\7\r\2"+
		"\2bc\5\24\13\2cd\7\16\2\2d\23\3\2\2\2ef\7\22\2\2fg\7\n\2\2gh\7\26\2\2"+
		"hi\7\n\2\2i\25\3\2\2\2jk\7\t\2\2ko\7\n\2\2lp\7\26\2\2mp\5\4\3\2np\5\6"+
		"\4\2ol\3\2\2\2om\3\2\2\2on\3\2\2\2pq\3\2\2\2qr\7\13\2\2r\27\3\2\2\2st"+
		"\7\30\2\2ty\7\26\2\2ux\5\4\3\2vx\5\6\4\2wu\3\2\2\2wv\3\2\2\2x{\3\2\2\2"+
		"yw\3\2\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\7\13\2\2}\31\3\2\2\2\f\37!"+
		",\67FOQowy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}