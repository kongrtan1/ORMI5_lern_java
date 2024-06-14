package ormi_0612;

public class Test {

    public static void main(String[] args){

       Person person1 =  new Person("지원", 22);
       Person person2 =  new Person("지덕", 11);

       person1.sayHello();
       person1.introduce();

       person2.sayHello();
       person2.introduce();
    }
}
