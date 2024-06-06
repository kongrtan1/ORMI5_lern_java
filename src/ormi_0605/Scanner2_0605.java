package ormi_0605;

import java.util.Scanner;

public class Scanner2_0605 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("정수를 입력해주세요.");
    int number = scanner.nextInt();
    scanner.nextLine();
    System.out.println("문자열을 입력하세요:");

    String line = scanner.nextLine();

    System.out.println("정수는 =" + number);

    System.out.println("문자열은 = " + line);

    scanner.close();
  }
}
