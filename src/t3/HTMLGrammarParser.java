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
		INICIO=1, LINHA=2, WIDTH=3, HEIGHT=4, COLUNA=5, COLUNA_TITULO=6, LISTA=7, 
		LISTA2=8, DATA=9, DOIS_PONTOS=10, PONTO_VIRGULA=11, ASPAS_DUPLAS=12, ABRE_CHAVES=13, 
		FECHA_CHAVES=14, TABELA=15, TIPO=16, LINK=17, URL=18, IDENT=19, WS=20, 
		CADEIA=21, NUMERO=22, ASTERISCO=23, ABRE_PARENTESIS=24, FECHA_PARENTESIS=25, 
		ALTURA=26, LARGURA=27, H1=28, H2=29, H3=30, HEAD=31, IMG=32, SRC=33;
	public static final int
		RULE_programa = 0, RULE_head = 1, RULE_h1 = 2, RULE_h2 = 3, RULE_h3 = 4, 
		RULE_body = 5, RULE_elementos = 6, RULE_img = 7, RULE_altura = 8, RULE_largura = 9, 
		RULE_img_src = 10, RULE_listaOrdenada = 11, RULE_listaNOrdenada = 12, 
		RULE_link = 13, RULE_url = 14, RULE_tipoMarcador = 15, RULE_tabela = 16, 
		RULE_linha = 17, RULE_coluna = 18, RULE_coluna_cabecalho = 19, RULE_data = 20, 
		RULE_item = 21;
	public static final String[] ruleNames = {
		"programa", "head", "h1", "h2", "h3", "body", "elementos", "img", "altura", 
		"largura", "img_src", "listaOrdenada", "listaNOrdenada", "link", "url", 
		"tipoMarcador", "tabela", "linha", "coluna", "coluna_cabecalho", "data", 
		"item"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'inicio'", "'linha'", "'widht'", "'height'", "'coluna'", "'coluna-titulo'", 
		"'listaOrdenada'", "'listaNaoOrdenada'", "'data'", "':'", "';'", "'\"'", 
		"'{'", "'}'", "'tabela'", "'tipo'", "'link'", "'url'", null, null, null, 
		null, "'*'", "'('", "')'", "'altura'", "'largura'", "'h1'", "'h2'", "'h3'", 
		"'head'", "'img'", "'src'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INICIO", "LINHA", "WIDTH", "HEIGHT", "COLUNA", "COLUNA_TITULO", 
		"LISTA", "LISTA2", "DATA", "DOIS_PONTOS", "PONTO_VIRGULA", "ASPAS_DUPLAS", 
		"ABRE_CHAVES", "FECHA_CHAVES", "TABELA", "TIPO", "LINK", "URL", "IDENT", 
		"WS", "CADEIA", "NUMERO", "ASTERISCO", "ABRE_PARENTESIS", "FECHA_PARENTESIS", 
		"ALTURA", "LARGURA", "H1", "H2", "H3", "HEAD", "IMG", "SRC"
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
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
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
			setState(44);
			match(INICIO);
			setState(45);
			match(ABRE_CHAVES);
			setState(47);
			_la = _input.LA(1);
			if (_la==HEAD) {
				{
				setState(46);
				head();
				}
			}

			setState(49);
			body();
			setState(50);
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

	public static class HeadContext extends ParserRuleContext {
		public TerminalNode HEAD() { return getToken(HTMLGrammarParser.HEAD, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public List<H1Context> h1() {
			return getRuleContexts(H1Context.class);
		}
		public H1Context h1(int i) {
			return getRuleContext(H1Context.class,i);
		}
		public List<H2Context> h2() {
			return getRuleContexts(H2Context.class);
		}
		public H2Context h2(int i) {
			return getRuleContext(H2Context.class,i);
		}
		public List<H3Context> h3() {
			return getRuleContexts(H3Context.class);
		}
		public H3Context h3(int i) {
			return getRuleContext(H3Context.class,i);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(HEAD);
			setState(53);
			match(ABRE_CHAVES);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << H1) | (1L << H2) | (1L << H3))) != 0)) {
				{
				setState(57);
				switch (_input.LA(1)) {
				case H1:
					{
					setState(54);
					h1();
					}
					break;
				case H2:
					{
					setState(55);
					h2();
					}
					break;
				case H3:
					{
					setState(56);
					h3();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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

	public static class H1Context extends ParserRuleContext {
		public TerminalNode H1() { return getToken(HTMLGrammarParser.H1, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public H1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterH1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitH1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitH1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H1Context h1() throws RecognitionException {
		H1Context _localctx = new H1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_h1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(H1);
			setState(65);
			match(ABRE_CHAVES);
			setState(66);
			data();
			setState(67);
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

	public static class H2Context extends ParserRuleContext {
		public TerminalNode H2() { return getToken(HTMLGrammarParser.H2, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public H2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterH2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitH2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitH2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H2Context h2() throws RecognitionException {
		H2Context _localctx = new H2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_h2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(H2);
			setState(70);
			match(ABRE_CHAVES);
			setState(71);
			data();
			setState(72);
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

	public static class H3Context extends ParserRuleContext {
		public TerminalNode H3() { return getToken(HTMLGrammarParser.H3, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public H3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_h3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterH3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitH3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitH3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final H3Context h3() throws RecognitionException {
		H3Context _localctx = new H3Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_h3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(H3);
			setState(75);
			match(ABRE_CHAVES);
			setState(76);
			data();
			setState(77);
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

	public static class BodyContext extends ParserRuleContext {
		public List<ElementosContext> elementos() {
			return getRuleContexts(ElementosContext.class);
		}
		public ElementosContext elementos(int i) {
			return getRuleContext(ElementosContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LISTA) | (1L << LISTA2) | (1L << TABELA) | (1L << LINK) | (1L << CADEIA) | (1L << IMG))) != 0)) {
				{
				{
				setState(79);
				elementos();
				}
				}
				setState(84);
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

	public static class ElementosContext extends ParserRuleContext {
		public int expr = 0;
		public TabelaContext tabela() {
			return getRuleContext(TabelaContext.class,0);
		}
		public ListaOrdenadaContext listaOrdenada() {
			return getRuleContext(ListaOrdenadaContext.class,0);
		}
		public ListaNOrdenadaContext listaNOrdenada() {
			return getRuleContext(ListaNOrdenadaContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public ImgContext img() {
			return getRuleContext(ImgContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(HTMLGrammarParser.CADEIA, 0); }
		public ElementosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterElementos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitElementos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitElementos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementosContext elementos() throws RecognitionException {
		ElementosContext _localctx = new ElementosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elementos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			switch (_input.LA(1)) {
			case TABELA:
				{
				setState(85);
				tabela();
				}
				break;
			case LISTA:
				{
				setState(86);
				listaOrdenada();
				}
				break;
			case LISTA2:
				{
				setState(87);
				listaNOrdenada();
				}
				break;
			case LINK:
				{
				setState(88);
				link();
				}
				break;
			case IMG:
				{
				setState(89);
				img();
				}
				break;
			case CADEIA:
				{
				setState(90);
				match(CADEIA);
				((ElementosContext)_localctx).expr = 1;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ImgContext extends ParserRuleContext {
		public TerminalNode IMG() { return getToken(HTMLGrammarParser.IMG, 0); }
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public Img_srcContext img_src() {
			return getRuleContext(Img_srcContext.class,0);
		}
		public AlturaContext altura() {
			return getRuleContext(AlturaContext.class,0);
		}
		public LarguraContext largura() {
			return getRuleContext(LarguraContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public ImgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_img; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterImg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitImg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitImg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImgContext img() throws RecognitionException {
		ImgContext _localctx = new ImgContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_img);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(IMG);
			setState(95);
			match(ABRE_CHAVES);
			setState(96);
			img_src();
			setState(97);
			altura();
			setState(98);
			largura();
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

	public static class AlturaContext extends ParserRuleContext {
		public TerminalNode ALTURA() { return getToken(HTMLGrammarParser.ALTURA, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(HTMLGrammarParser.DOIS_PONTOS, 0); }
		public TerminalNode CADEIA() { return getToken(HTMLGrammarParser.CADEIA, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(HTMLGrammarParser.PONTO_VIRGULA, 0); }
		public AlturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_altura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterAltura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitAltura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitAltura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlturaContext altura() throws RecognitionException {
		AlturaContext _localctx = new AlturaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_altura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(ALTURA);
			setState(102);
			match(DOIS_PONTOS);
			setState(103);
			match(CADEIA);
			setState(104);
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

	public static class LarguraContext extends ParserRuleContext {
		public TerminalNode LARGURA() { return getToken(HTMLGrammarParser.LARGURA, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(HTMLGrammarParser.DOIS_PONTOS, 0); }
		public TerminalNode CADEIA() { return getToken(HTMLGrammarParser.CADEIA, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(HTMLGrammarParser.PONTO_VIRGULA, 0); }
		public LarguraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_largura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterLargura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitLargura(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitLargura(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LarguraContext largura() throws RecognitionException {
		LarguraContext _localctx = new LarguraContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_largura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(LARGURA);
			setState(107);
			match(DOIS_PONTOS);
			setState(108);
			match(CADEIA);
			setState(109);
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

	public static class Img_srcContext extends ParserRuleContext {
		public TerminalNode SRC() { return getToken(HTMLGrammarParser.SRC, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(HTMLGrammarParser.DOIS_PONTOS, 0); }
		public TerminalNode CADEIA() { return getToken(HTMLGrammarParser.CADEIA, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(HTMLGrammarParser.PONTO_VIRGULA, 0); }
		public Img_srcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_img_src; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterImg_src(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitImg_src(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitImg_src(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Img_srcContext img_src() throws RecognitionException {
		Img_srcContext _localctx = new Img_srcContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_img_src);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(SRC);
			setState(112);
			match(DOIS_PONTOS);
			setState(113);
			match(CADEIA);
			setState(114);
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
		enterRule(_localctx, 22, RULE_listaOrdenada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(LISTA);
			setState(117);
			match(ABRE_CHAVES);
			setState(118);
			tipoMarcador();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LISTA) | (1L << LISTA2) | (1L << PONTO_VIRGULA) | (1L << LINK) | (1L << ASTERISCO))) != 0)) {
				{
				{
				setState(119);
				item();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
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
		enterRule(_localctx, 24, RULE_listaNOrdenada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(LISTA2);
			setState(128);
			match(ABRE_CHAVES);
			setState(129);
			tipoMarcador();
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LISTA) | (1L << LISTA2) | (1L << PONTO_VIRGULA) | (1L << LINK) | (1L << ASTERISCO))) != 0)) {
				{
				{
				setState(130);
				item();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
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
		enterRule(_localctx, 26, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(LINK);
			setState(139);
			match(ABRE_CHAVES);
			setState(140);
			data();
			setState(141);
			url();
			setState(142);
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
		enterRule(_localctx, 28, RULE_url);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(URL);
			setState(145);
			match(DOIS_PONTOS);
			setState(146);
			match(CADEIA);
			setState(147);
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
		enterRule(_localctx, 30, RULE_tipoMarcador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(TIPO);
			setState(150);
			match(DOIS_PONTOS);
			setState(151);
			match(CADEIA);
			setState(152);
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
		enterRule(_localctx, 32, RULE_tabela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(TABELA);
			setState(155);
			match(ABRE_CHAVES);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LINHA) {
				{
				{
				setState(156);
				linha();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(162);
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
		enterRule(_localctx, 34, RULE_linha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(LINHA);
			setState(165);
			match(ABRE_CHAVES);
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COLUNA || _la==COLUNA_TITULO) {
				{
				setState(168);
				switch (_input.LA(1)) {
				case COLUNA:
					{
					setState(166);
					coluna();
					}
					break;
				case COLUNA_TITULO:
					{
					setState(167);
					coluna_cabecalho();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
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
		enterRule(_localctx, 36, RULE_coluna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(COLUNA);
			setState(176);
			match(ABRE_CHAVES);
			setState(177);
			data();
			setState(178);
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
		enterRule(_localctx, 38, RULE_coluna_cabecalho);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(COLUNA_TITULO);
			setState(181);
			match(ABRE_CHAVES);
			setState(182);
			data();
			setState(183);
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
		public int expr = 0;
		public TerminalNode DATA() { return getToken(HTMLGrammarParser.DATA, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(HTMLGrammarParser.DOIS_PONTOS, 0); }
		public TerminalNode CADEIA() { return getToken(HTMLGrammarParser.CADEIA, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(HTMLGrammarParser.PONTO_VIRGULA, 0); }
		public ListaOrdenadaContext listaOrdenada() {
			return getRuleContext(ListaOrdenadaContext.class,0);
		}
		public ListaNOrdenadaContext listaNOrdenada() {
			return getRuleContext(ListaNOrdenadaContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public ImgContext img() {
			return getRuleContext(ImgContext.class,0);
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
		enterRule(_localctx, 40, RULE_data);
		try {
			setState(194);
			switch (_input.LA(1)) {
			case DATA:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(DATA);
				setState(186);
				match(DOIS_PONTOS);
				setState(187);
				match(CADEIA);
				((DataContext)_localctx).expr =  1;
				setState(189);
				match(PONTO_VIRGULA);
				}
				break;
			case LISTA:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				listaOrdenada();
				}
				break;
			case LISTA2:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				listaNOrdenada();
				}
				break;
			case LINK:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				link();
				}
				break;
			case IMG:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				img();
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

	public static class ItemContext extends ParserRuleContext {
		public int expr = 0;
		public TerminalNode PONTO_VIRGULA() { return getToken(HTMLGrammarParser.PONTO_VIRGULA, 0); }
		public List<TerminalNode> ASTERISCO() { return getTokens(HTMLGrammarParser.ASTERISCO); }
		public TerminalNode ASTERISCO(int i) {
			return getToken(HTMLGrammarParser.ASTERISCO, i);
		}
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
		enterRule(_localctx, 42, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LISTA) | (1L << LISTA2) | (1L << LINK) | (1L << ASTERISCO))) != 0)) {
				{
				setState(202);
				switch (_input.LA(1)) {
				case ASTERISCO:
					{
					setState(196);
					match(ASTERISCO);
					setState(197);
					match(CADEIA);
					((ItemContext)_localctx).expr = 1;
					}
					break;
				case LISTA:
					{
					setState(199);
					listaOrdenada();
					}
					break;
				case LISTA2:
					{
					setState(200);
					listaNOrdenada();
					}
					break;
				case LINK:
					{
					setState(201);
					link();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3#\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\5\2\62"+
		"\n\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\7\7S\n"+
		"\7\f\7\16\7V\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b_\n\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\7\r{\n\r\f\r\16\r~\13\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\7\16\u0086\n\16\f\16\16\16\u0089\13\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\7\22\u00a0\n\22\f\22\16\22\u00a3\13\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\7\23\u00ab\n\23\f\23\16\23\u00ae\13\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00c5\n\26\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u00cd"+
		"\n\27\f\27\16\27\u00d0\13\27\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,\2\2\u00d4\2.\3\2\2\2\4\66\3\2\2\2\6B\3\2\2"+
		"\2\bG\3\2\2\2\nL\3\2\2\2\fT\3\2\2\2\16^\3\2\2\2\20`\3\2\2\2\22g\3\2\2"+
		"\2\24l\3\2\2\2\26q\3\2\2\2\30v\3\2\2\2\32\u0081\3\2\2\2\34\u008c\3\2\2"+
		"\2\36\u0092\3\2\2\2 \u0097\3\2\2\2\"\u009c\3\2\2\2$\u00a6\3\2\2\2&\u00b1"+
		"\3\2\2\2(\u00b6\3\2\2\2*\u00c4\3\2\2\2,\u00ce\3\2\2\2./\7\3\2\2/\61\7"+
		"\17\2\2\60\62\5\4\3\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64"+
		"\5\f\7\2\64\65\7\20\2\2\65\3\3\2\2\2\66\67\7!\2\2\67=\7\17\2\28<\5\6\4"+
		"\29<\5\b\5\2:<\5\n\6\2;8\3\2\2\2;9\3\2\2\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2"+
		"\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\20\2\2A\5\3\2\2\2BC\7\36\2\2CD\7"+
		"\17\2\2DE\5*\26\2EF\7\20\2\2F\7\3\2\2\2GH\7\37\2\2HI\7\17\2\2IJ\5*\26"+
		"\2JK\7\20\2\2K\t\3\2\2\2LM\7 \2\2MN\7\17\2\2NO\5*\26\2OP\7\20\2\2P\13"+
		"\3\2\2\2QS\5\16\b\2RQ\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\r\3\2\2\2"+
		"VT\3\2\2\2W_\5\"\22\2X_\5\30\r\2Y_\5\32\16\2Z_\5\34\17\2[_\5\20\t\2\\"+
		"]\7\27\2\2]_\b\b\1\2^W\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2"+
		"^\\\3\2\2\2_\17\3\2\2\2`a\7\"\2\2ab\7\17\2\2bc\5\26\f\2cd\5\22\n\2de\5"+
		"\24\13\2ef\7\20\2\2f\21\3\2\2\2gh\7\34\2\2hi\7\f\2\2ij\7\27\2\2jk\7\r"+
		"\2\2k\23\3\2\2\2lm\7\35\2\2mn\7\f\2\2no\7\27\2\2op\7\r\2\2p\25\3\2\2\2"+
		"qr\7#\2\2rs\7\f\2\2st\7\27\2\2tu\7\r\2\2u\27\3\2\2\2vw\7\t\2\2wx\7\17"+
		"\2\2x|\5 \21\2y{\5,\27\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177"+
		"\3\2\2\2~|\3\2\2\2\177\u0080\7\20\2\2\u0080\31\3\2\2\2\u0081\u0082\7\n"+
		"\2\2\u0082\u0083\7\17\2\2\u0083\u0087\5 \21\2\u0084\u0086\5,\27\2\u0085"+
		"\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2"+
		"\2\2\u0088\u008a\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\20\2\2\u008b"+
		"\33\3\2\2\2\u008c\u008d\7\23\2\2\u008d\u008e\7\17\2\2\u008e\u008f\5*\26"+
		"\2\u008f\u0090\5\36\20\2\u0090\u0091\7\20\2\2\u0091\35\3\2\2\2\u0092\u0093"+
		"\7\24\2\2\u0093\u0094\7\f\2\2\u0094\u0095\7\27\2\2\u0095\u0096\7\r\2\2"+
		"\u0096\37\3\2\2\2\u0097\u0098\7\22\2\2\u0098\u0099\7\f\2\2\u0099\u009a"+
		"\7\27\2\2\u009a\u009b\7\r\2\2\u009b!\3\2\2\2\u009c\u009d\7\21\2\2\u009d"+
		"\u00a1\7\17\2\2\u009e\u00a0\5$\23\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3"+
		"\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a4\u00a5\7\20\2\2\u00a5#\3\2\2\2\u00a6\u00a7\7\4\2\2"+
		"\u00a7\u00ac\7\17\2\2\u00a8\u00ab\5&\24\2\u00a9\u00ab\5(\25\2\u00aa\u00a8"+
		"\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\7\20"+
		"\2\2\u00b0%\3\2\2\2\u00b1\u00b2\7\7\2\2\u00b2\u00b3\7\17\2\2\u00b3\u00b4"+
		"\5*\26\2\u00b4\u00b5\7\20\2\2\u00b5\'\3\2\2\2\u00b6\u00b7\7\b\2\2\u00b7"+
		"\u00b8\7\17\2\2\u00b8\u00b9\5*\26\2\u00b9\u00ba\7\20\2\2\u00ba)\3\2\2"+
		"\2\u00bb\u00bc\7\13\2\2\u00bc\u00bd\7\f\2\2\u00bd\u00be\7\27\2\2\u00be"+
		"\u00bf\b\26\1\2\u00bf\u00c5\7\r\2\2\u00c0\u00c5\5\30\r\2\u00c1\u00c5\5"+
		"\32\16\2\u00c2\u00c5\5\34\17\2\u00c3\u00c5\5\20\t\2\u00c4\u00bb\3\2\2"+
		"\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c3"+
		"\3\2\2\2\u00c5+\3\2\2\2\u00c6\u00c7\7\31\2\2\u00c7\u00c8\7\27\2\2\u00c8"+
		"\u00cd\b\27\1\2\u00c9\u00cd\5\30\r\2\u00ca\u00cd\5\32\16\2\u00cb\u00cd"+
		"\5\34\17\2\u00cc\u00c6\3\2\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2"+
		"\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\7\r\2\2\u00d2"+
		"-\3\2\2\2\17\61;=T^|\u0087\u00a1\u00aa\u00ac\u00c4\u00cc\u00ce";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}