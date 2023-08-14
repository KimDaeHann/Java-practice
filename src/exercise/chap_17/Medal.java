package exercise.chap_17;

public class Medal {
    public static void main(String[] args) {
        String medal;
        int tear = 1;


        switch (tear){
            case 1:
                medal="금메달";
                break;
            case 2:
                medal="은메달";
                break;
            case 3:
                medal="동메달";
                break;
            default:
                medal="못 얻었";
    }
    String result = String.format("선수님의 메달은 %s 입니다.",medal);
        System.out.println(result);

    }

}



