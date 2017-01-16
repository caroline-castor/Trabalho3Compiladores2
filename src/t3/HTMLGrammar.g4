/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

grammar HTMLGrammar;

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
BORDER: 'border';

inicio: INICIO ABRE_CHAVES programa FECHA_CHAVES;
programa: TABELA ABRE_CHAVES tabela FECHA_CHAVES;
tabela:  border LINHA ABRE_CHAVES linha FECHA_CHAVES| //vai ignorar o enter?
         border COLUNA ABRE_CHAVES coluna FECHA_CHAVES;
linha: DATA DOIS_PONTOS ASPAS_DUPLAS CADEIA ASPAS_DUPLAS PONTO_VIRGULA (tabela)*;  //PERGUNTA como incluir espaços nas cadeias
coluna: DATA DOIS_PONTOS ASPAS_DUPLAS CADEIA ASPAS_DUPLAS PONTO_VIRGULA (tabela)*;  //ESTÁ CERTO O JEITO DE DEFINIR QUE DENTRO DE UMA LINHA PODE TER COLUNA E DENTRO DE COLUNA PODE TER LINHA?
border: BORDER DOIS_PONTOS ASPAS_DUPLAS NUMERO ASPAS_DUPLAS PONTO_VIRGULA;

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

