// Generated from C:\Users\Carol\Desktop\T3\src\t3\HTMLGrammar.g4 by ANTLR 4.5.3
package t3;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HTMLGrammarParser}.
 */
public interface HTMLGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(HTMLGrammarParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(HTMLGrammarParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(HTMLGrammarParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(HTMLGrammarParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#tabela}.
	 * @param ctx the parse tree
	 */
	void enterTabela(HTMLGrammarParser.TabelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#tabela}.
	 * @param ctx the parse tree
	 */
	void exitTabela(HTMLGrammarParser.TabelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#linha}.
	 * @param ctx the parse tree
	 */
	void enterLinha(HTMLGrammarParser.LinhaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#linha}.
	 * @param ctx the parse tree
	 */
	void exitLinha(HTMLGrammarParser.LinhaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HTMLGrammarParser#coluna}.
	 * @param ctx the parse tree
	 */
	void enterColuna(HTMLGrammarParser.ColunaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HTMLGrammarParser#coluna}.
	 * @param ctx the parse tree
	 */
	void exitColuna(HTMLGrammarParser.ColunaContext ctx);
}