
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
//IDENTIFIER  =   [a-zA-Z_][a-zA-Z0-9_]*



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