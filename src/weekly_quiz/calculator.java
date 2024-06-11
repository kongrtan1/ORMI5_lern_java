package weekly_quiz;

import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int result = 0;

    while (true) {
      System.out.println("원하는 기능을 선택하세요");
      System.out.println("1. 덧셈 / 2. 뺄셈 / 3. 곱셈 / 4. 나눗셈 / 0. 종료");
      int option = input.nextInt();

      if (option >= 1 && option <= 4) {
        System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
        int num1 = input.nextInt();

        System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
        int num2 = input.nextInt();

        if (option == 1) {
          result = num1 + num2;
          System.out.println(num1 + " + " + num2 + " = " + result);
        } else if (option == 2) {
          result = num1 - num2;
          System.out.println(num1 + " - " + num2 + " = " + result);
        } else if (option == 3) {
          result = num1 * num2;
          System.out.println(num1 + " * " + num2 + " = " + result);
        } else if (option == 4) {
          result = num1 / num2;
          System.out.println(num1 + " / " + num2 + " = " + result);
        }

      } else if (option == 0) {
        System.out.println("프로그램을 종료합니다.");
        break;
      }
    }
  }
}
