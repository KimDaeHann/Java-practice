package exercise.chap_36;

public class Person extends Animal implements Walkable {
    private String name;
    private String job;
    private int height;


    @Override
    public void eat(String food) {
        System.out.printf("사람이 %s 을 수저를 이용하여 먹습니다.\n", food);
    }

    @Override
    public void sleep() {
        System.out.println("사람이 잠을 잡니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void walk() {
        System.out.println("사람이 걷습니다.");
    }
}
