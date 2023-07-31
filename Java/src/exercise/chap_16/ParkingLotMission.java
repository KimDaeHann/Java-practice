package exercise.chap_16;

public class ParkingLotMission {

    public static void main(String[] args) {
        //파킹
        int payMoney = 100000;
        int parkingTime = 10;

        if (payMoney >= 200_000) {
            parkingTime = parkingTime - 5;

        } else if (payMoney >= 100_000) {
            parkingTime = parkingTime - 4;

        } else if (payMoney >= 50_000) {
            parkingTime = parkingTime - 3;

        } else if (payMoney >= 30_000) {
            parkingTime = parkingTime - 2;

        } else if (payMoney >= 10_000) {
            parkingTime = parkingTime - 1;

        }
        String result = String.format("고객님 %d를 사용했기 때문에 ,%d 시간 결제 하셔야 합니다.", payMoney, parkingTime);
        System.out.println(result);
    }
}



