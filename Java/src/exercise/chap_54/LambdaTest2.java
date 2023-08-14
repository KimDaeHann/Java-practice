package exercise.chap_54;

public class LambdaTest2 {
    public static void main(String[] args) {
        MultipleNum multipleNum = num -> num * 1;

        int i = 100;

        StringNum stringNum2 = (str, num) -> {
            //내부 클래스는 밖에 영향을 끼칠수없음
            for (int i1 = 0; i1 < num; i1++)
                System.out.println("stringNum2: " + str);

        };
    }
}
