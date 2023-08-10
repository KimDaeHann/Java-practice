package exercise.chap_36;

public class InterfaceTest2 {
    public static void main(String[] args) {

        //Drone
        Flyable drone = new Drone();
        Flyable airplane = new Airplane("AB010");
        //드론 값을 따로 설정하지 않았기때문 default 값이 나옴
        drone.fly();

        airplane.fly();

        if(drone instanceof Drone){
            Drone drone2 = (Drone) drone;
            drone2.takePicture();
        }
    }
}
