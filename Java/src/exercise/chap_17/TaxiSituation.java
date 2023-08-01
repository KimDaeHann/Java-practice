package exercise.chap_17;

public class TaxiSituation {

    public static void main(String[] args) {
        //
        int goHomeTime=3;//시외 0~4 ;
        int timeOutMoney = 15_000; // 10% 할증
        String location ="경기"; //위치 경기지역부터 할증

        if(0< goHomeTime && goHomeTime <4){
            timeOutMoney =timeOutMoney +(int) (timeOutMoney * 0.2);
        }
        if (location!="서울"){
            timeOutMoney =timeOutMoney +(int) (timeOutMoney * 0.2);
        }
        String result = String.format("고객님이 내실 금액은 %s입니다.",timeOutMoney);
        System.out.println(result);


    }
}
