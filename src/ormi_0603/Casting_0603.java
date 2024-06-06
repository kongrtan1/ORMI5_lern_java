package ormi_0603;

public class Casting_0603 {

  public static void main(String[] args) {
    //        byte a = 1;
    //        byte b = 1;
    //        int c = (int) a + b;

//    int a = 10;
//    int b = 4;
//    int c = a / b;
//    double d = (double) a / b;
//
//    char c1 = 'A' + 1;
//    char c2 = 'A';
//    //    char c3 = c2 + 1;

    String str1 = "안녕하세요";
    String str2 = "만나서 반갑습니다.";
    String str3 = str1 + str2;

    System.out.println(str3);

    StringBuilder sb = new StringBuilder();
    sb.append(123);
    sb.append(456);
    sb.append("Hello");
    System.out.println(sb);

    int number1 = 10;
    int number2 = 30;

    System.out.println(number1 < number2);
    System.out.println(number1 > number2);
    System.out.println(number1 <= number2);
    System.out.println(number1 >= number2);

    System.out.println(number1 == number2);
    System.out.println(number1 != number2);

    String a = new String();
    String b = new String();
    System.out.println(a==b);
    System.out.println(a.equals(b));

    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(false && true);
    System.out.println(false && false);

    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);

    System.out.println(true ^ true);
    System.out.println(true ^ false);
    System.out.println(false ^ true);
    System.out.println(false ^ false);

    System.out.println(false ^ !false);
    System.out.println(false ^  !false);
    System.out.println(false ^ !false);
    System.out.println(false ^ !false);


  }
}
