package ormi_0614.Interface;

public class ZooKeeper {

  //  void feed(Tiger tiger) {
  //    System.out.println("feed meat"); // 호랑이가 오면 고기
  //  }
  //
  //  void feed(Lion lion) {
  //    System.out.println("feed fish"); // 사자가 오면 생선
  //  }
  void feed(Predator predator) {
    System.out.println("feed meat");
  }

  void feed2(Herbivore herbivore) {
    System.out.println("feed grace");
  }
}
