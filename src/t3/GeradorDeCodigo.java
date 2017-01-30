package t3;

public class GeradorDeCodigo extends HTMLGrammarBaseListener {

    SaidaParser saida;

    public GeradorDeCodigo(SaidaParser saida) {
        this.saida = saida;
    }

  

    @Override
    public void exitColuna(HTMLGrammarParser.ColunaContext ctx) {
        saida.println("</TR>");
    }

    @Override
    public void enterColuna(HTMLGrammarParser.ColunaContext ctx) {
        saida.println("<TR>");
    }

    @Override
    public void exitLinha(HTMLGrammarParser.LinhaContext ctx) {
        saida.println("</TD>");
    }

    @Override
    public void enterLinha(HTMLGrammarParser.LinhaContext ctx) {
        saida.println("<TD>");
    }

    @Override
    public void exitPrograma(HTMLGrammarParser.ProgramaContext ctx) {
        saida.println("</BODY>");
        saida.println("</HTML>");
    }

    @Override
    public void enterPrograma(HTMLGrammarParser.ProgramaContext ctx) {
        saida.println("<HTML>");
        saida.println("<BODY>");
    }

    @Override
    public void exitTabela(HTMLGrammarParser.TabelaContext ctx) {
        saida.println("</TABLE>");
    }

    @Override
    public void enterTabela(HTMLGrammarParser.TabelaContext ctx) {
        saida.println("<TABLE>");
    }

    

    
    
    

    
    
    
    
    
    
    

}

