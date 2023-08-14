package exercise.chap_21;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        int a = 5;
        int b = a;

        b += 5;

        System.out.println(a);
        System.out.println(b);

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        arr1[0] = 10;


        //둘 다 바뀜 JAVA 얕은 복사 때문
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

}
