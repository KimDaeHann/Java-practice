package exercise.chap_45;


public class WrapperClassTest {

    public static void main(String[] args) {
        //Integer

        Integer integer1 = Integer.valueOf(20); //Int -> Integer boxing
        Integer integer2 = Integer.valueOf(30);

        int int1 = integer1.intValue(); // Unboxing , Integer -> int로 바꿈

        Integer integer3 = 20; //AutoBoxing , new Integer(20);
        int int2 = integer3; //AutoUnboxing,

//        System.out.println(integer1);
//        System.out.println(int1);
//
//        System.out.println(integer3);
//        System.out.println(int2);
//
//        //연산자
//        System.out.println(integer1 + integer2);
//        System.out.println(integer1 + int1);

        //Character
        Character character = new Character('X'); // 'X' charType -> Character 박싱
        char ch1 = character.charValue(); // Character 타입을 char로 언박싱

        Character character1 = 'x';
        char ch2 = character1;

        System.out.println(character);
        System.out.println(ch1);

        Character[] characters = {'a', 'b', 'c'};

        String str = String.valueOf(characters);

        Boolean boolean1 = Boolean.TRUE; // true boolean -> boolean
        boolean b1 = boolean1.booleanValue(); //Unboxing

        Boolean boolean2 = true;
        Boolean b2 = boolean2;
    }
}
