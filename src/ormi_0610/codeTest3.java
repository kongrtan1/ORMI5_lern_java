package ormi_0610;

public class codeTest3 {
  public static void main(String[] args) {
    /*문자열 데이터를 전달 받으면 각각의 문자열 사이에 @표시를 집어 넣는 함수를 만들어 봅니다.
    단, 재귀 함수를 이용하여 풀어보세요.*/
    // System.out.println(printAt("hello")); // "h@e@l@l@o"
    //        System.out.println(speedRacer(60,true));
    //        System.out.println(speedRacer(61,false));
    //        System.out.println(speedRacer(81,true));
    //        System.out.println(speedRacer(85,false));

    System.out.println(twoSumOne(1, 2, 3) + " " + twoSumOne(3, 1, 2) + " " + twoSumOne(3, 2, 2));
  }

  static String printAt(String str) {
    //        StringBuilder sb = new StringBuilder(str);
    //        if(str.endsWith("@")) return str;
    //        else return printAt(sb.insert(str.lastIndexOf("@")+2, "@").toString());
    //        if (str.length() <= 1) return str;
    //        return str.charAt(0) + "@" + printAt(str.substring(1));

    // while로 푼 방법
    int i = 0;
    String result = "";

    while (i < str.length() - 1) {
      result += str.charAt(i) + "@";
      i++;
    }

    result += str.charAt(i);

    return result;
  }

  /*  경찰이 당신을 과속으로 잡았을 때 내야 할 벌금을 계산하는 코드를 작성해보겠습니다.
  만약 당신의 속도가 60 이하라면 벌금은 없습니다.
  속도가 61에서 80 사이(포함)라면 벌금은 100원입니다.
  속도가 81 이상이라면 벌금은 200원입니다.
  단, 휴일인 경우 속도 한도가 5 더 높아집니다.

  속도가 60 이하라면 벌금은 0원입니다.
  속도가 61 이상이라면 벌금은 100원입니다.
  만약 휴일이라면 속도가 65라도 벌금은 0원입니다.*/

  static int speedRacer(int speed, boolean isHoliday) {
    speed = isHoliday ? speed - 5 : speed;
    return speed >= 81 ? 200 : speed >= 61 ? 100 : 0;
  }

  /**
   * 세 개의 정수 a, b, c가 주어졌을 때, 두 개의 정수를 더해서 세 번째 정수를 만들 수 있으면 true를 반환하는 코드를 작성합니다. 메서드 본문은 단 한 줄의
   * 코드로 작성되어야 합니다. twoSumOne(1, 2, 3) --->true twoSumOne(3, 1, 2) --->true twoSumOne(3, 2, 2)
   * --->false
   */
  public static boolean twoSumOne(int a, int b, int c) {
    return a + b == c || b + c == a || a + c == b;
  }
}
