package exercise.chap_45;

public class PrintSituation {


    public static void main(String[] args) {
        //1.기획 : String 을 출력하는 프린터 만들어주세요~
        GeneralPrint<String> print = new GeneralPrint<String>();
        print.setMaterial("설계도");
        //다운 그레이드 할 필요가 없음
        String material = print.getMaterial();
        print.printMyInfo();

        //2.기획 : Integer 을 출력하는 프린터 만들어주세요~
        //객체 , 참조형 타입에만 Generic 사용 가능 int(x) Integer(O)
        GeneralPrint<Integer> print2 = new GeneralPrint<Integer>();
        print2.setMaterial(1235);
        //참조형 객체만 가능 int X
        Integer intMaterial = print2.getMaterial();
        print2.printMyInfo();

        //3.기획 : Boolean 을 출력하는 프린터 만들어주세요
        GeneralPrint<Boolean> print3 = new GeneralPrint<Boolean>();
        print3.setMaterial(true);

        Boolean booleanMaterial = (Boolean) print3.getMaterial();
        print3.printMyInfo();
    }
}
