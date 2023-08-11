package exercise.chap_44;

public class StringEqualsTest {

    public static void main(String[] args) {
        String str1 = "Cat";
        String str2 = "Cat";

        System.out.println(str1 == str2 );      //메모리값이 같음
        System.out.println(str1.equals(str2) );//메모리값이 같음

        String str3 = new String("Cat");
        String str4 = new String("Cat");


        System.out.println(str3.equals(str4)); //String 값은 같음
        System.out.println(str3 == str4) ; //new 로 정의 했기 때문에 heap 메모리에 이미
        //  저장되어있음

        //str1 , str3
        System.out.println(str3.equals(str1));
        System.out.println(str3 == str1); //str3는 heap메모리에 만들어졌고 ,str1는 상수풀에 만들어져있음

    }
}
