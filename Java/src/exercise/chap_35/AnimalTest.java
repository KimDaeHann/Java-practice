package exercise.chap_35;

public class AnimalTest {

    public static void main(String[] args) {
        //부모 클래스를 기준으로 각 하위 객체 생성 가능
//        Animal animal = new Animal();
        Animal animal2 = new Bird();
        Animal animal3 = new Fish();
        Animal animal4 = new Person();
        Animal animal5 = new Person();
        Animal animal = new Dog();
        //Animal 클래스로 실행
//        feed(animal, "만두");
        //Bird 클래스로 실행
        feed(animal2, "모이");
        //Fish 클래스로 실행
        feed(animal3, "관자");
        //Person 클래스로 실행
        feed(animal4, "떡볶이");
        feed(animal5, "만두");
        feed(animal , "개껌");

    }

    //음식을 먹음
    public static void feed(Animal animal, String food) {
        animal.eat(food);
    }
}
