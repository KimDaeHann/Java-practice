package exercise.chap_28;

public class ThisTest {

    public static void main(String[] args) {
        //

        Person person1 = new Person("노진구");
        Person person2 = new Person("퉁퉁이", "male");
        Person person3 = new Person("이슬이", "female", 30);

        person1.showMySelf();
        person2.showMySelf();
        person3.showMySelf();

        Person person11 = person1.returnMySelf();
        Person person22 = person2.returnMySelf();

        //각각 메모리값 주소를 나타냄
        //exercise.chap_28.Person@12843fce
        //exercise.chap_28.Person@3dd3bcd
        System.out.println(person11);
        System.out.println(person22);
    }
}
