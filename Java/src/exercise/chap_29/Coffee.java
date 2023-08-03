package exercise.chap_29;

//6.'바리스타'는 물 500ml와 원두 '30g'로 '아메리카노 커피' 만든다.
//8.'캐시어'는 '아메리카노 커피'를 테이크 아웃용으로 포장한다.

public class Coffee {
    //속성
    private String coffeeName;
    private long waterQuantity; //ml 단위
    private long coffeeBeanQuantity; //원두의 양 g
    private boolean isWrappedUp; // 포장됨 여부


    //행위  기본적으로 isWrappedUp이 false 로 되어있는데 beWrappedUp 함수를 쓰게 되면
    //포장이 되어지는것이 확인이 됨
    void beWrappedUp(){
        this.isWrappedUp=true;
    }

    public boolean isWrappedUp() {
        return isWrappedUp;
    }

    //생성자
    Coffee(String coffeeName , long waterQuantity, long coffeeBeanQuantity){
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        isWrappedUp = false; //기본적으로 포장 되어 나오지 않기 때문

    }
    //커피 이름을 가져 와야 하기때문에 Getter 생성
    public String getCoffeeName() {
        return coffeeName;
    }
}
