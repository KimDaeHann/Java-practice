package exercise.Naver;

public class OrderSneakersSituation {

    public static void main(String[] args){
        // 변수 변경 가능
        Customer customer = new Customer();
        Staff staff = new Staff();

        // Customer 의 잔액, DeliveryManager 매상, Staff 매상은 모두 10만원 시작 입니다.
        customer.setCashAmount(100_000);
        staff.setStaffCashAmount(100_000);
        long nikeSneakersPrice= 50_000;
        boolean havingNikeSneakersInStore=true;
        String nikeShoes = "운동화";
        boolean isCustomerLikeDelivery = false; // 고객의 배송 주문 선호 여부
        String nikeSneakersFeature = "안정감"; // 안정감 | 편안함 | 가벼움 등 신발 특징
        int daysForDeliver = 3;
        int costForDeliver = 15_000;

        //1. '고객'은 '매장 직원'에게 "Nike 운동화에 대해 알려주세요"라고 물어봅니다.
        customer.askNikeShoes(staff , nikeSneakersPrice);

        //2. '매장 직원'은 Nike 운동화를 확인하고, 해당 운동화의 특징(편안함|가벼움 등)과 가격을 자세히 설명해줍니다.
        staff.checkNikeShoes(nikeShoes,nikeSneakersPrice);
        long nikeShoesInfo = staff.NikeShoesInfo;

        //3. '고객'은 '매장 직원'에게 가격을 얻어낸 후, 자신의 결제 가능 여부를 확인한다.
        customer.getAmount(nikeSneakersPrice);
        //3- 1. 만약 잔액 부족으로 결제 가능하지 않다면, '고객'은 '다음에 올게요'라고 하고 자신의 상태를 말하고 상황이 종료됩니다.
        if (customer.getCashAmount()<nikeSneakersPrice){
            customer.overShoesPrice(nikeSneakersPrice);
            return;
        } else if ( customer.getCashAmount()>nikeSneakersPrice) {
            customer.checkMyCashAmount(nikeSneakersPrice);
            staff.checkHavingShoes(havingNikeSneakersInStore);
            return;
        }

        // 4. '고객'이 결제가 가능하다면 '매장 직원'은 Nike 브랜드의 운동화의 재고 여부를 확인합니다.
//        staff.checkHavingShoes(havingNikeSneakersInStore);
        //4-1-0: '매장 직원'은 '고객'에게 신발가격 결제를 안내합니다.
        long cash = customer.paymentGuide(50000);
        customer.paymentGuide(cash);
        //4-1-2: '매장 직원'은 자신의 매상에 돈을 더합니다.
        staff.addAmount(nikeSneakersPrice);
        //4-1-3: '매장 직원'은 운동화를 찾아 '고객'에게 전달합니다.
        staff.shoesDelivery(nikeShoes);
        //4-1-4: '고객'은 신규 구매한 Nike 브랜드의 운동화를 신고, 운동화의 특징(편안함| 가벼움 등)을 경험하며 기분이 좋아집니다. 자신의 상태를 말하고 상황이 종료됩니다.
        customer.upgradeMyFeeling();
        customer.showMyInfo();
        // TODO: 클래스를 선언하고, 객체간의 협력으로 구현해주세요.
    }
}