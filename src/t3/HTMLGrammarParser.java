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
		ABRE_CHAVES=8, FECHA_CHAVES=9, TABELA=10, WS=11, COMENTARIO=12, CADEIA=13, 
		IDENT=14, BORDER=15, NUMERO=16;
	public static final int
		RULE_programa = 0, RULE_tabela = 1, RULE_formacao_tabela = 2, RULE_coluna = 3, 
		RULE_linha = 4, RULE_data = 5, RULE_border = 6, RULE_identificador_tabela = 7;
	public static final String[] ruleNames = {
		"programa", "tabela", "formacao_tabela", "coluna", "linha", "data", "border", 
		"identificador_tabela"
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
	   PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();  

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
			setState(16);
			match(INICIO);

			          pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global")); 
			        
			setState(18);
			match(ABRE_CHAVES);
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TABELA) {
				{
				{
				setState(19);
				tabela();
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(25);
			match(FECHA_CHAVES);

			          pilhaDeTabelas.desempilhar();
			          if(msg_error!=""){
			                  throw new RuntimeException(msg_error);
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

	public static class TabelaContext extends ParserRuleContext {
		public TerminalNode TABELA() { return getToken(HTMLGrammarParser.TABELA, 0); }
		public Identificador_tabelaContext identificador_tabela() {
			return getRuleContext(Identificador_tabelaContext.class,0);
		}
		public TerminalNode ABRE_CHAVES() { return getToken(HTMLGrammarParser.ABRE_CHAVES, 0); }
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public Formacao_tabelaContext formacao_tabela() {
			return getRuleContext(Formacao_tabelaContext.class,0);
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
		enterRule(_localctx, 2, RULE_tabela);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(28);
			match(TABELA);
			setState(29);
			identificador_tabela();
			setState(30);
			match(ABRE_CHAVES);
			{
			setState(31);
			formacao_tabela();
			}
			setState(32);
			match(FECHA_CHAVES);
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

	public static class Formacao_tabelaContext extends ParserRuleContext {
		public BorderContext border() {
			return getRuleContext(BorderContext.class,0);
		}
		public LinhaContext linha() {
			return getRuleContext(LinhaContext.class,0);
		}
		public ColunaContext coluna() {
			return getRuleContext(ColunaContext.class,0);
		}
		public Formacao_tabelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formacao_tabela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterFormacao_tabela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitFormacao_tabela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitFormacao_tabela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Formacao_tabelaContext formacao_tabela() throws RecognitionException {
		Formacao_tabelaContext _localctx = new Formacao_tabelaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_formacao_tabela);
		try {
			setState(41);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(34);
				border();
				setState(35);
				linha();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(37);
				border();
				setState(38);
				coluna();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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
		public ColunaContext coluna() {
			return getRuleContext(ColunaContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public LinhaContext linha() {
			return getRuleContext(LinhaContext.class,0);
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
		enterRule(_localctx, 6, RULE_coluna);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(COLUNA);
				setState(44);
				match(ABRE_CHAVES);
				setState(45);
				data();
				setState(46);
				coluna();
				setState(47);
				match(FECHA_CHAVES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(COLUNA);
				setState(50);
				match(ABRE_CHAVES);
				setState(51);
				data();
				setState(52);
				linha();
				setState(53);
				match(FECHA_CHAVES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public ColunaContext coluna() {
			return getRuleContext(ColunaContext.class,0);
		}
		public TerminalNode FECHA_CHAVES() { return getToken(HTMLGrammarParser.FECHA_CHAVES, 0); }
		public LinhaContext linha() {
			return getRuleContext(LinhaContext.class,0);
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
		enterRule(_localctx, 8, RULE_linha);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				match(LINHA);
				setState(59);
				match(ABRE_CHAVES);
				setState(60);
				data();
				setState(61);
				coluna();
				setState(62);
				match(FECHA_CHAVES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(LINHA);
				setState(65);
				match(ABRE_CHAVES);
				setState(66);
				data();
				setState(67);
				linha();
				setState(68);
				match(FECHA_CHAVES);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
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
		public TerminalNode CADEIA() { return getToken(HTMLGrammarParser.CADEIA, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(HTMLGrammarParser.PONTO_VIRGULA, 0); }
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
		enterRule(_localctx, 10, RULE_data);
		try {
			setState(78);
			switch (_input.LA(1)) {
			case DATA:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(DATA);
				setState(74);
				match(DOIS_PONTOS);
				setState(75);
				match(CADEIA);
				setState(76);
				match(PONTO_VIRGULA);
				}
				break;
			case LINHA:
			case COLUNA:
			case FECHA_CHAVES:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class BorderContext extends ParserRuleContext {
		public TerminalNode BORDER() { return getToken(HTMLGrammarParser.BORDER, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(HTMLGrammarParser.DOIS_PONTOS, 0); }
		public List<TerminalNode> ASPAS_DUPLAS() { return getTokens(HTMLGrammarParser.ASPAS_DUPLAS); }
		public TerminalNode ASPAS_DUPLAS(int i) {
			return getToken(HTMLGrammarParser.ASPAS_DUPLAS, i);
		}
		public TerminalNode NUMERO() { return getToken(HTMLGrammarParser.NUMERO, 0); }
		public TerminalNode PONTO_VIRGULA() { return getToken(HTMLGrammarParser.PONTO_VIRGULA, 0); }
		public BorderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_border; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterBorder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitBorder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitBorder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BorderContext border() throws RecognitionException {
		BorderContext _localctx = new BorderContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_border);
		try {
			setState(87);
			switch (_input.LA(1)) {
			case BORDER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(80);
				match(BORDER);
				setState(81);
				match(DOIS_PONTOS);
				setState(82);
				match(ASPAS_DUPLAS);
				setState(83);
				match(NUMERO);
				setState(84);
				match(ASPAS_DUPLAS);
				setState(85);
				match(PONTO_VIRGULA);
				}
				}
				break;
			case LINHA:
			case COLUNA:
			case FECHA_CHAVES:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Identificador_tabelaContext extends ParserRuleContext {
		public Token id;
		public TerminalNode IDENT() { return getToken(HTMLGrammarParser.IDENT, 0); }
		public Identificador_tabelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador_tabela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).enterIdentificador_tabela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HTMLGrammarListener ) ((HTMLGrammarListener)listener).exitIdentificador_tabela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HTMLGrammarVisitor ) return ((HTMLGrammarVisitor<? extends T>)visitor).visitIdentificador_tabela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identificador_tabelaContext identificador_tabela() throws RecognitionException {
		Identificador_tabelaContext _localctx = new Identificador_tabelaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_identificador_tabela);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			((Identificador_tabelaContext)_localctx).id = match(IDENT);

			       //verificação se já existe uma tabela com o mesmo nome
			       if(pilhaDeTabelas.topo().existeSimbolo(((Identificador_tabelaContext)_localctx).id.getText())){
			            msg_error += "Linha " + ((Identificador_tabelaContext)_localctx).id.getLine() + ": identificador "+((Identificador_tabelaContext)_localctx).id.getText()+" ja declarado anteriormente\n" ;
			       }else{
			             // se não existir então adiciona-se o identificador escopo atual
			            pilhaDeTabelas.topo().adicionarSimbolo(((Identificador_tabelaContext)_localctx).id.getText());
			            
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22_\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\7\2"+
		"\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4,\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\5\6J\n\6\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bZ\n\b\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2_\2\22\3\2\2\2\4\36"+
		"\3\2\2\2\6+\3\2\2\2\b:\3\2\2\2\nI\3\2\2\2\fP\3\2\2\2\16Y\3\2\2\2\20[\3"+
		"\2\2\2\22\23\7\3\2\2\23\24\b\2\1\2\24\30\7\n\2\2\25\27\5\4\3\2\26\25\3"+
		"\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33\3\2\2\2\32\30\3"+
		"\2\2\2\33\34\7\13\2\2\34\35\b\2\1\2\35\3\3\2\2\2\36\37\7\f\2\2\37 \5\20"+
		"\t\2 !\7\n\2\2!\"\5\6\4\2\"#\7\13\2\2#\5\3\2\2\2$%\5\16\b\2%&\5\n\6\2"+
		"&,\3\2\2\2\'(\5\16\b\2()\5\b\5\2),\3\2\2\2*,\3\2\2\2+$\3\2\2\2+\'\3\2"+
		"\2\2+*\3\2\2\2,\7\3\2\2\2-.\7\5\2\2./\7\n\2\2/\60\5\f\7\2\60\61\5\b\5"+
		"\2\61\62\7\13\2\2\62;\3\2\2\2\63\64\7\5\2\2\64\65\7\n\2\2\65\66\5\f\7"+
		"\2\66\67\5\n\6\2\678\7\13\2\28;\3\2\2\29;\3\2\2\2:-\3\2\2\2:\63\3\2\2"+
		"\2:9\3\2\2\2;\t\3\2\2\2<=\7\4\2\2=>\7\n\2\2>?\5\f\7\2?@\5\b\5\2@A\7\13"+
		"\2\2AJ\3\2\2\2BC\7\4\2\2CD\7\n\2\2DE\5\f\7\2EF\5\n\6\2FG\7\13\2\2GJ\3"+
		"\2\2\2HJ\3\2\2\2I<\3\2\2\2IB\3\2\2\2IH\3\2\2\2J\13\3\2\2\2KL\7\6\2\2L"+
		"M\7\7\2\2MN\7\17\2\2NQ\7\b\2\2OQ\3\2\2\2PK\3\2\2\2PO\3\2\2\2Q\r\3\2\2"+
		"\2RS\7\21\2\2ST\7\7\2\2TU\7\t\2\2UV\7\22\2\2VW\7\t\2\2WZ\7\b\2\2XZ\3\2"+
		"\2\2YR\3\2\2\2YX\3\2\2\2Z\17\3\2\2\2[\\\7\20\2\2\\]\b\t\1\2]\21\3\2\2"+
		"\2\b\30+:IPY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}