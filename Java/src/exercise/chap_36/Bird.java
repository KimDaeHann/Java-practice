package exercise.chap_36;


//인터페이스 추가
public class Bird extends Animal implements Flyable{
    private long weight;
    private String color;

    @Override
    public void eat(String food) {
        System.out.printf("새가 %s 을 부리로 쪼아 먹고 있습니다.\n", food);
    }

    @Override
    public void sleep() {
        System.out.println("새가 잠을 자고 있습니다.");
    }
    @Override
    public void fly() {
        System.out.println("새가 날고 있습니다.");
    }
}
