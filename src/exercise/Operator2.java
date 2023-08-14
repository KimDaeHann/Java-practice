package exercise;

public class Operator2 {

    public static void main(String[] args) {
        // > , < , >= , <= , ==

        int num1 = 10;
        int num2 = 20;
        String str1  = "ABC";
        String str2  = "ABC";

        boolean result = num1 > num2;
        boolean result2 = str1 == str2;
        System.out.println(result);
        System.out.println(result2);

        // && || ! 논리 연산자
        boolean condition1 = 5 > 3;
        boolean condition2 = 4 >=4;

        boolean result3 = condition1 && condition2;
        boolean result4 = condition1 || condition2;
        boolean result5 = !(condition1 || condition2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }
}
