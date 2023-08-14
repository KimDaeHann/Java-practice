package exercise.chap_15;

public class Literal {

    public static void main(String[] args){
        int num = 0b1010; //2진법
        System.out.println(num); // 2 + 2^3 = 8

        int num2 = 0xAC0; //12 * 16 + 10 * 16 ^2 =2752
        System.out.println(num2);

        double myDouble = 5.22E5; //5.22 * 10^5
        System.out.println(myDouble);

        double myDouble2 = 2.55E-3; // 5.22 / 10^3
        System.out.println(myDouble2);

        //null
        String str = null; //레퍼런스 타입
//        int myInt =null; 적용 안됨
        System.out.println(str);

    }
}
