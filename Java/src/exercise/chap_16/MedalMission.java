package exercise.chap_16;

public class MedalMission {
    public static void main(String[] args) {
       //swich문 메달 수여

        int myRank=1 ;
        String medal;


        switch(myRank) {
            case 1:
                medal = "금메달";
                break;
            case 2:
                medal = "은메달";
                break;
            case 3:
                medal = "동메달";
                break;
            default:
                medal = "메달 없음";
        }
        String result = String.format("선수님의 메달 색깔은 %S 입니다.",medal);
        System.out.println(result);
    }
}
