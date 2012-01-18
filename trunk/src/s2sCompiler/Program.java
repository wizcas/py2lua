package s2sCompiler;

import java.io.FileNotFoundException;
import java.io.FileReader;

import java_cup.runtime.Symbol;

import pyGrammar.PythonCup;
import pyGrammar.PythonLex;

import luaGrammar.*;
import pyGrammar.*;
public class Program
{
	public static void main(String args[])
	{
		System.out.println("source-to-source compiler.");
		PythonCup.dumpOutput = "Traduzione.txt";
		PythonLex lexer;
		try {
			lexer = new PythonLex(new FileReader("python.py"));
			PythonCup parser = new PythonCup(lexer);
			parser.debug_parse();
			//Object result = parser.parse();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Eccezione");
			e.printStackTrace();
		}
		
		
		
//		System.out.println("-----------------------------------\n");
//		System.out.println("Starting verify translation");
//		System.out.println("\n-----------------------------------");
//		System.out.println("-----------------------------------");
//		
//		LuaGrammarLex luaLexer;
//		try {
//			luaLexer = new LuaGrammarLex(new FileReader("Prova.lua"));
//			LuaGrammarCup luaParser = new LuaGrammarCup(luaLexer);
//			luaParser.parse();
//			System.out.println("All rigth: translated successfully");
//		} catch (FileNotFoundException e1) {
//			System.out.println("File not found");
//			e1.printStackTrace();
//		}
//		catch(Exception e)
//		{
//			System.out.println("Eccezione");
//			e.printStackTrace();
//		}
	}
}
