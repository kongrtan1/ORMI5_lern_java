public class CaseEx_0603 {

  public static void main(String[] args) {

    String day = "월요일";

    switch (day) {
      case "월요일":
        System.out.println("책읽기.");
        break;
      case "화요일":
        System.out.println("영화보기");
        break;
      case "수요일":
        System.out.println("잠자기");
        break;
      case "목요일":
        System.out.println("숨쉬기");
        break;
      case "금요일":
        System.out.println("가마니있기");
        break;
      case "토요일":
        System.out.println("캠핑가기");
        break;
      case "일요일":
        System.out.println("쉬기");
        break;
      default:
        System.out.println("알수없는요일");
    }
  }
}
