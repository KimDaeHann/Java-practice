package exercise.chap_19;

import java.sql.SQLOutput;

public class StarTriangle {

    public static void main(String[] args){
        int row;
        int column;

        for(row = 1 ; row<=9; row++){
            //row를 기준으로 즉 같은 값으로 움직임
            for (column =1; column<=row; column++){
                System.out.print('*');
            }
            System.out.println();
        }
        for (row =9; row>=1; row--){
            for (column=1 ; column<=row; column++ ){
                System.out.print('*');
            }
            System.out.println();
        }
        for (row =0 ; row<=9; row++){
            for (column=0; column<=9; column++){
                System.out.print('*');
            }

            System.out.println();
        }

    }
}
