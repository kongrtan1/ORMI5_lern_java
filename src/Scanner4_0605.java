import java.util.*;

public class Scanner4_0605 {
  public static void main(String[] args) {
    Random random = new Random();

    ArrayList<Integer> list = new ArrayList<Integer>();

    while (list.size() != 6) {
      int number = random.nextInt(45) + 1;

      if (!list.contains(number)) {
        list.add(number);
      }
    }

    for (int data : list) {
      System.out.println(data);
    }
  }
}
