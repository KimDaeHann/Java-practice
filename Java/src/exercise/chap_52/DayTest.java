package exercise.chap_52;

public class DayTest {

    public static void main(String[] args) {
        Day monday = Day.MONDAY;
        Day friday = Day.FRIDAY;

        System.out.println(monday);
        System.out.println(monday.getKoreanName());
        System.out.println(friday.getKoreanName());


        Day day = Day.TUESDAY;

        switch (day){
            case MONDAY:
                System.out.println("한 주의 시작 입니다" + day.getKoreanName());
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("오늘은 WTF입니다." + day.getKoreanName());
                break;
            case FRIDAY:
                System.out.println("오늘은 불금 입니다" + day.getKoreanName());
                break;
            case SATURADAY:
            case SUNDAY:
                System.out.println("주말입니다." + day.getKoreanName());
        }
    }
}
