package exercise.chap_21;

import java.util.Arrays;

public class ArrayCopy2 {

    public static void main(String[] args) {
        //for loop
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] arr1 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            arr1[i] = array1[i];
        }
        //깊은 복사 예
        int[] arr2 = Arrays.copyOf(array1, array1.length);

        int[] arr3 = array1.clone();
        array1[0] = 100;


        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
