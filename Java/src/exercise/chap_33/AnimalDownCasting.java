package exercise.chap_33;

public class AnimalDownCasting {

    public static void main(String[] args) {
        //다운 캐스팅 확인 실험

        Animal animal = new Bird();
        checkBirdAndFly(animal);


        Animal animal1 = new Animal();
        checkBirdAndFly(animal1);
        //Person으로 만들고 Bird로 형 변환하면 안됨
        //이런 에러들은 실행하기 전 까지는 잡을 수 없음 (Runtime Error)
        Animal animal2 = new Person();
        checkBirdAndFly(animal2);
    }

    static void checkBirdAndFly(Animal animal) {
        //Bird가 맞는지 instanceof 를 통해 확인 맞으면 Bird.fly() 실행
        //아니면  System.out.println("너는 새가 아니다.") 실행
        if (animal instanceof Bird) {
            Bird bird = (Bird) animal;
            bird.fly();
        } else {
            System.out.println("너는 새가 아니다.");
        }
    }
}
