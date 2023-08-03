package exercise.chap_29;

//5.'바리스타'는 아메리카노 주문 확인을 알린다.
//6.'바리스타'는 물 500ml와 원두 '30g'로 '아메리카노 커피' 만든다.
//7.'바리스타'는 '아메리카노 커피' 완성을 알린다.


public class Barista {
    //속성

    //행위
    //커피 주문 알린다
    public void noticeOrder(String coffeeName) {
        System.out.println("바리스타: 커피 주문 확인 했습니다 커피: " + coffeeName);
    }

    //커피를 만든다.
    public Coffee makeupCoffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity) {
        Coffee coffee = new Coffee(coffeeName, waterQuantity, coffeeBeanQuantity);
        return coffee;
    }

    //커피 이름을 가져와야 하기 때문에 get
    public void sayCoffeeReady(Coffee coffee) {
        String coffeeName = coffee.getCoffeeName();
        System.out.println("바리스타: 커피 제작이 완료 되었습니다. 커피:" + coffeeName);
    }

}
