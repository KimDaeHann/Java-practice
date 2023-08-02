package exercise.chap_24;

public class MethodExamples {
    //자바에서는 class 안에서 구현을 해야 됨

    //일반적인 입력값, 출력값도 있는 경우
    //둘 다 하나인 경우
    static int toUnicode(char ch){
        //char 타입을 앞에 (int)를 붙인 명시적 변환을 씀으로 써 int로 변한
        return (int) ch;
    }
    // 계산기 생성
    static int sumAndMultiplyFour(int a, int b){
        return (a + b) * 4;
    }

    public static void main(String[] args){
        // char 타입 중 A를 decode
        char ch ='A';
        int decode = toUnicode(ch);
        System.out.println(decode);
        //myInt1, myInt2 로 계산 실행
        int myInt1 = 10;
        int myInt2 = 5;
        int result = sumAndMultiplyFour(myInt1,myInt2);
        System.out.println(result);

        String res = sayHello();
        System.out.println(res);

        printHello("printHello");

        printHi();
    }

    //인자값이 없을 수 있다, 출력값은 있음.
    static String sayHello(){
        return "Hello";
    }
    //인자값이 있으나 출력값은 없는것
    static void printHello(String str){
        System.out.printf("함수 안에서 실행합니다. %s \n",str);
    }
    //인자값도 없고 , 출력값도 없는거
    static void printHi(){
        System.out.println("Hi");
    }

}
