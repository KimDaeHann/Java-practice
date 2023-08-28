package exercise.JavasClassic;

public class Lambda {
    public static void main(String[] args) {
//     Object obj = (a , b) -> a > b ? a : b; // 람다식 . 익명객체
//        MyFunction2 myFunction2 = new MyFunction2() {
//         public int max(int a, int b) { //오버라이딩 - 접근제어자는 좁게 못바꿈 즉  default > public
//                return a > b ? a : b;
//            }
//        };
        //람다식을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다
        MyFunction2 f = (a, b) -> a > b ? a : b; //object 타입은 max라는 메소드가 없음
//        //이 때 필요한게 함수형 인터페이스

        int value = f.max(3, 5);
        System.out.println("value: " + value);
    }


    @FunctionalInterface //함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함
    interface MyFunction2 {
        public abstract int max(int a, int b);


    }
}
