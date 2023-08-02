package exercise.chap_25;
//Fish라는 객체 생성
public class Fish {
    //속성
    String sex; //"Male" , "Female"
    boolean havingPoison; // true 독 O , false 독 X
    String StartSpawningDate; // 산란 시작 시각
    String endSpawningDate; //산란 종료 시각
    String leavingSea; //사는 속성

    //행위
    //반환 값이 없을때는 void
    void eat(String food){
        System.out.printf("나, 물고기는 %s를 먹고 있습니다.\n",food);
    }
    void swim(int meter){
        // + 를 해서 표시 가능
        System.out.println("나는 헤엄칩니다 미터: " + meter);
    }
    void makeCrowd(Fish otherfish){
        System.out.println("나는 다른 물고기와 무리짓습니다.");
    }
    void  sleep(){};
}
