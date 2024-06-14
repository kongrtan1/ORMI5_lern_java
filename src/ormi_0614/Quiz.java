package ormi_0614;

import java.util.Scanner;

public class Quiz {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("첫 번째 정수를 입력하세요: ");
      int num1 = scanner.nextInt();

      System.out.print("두 번째 정수를 입력하세요: ");
      int num2 = scanner.nextInt();

      int result = num1 / num2; // 나눗셈 수행
      System.out.println("결과: " + result);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없습니다."); // ArithmeticException 처리
    } finally {
      scanner.close(); // scanner 자원 해제
    }
  }
}
