package exercise.chap_20;

import java.util.Arrays;

public class ArrayIndex {
    public static void main(String[] args){
        //index get
        //{90, 87 ,88 ,75 ,99 ,65}

        int[] studentScores = {90, 87 ,88 ,75 ,99 ,65};
        int score1 = studentScores[0];
        System.out.println(score1);

        //값 업데이트
        studentScores[2] = 95;
        System.out.println(Arrays.toString(studentScores));

        //Error
        int score6 = studentScores[6];
        System.out.println(score6);
    }
}
