package exercise.Naver;

//        3. '고객'은 '매장 직원'에게 가격을 얻어낸 후, 자신의 결제 가능 여부를 확인한다.
//        3- 1. 만약 잔액 부족으로 결제 가능하지 않다면, '고객'은 '다음에 올게요'라고 하고 자신의 상태를 말하고 상황이 종료됩니다.
//        4. '고객'이 결제가 가능하다면 '매장 직원'은 Nike 브랜드의 운동화의 재고 여부를 확인합니다.
//        4-1-0: '고객'은 주문 계속 진행합니다.
//        4-1-0: '매장 직원'은 '고객'에게 신발가격 결제를 안내합니다.
//        4-1-1: '고객'은 결제를 진행합니다.
//        4-1-3: '매장 직원'은 운동화를 찾아 '고객'에게 전달합니다.
//        4-1-4: '고객'은 신규 구매한 Nike 브랜드의 운동화를 신고, 운동화의 특징(편안함| 가벼움 등)을 경험하며 기분이 좋아집니다. 자신의 상태를 말하고 상황이 종료됩니다.
//        5. '매장 직원'은 '고객'에게 재고 부족을 안내하고 물품배송 요청 여부를 안내합니다.
//        5-1: 만약 '고객'의 배송 주문을 선호하지 않는 사람일 경우
//        5-1-0: '고객'은 '다음에 올게요'라고 하고 자신의 상태를 말하고 상황이 종료됩니다.
//        6. '고객'의 배송 주문을 선호하는 사람일 경우, '고객'은 주문 계속 진행합니다.
//        6-0:	'매장 직원'은 '고객'에게 신발가격 결제를 안내합니다.
//        6-1: '고객'은 결제를 진행합니다.
//        6-5: '매장 직원'은 배송 예정 소요일자와 배송료를 말해주고, 배송료 + 신발가격을 '고객'에게 전달합니다.
//        6-5-1: 만약 배송료 + 신발가격이 고객의 잔고보다 많은 경우
//        6-5-1-0: '고객'은 신발 가격을 환불 요청합니다.
//        6-5-1-1: '매장 직원'은 신발 가격을 다시 매상에서 빼고, '고객'은 환불 받습니다.
//        6-5-1-2 '고객'은 '다음에 올게요'라고 하고 자신의 상태를 말하고 상황이 종료됩니다.
//        6-5-2: 만약 배송료 + 신발가격이 고객의 잔고보다 많지 않은 경우
//        6-5-2-0: '고객'은 주문 계속 진행합니다.
//        6-5-2-2: '배송 담당자'는 '고객'에게 택배 패키지를 전달합니다.
//        6-5-2-3: '고객'은 '배송 담당자' 에게 배송료를 지불합니다.
//        6-5-2-4: '배송 담당자'는 '자신의 매상'에 돈을 더합니다.
//        6-5-2-5: '고객'은 택배 패키지의 운동화를 신고, 운동화의 특징(편안함| 가벼움 등)을 경험하며 기분이 좋아집니다. 자신의 상태를 말하고 상황이 종료됩니다.
public class Customer {
    //    Customer: 자신의 Cache 와 배송 주문선호 여부\
    //내 돈
    private long cashAmount;



    //내 기분
    private String myFeeling;

    String nikeSneakersFeature = "안정감";



    //1. '고객'은 '매장 직원'에게 "Nike 운동화에 대해 알려주세요"라고 물어봅니다.
    public void askNikeShoes(Staff staff, long NikeShoes) {
        System.out.println("손님: Nike 운동화에 대해서 알려주세요");
    }

    //3. '고객'은 '매장 직원'에게 가격을 얻어낸 후, 자신의 결제 가능 여부를 확인한다.
    public long getAmount(long NikeShoes) {
        return NikeShoes;
    }

    public  void showInFeeling(){
        System.out.println("제 기분은 보통이네요");
    }

    //3- 1. 만약 잔액 부족으로 결제 가능하지 않다면, '고객'은 '다음에 올게요'라고 하고 자신의 상태를 말하고 상황이 종료됩니다.
    public boolean checkMyCashAmount(long NikeShoes) {
        if (NikeShoes < cashAmount) {
            System.out.println("손님: 네 좋네요, 주문 계속 진행 할게요.");
        }
        return false;
    }
    public long getCashAmount() {
        return cashAmount;
    }

    public boolean overShoesPrice(long Nikeshoes){
        if(cashAmount < Nikeshoes ){
            System.out.printf("손님: 아.. 그럼, 다음에 올게요~ %s이고,잔액 %d 남았습니다.",
                    nomailFelling,cashAmount);


        }
        return false;
    }

    //        4. '고객'이 결제가 가능하다면 '매장 직원'은 Nike 브랜드의 운동화의 재고 여부를 확인합니다.
    //        4-1-1: '고객'은 결제를 진행합니다.
//        4-1-0: '고객'은 주문 계속 진행합니다.
    //4-1-0: '매장 직원'은 '고객'에게 신발가격 결제를 안내합니다.
    public long paymentGuide(long money) {
        this.cashAmount -= money;
        return money;
    }

    String nomailFelling ="보통";

    public void upgradeMyFeeling(){
        this.myFeeling = "기분이 좋음";
    }




    //        4-1-4: '고객'은 신규 구매한 Nike 브랜드의 운동화를 신고, 운동화의 특징(편안함| 가벼움 등)을 경험하며 기분이 좋아집니다. 자신의 상태를 말하고 상황이 종료됩니다.
    public void showMyInfo() {
        System.out.printf("손님: 이 신발은 %s 의 특징이 느껴지네요, %s 이고 , 잔액 %d 남았습니다.\n"
                , this.nikeSneakersFeature,this.myFeeling,this.cashAmount);
    }
    public void setCashAmount(long cashAmount) {
        this.cashAmount = cashAmount;
    }

}
