
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

%eofval{ 
	return sym(EOF); 
%eofval}1

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

/*VAR_NAME 	= [a-z|A-Z|_] [a-z|A-Z|_|0-9]**/
VAR_NAME	= [a-zA-Z_][a-zA-Z0-9_]*
ASSIGN		= =
PLUS		= "+"
MINUS		= "-"
MULT		= "*"
DIVIDE		= "/"
MOD			= %
EXPON		= \^
DOTDOT		= ".."
MINOR		= <
MINEQ		= "<="
MAIOR		= >
MAIEQ		= ">="
EQ			= "=="
NEQ			= "~="
AND			= "and"
OR			= "or"
NIL			= "nil"
INT			= [0-9]+
FLOAT		= ({INT}({DOT}{INT})?)
EXP			= ({INT}| {FLOAT})[E|e]["-"]?{INT}
HEX			= 0[xX][0-9A-Fa-f]+
LINE_COMMENT = \-\-([^\n|\r])*
COMMENT		= \-\-\[\[(.|\n)*\]\]
NEWLINE		= \r|\n|\r\n
WS  		= \ |\t|\u000C
SEMI		= ;
DOT			= \.

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
%%

{PLUS}			{return sym(PLUS);}
{MINUS}			{return sym(MINUS);}
{MULT}			{return sym(MULT);}
{DIVIDE}		{return sym(DIVIDE);}
{MOD}			{return sym(MOD);}
{EXPON}			{return sym(EXPON);}
{DOTDOT}		{return sym(DOTDOT);}
{MINOR}			{return sym(MINOR);}
{MINEQ}			{return sym(MINEQ);}
{MAIOR}			{return sym(MAIOR);}
{MAIEQ}			{return sym(MAIEQ);}
{EQ}			{return sym(EQ);}
{NEQ}			{return sym(NEQ);}
{AND}			{return sym(AND);}
{OR}			{return sym(OR);}
{NIL}			{return sym(NIL);}
{INT}			{return sym(INT); }
{FLOAT}			{return sym(FLOAT); }
{EXP}			{return sym(EXP); }
"not"			{return sym(NOT);}
"false"			{return sym(FALSE);}
"true"			{return sym(TRUE);}
"function"		{return sym(FUNCTION);}
{DOT}				{return sym(DOT);}
","				{return sym(COMMA);}
"while"			{return sym(WHILE);}
"for"			{return sym(FOR);}
"do"			{return sym(DO);}
"end"			{return sym(END);}
"repeat"		{return sym(REPEAT);}
"until"			{return sym(UNTIL);}
"then"			{return sym(THEN);}
"if"			{return sym(IF);}
"elseif"		{return sym(ELSEIF);}
"else"			{return sym(ELSE);}
"local"			{return sym(LOCAL);}
"return"		{return sym(RETURN);}
"break"			{return sym(BREAK);}
"in"			{return sym(IN);}
"..."			{return sym(TRIDOT);}
"#"				{return sym(SHARP);}
"("				{return sym(LPAREN);}
")"				{return sym(RPAREN);}
"["				{return sym(LBRACK);}
"]"				{return sym(RBRACK);}
"{"				{return sym(LCURLY);}
"}"				{return sym(RCURLY);}
":"				{return sym(COLON);}
{VAR_NAME}		{return sym(VAR_NAME); }
{ASSIGN}		{return sym(ASSIGN); }
{SEMI}			{	return sym(SEMI); }
{HEX}			{	return sym(HEX); }
{COMMENT}		{}
{LINE_COMMENT}	{ }
{WS}			{}
{NEWLINE}		{}
{NORMALSTRING}	{return sym(NORMALSTRING); }
{CHARSTRING}	{return sym(CHARSTRING); }
{LONGSTRING}	{return sym(LONGSTRING); }