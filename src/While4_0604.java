public class While4_0604 {
  public static void main(String[] args) {
    int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
    int i = 1;
    int max = numbers[0];
    while (i<numbers.length){
      if(max > numbers[i]){
        max=numbers[i];
      }
      i++;
    }
    System.out.println("max: " + max);
  }
}
