package ormi_0603;

public class Exif_0603 {

  public static void main(String[] args) {
    int a = 5;
    int b = 3;

    if (a > b) {
      System.out.println("a is greater than b");
    } else if (a == b) {
      System.out.println("a and b are equal");
    } else {
      System.out.println("a is less than b");
    }

      System.out.println((a>b)?"a is greater than b":(a == b)?"a and b are equal":"a is less than b");

  }
}

