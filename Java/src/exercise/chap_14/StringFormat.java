package exercise.chap_14;

public class StringFormat {

    public static void main(String[] args) {
        //String 생성 방식
        String str1 = "Happy";
        String str2 = String.valueOf(123);

        System.out.println(str1);
        System.out.println(str2);

        //String 1
        String result;
        //s 소문자 S 대문자로 바뀌어서 나옴
        result = String.format("문자 서식: %s , %S",str1,str1); //s는 스트링이라는뜻
        System.out.println(result);

        //Int
        int myInt = 10;
        result =String.format("정수 서식: %05d" , myInt); //%05d :5자리 숫자로 표현 %d값에 myInt값 들어감
        System.out.println(result);

        float myFloat = 12.4984890f;
        result=String.format("실수 서식: %f, %.1f, %.2f ,%.3f", myFloat,myFloat,myFloat,myFloat);
        System.out.println(result);

    }
}
