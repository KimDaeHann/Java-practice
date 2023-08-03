package exercise.chap_28;

public class BirthDay {
    //
    private int year;
    private int mouth;
    private int day;
    //다른 곳으로 접근 할 수 있을 때는 setter

    BirthDay(int year, int mouth, int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }

    //this로 자신의 변수를 지칭
    public void setYear(int year) {
        this.year = year;
    }

    private void printHi() {
        System.out.println("Hi");
    }
}
