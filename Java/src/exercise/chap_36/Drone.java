package exercise.chap_36;

public class Drone implements Flyable{
    //Flyable에 default 값을 설정해서 따로 값을 입력하지 않아도 됨
    public void takePicture(){
        Flyable.printLanding();
        System.out.println("이 드론은 사진을 찍고 있습니다.");
    }
    //속성
    private String droneId;
    private long remainingFuelAmount;
    private long remainingFileStorage;
}
