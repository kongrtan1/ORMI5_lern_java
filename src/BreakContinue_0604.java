public class BreakContinue_0604 {

  public static void main(String[] args) {
    //    int number = 0;
    //    while (number < 10) {
    //      System.out.println("현재숫자: " + number);
    //      if (number == 5) {
    //        System.out.println("5가 되었습니다.");
    //        break;
    //      }
    //      number++;
    //    }
    //    for (int i = 0; i < 10; i++) {
    //      System.out.println("현재 i의 값은 = " + i);
    //      for (int j = 0; j < 10; j++) {
    //        System.out.println("현재 j의 값은 = " + j);
    //        if (j == 5) {
    //          break;
    //        }
    //      }
    //    }

    for (int i = 1; i <= 100; i++) {
      System.out.println("i= " + i);
      if (i == 50) {
        break;
      }
      for (int j = 2; j <= 100; j++) {
        System.out.println("j= " + j);
        if (j == 80) {
          break;
        }
      }
    }
  }
}
