package exercise.chap_19;

public class Gugudan {

    public static void main(String[] args){
        // 단 행
        int dan;
        int hang;
        for(dan = 2; dan <=9; dan++){
            for(hang =1 ; hang <= 9; hang++){
                int result = dan * hang;
                System.out.printf("%d * %d = %d\n",dan,hang,result);
            }//이렇게 하면 다음 단 부터 한칸 떨어져서 나옴
            System.out.println();
        }

    }
}
