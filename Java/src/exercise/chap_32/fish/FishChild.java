package exercise.chap_32.fish;


//부모 객체 상속
public class FishChild extends Fish {
    //자식 클래스에 필드랑 메소드 추가
    protected String leavingSeaChild;
    private boolean eatable;

    FishChild() {
        //자식 클래스는 부모 클래스를 넣지 않았는데
        //super()가 default 로 생성
        super();

    }

    public FishChild(String leavingSea, boolean eatable) {
        super.leavingSea = leavingSea;
        this.eatable = eatable;
    }

    FishChild(String sex, boolean eatable, String leavingSea) {
        //자식 클래스 생성할때 부모 클래스 호출
        super(leavingSea, sex, false, "2022", "2022");
        this.eatable = eatable;
    }

    public void digging() {
        System.out.println(myInfo() + "가 모래를 파고 있습니다.");
    }

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    public void becomeDanger() {
        this.havingPoison = true;
    }

    @Override
        //부모 클래스에 있는걸 재 수정
    void eat(String food) {
        System.out.printf("나, 물고기는 %s를 먹을지 말지 고민중에 있습니다.\n", food);
    }

    void printSea() {
        System.out.println(myInfo() + "는" + this.leavingSeaChild + "바다 출신이고,   " +
                "부모 물고기는" + super.leavingSea + "바다 출신이야.");
    }

    public void setLeavingSeaChild(String leavingSeaChild) {
        this.leavingSeaChild = leavingSeaChild;
    }
}
