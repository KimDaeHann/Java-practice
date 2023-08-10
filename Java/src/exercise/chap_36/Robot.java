package exercise.chap_36;

public class Robot implements Walkable{

    private String robotID;
    private String modelName;
    private String color;



    @Override
    public void walk() {
        System.out.println("로봇ID "+this.robotID + "걷고 있습니다.");
    }

    public Robot(String robotID) {
        this.robotID = robotID;
    }

    public void helpHuman(Person person){
        String name = person.getName();
        System.out.println("로봇이 인간 " + name + "을 돕습니다.");
    }
}
