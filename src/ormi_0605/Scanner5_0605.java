package ormi_0605;

import java.util.*;

public class Scanner5_0605 {
  public static void main(String[] args) {
    Random random = new Random();
    int targetNumber = random.nextInt(100) + 1;
    Scanner scanner = new Scanner(System.in);

    System.out.println("1부터 100 사이의 숫자를 맞춰보세요!");

    while (true) {
      System.out.print("숫자를 입력하세요");
      int number = scanner.nextInt();

      if (number == targetNumber) {
        System.out.println("정답입니다!");
        break;
      } else if (number < targetNumber) {
        System.out.println("입력하신 숫자보다 더 큰 숫자입니다.");
      } else {
        System.out.println("입력하신 숫자보다 더 작은 숫자입니다.");
      }
    }

    scanner.close();
  }
}
