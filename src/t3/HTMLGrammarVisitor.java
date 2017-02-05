// Generated from C:\Users\Carol\Desktop\T3\src\t3\HTMLGrammar.g4 by ANTLR 4.5.3
package t3;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HTMLGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HTMLGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(HTMLGrammarParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(HTMLGrammarParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#h1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH1(HTMLGrammarParser.H1Context ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#h2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH2(HTMLGrammarParser.H2Context ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#h3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitH3(HTMLGrammarParser.H3Context ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(HTMLGrammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#elementos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementos(HTMLGrammarParser.ElementosContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#img}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImg(HTMLGrammarParser.ImgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#altura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAltura(HTMLGrammarParser.AlturaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#largura}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLargura(HTMLGrammarParser.LarguraContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#img_src}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImg_src(HTMLGrammarParser.Img_srcContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#listaOrdenada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaOrdenada(HTMLGrammarParser.ListaOrdenadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#listaNOrdenada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaNOrdenada(HTMLGrammarParser.ListaNOrdenadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(HTMLGrammarParser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(HTMLGrammarParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#tipoMarcador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoMarcador(HTMLGrammarParser.TipoMarcadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#tabela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabela(HTMLGrammarParser.TabelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#linha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLinha(HTMLGrammarParser.LinhaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#coluna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColuna(HTMLGrammarParser.ColunaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#coluna_cabecalho}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColuna_cabecalho(HTMLGrammarParser.Coluna_cabecalhoContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(HTMLGrammarParser.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem(HTMLGrammarParser.ItemContext ctx);
}