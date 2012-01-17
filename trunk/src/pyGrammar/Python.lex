
package pyGrammar;

import java_cup.runtime.*;
import java.io.IOException;
import java.util.Stack;

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
       	int level  = indentStack.peek();
		int indent = yytext().replace("\t", "        ").length();
   
		System.out.println("Checking indentation... Level: " + level + " Indent: " + indent );
   
		if (indent > level)
		{               			
			indentStack.push(indent);
			System.err.println("INDENT");
			return sym(INDENT);
   		}
   		else if (indent < level)
   		{
           	indentStack.pop();
           	System.err.println("DEDENT");
           	return sym(DEDENT);
   		}
   		return sym(EOF);
%eofval}

%init{
	indentStack = new Stack<Integer>();
	indentStack.push(0);
%init}

%{

	private Stack<Integer> indentStack;
	
	private Symbol checkIndent()
	{
		int level  = indentStack.peek();
		int indent = yytext().replace("\t", "        ").length();
   
		System.out.println("Checking indentation... Level: " + level + " Indent: " + indent );
   
		if (indent > level)
		{               			
			indentStack.push(indent);
			System.err.println("INDENT");
			return sym(INDENT);
   		}
   		else if (indent < level)
   		{
           	indentStack.pop();
           	System.err.println("DEDENT");
           	return sym(DEDENT);
   		}
   		System.err.println("...");
   		return null;
	}
       
	public int stackLength()
	{
		return indentStack.size();
	}
	
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
WHITESPACE	=	\ 
TAB			= 	\t
WS			=	( {WHITESPACE} | {TAB} )+
NAME  		=   [a-zA-Z_][a-zA-Z0-9_]*
COMMENT		= 	#([^\n|\r])*


/* Stringhe */
STRING  		=  ({stringprefix})?({shortstring} | {longstring})
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
DECIMAL			=  [1-9] {digit}* | 0
OCT				=  0[oO][0-7]+ | 0[0-7]+
HEX				=  0[xX][0-9a-fA-F]+
BIN				=  0[bB][01]+

/*Floating point*/
FLOAT			=  {pointfloat} | {exponentfloat}
pointfloat    	=  {intpart}? {fraction} | {intpart} \.
exponentfloat 	=  ({intpart} | {pointfloat}) {exponent}
intpart       	=  {digit}+
fraction      	=  \.{digit}+
exponent      	=  [eE]([\+\-])? {digit}+

/*Imaginary number*/
IMAGNUM 		=  ({FLOAT}|{intpart})[jJ]

digit			= [0-9]

/*Simbols*/
ASSIGN		= =
PLUS		= "+"
MINUS		= "-"
MULT		= "*"
DIVIDE		= "/"
DIVDIV		= "//"
MOD			= %
EXPON			= \^
MINOR		= <
MINEQ		= "<="
MAIOR		= >
MAIEQ		= ">="
EQ			= "=="
NEQ			= "!="
SEMI		= ";"


%%

{NEWLINE}+		{ System.err.println("NEWLINE");return sym(NEWLINE); }
^{TAB}*			{ 
					System.err.println("TAB");
					int level  = indentStack.peek();
					int indent = yytext().replace("\t", "        ").length();
					System.out.println("Checking indentation... Level: " + level + " Indent: " + indent );
			   
					if (indent > level)
					{               			
						indentStack.push(indent);
						System.err.println("INDENT");
						return sym(INDENT);
			   		}
			   		else if (indent < level)
			   		{
			           	indentStack.pop();
			           	System.err.println("DEDENT");
			           	return sym(DEDENT);
			   		}
				}        
^{WHITESPACE}	{}
{WS}			{}

/* Keywords */
"and"       	{ return sym(AND); }
"as"        	{ return sym(AS); }
"assert"    	{ return sym(ASSERT); }
"break"     	{ return sym(BREAK); }
"class"     	{ return sym(CLASS); }
"continue"  	{ return sym(CONTINUE); }
"def"       	{ return sym(DEF); }
"del"       	{ return sym(DEL); }
"elif"      	{ return sym(ELIF); }
"else"      	{ return sym(ELSE); }
"except"    	{ return sym(EXCEPT); }
"exec"      	{ return sym(EXEC); }
"finally"   	{ return sym(FINALLY); }
"for"       	{ return sym(FOR); }
"from"      	{ return sym(FROM); }
"global"    	{ return sym(GLOBAL); }
"if"        	{ return sym(IF); }
"import"    	{ return sym(IMPORT); }
"in"        	{ return sym(IN); }
"is"        	{ return sym(IS); }
"lambda"    	{ return sym(LAMBDA); }
"not"       	{ return sym(NOT); }
"or"        	{ return sym(OR); }
"pass"      	{ return sym(PASS); }
"print"     	{ System.err.println("PRINT");return sym(PRINT); }
"raise"     	{ return sym(RAISE); }
"return"    	{ return sym(RETURN); }
"try"       	{ return sym(TRY); }
"while"     	{ System.err.println("WHILE");return sym(WHILE); }
"with"      	{ return sym(WITH); }
"yield"     	{ return sym(YIELD); }
/*Operators*/
{PLUS}			{return sym(PLUS);}
{MINUS}			{return sym(MINUS);}
{MULT}			{return sym(MULT);}
"**"			{return sym(MULTMULT);}
{DIVIDE}		{return sym(DIVIDE);}
{DIVDIV}		{return sym(DIVDIV);}
{MOD}			{return sym(MOD);}
{EXPON}			{return sym(EXPON);}
{MINOR}			{System.err.println("MINOR");return sym(MINOR);}
{MINEQ}			{return sym(MINEQ);}
{MAIOR}			{return sym(MAIOR);}
{MAIEQ}			{return sym(MAIEQ);}
{EQ}			{return sym(EQ);}
{NEQ}			{return sym(NEQ);}
"~"				{return sym(TILDE);}
"&"				{return sym(ECOM);}
"|"				{return sym(PIPE);}
"<<"			{return sym(LSHIFT);}
">>"			{return sym(RSHIFT);}
/*Delimiters*/
"."				{return sym(DOT);}
","				{return sym(COMMA);}
"("				{return sym(LPAREN);}
")"				{return sym(RPAREN);}
"["				{return sym(LBRACK);}
"]"				{return sym(RBRACK);}
"{"				{return sym(LCURLY);}
"}"				{return sym(RCURLY);}
":"				{System.err.println("COLON");return sym(COLON);}
{ASSIGN}		{return sym(ASSIGN); }
{SEMI}			{return sym(SEMI);}
"@"				{return sym(AT);}
"+="			{return sym(PLUSEQ);}
"-="			{return sym(MINUSEQ);}
"*="			{return sym(MULTEQ);}
"/="			{return sym(DIVEQ);}
"%="			{return sym(MODEQ);}
"&="			{return sym(ANDEQ);}
"|="			{return sym(OREQ);}
"^="			{return sym(EXPEQ);}
">>="			{return sym(RSEQ);}
"<<="			{return sym(LSEQ);}
"**="			{return sym(EXPEQ);}
"..."			{return sym(TRIDOT);}
{STRING}		{System.err.println("STRING"); return sym(STRING);}
{FLOAT}			{return sym(FLOAT);}
{IMAGNUM}		{ return sym(IMAGNUM);}
{LONGINT}		{ return sym(LONGINT);}
{DECIMAL}		{ return sym(DECIMAL);}
{OCT}			{ return sym(OCT);}
{HEX}			{ return sym(HEX);}
{BIN}			{ return sym(BIN);}
{NAME}    		{ System.err.println("NAME");return sym(NAME); }
{COMMENT}   	{ return null;}

.				{System.out.println("SCANNER ERROR: "+yytext());}