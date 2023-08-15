package exercise.chap_13;

import java.sql.SQLOutput;

public class ExplicitCasting {


    public static void main(String[] args) {
        //더 정밀한 타입 -> 덜 정밀한 타입
        float myFloat = 5.55f;
        int myInt =(int) myFloat;
        System.out.println(myInt);

        //Size 큰 -> Size 작은
        int myInt2 = 600;
        //byte로 바뀌면서 600이 나와야 하질 않고 88이 나옴
        byte myByte = (byte) myInt2;
        System.out.println(myByte);

        int myInt3 = 120;
        //byte로 바뀌면서 byte 범위 값 안이기 때문에 120이 나옴
        byte myByte2 = (byte) myInt3;
        System.out.println(myByte2);

        //연산 "+"
        double myDouble1 =5.5;
        double myDouble2 =3.7;
        //int가 씌어지고 강제적명시가 되어서 소수점 버리게 됨
        int result = (int) myDouble2 +(int) myDouble1;
        //먼저 괄호 치고 강제적 명시 하면 5.5+3.7 = 9.x 나옴 int 이기 때문 소수점 삭제
        int result2 = (int) (myDouble2 + myDouble1);
        System.out.println(result);
        System.out.println(result2);


    }

}
