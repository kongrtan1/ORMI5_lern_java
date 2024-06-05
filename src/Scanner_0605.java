import java.util.Scanner;

public class Scanner_0605 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("정수를 입력해주세요.");
    int a = scanner.nextInt();

    System.out.println("제가 입력한 값은 "+ a +" 입니다.");

    scanner.close();
  }
}
