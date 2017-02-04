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