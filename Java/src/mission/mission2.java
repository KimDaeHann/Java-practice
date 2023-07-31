package mission;

/**
 *티켓이 625장 있다. 인당 가질수 있는 티켓은 3장이다.
 *티켓을 나눠줬을때 최대 몇명한테 나눠줄 수 있고 또 몇장이 남는가
 */

public class mission2 {

    public static void main(String[] args) {
        int ticket = 625;
        int person = 3;

        int result =ticket/person;
        int result2 =ticket%person;

        System.out.println(result);
        System.out.println(result2);
    }
}
