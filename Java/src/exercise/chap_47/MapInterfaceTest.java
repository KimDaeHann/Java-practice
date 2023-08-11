package exercise.chap_47;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {

    public static void main(String[] args){
        // Map 정의
        Map<String,Integer> fruitMap =new HashMap<>();

        //Map 에 데이터 들을 넣음

        //값이 순서대로가 안들어 간 것을 볼 수 있다.
        fruitMap.put("Orange",10);
        fruitMap.put("Apple",5);
        fruitMap.put("Banana",3);
        fruitMap.put("Kiwi",5);
        System.out.println("fruitMap : " + fruitMap);

        //Get(Key)
        Integer appleCount = fruitMap.get("Apple");
        Integer bananaCount = fruitMap.get("Banana");

        System.out.println("사과 갯수:" + appleCount);
        System.out.println("바나나 갯수:" + bananaCount);

        //contains(Key)
        Boolean isApple = fruitMap.containsKey("Apple");
        Boolean isMango = fruitMap.containsKey("Mango");

        System.out.println("Apple 존재 유무:" + isApple);
        System.out.println("Mango 존재 유무:" + isMango);

        //remove(Key)
        fruitMap.remove("Apple");

        System.out.println(fruitMap);

        //size
        System.out.println(fruitMap.size());

        //KeySet()
        System.out.println(fruitMap.keySet());
    }
}
