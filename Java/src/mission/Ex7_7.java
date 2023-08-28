package mission;

class Ex7_7 {
    public static void main(String args[]) {
        Car car = new Car();
        FireEngine fe = (FireEngine)car;  //실제 인스턴스가 무엇인지가 중요
        fe.water();

        FireEngine fe2 = null;
        Car car2 =(Car) null;
        //객체가 null인 경우에도 형 변환 아무 ~ 문제 없음 그러나 값은 실행하면 nullpointException 발생
        car2.drive(); //null.drive() 하는 꼴임

        fe.water();
        //생략 가능 (자식이 부모 집 갈때는 그냥 변환 생략하고 됨)
        car = fe;
//    car.water(); 컴파일 에러 Car타입(조상)참조변수로는 water(자식참조변수) 호출 x
        //생략 불가 (자식이란 놈이 자식 집에 부모 왔는데 도어락 설치해서 입력하고 가야 됨 )


        fe2 = (FireEngine) car; //자손타입 <- 조상타입 형 변환 생략 불가
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() { //운전 하는 기능
        System.out.println("drive, Brrrr~");
    }
    void stop () {
        System.out.println("stop");
        }
    }


//자식           //부모
class FireEngine extends Car { //소방차
    void water() {
        System.out.println("water!!");
    }
}
