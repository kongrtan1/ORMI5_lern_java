package ormi_0605;

import java.util.Scanner;

public class SeasonEx {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("1~4사이의 숫자를 입력하세요");

    int number = scanner.nextInt();

    switch (number) {
      case 1:
        System.out.println("계절은 봄 입니다.");
        break;
      case 2:
        System.out.println("계절은 여름 입니다.");
        break;
      case 3:
        System.out.println("계절은 가을 입니다.");
        break;
      case 4:
        System.out.println("계절은 겨울 입니다.");
        break;
      default:
        System.out.println("잘못된 입력입니다!");
    }
  }
}
