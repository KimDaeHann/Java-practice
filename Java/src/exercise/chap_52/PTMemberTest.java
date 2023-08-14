package exercise.chap_52;


public class PTMemberTest {

    public static void main(String[] args) {


    PTMember ptMember = new PTMember("철수",176,75,"Male");
    try {
        ptMember.setID("sdfsdfsddsfd");
    }catch (Exception e){
        //고객 에게 알람 보내기
    }
    System.out.println(ptMember);
    }
}

