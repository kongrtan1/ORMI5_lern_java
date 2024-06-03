public class Exif2_0603 {

  public static void main(String[] args) {
    int x = 10;

    if (x > 0) {
      System.out.println("x=양수");
    } else {
      System.out.println("x=음수");
    }

    System.out.println(x > 0 ? "x=양수" : "x=음수");

    int score = 75;

    if (score > 90) {
      System.out.println("A");
    } else if (80 < score && 90 > score) {
      System.out.println("B");
    } else if (70 < score && 80 > score) {
      System.out.println("C");
    } else if (60 < score && 70 > score) {
      System.out.println("D");
    } else {
      System.out.println("F");
    }

    int year = 2023;

    if ( year%4 == 0 && (year %100 != 0 || year%400 == 0)){
      System.out.println("윤년입니다.");
    }

    int a = 10;
    int b = 20;
    int c = 30;
    if(a >= b && a >= c){
      System.out.println(a);
    }else if(b >= a && b >= a){
      System.out.println(b);
    }else if((c >= a && c>=b)){
      System.out.println(c);
    }

    int passScore = 60;
    int myScore = 75;
    if(myScore >= passScore){
      System.out.println("합격");
    }else {
      System.out.println("불합격");
    }


  }
}
