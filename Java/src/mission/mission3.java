package mission;

public class mission3 {
    /**
     * 한국 박물관에 입장 할 예정인 Alice , Kim , Yoo 가 있다.
     * 한국 박물관 할인을 받으려면 나이는 65살 이어야 하고 국적은 한국이어야 한다.
     * 위 세명 중 할인을 받을 수 있는 사람은 누구인가?
     * Alice 나이 = 70 , 국적 =미국
     * Kim 나이 = 65 , 국적 = 한국
     * Yoo 나이 =42 , 국적 = 한국
     */

    public static void main(String[] args) {
        final int Senior_Age_Standard = 65;

        int Alice = 70;
        int Kim =65;
        int Yoo = 42;


        String AliceCountry ="미국";
        String KimCountry ="한국";
        String YooCountry ="한국";

        boolean result = (AliceCountry=="한국") && (Alice >= Senior_Age_Standard);
        boolean result2 = (KimCountry =="한국") && (Kim >= Senior_Age_Standard);
        boolean result3 = (YooCountry =="한국") && (Yoo >= Senior_Age_Standard);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);

    }
}
