package exercise.chap_17;

public class park {
    public static void main(String[] args) {
        int parkingTime=10;
        int payMoney=200000;

        if (payMoney >= 200000) {
            parkingTime = parkingTime - 6;
        } else if (payMoney >= 150000) {
            parkingTime = parkingTime - 5;
        } else if (payMoney >= 100000) {
            parkingTime = parkingTime - 4;
        } else if (payMoney >= 50000) {
            parkingTime = parkingTime - 3;
        }
        System.out.printf("고객님은 %s 원을 사용 하셔서 %s만큼 시간을 결제 하셔야 됩니다.",payMoney,parkingTime);

    }
}
