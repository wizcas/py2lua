
package luaGrammar;

import java_cup.runtime.*;
import java.io.IOException;

import luaGrammar.LuaGrammarSym;
import static luaGrammar.LuaGrammarSym.*;

%%

%class LuaGrammarLex

%unicode
%line
%column

%public
%final
// %abstract

%cupsym luaGrammar.LuaGrammarSym
%cup
// %cupdebug

%init{
	// TODO: code that goes to constructor
%init}

%{
	private Symbol sym(int type)
	{
		return sym(type, yytext());
	}

	private Symbol sym(int type, Object value)
	{
		return new Symbol(type, yyline, yycolumn, value);
	}

	private void error()
	throws IOException
	{
		throw new IOException("illegal text at line = "+yyline+", column = "+yycolumn+", text = '"+yytext()+"'");
	}
%}

VAR_NAME 	= [a-z|A-Z|_] [a-z|A-Z|_|0-9]*
ASSIGN		= =
INT			= [0-9]+
FLOAT 		= INT ("." INT)?
EXP			= [INT| FLOAT] [E|e] ["-"]? INT
HEX			= 0[xX][0-9A-Fa-f]+
LINE_COMMENT = "--" (![\n | \r])* {NEWLINE}
COMMENT		= "--[[" (![])* "]]" {NEWLINE}/*da rivedere!*/
NEWLINE		= \r | \n |\r\n
WS  		=  [\ |\t|\u000C]
SEMI		= ;

/*
Stringhe accettate da LUA:
"hello"
'hello'
[[hello]]  che permettono di scrivere su più linee

> = 'hello "Lua user"'
hello "Lua user"
> = "Its [[content]] hasn't got a substring."
Its [[content]] hasn't got a substring.
> = [[Let's have more "strings" please.]]
Let's have more "strings" please.

Gli escape non funzionano con le doppie parentesi ]]
> = [[hello\nNew line\tTab]]
hello\nNew line\tTab

Doppie parentesi innestate
> = [[one [[two]] one]]        -- bad
stdin:1: nesting of [[...]] is deprecated near '['
> = [=[one [[two]] one]=]      -- ok
one [[two]] one
*/

//Nella normalstring posso usare tutti i caratteri tranne " e l'escpae singolo \
NORMALSTRING 		= \" ({EscapeSequence} | [^\\|\"|\n])* \"
//Nella charstring non posso usare l'apice ' e l'escape singolo \
CHARSTRING			= \' ({EscapeSequence} | [^\'|\\|\n])* \'
//Nella longstring non si possono inserire parentesi chiuse da sole ] se si inizia per [[,
//se invece si usa [=[ con un numero qualsiasi di = allora si può mettere tutto ciò che si vuole
LONGSTRING			= \[ (\=)+ \[ (.|{NEWLINE})* \] (\=)+ \]
					| \[\[ ({EscapeSequence} | [^\]])* \]\] 

/* la regola sotto fa il match con i seguenti escape:
\b, \t, \n, \f, \r, \", \', \\ che si possono inserire nelle stringhe LUA senza dare errori: "ciao\\pippo\n\tpluto"
poi con gli escpae unicode scritti come esadecimali, cioè a dire: \u9098
*/
EscapeSequence 		= \\ [b|t|n|f|r|\"|'|\\]
    				|   \\u {HexDigit} {HexDigit} {HexDigit} {HexDigit} /*unicode escape*/
    				|   {OctalEscape}
OctalEscape			= \\ [0-3] [0-7] [0-7]
    				|   \\ [0-7] [0-7]
    				|   \\ [0-7]
HexDigit 			= [0-9|a-f|A-F]

/************************** CODICE ANTLR **********************
NORMALSTRING
    :  '"' ( EscapeSequence | ~('\\'|'"') )* '"' 
    ;

CHARSTRING
   :	'\'' ( EscapeSequence | ~('\''|'\\') )* '\''
   ;

LONGSTRING
	:	'['('=')*'[' ( EscapeSequence | ~('\\'|']') )* ']'('=')*']'
	;
**********************************/

%%

{VAR_NAME}		{	return sym(VAR_NAME); }
{ASSIGN}		{	return sym(ASSIGN); }
{SEMI}			{	return sym(SEMI); }
{INT}			{	return sym(INT); }
{FLOAT}			{	return sym(FLOAT); }
{EXP}			{	return sym(EXP); }
{HEX}			{	return sym(HEX); }
{COMMENT}		{ System.out.println("Comment");}
{LINE_COMMENT}	{ System.out.println("Line comment");}
{WS}			{}
{NEWLINE}		{}
{NORMALSTRING}	{ System.out.println("Found String");	
				return sym(NORMALSTRING); }
{CHARSTRING}	{ System.out.println("Found Char String");	
				return sym(CHARSTRING); }
{LONGSTRING}	{ System.out.println("Found Long String");	
				return sym(LONGSTRING); }