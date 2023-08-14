package exercise.chap_52;

import java.util.Arrays;

public class DayEnumTest {

    public static void main(String[] args){
        //각각 ENum 정의
        // Ordinal , compareTo, values
        //Enum 값은 Ordinal 에 따라 달라짐
        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;
        Day thursday = Day.THURSDAY;

        System.out.println("ordinal 값: " + monday.ordinal());
        System.out.println("ordinal 값: " + sunday.ordinal());
        System.out.println("ordinal 값: " + thursday.ordinal());
        //monday = 1에서 0을 빼서 sunday는 1이나옴
        //monday = 1에서 4를 빼서 thursday -3이 나옴
        System.out.println("CompareTo: " + monday.compareTo(sunday));
        System.out.println("CompareTo: " + monday.compareTo(thursday));

        //enum에 정의된 값들이 출력됨
        Day[] days = Day.values();
        System.out.println("Days: " + Arrays.toString(days));


    }
}
