public class ForeachQuiz2_0604 {

  public static void main(String[] args) {
    String[] arr = {"okay2", "asbds", "good2", "ormiiiii", "abcde"};
    for (String i : arr) {
      if (i.length() <= 5) {
        System.out.println(i);
      }
    }
  }
}
