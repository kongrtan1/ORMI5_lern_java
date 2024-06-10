package ormi_0610;

public class codeTest5 {
  public static void main(String[] args) {

    /*
    어떤 숫자가 11의 배수이거나 11의 배수보다 1 큰 숫자라면, 그 숫자를 "cool"하다고 하겠습니다.
    주어진 0 이상의 숫자가 cool하다면 true를 반환하세요.

    System.out.println(isCool(22)); // true (11의 배수)
    System.out.println(isCool(23)); // true (11의 배수보다 1 큼)
    System.out.println(isCool(24)); // false (11의 배수도 아니고, 11의 배수보다 1 크지도 않음)
    */

  }

  public static boolean isCool(int num) {
    if (num >= 0) {
      return num % 11 == 0 || num % 11 == 1;
    }
    return false;
  }
}
