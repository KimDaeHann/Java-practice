package exercise.chap_16;

public class AvocadosSituation {

    public static void main(String[] args) {
        //장보기 전

        int milk = 0; //우유 0개
        int avocados = 0;//아보카도 0개
        boolean existedAvocados = true; //아보카도 있는가 true

        //장보기
        milk = (existedAvocados) ? 6: 0; //삼항 연산자

//        if(existedAvocados) {
//            milk = 6;
//        }else {
//            milk = 1;
//        }

        //집으로 돌아오기
        String comment = String.format("아내야, 장 보고 돌아왔어 %d 개 아보카도, %d개 우유 사왔어",avocados,milk);
        System.out.println(comment);

        }
    }
