
package pyGrammar;

import java_cup.runtime.*;
import java.io.IOException;

import pyGrammar.PythonSym;
import static pyGrammar.PythonSym.*;

%%

%class PythonLex

%unicode
%line
%column

%public
%final

%cupsym pyGrammar.PythonSym
%cup

%eofval{ 
	return sym(EOF); 
%eofval}

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



NEWLINE		=	\r|\n|\r\n
WHITESPACE	=	[ \t]
NAME  		=   [a-zA-Z_][a-zA-Z0-9_]*
COMMENT		= 	#([^\n|\r])*
STRING		= 	{stringliteral}


/* Stringhe */
stringliteral   =  ({stringprefix})?({shortstring} | {longstring})
stringprefix    =  r | u | ur | R | U | UR | Ur | uR
                     | b | B | br | Br | bR | BR
shortstring     =  "'"{shortstringitem}*"'" | \"{shortstringitem}*\"
longstring      =  "'''"{longstringitem}*"'''"
                     | \"\"\"{longstringitem}*\"\"\"
shortstringitem =  {shortstringchar} | {escapeseq}
longstringitem  =  {longstringchar} | {escapeseq}
shortstringchar =  [^\\'\n]* /*any source character except "\" or newline or the quote*/
longstringchar  =  [^\\]* //any source character except "\"
escapeseq       =  \\ [a-zA-Z0-9] /*any ASCII character*/

/* Integer and Long Integer */
LONGINT    	   	=  ({DECIMAL}|{OCT}|{HEX}|{BIN})[lL]
DECIMAL			=  [1-9] [0-9]* | 0
OCT				=  0[oO][0-7]+ | 0[0-7]+
HEX				=  0[xX][0-9a-fA-F]+
BIN				=  0[bB][01]+

%%

{NEWLINE}		{ System.out.println("newline"); return sym(NEWLINE); }
{WHITESPACE}	{ System.out.println("whitespace"); }
//{IDENTIFIER}    { System.out.println("name"); return sym(IDENTIFIER); }

/* Keywords */
"and"       { return sym(AND); }
"as"        { return sym(AS); }
"assert"    { return sym(ASSERT); }
"break"     { return sym(BREAK); }
"class"     { return sym(CLASS); }
"continue"  { return sym(CONTINUE); }
"def"       { return sym(DEF); }
"del"       { return sym(DEL); }
"elif"      { return sym(ELIF); }
"else"      { return sym(ELSE); }
"except"    { return sym(EXCEPT); }
"exec"      { return sym(EXEC); }
"finally"   { return sym(FINALLY); }
"for"       { return sym(FOR); }
"from"      { return sym(FROM); }
"global"    { return sym(GLOBAL); }
"if"        { return sym(IF); }
"import"    { return sym(IMPORT); }
"in"        { return sym(IN); }
"is"        { return sym(IS); }
"lambda"    { return sym(LAMBDA); }
"not"       { return sym(NOT); }
"or"        { return sym(OR); }
"pass"      { return sym(PASS); }
"print"     { return sym(PRINT); }
"raise"     { return sym(RAISE); }
"return"    { return sym(RETURN); }
"try"       { return sym(TRY); }
"while"     { return sym(WHILE); }
"with"      { return sym(WITH); }
"yield"     { return sym(YIELD); }
{STRING}	{ System.out.println("found string"); return sym(STRING);}
{LONGINT}	{ System.out.println("found longinteger"); return sym(LONGINT);}
{DECIMAL}		{ System.out.println("found decimal"); return sym(DECIMAL);}
{OCT}		{ System.out.println("found oct"); return sym(OCT);}
{HEX}		{ System.out.println("found hex"); return sym(HEX);}
{BIN}		{ System.out.println("found bin"); return sym(BIN);}
{NAME}    	{ System.out.println("name"); return sym(NAME); }
{COMMENT}   { System.out.println("found comment");}