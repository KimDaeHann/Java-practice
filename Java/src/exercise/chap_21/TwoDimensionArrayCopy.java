package exercise.chap_21;

import java.util.Arrays;

public class TwoDimensionArrayCopy {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[][] arr1 = arr.clone();
        //깊은 복사 하는법
        int[][] arr2 = new int[3][];

        for (int row = 0; row < 3; row++) {
            arr2[row] = arr[row].clone();
        }


        //얕은 복사가 됨
        arr[0][0] = 100;
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
    }
}
