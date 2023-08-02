package exercise.chap_19;

public class OddNumberTotal {

    public static void main(String [] args){

        int total=0;

        for(int i =1; i<=10 ; i++){
            if(i % 2==0){//짝수
                continue;
            }
            System.out.println(i);
            total +=i;
        }
        System.out.printf("0~100까지 더한 값은 %d",total);
    }
}
