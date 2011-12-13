/* The following code was generated by JFlex 1.4.3 on 13/12/11 9.25 */


package luaGrammar;

import java_cup.runtime.*;
import java.io.IOException;

import luaGrammar.LuaGrammarSym;
import static luaGrammar.LuaGrammarSym.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 13/12/11 9.25 from the specification file
 * <tt>F:/Documenti/workspaceANTLR/py2lua/src/luaGrammar/LuaGrammar.lex</tt>
 */
public final class LuaGrammarLex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\36\1\34\1\0\1\36\1\32\22\0\1\36\1\0\1\40"+
    "\1\60\1\0\1\10\1\0\1\42\1\61\1\62\1\6\1\4\1\53"+
    "\1\5\1\12\1\7\1\26\3\46\4\46\2\2\1\65\1\37\1\13"+
    "\1\3\1\14\2\0\4\30\1\31\1\30\21\1\1\27\2\1\1\33"+
    "\1\41\1\35\1\11\1\1\1\0\1\16\1\44\1\52\1\20\1\51"+
    "\1\47\1\1\1\55\1\23\1\1\1\57\1\24\1\1\1\17\1\21"+
    "\1\56\1\1\1\22\1\50\1\43\1\45\1\1\1\54\1\27\2\1"+
    "\1\63\1\25\1\64\1\15\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\0\7\1\1\2"+
    "\1\15\1\16\1\15\1\17\1\20\2\0\5\1\1\21"+
    "\1\1\1\22\1\23\1\24\1\25\1\26\1\27\2\0"+
    "\1\30\1\31\1\32\1\33\1\34\1\35\3\1\1\36"+
    "\1\37\1\1\1\40\1\41\1\1\3\0\1\42\2\0"+
    "\1\43\12\1\1\44\1\45\1\0\2\31\1\46\1\47"+
    "\1\50\1\51\3\1\1\52\4\0\5\1\1\53\1\1"+
    "\1\54\2\1\1\31\3\1\1\0\1\55\2\0\1\56"+
    "\1\57\4\1\1\60\1\1\1\0\1\31\2\1\1\61"+
    "\3\0\1\62\1\63\1\64\2\1\1\65\1\0\1\66"+
    "\1\67\1\70\1\55\2\0\1\1\1\71\1\66\1\1"+
    "\1\72";

  private static int [] zzUnpackAction() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\66\0\154\0\242\0\330\0\u010e\0\330\0\330"+
    "\0\330\0\330\0\u0144\0\u017a\0\u01b0\0\u01e6\0\u021c\0\u0252"+
    "\0\u0288\0\u02be\0\u02f4\0\u032a\0\u0360\0\u0396\0\u03cc\0\u0402"+
    "\0\330\0\330\0\330\0\u0438\0\u046e\0\u04a4\0\u04da\0\u0510"+
    "\0\u0546\0\u057c\0\330\0\u05b2\0\330\0\330\0\330\0\330"+
    "\0\330\0\330\0\u05e8\0\u061e\0\330\0\u0654\0\u068a\0\330"+
    "\0\330\0\330\0\u06c0\0\u06f6\0\u072c\0\66\0\66\0\u0762"+
    "\0\66\0\66\0\u0798\0\u07ce\0\u0804\0\u083a\0\330\0\u0870"+
    "\0\u08a6\0\330\0\u08dc\0\u0912\0\u0948\0\u097e\0\u09b4\0\u09ea"+
    "\0\u0a20\0\u0a56\0\u0a8c\0\u0ac2\0\u0af8\0\u0b2e\0\u0b2e\0\u0b64"+
    "\0\u0b9a\0\330\0\66\0\66\0\66\0\u0bd0\0\u0c06\0\u0c3c"+
    "\0\u07ce\0\u0c72\0\u0ca8\0\u0cde\0\u0d14\0\u0d4a\0\u0d80\0\u0db6"+
    "\0\u0dec\0\u0e22\0\66\0\u0e58\0\66\0\u0e8e\0\u0ec4\0\u0efa"+
    "\0\u0f30\0\u0f66\0\u0f9c\0\u0fd2\0\330\0\u1008\0\u103e\0\66"+
    "\0\66\0\u1074\0\u10aa\0\u10e0\0\u1116\0\u114c\0\u1182\0\u11b8"+
    "\0\u11ee\0\u1224\0\u125a\0\66\0\u1290\0\u12c6\0\u12fc\0\66"+
    "\0\66\0\66\0\u1332\0\u1368\0\66\0\u139e\0\u11ee\0\66"+
    "\0\66\0\u0fd2\0\u13d4\0\u140a\0\u1440\0\66\0\u139e\0\u1476"+
    "\0\66";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\2\1\26\3\2"+
    "\1\27\1\30\1\31\1\32\1\31\1\33\1\34\1\0"+
    "\1\35\1\36\1\37\1\40\1\3\1\41\1\2\1\42"+
    "\1\2\1\43\1\44\3\2\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\0\2\2\13\0\14\2\11\0\10\2"+
    "\1\0\4\2\10\0\1\3\7\0\1\53\12\0\1\54"+
    "\1\3\2\0\1\54\14\0\1\3\2\0\1\54\17\0"+
    "\1\55\155\0\1\56\72\0\1\57\56\0\1\60\65\0"+
    "\1\61\65\0\1\62\63\0\2\2\13\0\1\2\1\63"+
    "\12\2\11\0\10\2\1\0\4\2\7\0\2\2\13\0"+
    "\3\2\1\64\1\2\1\65\6\2\11\0\10\2\1\0"+
    "\4\2\7\0\2\2\13\0\3\2\1\66\10\2\11\0"+
    "\10\2\1\0\4\2\7\0\2\2\13\0\4\2\1\67"+
    "\7\2\11\0\10\2\1\0\4\2\7\0\2\2\13\0"+
    "\14\2\11\0\6\2\1\70\1\2\1\0\4\2\7\0"+
    "\2\2\13\0\1\2\1\71\12\2\11\0\4\2\1\72"+
    "\3\2\1\0\4\2\7\0\2\2\13\0\3\2\1\73"+
    "\10\2\11\0\10\2\1\0\4\2\10\0\1\3\7\0"+
    "\1\53\12\0\1\54\1\3\1\74\1\0\1\54\14\0"+
    "\1\3\2\0\1\54\50\0\1\31\34\0\1\75\27\0"+
    "\1\76\32\0\25\34\1\0\6\34\1\0\3\34\1\77"+
    "\1\100\24\34\25\35\1\0\6\35\1\0\4\35\1\101"+
    "\1\102\23\35\1\0\2\2\13\0\4\2\1\103\7\2"+
    "\11\0\10\2\1\0\1\2\1\104\2\2\7\0\2\2"+
    "\13\0\4\2\1\105\7\2\11\0\10\2\1\0\4\2"+
    "\7\0\2\2\13\0\1\2\1\106\12\2\11\0\10\2"+
    "\1\0\4\2\7\0\2\2\13\0\1\107\2\2\1\110"+
    "\10\2\11\0\2\2\1\111\5\2\1\0\4\2\7\0"+
    "\2\2\13\0\1\2\1\112\4\2\1\113\5\2\11\0"+
    "\10\2\1\0\4\2\7\0\2\2\13\0\14\2\11\0"+
    "\10\2\1\0\1\2\1\114\2\2\10\0\1\115\23\0"+
    "\1\115\17\0\1\115\21\0\1\116\2\0\1\117\20\0"+
    "\1\116\17\0\1\116\17\0\25\120\1\0\4\120\1\0"+
    "\1\121\1\0\31\120\12\0\1\122\54\0\2\2\13\0"+
    "\2\2\1\123\11\2\11\0\10\2\1\0\4\2\7\0"+
    "\2\2\13\0\14\2\11\0\1\124\7\2\1\0\4\2"+
    "\7\0\2\2\13\0\6\2\1\125\5\2\11\0\10\2"+
    "\1\0\4\2\7\0\2\2\13\0\14\2\11\0\1\126"+
    "\7\2\1\0\2\2\1\127\1\2\7\0\2\2\13\0"+
    "\14\2\11\0\7\2\1\130\1\0\4\2\10\0\1\131"+
    "\13\0\1\131\1\0\1\131\5\0\1\131\1\0\2\131"+
    "\12\0\1\131\1\0\2\131\1\0\2\131\16\0\1\75"+
    "\27\0\1\132\32\0\35\76\1\133\30\76\17\0\1\34"+
    "\2\0\1\34\2\0\2\34\11\0\5\34\1\134\2\34"+
    "\35\0\1\35\2\0\1\35\2\0\2\35\11\0\5\35"+
    "\1\135\2\35\17\0\2\2\13\0\14\2\11\0\2\2"+
    "\1\136\5\2\1\0\4\2\7\0\2\2\13\0\14\2"+
    "\11\0\6\2\1\137\1\2\1\0\4\2\7\0\2\2"+
    "\13\0\14\2\11\0\6\2\1\140\1\2\1\0\4\2"+
    "\7\0\2\2\13\0\14\2\11\0\1\141\7\2\1\0"+
    "\4\2\7\0\2\2\13\0\6\2\1\142\5\2\11\0"+
    "\10\2\1\0\4\2\7\0\2\2\13\0\4\2\1\143"+
    "\7\2\11\0\10\2\1\0\4\2\7\0\2\2\13\0"+
    "\1\2\1\144\12\2\11\0\10\2\1\0\4\2\7\0"+
    "\2\2\13\0\2\2\1\145\11\2\11\0\10\2\1\0"+
    "\4\2\7\0\2\2\13\0\14\2\11\0\5\2\1\146"+
    "\2\2\1\0\4\2\7\0\2\2\13\0\5\2\1\147"+
    "\6\2\11\0\10\2\1\0\4\2\10\0\1\115\22\0"+
    "\1\54\1\115\2\0\1\54\14\0\1\115\2\0\1\54"+
    "\16\0\1\116\23\0\1\116\17\0\1\116\17\0\25\120"+
    "\1\0\4\120\1\0\1\120\1\0\56\120\1\0\4\120"+
    "\1\0\1\150\1\0\31\120\1\0\2\2\13\0\14\2"+
    "\11\0\2\2\1\151\5\2\1\0\4\2\7\0\2\2"+
    "\13\0\14\2\11\0\6\2\1\152\1\2\1\0\4\2"+
    "\7\0\2\2\13\0\1\153\13\2\11\0\10\2\1\0"+
    "\4\2\6\0\35\132\1\154\30\132\35\0\1\155\32\0"+
    "\1\156\13\0\1\156\1\0\1\156\4\0\2\156\1\0"+
    "\2\156\12\0\1\156\1\0\2\156\1\0\2\156\15\0"+
    "\1\157\13\0\1\157\1\0\1\157\4\0\2\157\1\0"+
    "\2\157\12\0\1\157\1\0\2\157\1\0\2\157\14\0"+
    "\2\2\13\0\14\2\11\0\6\2\1\160\1\2\1\0"+
    "\4\2\7\0\2\2\13\0\1\2\1\161\12\2\11\0"+
    "\10\2\1\0\4\2\7\0\2\2\13\0\1\162\13\2"+
    "\11\0\10\2\1\0\4\2\7\0\2\2\13\0\5\2"+
    "\1\163\6\2\11\0\10\2\1\0\4\2\7\0\2\2"+
    "\13\0\14\2\11\0\5\2\1\164\2\2\1\0\4\2"+
    "\7\0\2\2\13\0\14\2\11\0\7\2\1\165\1\0"+
    "\4\2\7\0\2\2\13\0\14\2\11\0\6\2\1\166"+
    "\1\2\1\0\4\2\7\0\2\2\13\0\6\2\1\167"+
    "\5\2\11\0\10\2\1\0\4\2\6\0\25\150\1\170"+
    "\4\150\1\170\1\150\1\170\1\171\30\150\1\0\2\2"+
    "\13\0\4\2\1\172\7\2\11\0\10\2\1\0\4\2"+
    "\7\0\2\2\13\0\1\173\13\2\11\0\10\2\1\0"+
    "\4\2\7\0\2\2\13\0\6\2\1\174\5\2\11\0"+
    "\10\2\1\0\4\2\6\0\3\132\1\175\31\132\1\154"+
    "\30\132\2\0\1\176\13\0\1\176\1\0\1\176\4\0"+
    "\2\176\1\0\2\176\12\0\1\176\1\0\2\176\1\0"+
    "\2\176\15\0\1\177\13\0\1\177\1\0\1\177\4\0"+
    "\2\177\1\0\2\177\12\0\1\177\1\0\2\177\1\0"+
    "\2\177\14\0\2\2\13\0\14\2\11\0\10\2\1\0"+
    "\3\2\1\200\7\0\2\2\13\0\6\2\1\201\5\2"+
    "\11\0\10\2\1\0\4\2\7\0\2\2\13\0\14\2"+
    "\11\0\6\2\1\202\1\2\1\0\4\2\7\0\2\2"+
    "\13\0\14\2\11\0\1\203\7\2\1\0\4\2\7\0"+
    "\2\2\13\0\5\2\1\204\6\2\11\0\10\2\1\0"+
    "\4\2\7\0\2\2\13\0\14\2\11\0\6\2\1\205"+
    "\1\2\1\0\4\2\6\0\35\170\1\206\30\170\25\150"+
    "\1\170\4\150\1\170\1\150\1\170\1\207\30\150\1\0"+
    "\2\2\13\0\1\2\1\210\12\2\11\0\10\2\1\0"+
    "\4\2\7\0\2\2\13\0\14\2\11\0\1\211\7\2"+
    "\1\0\4\2\6\0\3\132\1\175\31\132\1\212\30\132"+
    "\2\0\1\213\13\0\1\213\1\0\1\213\4\0\2\213"+
    "\1\0\2\213\12\0\1\213\1\0\2\213\1\0\2\213"+
    "\15\0\1\214\13\0\1\214\1\0\1\214\4\0\2\214"+
    "\1\0\2\214\12\0\1\214\1\0\2\214\1\0\2\214"+
    "\14\0\2\2\13\0\5\2\1\215\6\2\11\0\10\2"+
    "\1\0\4\2\7\0\2\2\13\0\14\2\11\0\4\2"+
    "\1\216\3\2\1\0\4\2\6\0\35\170\1\217\30\170"+
    "\2\0\1\34\13\0\1\34\1\0\1\34\4\0\2\34"+
    "\1\0\2\34\12\0\1\34\1\0\2\34\1\0\2\34"+
    "\15\0\1\35\13\0\1\35\1\0\1\35\4\0\2\35"+
    "\1\0\2\35\12\0\1\35\1\0\2\35\1\0\2\35"+
    "\14\0\2\2\13\0\3\2\1\220\10\2\11\0\10\2"+
    "\1\0\4\2\7\0\2\2\13\0\1\2\1\221\12\2"+
    "\11\0\10\2\1\0\4\2\6\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5292];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\3\1\1\11\1\1\4\11\3\1\1\0\12\1"+
    "\3\11\2\0\5\1\1\11\1\1\6\11\2\0\1\11"+
    "\2\1\3\11\11\1\3\0\1\11\2\0\1\11\14\1"+
    "\1\0\2\1\1\11\7\1\4\0\16\1\1\0\1\11"+
    "\2\0\10\1\1\0\4\1\3\0\6\1\1\0\4\1"+
    "\2\0\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[145];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
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


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LuaGrammarLex(java.io.Reader in) {
  	// TODO: code that goes to constructor
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public LuaGrammarLex(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 150) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 29: 
          { return sym(NEQ);
          }
        case 59: break;
        case 3: 
          { return sym(ASSIGN);
          }
        case 60: break;
        case 55: 
          { return sym(RETURN);
          }
        case 61: break;
        case 9: 
          { return sym(EXPON);
          }
        case 62: break;
        case 25: 
          { System.out.println("Line comment");
          }
        case 63: break;
        case 57: 
          { return sym(ELSEIF);
          }
        case 64: break;
        case 21: 
          { return sym(LCURLY);
          }
        case 65: break;
        case 4: 
          { return sym(PLUS);
          }
        case 66: break;
        case 43: 
          { return sym(FOR);
          }
        case 67: break;
        case 46: 
          { return sym(TRUE);
          }
        case 68: break;
        case 14: 
          { return sym(LBRACK);
          }
        case 69: break;
        case 41: 
          { return sym(NIL);
          }
        case 70: break;
        case 19: 
          { return sym(LPAREN);
          }
        case 71: break;
        case 48: 
          { return sym(ELSE);
          }
        case 72: break;
        case 38: 
          { return sym(TRIDOT);
          }
        case 73: break;
        case 47: 
          { return sym(THEN);
          }
        case 74: break;
        case 34: 
          { System.out.println("Found String");	
				return sym(NORMALSTRING);
          }
        case 75: break;
        case 6: 
          { return sym(MULT);
          }
        case 76: break;
        case 30: 
          { return sym(DO);
          }
        case 77: break;
        case 37: 
          { return sym(EXP);
          }
        case 78: break;
        case 11: 
          { return sym(MINOR);
          }
        case 79: break;
        case 27: 
          { return sym(MINEQ);
          }
        case 80: break;
        case 33: 
          { return sym(IF);
          }
        case 81: break;
        case 58: 
          { return sym(FUNCTION);
          }
        case 82: break;
        case 49: 
          { return sym(LOCAL);
          }
        case 83: break;
        case 16: 
          { return sym(SEMI);
          }
        case 84: break;
        case 10: 
          { return sym(DOT);
          }
        case 85: break;
        case 23: 
          { return sym(COLON);
          }
        case 86: break;
        case 31: 
          { return sym(OR);
          }
        case 87: break;
        case 32: 
          { return sym(IN);
          }
        case 88: break;
        case 24: 
          { return sym(EQ);
          }
        case 89: break;
        case 7: 
          { return sym(DIVIDE);
          }
        case 90: break;
        case 53: 
          { return sym(WHILE);
          }
        case 91: break;
        case 50: 
          { return sym(BREAK);
          }
        case 92: break;
        case 51: 
          { return sym(UNTIL);
          }
        case 93: break;
        case 22: 
          { return sym(RCURLY);
          }
        case 94: break;
        case 44: 
          { return sym(END);
          }
        case 95: break;
        case 12: 
          { return sym(MAIOR);
          }
        case 96: break;
        case 28: 
          { return sym(MAIEQ);
          }
        case 97: break;
        case 15: 
          { return sym(RBRACK);
          }
        case 98: break;
        case 56: 
          { return sym(REPEAT);
          }
        case 99: break;
        case 36: 
          { return sym(FLOAT);
          }
        case 100: break;
        case 26: 
          { return sym(DOTDOT);
          }
        case 101: break;
        case 2: 
          { return sym(INT);
          }
        case 102: break;
        case 20: 
          { return sym(RPAREN);
          }
        case 103: break;
        case 35: 
          { System.out.println("Found Char String");	
				return sym(CHARSTRING);
          }
        case 104: break;
        case 40: 
          { return sym(NOT);
          }
        case 105: break;
        case 39: 
          { return sym(AND);
          }
        case 106: break;
        case 5: 
          { return sym(MINUS);
          }
        case 107: break;
        case 54: 
          { System.out.println("Comment");
          }
        case 108: break;
        case 42: 
          { return sym(HEX);
          }
        case 109: break;
        case 8: 
          { return sym(MOD);
          }
        case 110: break;
        case 17: 
          { return sym(COMMA);
          }
        case 111: break;
        case 18: 
          { return sym(SHARP);
          }
        case 112: break;
        case 52: 
          { return sym(FALSE);
          }
        case 113: break;
        case 45: 
          { System.out.println("Found Long String");	
				return sym(LONGSTRING);
          }
        case 114: break;
        case 13: 
          { 
          }
        case 115: break;
        case 1: 
          { return sym(VAR_NAME);
          }
        case 116: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { 	return sym(EOF); 
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
