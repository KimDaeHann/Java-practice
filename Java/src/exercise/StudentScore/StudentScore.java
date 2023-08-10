package exercise.StudentScore;

public class StudentScore {

    //static
    private static int serialIndex;
    //serialIndex는 static 변수로 선언되어야 모든 학생들이 공유합니다.
    //학생 객체가 생성될 때마다 1씩 증가합니다.
    private static int[] allScores;
    //Arrays.copyOf 라는 함수를 사용하면 배열의 크기를 늘리는데 유용합니다.
    //allScores 배열은 static 변수로 선언되어야 모든 학생들의 점수를 공유할 수 있습니다.
    //static 변수들은 static method로 호출되어야 정상적으로 다룰 수 있습니다.

    private int myIndex;
    private int score;
    //        MyIndex와 SerialIndex는 allScores의 값을 수정할 때 유용하게 쓰일 수 있습니다.
    public static int[] getAllScores() {
        serialIndex++;
        return allScores;

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        // 변경된 시험점수
    }

    public StudentScore(int score) {
        // TODO: 구현 부분 만약 학생 한명이 추가 되면 점수 하나 추가

    }

    private static void addAllScore(int score) {
        // TODO: 구현 부분
    }
}
//학생들이 아무도 없을 때, 전체 시험 점수: null
//학생이 한명 추가 되었을 떄, 전체 시험 점수: [85]
//여러 명 추가후 전체 시험 점수: [85, 90, 77]
//변경된 전체 시험 점수: [95, 88, 55]
//추가후 전체 시험 점수: [95, 88, 55, 20]
//Student1 점수: 95
//Student2 점수: 88
//Student3 점수: 55
//Student4 점수: 20

