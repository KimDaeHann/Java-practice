package exercise.chap_31;

public class SeaSituation {

    //FishChild 에 아무것도 없음에도 호출이 됨

    public static void main(String[] args){
        //부모 클래스 new Fish 생성
        Fish fish1 =new Fish();
        fish1.setSex("Male");
        fish1.setLeavingSea("동해");
        fish1.setHavingPoison(false);

        //자식 클래스 new FishChild 생성
        FishChild fish2 =new FishChild();
        fish2.setSex("Female");
        fish2.setLeavingSea("서해");
        fish2.setHavingPoison(false);

        fish1.printMyInfo();
        fish2.printMyInfo();
        //자식 클래스 fish2 는 digging,eatable 이 호출이 되나
        //부모 클래스 fish 는 digging,eatable 이 호출이 안됨
        fish2.digging();
        fish2.setEatable(true);
        fish2.becomeDanger();
        System.out.println("독성여부: "  +  fish2.isHavingPoison());

        fish1.eat("관자");
        fish2.eat("성게알");

        System.out.println(fish2.isEatable());
    }
}
