package ormi_0605;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    int targetNumber = random.nextInt(100) + 1; // 1부터 100 사이의 랜덤 숫자 생성

    System.out.println("1부터 100 사이의 숫자를 맞춰보세요!");

    while (true) {
      System.out.println("숫자를 입력하세요!");
      int number = input.nextInt();

      if (number < targetNumber) {
        System.out.println("up");
      } else if (number > targetNumber) {
        System.out.println("down");
      } else {
        System.out.println("정답입니다!");
        break;
      }
    }
    input.close();
  }
}
