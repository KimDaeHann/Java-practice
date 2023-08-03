package exercise.chap_29;


//2.'캐시어'는 '아메리카노'가 얼마인지 확인해서 / 가격을 답변해준다.
//4.'캐시어'는 '자신의 매상'에 돈을 더하고, 아메리카노 주문을 알린다.
//8.'캐시어'는 '아메리카노 커피'를 테이크 아웃용으로 포장한다.
//9.'캐시어'는 '아메리카노 커피'준비 완료를 알린다.
//※ 가격표 : 아메리카노 5천원 , 카페라떼 6천원 , 카페모카 6500원 , 카푸치노 6천원

public class Cashier {

    //속성

    private long salesAmount;

    //행위
    // 커피 가격 확인
    //가격을 반환 하기에 long 금액을 확인 하는 로직
    public long checkCoffeePrice(String coffeeName){
        long price;
        switch (coffeeName){
            case "아메리카노":
                price = 5000;
                break;
            case "카페라떼":
                price = 6000;
                break;
            case "카페모카":
                price = 6500;
                break;
            case "카푸치노":
                price = 6000;
                break;
            default:
                price = 0;
                break;
        }
        return price;
    }

    // price == 0인 뜻은 위에 메뉴가 없을때를 가정 답변
    public void replyCoffeePrice(String coffeeName ,long price){
        if(price == 0){
            System.out.println("캐시어 : 죄송합니다 손님 말씀하신 메뉴:" + coffeeName + "는 저희 매장엔 없습니다.");
        }
        System.out.println("캐시어: 말씀하신 커피" + coffeeName +"은 가격이" + price + "입니다.");
    }
    //주문을 알린다
    public void addAmount(long money){
        this.salesAmount += money;
    }
    //coffee 이름을 알려야 하기 때문에 coffeeName 사용
    public void sayOrder(String coffeeName){
        System.out.println("캐시어 : 커피 " + coffeeName +"주문이 들어 왔습니다.");
    }
    //'커피'를 포장 하기때문에 Coffee 객체 사용
    public Coffee warpUpCoffee(Coffee coffee){
        coffee.beWrappedUp();
        return coffee;
    }
    //매상 디폴트 값이 0이기 때문에 Setter 생성
    public void setSalesAmount(long salesAmount) {
        this.salesAmount = salesAmount;
    }

    //'커피'가 준비 완료 됐기 때문에 Coffee coffee 사용
    public void sayCoffeeReady(Coffee coffee){
        String coffeeName = coffee.getCoffeeName();
        System.out.println("캐시어: 주문 하신 커피" + coffeeName + "가 준비 완료 되었습니다.");
    }
}
