package exercise.chap_24;

public class Scores {

    public static void main(String[] args) {
        //A class 학생들 점수
        int studentAClass1 = 50;
        int studentAClass2 = 30;
        int studentAClass3 = 45;

        //B class 학생들 점수
        int studentBClass1 = 60;
        int studentBClass2 = 65;
        int studentBClass3 = 66;

        //Average

        //이 방식이 아닌
        int sumAClass = studentAClass1 + studentAClass2 + studentAClass3;
        //이 방식으로 사용하면 언제든지 재사용 가능
        double averageAClass = calculateAverage(studentAClass1, studentAClass2, studentAClass3);

        //B class
        //이 방식이 아닌
        int sumBClass = studentBClass1 + studentBClass2 + studentBClass3;

        //이 방식으로 사용하면 언제든지 재사용 가능
        double averageBClass = calculateAverage(studentBClass1, studentBClass2, studentBClass3);
        // %.2f = 소수점 2의 자리 까지 나타내라
        System.out.printf("A 학급의 평군 점수는 %.2f, B 학급의 평균은 %.2f\n"
                , averageAClass, averageBClass);

    }

    //calculateAverage 함수의 정의 만듬
    static double calculateAverage(
            int studentScore1, int studentScore2, int studentScore3) {
        int sumClass = studentScore1 + studentScore2 + studentScore3;
        return sumClass / (double) 3;
    }
}
