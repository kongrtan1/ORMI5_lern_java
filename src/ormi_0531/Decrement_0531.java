package ormi_0531;

class Decrement_0531 {

  public static void main(String[] args) {

    // -------연산자
    int positive = 10;
    int negative = -10;

    System.out.println("양의 부호 연산자 적용: " + (+positive));
    System.out.println("양의 부호 연산자 적용: " + (-positive));
    System.out.println("음의 부호 연산자로 부호 반전: " + (+negative));
    System.out.println("음의 부호 연산자로 다시 부호 반전: " + (-negative));

    int x = 5;
    int y = 5;

    System.out.println("전위 증가 연산자: " + (++x));
    System.out.println("전위 증가 연산자: " + (y++));

    System.out.println("====================");
    System.out.println("x는" + x);
    System.out.println("y는" + y);

    int a = 100;
    int b = 100;

    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("전위 감소 연산자: " + (b--));
    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("전위 감소 연산자: " + (b--));
    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("전위 감소 연산자: " + (b--));
    System.out.println("전위 감소 연산자: " + (--a));
    System.out.println("전위 감소 연산자: " + (b--));


    boolean isRaining = true;

    if(isRaining){
      System.out.println("하늘에서 비가와요");
    }
    if(!isRaining){
      System.out.println("하늘에서 눈이 내려 와요");
    }

    boolean isSunny = false;

    if(!isSunny){
      System.out.println("날씨가 맑아요");
    }else{
      System.out.println("집에서 쉬어야죠");
    }
  }
}
