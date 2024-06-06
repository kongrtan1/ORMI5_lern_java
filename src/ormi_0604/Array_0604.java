package ormi_0604;

public class Array_0604 {
  public static void main(String[] args) {
    int[] numbers = {5, 2, 9, 1, 7, 4, 6, 3, 8};
    int i = 0;
    int sum = 0;

    while (i < numbers.length) {
      sum += numbers[i];
      i++;
    }
    System.out.println(sum / numbers.length);
  }
}
