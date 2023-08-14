package exercise.chap_29;

//1.'손님'은 '캐시어'에게 아메리카노가 얼마인지 물어본다.
//3.'손님'은 '자신의 현금'에서 돈을 빼서 / 아메리카노를 '테이크 아웃'으로 주문한다.
//10.'손님'은 '아메리카노 커피'를 마시고 자신의 기분이 좋아진다 .


public class Customer {
    //내가 가지고 있는 돈
    private long cashAmount;
    //내 기분
    private String myFeeling;

    //행위
    //커피 가격 물어봄      //캐쉬어 에게 커피 이름을  물어봐야 되기 때문에
    public void askCoffee(Cashier cashier, String coffeeName) {
        System.out.println("손님: 커피" + coffeeName + " 얼마인가요?");
    }

    //자신의 현금에서 돈을 뺌
    public long withDrawCash(long amount) {
        this.cashAmount -= amount;
        return amount;
    }

    //커피를 테이크아웃으로 주문
    public void orderCoffee(String coffeeName, boolean isWrappedUp) {
        System.out.println("손님:커피" + coffeeName + "을 주문할게요" +
                "단, 포장 여부는" + isWrappedUp + "으로 부탁드려요.");
    }

    //아메리카노 마심
    public void drinkCoffee(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.println("손님:나는 커피" + coffeeName + "을 마신다.");
    }

    //기분이 좋아짐
    public void upgradeMyFeeling() {
        this.myFeeling = "기분이 좋아짐";
    }

    public void showMyInfo() {
        System.out.printf("손님: 지금 나의 기분은 %s 이고 ,현제 제 현금은 %d 있습니다"
                , this.myFeeling, this.cashAmount);
    }

    public void setCashAmount(long cashAmount) {
        this.cashAmount = cashAmount;
    }
}
