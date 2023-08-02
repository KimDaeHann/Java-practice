package exercise.chap_19;

public class ThreeSixNineGame {

    public static void main(String[] args){

        for(int num =1; num<=30; num++){
            //3으로 남아 떨어진다 == 3의배수
            if(num % 3==0){
                System.out.print("짝,");
                continue;
            }

            System.out.printf("%d,", num);
        }
    }
}
