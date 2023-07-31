package exercise.chap_13;

public class ImplicitCasting2 {

    public static void main(String[] args) {
        // + * 사칙연산 Casting
        int myInt = 10;
        double myDouble =55.1;
        //더 큰값으로 정의 해야 됨
        double result1 =myDouble+myInt;
        System.out.println(result1);


        int myInt2 =10;
        long myLong = 20L;
        long result2 = myLong * myInt2;
        System.out.println(result2);

        // "/"
        int number1 = 10;
        int number2 = 3;
        //int는 소수점이 안나옴 즉 소수점을 버림
        int result3 =number1 / number2;
        System.out.println(result3);

        int number3= 10;
        float number4 = 3.0f;

        float result4 = number3 /number4;
        System.out.println(result4);
    }
}
