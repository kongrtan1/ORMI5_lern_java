public class Array3_06040 {
  public static void main(String[] args) {
    // 2 단 출력
    //    for (int i = 1; i <= 9; i++){
    //      System.out.println( "2 x " + i + " = " + (2 * i) );
    //    }
    //
    // 구구단 출력
    //    for (int i = 2; i <= 9; i++) {
    //      for (int j = 1; j <= 9; j++) {
    //        System.out.println(i + "x" + j + "=" + i * j);
    //      }
    //    }

    // 19단 역출력
    for (int i = 19; i >= 2; i--) {
      for (int j = 19; j >= 1; j--) {
        System.out.println(i + "x" + j + "=" + i * j);
      }
    }
  }
}
