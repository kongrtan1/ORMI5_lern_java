public class String_0531 {

  public static void main(String[] args) {

    //        String phoneName = "Galaxy";
    //        String phoneName = new String();

    String firstName = "jiwon";
    String secondName = "jung";
    String phone = "iphone";
    String status = "happy";

    System.out.println("나는 " + secondName + " " + firstName + " 입니다.");
    System.out.println(phone + " is " + status);

    //    String a = "hello";
    //    String b = new String("hello");
    //    System.out.println(a.length());
    //    System.out.println(a.toUpperCase());
    //    System.out.println(a.equals(b)); //문자 포함하는지
    //    System.out.println(a == b);
    //    System.out.println(a.indexOf("!")); //순서

    //    String a = "Hello World! Hello World! Hello World!";
    //    System.out.println(a.contains("World"));
    //
    //    String b = "ESTSOFT";
    //    System.out.println(b.contains("SOFT")); //문자열을 포함하는지
    //
    //    String findChar = "What is your hobby";
    //    System.out.println(findChar.charAt(5));
    //    System.out.println(findChar.charAt(13) +""+ findChar.charAt(14) +""+ findChar.charAt(15)
    // +""+ findChar.charAt(16) +""+ findChar.charAt(17));
    //    System.out.println(a.replace("World","Java"));

    //    String a = "WEEEE ASKE ;DN";
    //    System.out.println(a.substring(0, 3) + "" + a.substring(8, 10) + "" + a.substring(12,
    // 14));

    //    String a = "a:b:c:d";
    //
    //    String[] split = a.split(":"); //split 에 alt + enter 지역변수 생성

//    String result = "Hello";
//    System.out.println(result.concat("!"));
//    System.out.println("======================");
//    result.concat(result.concat("!"));
//    System.out.println(result);


String name1 = "Tim";
int age1 = 30;

String name2 = "Anna";
int age2 = 45;

String d1= String.format("%s의 나이는 %s세 입니다,", name1, age1);
String d2= String.format("%s의 나이는 %s세 입니다,", name2, age2);

    System.out.println(d1);
    System.out.println(d2);
  }
}
