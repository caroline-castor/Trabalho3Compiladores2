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
WIDTH: 'widht';
HEIGHT: 'height';
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
CADEIA : '\'' ~('\n' | '\r' | '\'')* '\'' | '"' ~('\n' | '\r' | '"')* '"';
NUMERO : ('0'..'9')+;
ASTERISCO:'*';
ABRE_PARENTESIS:'(';
FECHA_PARENTESIS:')';
ALTURA:'altura';
LARGURA:'largura';
H1: 'h1';
H2: 'h2';
H3: 'h3';
HEAD:'head';
IMG: 'img';
SRC: 'src';




programa: INICIO ABRE_CHAVES head? body FECHA_CHAVES;
head: HEAD ABRE_CHAVES (h1| h2| h3)* FECHA_CHAVES;
h1: H1 ABRE_CHAVES data FECHA_CHAVES;
h2: H2 ABRE_CHAVES data FECHA_CHAVES;
h3: H3 ABRE_CHAVES data FECHA_CHAVES;
body: elementos*;
elementos returns[int expr=0]:(tabela|listaOrdenada|listaNOrdenada|link|img|CADEIA{$expr=1;});
img:IMG ABRE_CHAVES img_src altura largura  FECHA_CHAVES;
altura:ALTURA DOIS_PONTOS CADEIA PONTO_VIRGULA;
largura:LARGURA DOIS_PONTOS CADEIA PONTO_VIRGULA;
img_src:SRC DOIS_PONTOS CADEIA PONTO_VIRGULA;
listaOrdenada: LISTA ABRE_CHAVES tipoMarcador  (item)* FECHA_CHAVES;
listaNOrdenada:LISTA2 ABRE_CHAVES tipoMarcador (item)* FECHA_CHAVES;
link: LINK ABRE_CHAVES data url FECHA_CHAVES;
url:URL DOIS_PONTOS CADEIA PONTO_VIRGULA;
tipoMarcador:TIPO DOIS_PONTOS CADEIA PONTO_VIRGULA;
tabela: TABELA ABRE_CHAVES (linha)* FECHA_CHAVES;
linha: LINHA ABRE_CHAVES (coluna | coluna_cabecalho)* FECHA_CHAVES;
coluna: COLUNA ABRE_CHAVES data FECHA_CHAVES;
coluna_cabecalho: COLUNA_TITULO ABRE_CHAVES data FECHA_CHAVES;
data returns[int expr=0]: DATA DOIS_PONTOS CADEIA{$expr = 1;} PONTO_VIRGULA|
                                            listaOrdenada|
                                            listaNOrdenada |
                                            link|img;
item returns[int expr=0]: (ASTERISCO CADEIA{$expr=1;}|
                        listaOrdenada|
                        listaNOrdenada|
                        link)* PONTO_VIRGULA;



