package ormi_0607;

public class codeTest {
  public static void main(String[] args) {
//    System.out.println("Hello world!");
//
//    System.out.println(MyClass.staticNum);
    MyClass.staticMethod();

//    MyClass myClass = new MyClass();
  }

  public class MyClass {

    public static int staticNum = 0;

    public static void staticMethod(){
      System.out.println("this is static method");
    }
  }

  // static ==> 클래스 레벨의 필드와 메서드를 정의할 때 사용하는 키워드입니다.
  // 클래스 레벨 ==> 인스턴스에 속하는게 X
}
