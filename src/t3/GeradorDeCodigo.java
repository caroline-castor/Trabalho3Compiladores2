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
        if(ctx.data().expr==1){
        saida.println("<TD>"+ctx.data().CADEIA().getText().replaceAll("\"", ""));
        }else{
            saida.println("<TD>");
        }
           
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
        saida.println("</HTML>");
    }

    @Override
    public void enterPrograma(HTMLGrammarParser.ProgramaContext ctx) {
        saida.println("<HTML>");
        
    }

    @Override
    public void exitBody(HTMLGrammarParser.BodyContext ctx) {
        saida.println("</BODY>");
    }

    @Override
    public void enterBody(HTMLGrammarParser.BodyContext ctx) {
        saida.println("<BODY>");
    }

    @Override
    public void exitHead(HTMLGrammarParser.HeadContext ctx) {
        saida.println("</HEAD>");
    }

    @Override
    public void enterHead(HTMLGrammarParser.HeadContext ctx) {
        saida.println("<HEAD>");
    }

    @Override
    public void exitH3(HTMLGrammarParser.H3Context ctx) {
        saida.println("</H3>");
    }

    @Override
    public void enterH3(HTMLGrammarParser.H3Context ctx) {
        saida.println("<H3>"+ctx.data().CADEIA().getText().replaceAll("\"", ""));
    }

    @Override
    public void exitH2(HTMLGrammarParser.H2Context ctx) {
        saida.println("</H2>");
    }

    @Override
    public void enterH2(HTMLGrammarParser.H2Context ctx) {
        saida.println("<H2>"+ctx.data().CADEIA().getText().replaceAll("\"", ""));
    }

    @Override
    public void exitH1(HTMLGrammarParser.H1Context ctx) {
        saida.println("</H1>");
    }

    @Override
    public void enterH1(HTMLGrammarParser.H1Context ctx) {
        saida.println("<H1>"+ctx.data().CADEIA().getText().replaceAll("\"", ""));
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
    public void enterElementos(HTMLGrammarParser.ElementosContext ctx) {
       if(ctx.expr==1){
           saida.println(ctx.CADEIA().getText().replace("\"", ""));
       }
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
        if(ctx.expr==1){
        for(int i =0; i<ctx.CADEIA().size();i++){
        saida.println("<li>"+ctx.CADEIA(0).getText().replaceAll("\"", ""));
        }
        
        }
    }

    @Override
    public void exitLink(HTMLGrammarParser.LinkContext ctx) {
        saida.println("</a>");
    }

    @Override
    public void enterLink(HTMLGrammarParser.LinkContext ctx) {
        saida.println("<a href=http://"+ctx.url().CADEIA().getText().replace("\"", "")+">"+ctx.data().CADEIA().getText().replaceAll("\"", ""));
    }

    @Override
    public void enterImg(HTMLGrammarParser.ImgContext ctx) {
        
             saida.println("<img src="+ctx.img_src().CADEIA().getText()+" width="+ctx.largura().CADEIA().getText() +" heigth="+ctx.altura().CADEIA().getText()+"/>");
       
        
    }
   
    
    

}

