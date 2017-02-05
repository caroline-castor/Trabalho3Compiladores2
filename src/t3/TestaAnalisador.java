package t3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class TestaAnalisador {

    public static void main(String args[]) throws IOException, RecognitionException {
        for(int i=1; i<=6; i++){
        SaidaParser out = new SaidaParser();
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream("C:\\Users\\Carol\\Desktop\\T3\\Teste"+i+".txt"));
        HTMLGrammarLexer lexer = new HTMLGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HTMLGrammarParser parser = new HTMLGrammarParser(tokens);
        try {
            //inicialização do Gerador de Código
            T1ErrorListener error = new T1ErrorListener(out);
            GeradorDeCodigo ger = new GeradorDeCodigo(out);
            // Adição dos listeners no LEXER e no PARSER
            lexer.addErrorListener(new T1ErrorListenerLexer(out));
            parser.addErrorListener(new T1ErrorListener(out));

            // Inicio 
            HTMLGrammarParser.ProgramaContext raiz = parser.programa();
            ParseTreeWalker ptw = new ParseTreeWalker();
            ptw.walk(ger,raiz);
        } catch (RuntimeException e) {
            // Pega as mensagens de erro semanticas
            if (e.getMessage() != null) {
                out.println(e.getMessage() + "Fim da compilacao");
            }
        }

        PrintWriter pw = new PrintWriter(new File("C:\\Users\\Carol\\Desktop\\T3\\Saida"+i+".html"));
        pw.print(out.toString());
        pw.flush();
        pw.close();
    }
        
    }
}
