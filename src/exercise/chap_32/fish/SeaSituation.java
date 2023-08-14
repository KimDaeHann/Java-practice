package exercise.chap_32.fish;

public class SeaSituation {
    public static void main(String[] args) {
//        //자식 물고기
//        FishChild fishChild = new FishChild(); //
//        fishChild.setSex("Male");
//        fishChild.setEatable(true);
//        fishChild.setLeavingSea("서해");
//
//        fishChild.printMyInfo();
//
//       //생성자 오버로딩
//       FishChild fishChild2 = new FishChild("male",true,"서해");
//       fishChild2.printMyInfo();

        //자식 물고기 생성 //서해라고 지정 했는데 null 값이 나옴
        //자식 leavingSea 는 적용이 됐지만 부모 클래스인 leavingSea 는 적용이 안됨
        //이럴때 자식클래스에서는 this가 아닌 super로 해야됨
        FishChild fishChild = new FishChild("서해", true);
        fishChild.printMyInfo();

        FishChild fishChild1 = new FishChild();
        fishChild1.setLeavingSeaChild("서해");
        fishChild1.setLeavingSea("동해");

        fishChild1.printSea();

        //핵심 타입 s
        //타입선언 : 부모 ,인스턴스화: 자식
        //타입선언 부모 ,인스턴스화 : 부모
        //타입 선언 : 자식 인스턴스화 : 자식
        //타입 선언 : 자식 인스턴스화 : 부모 => 묵시적 변환 X

        Fish fish = new Fish();
        fish.eat("새우");

        Fish fish2 = new FishChild();
        fish2.eat("새우");

        FishChild fish3 = new FishChild();
        fish3.eat("새우");

        //
    }
}
