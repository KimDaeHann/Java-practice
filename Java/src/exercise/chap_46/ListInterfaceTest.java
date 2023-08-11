package exercise.chap_46;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ListInterfaceTest {

    public static void main(String[] args){
        //List 정의
        List<String> fruitList = new ArrayList<>();

        //add
        fruitList.add("Orange");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Kiwi");
        //순서대로 들어감
        System.out.println("FruitList 요소: "+fruitList);

        //add(index ,element)
        fruitList.add(3,"Mango");
        //3번재칸에 Mango가 들어간 모습
        System.out.println("FruitList 요소: "+fruitList);

        //remove(index)
        fruitList.remove(3);
        //3번째 요소를 지움
        System.out.println("FruitList 요소: "+fruitList);

        //get(Index)
        String myFruit = fruitList.get(3);
        //get을 통해 3번째 값을 가져옴
        System.out.println("가져온 과일은:" + myFruit);

        //set(Index , Element)
        fruitList.set(1, "pineApple");
        //set을 통해 1번째 값을 수정
        System.out.println("FruitList 요소:" + fruitList);

        //size
        System.out.println("리스트 사이즈: " + fruitList.size());

        //isEmpty
        List<String> fruitList2 = new ArrayList<>();
        //값이 비었는지 확인
        System.out.println(fruitList2.isEmpty());
        System.out.println(fruitList.isEmpty());

        //Contains : 리스트에 해당 원소가 있는지 없는지 확인 하는 메서드
        System.out.println(fruitList.contains("Kiwi"));
        System.out.println(fruitList.contains("Apple"));

        //IndexOf , Clear
        String myFruit2 = "Orange";
        System.out.println(fruitList.indexOf(myFruit2));
        //String 변수 값이 있으면 0 없으면 -1
        String myFruit3 = "Apple";
        System.out.println(fruitList.indexOf(myFruit3));

        fruitList.clear();
        //clear를 통해 배열 clear 됨
        System.out.println("FruitList 요소:" + fruitList);
    }
}
