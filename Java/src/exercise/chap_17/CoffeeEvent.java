package exercise.chap_17;

public class CoffeeEvent {
    public static void main(String[] args) {


        //기간에 했는지
        boolean eventTime = true;
        //인스타 팔로우 했는지;
        boolean instarFollow = true;
        //리그램 했는지
        boolean reGram = true;
        //댓글 남겼는지
        boolean commit = true;


        if (eventTime && instarFollow && reGram && commit) {
            System.out.println("이벤트 당첨 ");
        } else {
            System.out.println("이벤트 미 당첨");
        }
    }
}

