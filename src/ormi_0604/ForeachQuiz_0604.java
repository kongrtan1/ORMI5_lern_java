package ormi_0604;

public class ForeachQuiz_0604 {

  public static void main(String[] args) {
    int sum = 0;

    int [] score = {1,30,20,80,15,20,30,22};
    for (int i : score){
       sum += i;
    }

    double average = (double)sum/score.length;
    System.out.println("합계는 " + sum);
    System.out.println("평균은 " + average);
  }
}
