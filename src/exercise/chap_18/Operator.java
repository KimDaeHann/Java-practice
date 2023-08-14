package exercise.chap_18;

public class Operator {
    public static void main(String[] args){

        //+= *=
        int myInt =5;
        myInt *= 10;
        System.out.println(myInt);

        //단항 연산자 ++
        int myInt2 =10;
        myInt2++;
//        System.out.println(myInt2);
        //명령 구문 후 ++값이 실행 =11;
//        System.out.println(myInt2++);
        //명령 구문 전 ++값이 실행 = 12
        System.out.println(++myInt2);
    }
}
