package ormi_0605;

import java.util.Scanner;

public class MovieTicket {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("영화 제목을 입력하세요: ");
    String movieName = input.nextLine();

    System.out.println("관람 인원 수를 입력하세요: ");
    int people = input.nextInt();
    input.nextLine();

    System.out.println("예매자의 이름을 입력하세요: ");
    String name = input.nextLine();

    System.out.println("예매자의 전화번호를 입력하세요:");
    String phone = input.nextLine();

    int ticketPrice = 10000;
    int totalPrice = people * ticketPrice;

    System.out.println("==== 영화 티켓 예매 정보 ====");
    System.out.println("영화 제목: " + movieName);
    System.out.println("관람 인원: " + people);
    System.out.println("예매자 이름: " + name );
    System.out.println("예매자 전화번호 : " + phone);
    System.out.println("총 결제 금액 :" + totalPrice + "원");
  }
}
