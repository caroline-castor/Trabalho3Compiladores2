/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar HTMLGrammar;

@members
{
   public static String grupo="551503, 586773";
   String msg_error="";
   PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();  
}

INICIO: 'inicio';
LINHA: 'linha';
COLUNA: 'coluna';
DATA: 'data';
DOIS_PONTOS:':';
PONTO_VIRGULA: ';';
ASPAS_DUPLAS: '"';
ABRE_CHAVES: '{';
FECHA_CHAVES: '}';
TABELA: 'tabela';
WS : ( ' ' |'\t' | '\r' | '\n') {skip();}; 
COMENTARIO : '{' ~('\n'|'\r'|'\t')* '\r'? '\n'? '}'('\n'('\n'|'\t'))* {skip();};
CADEIA : '\'' ~('\n' | '\r' | '\'')* '\'' | '"' ~('\n' | '\r' | '"')* '"';
IDENT : ('_'|'a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
BORDER: 'border';
NUMERO : ('0'..'9')+;


programa:INICIO{
          pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global")); 
        } ABRE_CHAVES (TABELA identificador_tabela ABRE_CHAVES (tabela)* FECHA_CHAVES)*  FECHA_CHAVES{
          pilhaDeTabelas.desempilhar();
          if(msg_error!=""){
                  throw new RuntimeException(msg_error);
          } 
        };
tabela:  (border LINHA ABRE_CHAVES linha FECHA_CHAVES)| 
         (border COLUNA ABRE_CHAVES coluna FECHA_CHAVES) 
         ;
linha: (data (tabela)) |;  
coluna: (data (tabela)) | ; 
data: DATA DOIS_PONTOS CADEIA PONTO_VIRGULA |;
border: (BORDER DOIS_PONTOS ASPAS_DUPLAS NUMERO ASPAS_DUPLAS PONTO_VIRGULA) |;
identificador_tabela: id= IDENT{
       //verificação se já existe uma tabela com o mesmo nome
       if(pilhaDeTabelas.topo().existeSimbolo($id.getText())){
            msg_error += "Linha " + $id.getLine() + ": identificador "+$id.getText()+" ja declarado anteriormente\n" ;
       }else{
             // se não existir então adiciona-se o identificador escopo atual
            pilhaDeTabelas.topo().adicionarSimbolo($id.getText());
            
        }
       };

/*

EXEMPLO

inicio {
  
   tabela{
        border:"1";
        coluna{
            data: "coluna 1";
            linha{  
                data: "linha 1, coluna 1";
            }
            linha{  
                data: "linha 2, coluna 1";
            }
            
        }

        coluna{
            data: "coluna 2";
            
            linha{  
                data: "linha 1, coluna 2";

                coluna{
                    data: "coluna 1 da linha 1 coluna 2";
            }
    }

}

*/

