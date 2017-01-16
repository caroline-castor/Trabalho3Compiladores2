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
	 * Visit a parse tree produced by {@link HTMLGrammarParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(HTMLGrammarParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link HTMLGrammarParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(HTMLGrammarParser.ProgramaContext ctx);
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
}