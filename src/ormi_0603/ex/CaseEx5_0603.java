package ormi_0603.ex;

public class CaseEx5_0603 {

  public static void main(String[] args) {
    char grade = ' ';
    int score=60;
    switch (score / 10) {
      case 10:
      case 9:
        grade = 'A';
        break;
      case 8:
        grade = 'B';
        break;
      case 7:
        grade = 'C';
        break;
      case 6:
        grade = 'D';
        break;
      default:
        grade = 'F';
    }

    System.out.println(grade);
  }
}
