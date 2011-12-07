
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
NAME        =   [a-zA-Z_][a-zA-Z0-9]+

%%

{NEWLINE}		{ System.out.println("newline"); return sym(NEWLINE); }
{WHITESPACE}	{ System.out.println("whitespace"); }
{NAME}          { System.out.println("name"); return sym(NAME); }

<<EOF>>			{ System.out.println("end of file"); return sym(EOF); }