package exercise.chap_35;

public class Fish extends Animal {
    //속성
    private boolean havingPoison;
    private String livingSea;

    @Override
    public void eat(String food) {
        System.out.printf("물고기가 주둥이로 %s 을 먹습니다.\n", food);
    }

    @Override
    public void sleep() {
        System.out.println("물고기가 잠을 잡니다.");
    }

    public void swim() {
        System.out.println("물고기가 수영을 합니다.");
    }
}
