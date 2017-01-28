package t3;

public class GeradorDeCodigo extends HTMLGrammarBaseListener {

    SaidaParser saida;

    public GeradorDeCodigo(SaidaParser saida) {
        this.saida = saida;
    }

   /* @Override
    public void enterInicio(HTMLGrammarParser.InicioContext ctx) {
        saida.println("<HTML>");
        
    }*/

    @Override
    public void enterPrograma(HTMLGrammarParser.ProgramaContext ctx) {
        saida.println("<BODY>");
    }
    
    @Override
    public void exitPrograma(HTMLGrammarParser.ProgramaContext ctx) {
        saida.println("</BODY>");
    }
    
    
    /*@Override
    public void exitInicio(HTMLGrammarParser.InicioContext ctx) {
        saida.println("</HTML>");
    }*/

    
    
    

}

