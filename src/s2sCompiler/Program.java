package s2sCompiler;

import java.io.FileNotFoundException;
import java.io.FileReader;

import luaGrammar.*;
public class Program
{
	public static void main(String args[])
	{
		System.out.println("source-to-source compiler.");
		LuaGrammarLex lexer;
		try {
			lexer = new LuaGrammarLex(new FileReader("Prova.txt"));
			LuaGrammarCup parser = new LuaGrammarCup(lexer);
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
