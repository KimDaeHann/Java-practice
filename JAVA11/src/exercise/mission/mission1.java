package exercise.mission;

public class mission1 {
    /**
     * Q1)이 티켓 값은 얼마인가?
     * 전문가 4명(Kim,park,Lee,Hong)가 제시하는 적정 티켓 값을 평균을 티켓 값으로
     * 최종 책정 하려고 한다.
     * 각각 제시한 티켓 값 Kim : 3000, Park : 5000, Lee:200 , Hong:2000;
     */
    public static void main(String[] args) {
        int Kim = 3000;
        int Park = 5000;
        int Lee = 2000;
        int Hong = 2000;

        int result = (Kim + Park + Lee +Hong)/4;
        System.out.println(result);
    }
}
