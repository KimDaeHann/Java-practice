package exercise.chap_36;


//추상 클래스 만들기
public abstract class  Animal {
    //속성
    protected String gender;

    //행위
    //구현이 됐던 것들이 구현이 안되게함
    //나머지 상속 받은 애들이 구현 하도록 설정이 됨
    public abstract void eat(String food);

    public abstract void sleep();
}
