package s2sCompiler;

import java.io.FileNotFoundException;
import java.io.FileReader;

import luaGrammar.*;
import pyGrammar.*;
public class Program
{
	public static void main(String args[])
	{
		System.out.println("source-to-source compiler.");
		/*LuaGrammarLex luaLexer;
		try {
			luaLexer = new LuaGrammarLex(new FileReader("Prova.txt"));
			LuaGrammarCup parser = new LuaGrammarCup(luaLexer);
			parser.parse();
		} catch (FileNotFoundException e1) {
			System.out.println("File not found");
			e1.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Eccezione");
			e.printStackTrace();
		}*/
		
		PythonLex lexer;
		try {
			lexer = new PythonLex(new FileReader("python.py"));
			PythonCup parser = new PythonCup(lexer);
			parser.parse();
		} catch (FileNotFoundException e1) {
			System.out.println("File not found");
			e1.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Eccezione");
			e.printStackTrace();
		}
	}
}
