package ormi_0531;

public class String_0531 {

  public static void main(String[] args) {
//      String result = "";
//      result += "Hello ";
//      result += "java";
//      result += "World";
//    System.out.println(result);
//
//    StringBuilder sb = new StringBuilder();         //이어붙일땐 StringBuilder or StringBuffer
//    sb.append("Hello ");
//    sb.append("java");
//    sb.append("World ");
//    System.out.println(sb);
//
//    StringBuffer sf = new StringBuffer();
//    sf.append("Hello ");
//    sf.append("java");
//    sf.append("world");
//    System.out.println(sf);

      StringBuffer buffer = new StringBuffer();
      buffer.append("Hello");
      buffer.insert(0, "World");
      System.out.println(buffer);
  }
}
