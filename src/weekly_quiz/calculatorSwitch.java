package weekly_quiz;

import java.util.Scanner;

public class calculatorSwitch {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    boolean onOffFlag = true;

    while (true) {
      System.out.println("원하는 기능을 선택하세요");

      System.out.println("1. 덧셈 / 2. 뺄셈 / 3. 곱셈 / 4. 나눗셈 / 0. 종료");
      int option = input.nextInt();

      if (option == 0) {
        System.out.println("프로그램을 종료합니다.");
        break;
      } else if (option < 0 || option > 4) {
        continue;
      }
      System.out.println("첫번째 값을 입력하고 엔터를 누르세요.");
      int num1 = input.nextInt();

      System.out.println("두번째 값을 입력하고 엔터를 누르세요.");
      int num2 = input.nextInt();

      int result = 0;

      switch (option) {
        case 1:
          result = num1 + num2;
          System.out.println(num1 + " + " + num2 + " = " + result);
          break;
        case 2:
          result = num1 - num2;
          System.out.println(num1 + " - " + num2 + " = " + result);
          break;
        case 3:
          result = num1 * num2;
          System.out.println(num1 + " * " + num2 + " = " + result);
          break;
        case 4:
          result = num1 / num2;
          System.out.println(num1 + " / " + num2 + " = " + result);
          break;
      }
    }
  }
}
