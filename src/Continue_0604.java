public class Continue_0604 {

  public static void main(String[] args) {
//    int number = 0;
//
//    while (number < 10) {
//      number++;
//      if (number == 3) {
//        continue;
//      } else {
//        System.out.println("현재 값은 :" + number);
//      }
//    }
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        break;
      }
      for (int j = 0; j < 10; j++) {
        if (j == 5) {
          continue;
        }
        System.out.println(j);
      }
    }
  }
}
