package exercise.chap_47;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetInterfaceTest {

    public static void main(String[] args){
        //Set 인터페이스 구현
        Set<String> fruitSet = new HashSet<>();

        //Add
        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Mango");
        fruitSet.add("Kiwi");

        System.out.println("fruitSet: " + fruitSet);

//        //add 중복 add List는 적용이 되나 set은 적용 X
//        List<String> fruitList = new LinkedList<>();
//        fruitList.add("Apple");
//        fruitList.add("Melon");
//        fruitList.add("Banana");
//        fruitList.add("Mango");
//        fruitList.add("Kiwi");
//        fruitList.add("Apple");
//        System.out.println("fruitSet: " + fruitList);

        //remove (set)
        fruitSet.remove("Apple");
        System.out.println(fruitSet);

        //container
        System.out.println(fruitSet.contains("Apple"));
        System.out.println(fruitSet.contains("Mango"));

        //size ,isEmpty , Clear
        System.out.println(fruitSet.size());

        fruitSet.clear();
        System.out.println(fruitSet);
    }
}
