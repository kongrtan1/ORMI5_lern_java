package ormi_0605;

import java.util.Scanner;

public class Scanner3_0605 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("계절을 맞춰보세요!");
    int input = sc.nextInt();

    switch (input) {
      case 1:
        System.out.println("봄");
        break;
      case 2:
        System.out.println("여름");
        break;
      case 3:
        System.out.println("가을");
        break;
      case 4:
        System.out.println("겨울");
        break;
      default:
        System.out.println("잘못된 입력입니다!");
    }
  }
}
