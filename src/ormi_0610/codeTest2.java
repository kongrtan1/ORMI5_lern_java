package ormi_0610;

public class codeTest2 {

  public static void main(String[] args) {
    System.out.println(printAt("hello"));
  }

  static String printAt(String str) {

    if(str.length() <=1 ){
      return str;
    }

    return str.charAt(0) + "@" + printAt(str.substring(1));
  }
}
