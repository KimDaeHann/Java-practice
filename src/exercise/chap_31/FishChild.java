package exercise.chap_31;


//부모 객체 상속
public class FishChild extends Fish {
    //자식 클래스에 필드랑 메소드 추가

    private boolean eatable;

    public void digging(){
        System.out.println(myInfo() + "가 모래를 파고 있습니다.");
    }

    public boolean isEatable() {
        return eatable;
    }
    public void becomeDanger(){
        this.havingPoison = true;
    }
    @Override //부모 클래스에 있는걸 재 수정
    void eat(String food){
        System.out.printf("나, 물고기는 %s를 먹을지 말지 고민중에 있습니다.\n", food);
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }
}
