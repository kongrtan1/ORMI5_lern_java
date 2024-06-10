package ormi_0610;

public class codeTest1 {

  public static void main(String[] args) {
    System.out.println(printNumber(10));
  }

  static int printNumber(int num) {
    if (num == 0) {
      return 0;
    } else {
      System.out.println(num);
      return printNumber(num - 1);
    }
  }
}
