package exercise.chap_50;

import java.util.ArrayList;
import java.util.List;

public class TryCatchTest2 {

    public static void main(String[] args) {


        List<String> stringList = new ArrayList<>();

        stringList.add("I");
        stringList.add("Hate");
        stringList.add("Really");
        stringList.add("Super");
        //null은 toUpperCase 실행 못해서 .NullPointerException 에러가 뜸
        stringList.add(null);
        stringList.add("Coding");

        for (int i = 0 ; i< stringList.size() +5 ; i++){
           try {
               System.out.println("i: " + i);
               String str= stringList.get(i);
               System.out.println(str.toUpperCase());
           }catch (NullPointerException e){
               System.out.println("null은 들어 갈 수 없습니다.");
           }catch (IndexOutOfBoundsException e){
               System.out.println("Index는 Array Bound를 넘어갈 수 없습니다");
               //break를 통해 반복문 탈출 !
               break;
           }

        }
    }
}
