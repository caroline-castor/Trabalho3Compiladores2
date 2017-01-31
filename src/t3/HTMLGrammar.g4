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
   
}

INICIO: 'inicio';
LINHA: 'linha';
COLUNA: 'coluna';
COLUNA_TITULO: 'coluna-titulo';
LISTA:'listaOrdenada';
LISTA2:'listaNaoOrdenada';
DATA: 'data';
DOIS_PONTOS:':';
PONTO_VIRGULA: ';';
ASPAS_DUPLAS: '"';
ABRE_CHAVES: '{';
FECHA_CHAVES: '}';
TABELA: 'tabela';
TIPO:'tipo';
LINK:'link';
URL:'url';
IDENT : ('a'..'z'|'A'..'Z'|'0'..'9');
WS : ( ' ' |'\t' | '\r' | '\n') {skip();}; 
COMENTARIO : '{' ~('\n'|'\r'|'\t')* '\r'? '\n'? '}'('\n'('\n'|'\t'))* {skip();};
CADEIA : '\'' ~('\n' | '\r' | '\'')* '\'' | '"' ~('\n' | '\r' | '"')* '"';
NUMERO : ('0'..'9')+;
ASTERISCO:'*';


programa:INICIO ABRE_CHAVES (tabela|listaOrdenada|listaNOrdenada)*  FECHA_CHAVES;
listaOrdenada: LISTA ABRE_CHAVES tipoMarcador  (item)* FECHA_CHAVES;
listaNOrdenada:LISTA2 ABRE_CHAVES tipoMarcador (item)* FECHA_CHAVES;
tipoMarcador:TIPO DOIS_PONTOS CADEIA PONTO_VIRGULA;
tabela: TABELA ABRE_CHAVES (linha)* FECHA_CHAVES;
linha: LINHA ABRE_CHAVES (coluna | coluna_cabecalho)* FECHA_CHAVES;
coluna: COLUNA ABRE_CHAVES data FECHA_CHAVES;
coluna_cabecalho: COLUNA_TITULO ABRE_CHAVES data FECHA_CHAVES;
link: LINK ABRE_CHAVES url FECHA_CHAVES;
url:URL DOIS_PONTOS CADEIA DOIS_PONTOS;
data: DATA DOIS_PONTOS (CADEIA|listaOrdenada|listaNOrdenada) PONTO_VIRGULA;
item: ASTERISCO CADEIA(listaOrdenada|listaNOrdenada)* PONTO_VIRGULA;



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

