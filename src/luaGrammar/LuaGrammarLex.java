/* The following code was generated by JFlex 1.4.3 on 09/12/11 11.22 */


package luaGrammar;

import java_cup.runtime.*;
import java.io.IOException;

import luaGrammar.LuaGrammarSym;
import static luaGrammar.LuaGrammarSym.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 09/12/11 11.22 from the specification file
 * <tt>F:/Documenti/workspaceANTLR/py2lua/LuaGrammar.lex</tt>
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
    "\11\0\1\44\1\42\1\0\1\44\1\40\22\0\1\30\1\0\1\46"+
    "\1\66\1\0\1\10\1\0\1\50\1\67\1\70\1\6\1\4\1\61"+
    "\1\5\1\12\1\7\1\34\3\54\4\54\2\2\1\0\1\45\1\13"+
    "\1\3\1\14\2\0\1\37\3\36\1\32\1\37\2\1\1\25\2\1"+
    "\1\31\1\1\1\26\1\31\4\1\1\27\3\1\1\35\2\1\1\41"+
    "\1\47\1\43\1\11\1\1\1\0\1\16\1\52\1\60\1\20\1\57"+
    "\1\55\1\1\1\63\1\23\1\1\1\65\1\24\1\1\1\17\1\21"+
    "\1\64\1\1\1\22\1\56\1\51\1\53\1\1\1\62\1\35\2\1"+
    "\1\71\1\33\1\72\1\15\uff81\0";

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
    "\1\10\1\11\1\12\1\13\1\14\1\0\11\1\1\15"+
    "\1\2\1\15\1\16\1\15\1\17\1\20\2\0\5\1"+
    "\1\21\1\1\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\3\1\1\35\1\36"+
    "\1\1\1\37\1\40\3\1\4\0\1\41\2\0\1\42"+
    "\12\1\2\30\1\43\1\44\1\45\1\46\4\1\2\0"+
    "\1\47\4\0\5\1\1\50\1\1\1\51\2\1\1\30"+
    "\3\1\3\0\1\52\2\0\1\53\1\54\4\1\1\55"+
    "\1\1\1\0\1\30\2\1\1\56\1\0\1\57\3\0"+
    "\1\60\1\61\1\62\2\1\1\63\1\0\1\64\1\65"+
    "\1\66\1\0\1\52\2\0\1\1\1\67\1\64\1\70"+
    "\1\1\1\71";

  private static int [] zzUnpackAction() {
    int [] result = new int[154];
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
    "\0\0\0\73\0\166\0\261\0\354\0\u0127\0\354\0\354"+
    "\0\354\0\354\0\u0162\0\u019d\0\u01d8\0\u0213\0\u024e\0\u0289"+
    "\0\u02c4\0\u02ff\0\u033a\0\u0375\0\u03b0\0\u03eb\0\u0426\0\u0461"+
    "\0\u049c\0\u04d7\0\u0512\0\354\0\354\0\354\0\u054d\0\u0588"+
    "\0\u05c3\0\u05fe\0\u0639\0\u0674\0\u06af\0\354\0\u06ea\0\354"+
    "\0\354\0\354\0\354\0\354\0\354\0\u0725\0\u0760\0\354"+
    "\0\354\0\354\0\u079b\0\u07d6\0\u0811\0\73\0\73\0\u084c"+
    "\0\73\0\73\0\u0887\0\u08c2\0\u08fd\0\u0938\0\u0973\0\u09ae"+
    "\0\u09e9\0\354\0\u0a24\0\u0a5f\0\354\0\u0a9a\0\u0ad5\0\u0b10"+
    "\0\u0b4b\0\u0b86\0\u0bc1\0\u0bfc\0\u0c37\0\u0c72\0\u0cad\0\u0ce8"+
    "\0\u0d23\0\354\0\73\0\73\0\73\0\u0d5e\0\u0d99\0\u0dd4"+
    "\0\u0e0f\0\u0e4a\0\u0e85\0\u0973\0\u0ec0\0\u0efb\0\u0f36\0\u0f71"+
    "\0\u0fac\0\u0fe7\0\u1022\0\u105d\0\u1098\0\73\0\u10d3\0\73"+
    "\0\u110e\0\u1149\0\u1184\0\u11bf\0\u11fa\0\u1235\0\u1270\0\u12ab"+
    "\0\u12e6\0\354\0\u1321\0\u135c\0\73\0\73\0\u1397\0\u13d2"+
    "\0\u140d\0\u1448\0\u1483\0\u14be\0\u14f9\0\u1534\0\u156f\0\u15aa"+
    "\0\73\0\u15e5\0\354\0\u1620\0\u165b\0\u1696\0\73\0\73"+
    "\0\73\0\u16d1\0\u170c\0\73\0\u1747\0\u1534\0\73\0\73"+
    "\0\u1782\0\u12e6\0\u17bd\0\u17f8\0\u1833\0\73\0\u1747\0\354"+
    "\0\u186e\0\73";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[154];
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
    "\1\21\1\22\1\23\1\24\1\25\1\26\2\27\1\30"+
    "\1\27\1\2\1\27\1\31\2\2\1\27\1\32\1\33"+
    "\1\34\1\35\1\34\1\36\1\37\1\0\1\40\1\41"+
    "\1\42\1\43\1\3\1\44\1\2\1\45\1\2\1\46"+
    "\1\47\3\2\1\50\1\51\1\52\1\53\1\54\1\0"+
    "\2\2\13\0\12\2\1\0\7\2\11\0\10\2\1\0"+
    "\4\2\7\0\1\3\31\0\1\3\17\0\1\3\21\0"+
    "\1\55\167\0\1\56\77\0\1\57\63\0\1\60\72\0"+
    "\1\61\72\0\1\62\70\0\2\2\13\0\1\2\1\63"+
    "\10\2\1\0\7\2\11\0\10\2\1\0\4\2\6\0"+
    "\2\2\13\0\3\2\1\64\1\2\1\65\4\2\1\0"+
    "\7\2\11\0\10\2\1\0\4\2\6\0\2\2\13\0"+
    "\3\2\1\66\6\2\1\0\7\2\11\0\10\2\1\0"+
    "\4\2\6\0\2\2\13\0\4\2\1\67\5\2\1\0"+
    "\7\2\11\0\10\2\1\0\4\2\6\0\2\2\13\0"+
    "\12\2\1\0\7\2\11\0\6\2\1\70\1\2\1\0"+
    "\4\2\6\0\2\2\13\0\1\2\1\71\10\2\1\0"+
    "\7\2\11\0\4\2\1\72\3\2\1\0\4\2\6\0"+
    "\2\2\13\0\3\2\1\73\6\2\1\0\7\2\11\0"+
    "\10\2\1\0\4\2\6\0\2\2\13\0\10\2\1\74"+
    "\1\2\1\0\1\2\2\75\4\2\11\0\6\2\1\75"+
    "\1\2\1\0\4\2\6\0\2\2\13\0\12\2\1\0"+
    "\1\2\2\75\4\2\11\0\6\2\1\75\1\2\1\0"+
    "\4\2\37\0\2\76\23\0\1\76\15\0\1\3\31\0"+
    "\1\3\1\77\16\0\1\3\60\0\1\34\33\0\1\100"+
    "\35\0\1\101\31\0\33\37\1\0\6\37\1\0\3\37"+
    "\1\102\1\103\23\37\33\40\1\0\6\40\1\0\4\40"+
    "\1\104\1\105\22\40\1\0\2\2\13\0\4\2\1\106"+
    "\5\2\1\0\7\2\11\0\10\2\1\0\1\2\1\107"+
    "\2\2\6\0\2\2\13\0\4\2\1\110\5\2\1\0"+
    "\7\2\11\0\10\2\1\0\4\2\6\0\2\2\13\0"+
    "\1\2\1\111\10\2\1\0\7\2\11\0\10\2\1\0"+
    "\4\2\6\0\2\2\13\0\1\112\2\2\1\113\6\2"+
    "\1\0\7\2\11\0\2\2\1\114\5\2\1\0\4\2"+
    "\6\0\2\2\13\0\1\2\1\115\4\2\1\116\3\2"+
    "\1\0\7\2\11\0\10\2\1\0\4\2\6\0\2\2"+
    "\13\0\12\2\1\0\7\2\11\0\10\2\1\0\1\2"+
    "\1\117\2\2\5\0\30\120\1\0\2\120\1\0\4\120"+
    "\1\0\1\121\1\0\30\120\12\0\1\122\61\0\2\2"+
    "\13\0\2\2\1\123\7\2\1\0\7\2\11\0\10\2"+
    "\1\0\4\2\6\0\2\2\13\0\12\2\1\0\7\2"+
    "\11\0\1\124\7\2\1\0\4\2\6\0\2\2\13\0"+
    "\6\2\1\125\3\2\1\0\7\2\11\0\10\2\1\0"+
    "\4\2\6\0\2\2\13\0\12\2\1\0\7\2\11\0"+
    "\1\126\7\2\1\0\2\2\1\127\1\2\6\0\2\2"+
    "\13\0\12\2\1\0\7\2\11\0\7\2\1\130\1\0"+
    "\4\2\6\0\2\2\13\0\11\2\1\131\1\0\7\2"+
    "\11\0\10\2\1\0\4\2\6\0\2\2\2\0\1\132"+
    "\10\0\12\2\1\0\7\2\11\0\10\2\1\0\4\2"+
    "\12\0\1\132\17\0\1\133\47\0\1\134\13\0\1\134"+
    "\1\0\1\134\11\0\1\134\1\0\1\134\1\0\2\134"+
    "\12\0\1\134\1\0\2\134\1\0\2\134\15\0\1\100"+
    "\35\0\1\135\31\0\43\101\1\136\27\101\17\0\1\37"+
    "\2\0\1\37\10\0\2\37\11\0\5\37\1\137\2\37"+
    "\34\0\1\40\2\0\1\40\10\0\2\40\11\0\5\40"+
    "\1\140\2\40\16\0\2\2\13\0\12\2\1\0\7\2"+
    "\11\0\2\2\1\141\5\2\1\0\4\2\6\0\2\2"+
    "\13\0\12\2\1\0\7\2\11\0\6\2\1\142\1\2"+
    "\1\0\4\2\6\0\2\2\13\0\12\2\1\0\7\2"+
    "\11\0\6\2\1\143\1\2\1\0\4\2\6\0\2\2"+
    "\13\0\12\2\1\0\7\2\11\0\1\144\7\2\1\0"+
    "\4\2\6\0\2\2\13\0\6\2\1\145\3\2\1\0"+
    "\7\2\11\0\10\2\1\0\4\2\6\0\2\2\13\0"+
    "\4\2\1\146\5\2\1\0\7\2\11\0\10\2\1\0"+
    "\4\2\6\0\2\2\13\0\1\2\1\147\10\2\1\0"+
    "\7\2\11\0\10\2\1\0\4\2\6\0\2\2\13\0"+
    "\2\2\1\150\7\2\1\0\7\2\11\0\10\2\1\0"+
    "\4\2\6\0\2\2\13\0\12\2\1\0\7\2\11\0"+
    "\5\2\1\151\2\2\1\0\4\2\6\0\2\2\13\0"+
    "\5\2\1\152\4\2\1\0\7\2\11\0\10\2\1\0"+
    "\4\2\5\0\30\120\1\0\2\120\1\0\4\120\1\0"+
    "\1\120\1\0\60\120\1\0\2\120\1\0\4\120\1\0"+
    "\1\153\1\0\30\120\1\0\2\2\13\0\12\2\1\0"+
    "\7\2\11\0\2\2\1\154\5\2\1\0\4\2\6\0"+
    "\2\2\13\0\12\2\1\0\7\2\11\0\6\2\1\155"+
    "\1\2\1\0\4\2\6\0\2\2\13\0\1\156\11\2"+
    "\1\0\7\2\11\0\10\2\1\0\4\2\6\0\2\2"+
    "\7\0\1\157\3\0\12\2\1\0\7\2\11\0\10\2"+
    "\1\0\4\2\32\0\1\133\73\0\1\160\44\0\43\135"+
    "\1\161\27\135\43\0\1\162\31\0\1\163\13\0\1\163"+
    "\1\0\1\163\11\0\3\163\1\0\2\163\12\0\1\163"+
    "\1\0\2\163\1\0\2\163\14\0\1\164\13\0\1\164"+
    "\1\0\1\164\11\0\3\164\1\0\2\164\12\0\1\164"+
    "\1\0\2\164\1\0\2\164\13\0\2\2\13\0\12\2"+
    "\1\0\7\2\11\0\6\2\1\165\1\2\1\0\4\2"+
    "\6\0\2\2\13\0\1\2\1\166\10\2\1\0\7\2"+
    "\11\0\10\2\1\0\4\2\6\0\2\2\13\0\1\167"+
    "\11\2\1\0\7\2\11\0\10\2\1\0\4\2\6\0"+
    "\2\2\13\0\5\2\1\170\4\2\1\0\7\2\11\0"+
    "\10\2\1\0\4\2\6\0\2\2\13\0\12\2\1\0"+
    "\7\2\11\0\5\2\1\171\2\2\1\0\4\2\6\0"+
    "\2\2\13\0\12\2\1\0\7\2\11\0\7\2\1\172"+
    "\1\0\4\2\6\0\2\2\13\0\12\2\1\0\7\2"+
    "\11\0\6\2\1\173\1\2\1\0\4\2\6\0\2\2"+
    "\13\0\6\2\1\174\3\2\1\0\7\2\11\0\10\2"+
    "\1\0\4\2\5\0\30\153\1\175\2\153\1\175\4\153"+
    "\1\175\1\153\1\175\1\176\27\153\1\0\2\2\13\0"+
    "\4\2\1\177\5\2\1\0\7\2\11\0\10\2\1\0"+
    "\4\2\6\0\2\2\13\0\1\200\11\2\1\0\7\2"+
    "\11\0\10\2\1\0\4\2\6\0\2\2\13\0\6\2"+
    "\1\201\3\2\1\0\7\2\11\0\10\2\1\0\4\2"+
    "\32\0\1\202\74\0\1\203\43\0\3\135\1\204\37\135"+
    "\1\161\27\135\2\0\1\205\13\0\1\205\1\0\1\205"+
    "\11\0\3\205\1\0\2\205\12\0\1\205\1\0\2\205"+
    "\1\0\2\205\14\0\1\206\13\0\1\206\1\0\1\206"+
    "\11\0\3\206\1\0\2\206\12\0\1\206\1\0\2\206"+
    "\1\0\2\206\13\0\2\2\13\0\12\2\1\0\7\2"+
    "\11\0\10\2\1\0\3\2\1\207\6\0\2\2\13\0"+
    "\6\2\1\210\3\2\1\0\7\2\11\0\10\2\1\0"+
    "\4\2\6\0\2\2\13\0\12\2\1\0\7\2\11\0"+
    "\6\2\1\211\1\2\1\0\4\2\6\0\2\2\13\0"+
    "\12\2\1\0\7\2\11\0\1\212\7\2\1\0\4\2"+
    "\6\0\2\2\13\0\5\2\1\213\4\2\1\0\7\2"+
    "\11\0\10\2\1\0\4\2\6\0\2\2\13\0\12\2"+
    "\1\0\7\2\11\0\6\2\1\214\1\2\1\0\4\2"+
    "\5\0\43\175\1\215\27\175\30\153\1\175\2\153\1\175"+
    "\4\153\1\175\1\153\1\175\1\216\27\153\1\0\2\2"+
    "\13\0\1\2\1\217\10\2\1\0\7\2\11\0\10\2"+
    "\1\0\4\2\6\0\2\2\13\0\12\2\1\0\7\2"+
    "\11\0\1\220\7\2\1\0\4\2\33\0\1\221\44\0"+
    "\3\135\1\204\37\135\1\222\27\135\2\0\1\223\13\0"+
    "\1\223\1\0\1\223\11\0\3\223\1\0\2\223\12\0"+
    "\1\223\1\0\2\223\1\0\2\223\14\0\1\224\13\0"+
    "\1\224\1\0\1\224\11\0\3\224\1\0\2\224\12\0"+
    "\1\224\1\0\2\224\1\0\2\224\13\0\2\2\13\0"+
    "\5\2\1\225\4\2\1\0\7\2\11\0\10\2\1\0"+
    "\4\2\6\0\2\2\13\0\12\2\1\0\7\2\11\0"+
    "\4\2\1\226\3\2\1\0\4\2\5\0\43\175\1\227"+
    "\27\175\27\0\1\230\45\0\1\37\13\0\1\37\1\0"+
    "\1\37\11\0\3\37\1\0\2\37\12\0\1\37\1\0"+
    "\2\37\1\0\2\37\14\0\1\40\13\0\1\40\1\0"+
    "\1\40\11\0\3\40\1\0\2\40\12\0\1\40\1\0"+
    "\2\40\1\0\2\40\13\0\2\2\13\0\3\2\1\231"+
    "\6\2\1\0\7\2\11\0\10\2\1\0\4\2\6\0"+
    "\2\2\13\0\1\2\1\232\10\2\1\0\7\2\11\0"+
    "\10\2\1\0\4\2\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6313];
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
    "\1\0\3\1\1\11\1\1\4\11\3\1\1\0\15\1"+
    "\3\11\2\0\5\1\1\11\1\1\6\11\2\1\3\11"+
    "\13\1\4\0\1\11\2\0\1\11\14\1\1\11\7\1"+
    "\2\0\1\1\4\0\16\1\3\0\1\11\2\0\10\1"+
    "\1\0\4\1\1\0\1\11\3\0\6\1\1\0\3\1"+
    "\1\0\1\1\2\0\3\1\1\11\2\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[154];
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
    while (i < 170) {
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
        case 28: 
          { return sym(NEQ);
          }
        case 58: break;
        case 53: 
          { return sym(RETURN);
          }
        case 59: break;
        case 9: 
          { return sym(EXPON);
          }
        case 60: break;
        case 24: 
          { System.out.println("Line comment");
          }
        case 61: break;
        case 55: 
          { return sym(ELSEIF);
          }
        case 62: break;
        case 21: 
          { return sym(LCURLY);
          }
        case 63: break;
        case 4: 
          { return sym(PLUS);
          }
        case 64: break;
        case 40: 
          { return sym(FOR);
          }
        case 65: break;
        case 43: 
          { return sym(TRUE);
          }
        case 66: break;
        case 14: 
          { return sym(LBRACK);
          }
        case 67: break;
        case 38: 
          { return sym(NIL);
          }
        case 68: break;
        case 19: 
          { return sym(LPAREN);
          }
        case 69: break;
        case 3: 
          { System.out.println("assign");return sym(ASSIGN);
          }
        case 70: break;
        case 1: 
          { System.out.println("varname");return sym(VAR_NAME);
          }
        case 71: break;
        case 45: 
          { return sym(ELSE);
          }
        case 72: break;
        case 35: 
          { return sym(TRIDOT);
          }
        case 73: break;
        case 44: 
          { return sym(THEN);
          }
        case 74: break;
        case 33: 
          { System.out.println("Found String");	
				return sym(NORMALSTRING);
          }
        case 75: break;
        case 6: 
          { return sym(MULT);
          }
        case 76: break;
        case 29: 
          { return sym(DO);
          }
        case 77: break;
        case 47: 
          { return sym(EXP);
          }
        case 78: break;
        case 11: 
          { return sym(MINOR);
          }
        case 79: break;
        case 26: 
          { return sym(MINEQ);
          }
        case 80: break;
        case 32: 
          { return sym(IF);
          }
        case 81: break;
        case 57: 
          { return sym(FUNCTION);
          }
        case 82: break;
        case 46: 
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
        case 30: 
          { return sym(OR);
          }
        case 86: break;
        case 31: 
          { return sym(IN);
          }
        case 87: break;
        case 23: 
          { return sym(EQ);
          }
        case 88: break;
        case 7: 
          { return sym(DIVIDE);
          }
        case 89: break;
        case 51: 
          { return sym(WHILE);
          }
        case 90: break;
        case 48: 
          { return sym(BREAK);
          }
        case 91: break;
        case 49: 
          { return sym(UNTIL);
          }
        case 92: break;
        case 22: 
          { return sym(RCURLY);
          }
        case 93: break;
        case 41: 
          { return sym(END);
          }
        case 94: break;
        case 12: 
          { return sym(MAIOR);
          }
        case 95: break;
        case 27: 
          { return sym(MAIEQ);
          }
        case 96: break;
        case 15: 
          { return sym(RBRACK);
          }
        case 97: break;
        case 54: 
          { return sym(REPEAT);
          }
        case 98: break;
        case 56: 
          { return sym(FLOAT);
          }
        case 99: break;
        case 25: 
          { return sym(DOTDOT);
          }
        case 100: break;
        case 2: 
          { return sym(INT);
          }
        case 101: break;
        case 20: 
          { return sym(RPAREN);
          }
        case 102: break;
        case 34: 
          { System.out.println("Found Char String");	
				return sym(CHARSTRING);
          }
        case 103: break;
        case 37: 
          { return sym(NOT);
          }
        case 104: break;
        case 36: 
          { return sym(AND);
          }
        case 105: break;
        case 5: 
          { return sym(MINUS);
          }
        case 106: break;
        case 52: 
          { System.out.println("Comment");
          }
        case 107: break;
        case 39: 
          { return sym(HEX);
          }
        case 108: break;
        case 8: 
          { return sym(MOD);
          }
        case 109: break;
        case 17: 
          { return sym(COMMA);
          }
        case 110: break;
        case 18: 
          { return sym(SHARP);
          }
        case 111: break;
        case 50: 
          { return sym(FALSE);
          }
        case 112: break;
        case 42: 
          { System.out.println("Found Long String");	
				return sym(LONGSTRING);
          }
        case 113: break;
        case 13: 
          { 
          }
        case 114: break;
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
