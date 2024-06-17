package ormi_0617.imple;

public class Test {
  public static void main(String[] args) {
    InterfaceC impleC = new ImpleC();

    InterfaceA interfaceA = impleC;
    System.out.println("=================");

    InterfaceB interfaceB = impleC;
    interfaceB.methodB();
    System.out.println("=================");

    impleC.methodA();
    impleC.methodB();
    impleC.methodC();
  }
}
