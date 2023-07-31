package exercise.chap_13;

public class ImplicitCasting1 {

    public static void main(String[] args) {
        //사이즈가 작은 type ->사이즈가 큰 타입 큰 type
        int myInt = 10;
        long myLong = myInt;
        System.out.println(myLong);
    }

}
