package exercise.chap_29;

//1.'손님'은 '캐시어'에게 아메리카노가 얼마인지 물어본다.
//2.'캐시어'는 '아메리카노'가 얼마인지 확인해서 가격을 답변해준다.
//3.'손님'은 '자신의 현금'에서 돈을 빼서 아메리카노를 '테이크 아웃'으로 주문한다.
//4.'캐시어'는 '자신의 매상'에 돈을 더하고, 아메리카노 주문을 알린다.
//5.'바리스타'는 아메리카노 주문 확인을 알린다.
//6.'바리스타'는 물 500ml와 원두 '30g'로 '아메리카노 커피' 만든다.
//7.'바리스타'는 '아메리카노 커피' 완성을 알린다.
//8.'캐시어'는 '아메리카노 커피'를 테이크 아웃용으로 포장한다.
//9.'캐시어'는 '아메리카노 커피'준비 완료를 알린다.
//10.'손님'은 '아메리카노 커피'를 마시고 자신의 기분이 좋아진다 .

//손님 현금 : 50_000;
//매상 : 1_000_000;
public class CoffeeShopSituation {

    public static void main(String[] args) {
        //손님 , 캐시어 ,바리스타 를 미리 인스턴스화
        //미리 초기화
        //Customer 객체 생성
        Customer customer = new Customer();
        //손님 현금
        customer.setCashAmount(50_000);
        //Cashier 객체 생성
        Cashier cashier = new Cashier();
        //매상
        cashier.setSalesAmount(1_000_000);
        //Barista 객체 생성
        Barista barista = new Barista();

        //로직 시작
        //손님은 캐시어에게 아메리카노가 얼만지 물어봄
        String coffeeName = "아메리카노";
        boolean isTakeOut = true;
        customer.askCoffee(cashier, coffeeName);

        //캐시어는 아메리카노가 얼마인지 확인해서 가격 답변
        long price = cashier.checkCoffeePrice(coffeeName);
        cashier.replyCoffeePrice(coffeeName, price);

        //'손님'은 '자신의 현금'에서 돈을 빼서 아메리카노를 '테이크 아웃'으로 주문한다.

        long cash = customer.withDrawCash(price);
        customer.orderCoffee(coffeeName, isTakeOut);

        //캐시어'는 '자신의 매상'에 돈을 더하고, 아메리카노 주문을 알린다.

        cashier.addAmount(cash);
        cashier.sayOrder(coffeeName);

        //5.'바리스타'는 아메리카노 주문 확인을 알린다.
        barista.noticeOrder(coffeeName);

        //6.'바리스타'는 물 500ml와 원두 '30g'로 '아메리카노 커피' 만든다.
        //바리스타가 커피를 만듦
        Coffee coffee = barista.makeupCoffee("아메리카노", 500, 30);

        //'바리스타'는 '아메리카노 커피' 완성을 알린다.
        barista.sayCoffeeReady(coffee);

        //캐시어'는 '아메리카노 커피'를 테이크 아웃용으로 포장한다.
        Coffee coffeeCompleted = cashier.warpUpCoffee(coffee);
        cashier.sayCoffeeReady(coffeeCompleted);
        //완료 된 커피를 손님이 먹음
        //만약 완성 된 커피하고 포장된 커피가 같으면 테이크아웃 해감
        customer.drinkCoffee(coffeeCompleted);
        if (coffeeCompleted.getCoffeeName() == coffeeName &&
                coffeeCompleted.isWrappedUp() == isTakeOut) {
            //먹고 기분이 좋아짐
            customer.upgradeMyFeeling();
        }
        customer.showMyInfo();

    }
}
