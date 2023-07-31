package exercise;

public class Operator1 {

    public static void main(String[] args){
        //대입 연산자
        int a = 10;
        int b = a;
        int c = b;
        System.out.println(c);

        //+ - 부호 연산자
        int positive3 = 3;
        int negative3 = -3;
        System.out.println(positive3);
        System.out.println(negative3);

        //+ - * / % 산술 연산자
        int num1 = 10;
        int num2 = 5;
        int num3 = 40;
        int result = num1 + num2 ;
        int result2 = num1 - num2 ;
        int result3 = num1 * num2 ;
        int result4 = num1 / num2 ;
        int result5 = num1 % num2 ;
        int result6 = (num1 + num2) * num3;
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        //0으로 / % 하게 되면 에러가 뜸
    }
}