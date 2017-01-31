package t3;

import org.antlr.v4.runtime.Token;

public class GeradorDeCodigo extends HTMLGrammarBaseListener {

    SaidaParser saida;

    public GeradorDeCodigo(SaidaParser saida) {
        this.saida = saida;
    }

  

    @Override
    public void exitColuna(HTMLGrammarParser.ColunaContext ctx) {
        saida.println("</TD>");
    }

    @Override
    public void enterColuna(HTMLGrammarParser.ColunaContext ctx) {
        
        saida.println("<TD>"+ctx.data().CADEIA().getText().replaceAll("\"", ""));
           
    }

    @Override
    public void exitLinha(HTMLGrammarParser.LinhaContext ctx) {
        saida.println("</TR>");
    }

    @Override
    public void enterLinha(HTMLGrammarParser.LinhaContext ctx) {
        saida.println("<TR>");
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
        
        saida.println("<TABLE BORDER=\"1\">");
        
    }   

  

    @Override
    public void exitColuna_cabecalho(HTMLGrammarParser.Coluna_cabecalhoContext ctx) {
        saida.println("</TH>");
    }

    @Override
    public void enterColuna_cabecalho(HTMLGrammarParser.Coluna_cabecalhoContext ctx) {
        
        saida.println("<TH>"+ctx.data().CADEIA().getText().replaceAll("\"", ""));
        
    }

    @Override
    public void exitListaOrdenada(HTMLGrammarParser.ListaOrdenadaContext ctx) {
        saida.println("</ol>");
    }

    @Override
    public void enterListaOrdenada(HTMLGrammarParser.ListaOrdenadaContext ctx) {
        saida.println("<ol type="+ctx.tipoMarcador().CADEIA().getText()+">");
    }

    @Override
    public void exitListaNOrdenada(HTMLGrammarParser.ListaNOrdenadaContext ctx) {
        saida.println("</ul>");
    }

    @Override
    public void enterListaNOrdenada(HTMLGrammarParser.ListaNOrdenadaContext ctx) {
        saida.println("<ul type="+ctx.tipoMarcador().CADEIA().getText()+">");
    }
    
    

    @Override
    public void exitItem(HTMLGrammarParser.ItemContext ctx) {
        saida.println("</li>");
    }

    @Override
    public void enterItem(HTMLGrammarParser.ItemContext ctx) {
        saida.println("<li>"+ctx.CADEIA().getText().replaceAll("\"", ""));
    }
   
    
    

}

