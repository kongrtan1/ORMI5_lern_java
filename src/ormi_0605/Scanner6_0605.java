package ormi_0605;

import java.util.*;

public class Scanner6_0605 {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("영화 제목");
    String movieName = input.nextLine();

    System.out.println("관람 인원");
    int number = input.nextInt();

    System.out.println("예매자 이름");
    String name = input.nextLine();

    System.out.println("예매자 전화번호");
    int phone = input.nextInt();


  }
}
