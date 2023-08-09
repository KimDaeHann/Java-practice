package exercise.chap_31;

//Fish라는 객체 생성
public class Fish {
    String leavingSea; //사는 속성
    //속성 , 정보 은닉화
    private String sex; //"Male" , "Female"
    protected boolean havingPoison; // true 독 O , false 독 X
    private String StartSpawningDate; // 산란 시작 시각
    private String endSpawningDate; //산란 종료 시각

    //행위
    //반환 값이 없을때는 void
    void eat(String food) {
        System.out.printf("나, 물고기는 %s를 먹고 있습니다.\n", food);
    }

    void swim(int meter) {
        // + 를 해서 표시 가능
        System.out.println("나는 헤엄칩니다 미터: " + meter);
    }

    void makeCrowd(Fish otherfish) {
        System.out.println("나는 다른 물고기와 무리짓습니다.");
    }

    /**
     * 다른 클래스가 이 클래스에 메소드가 필요 할 때 는 setter 생성
     */
    public void setLeavingSea(String leavingSea) {
        this.leavingSea = leavingSea;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setHavingPoison(boolean havingPoison) {
        this.havingPoison = havingPoison;
    }

    public void setStartSpawningDate(String startSpawningDate) {
        StartSpawningDate = startSpawningDate;
    }

    public void setEndSpawningDate(String endSpawningDate) {
        this.endSpawningDate = endSpawningDate;
    }
    String myInfo(){
        return String.format("물고기(sex=%s, havingPoison=%b , leavingSea=%s)\n",
                this.sex , this.havingPoison , this.leavingSea);
    }
    //독성 여부 확인 생성자 생성
    public boolean isHavingPoison() {
        return havingPoison;
    }

    //myInfo 호출 생성
    void printMyInfo(){
        System.out.println(myInfo());
    }
    void sleep() {};
}
