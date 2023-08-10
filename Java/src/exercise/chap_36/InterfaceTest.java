package exercise.chap_36;

public class InterfaceTest {
    public static void main(String[] args) {

        //속성
        //인스턴스화를 안해도 클래스로 호출이 가능
        //알아서 static final 이 정의됨
        System.out.println(Flyable.atmosphereLimit);

        //Flyable
        Flyable bird = new Bird();
        Flyable airplane = new Airplane("AB101");

        bird.fly();
        airplane.fly();

        Walkable person = new Person();
        Person person2 = new Person();
        Walkable robot = new Robot("Code-name : Toy-Story");
        person2.setName("빵빵이");


        person.walk();
        robot.walk();
        //다운캐스팅
        //원래 로봇이였냐 ! 로봇2로 다운캐스팅!
        if(robot instanceof Robot){
            Robot robot2 =(Robot) robot;
            robot2.helpHuman(person2);
        }
    }
}
