package ormi_0603.ex;

public class CaseEx3_0603 {

  public static void main(String[] args) {

    char grade = 'C';

    switch (grade) {
      case 'A':
        System.out.println("Excellent");
        break;
      case 'B':
        System.out.println("Good");
        break;
      case 'C':
        System.out.println("Average");
        break;
      case 'D':
        System.out.println("Below Average");
        break;
      default:
        System.out.println("Fail");
    }
  }
}
