package ormi_0610;

public class codeTest7 {
  public static void main(String[] args) {

    System.out.println("hello" + 'G');
    System.out.println(repeatChar("AAbb"));
    /*
    주어진 문자열에서 각 문자마다 동일한 문자를 한 번 더 추가한 문자열을 반환하세요.

    System.out.println(repeatChar("The")); // "TThhee"
    System.out.println(repeatChar("AAbb")); // "AAAAbbbb"
    System.out.println(repeatChar("Hi-There")); // "HHii--TThheerree"
    */

  }

  static String repeatChar(String str) {
    String result = "";

    for (int i = 0; i < str.length(); i++) {
      char theChar = str.charAt(i);
      result += String.valueOf(theChar) + theChar;
      //      result += "" + theChar + theChar;
    }

    return result;
  }
}
