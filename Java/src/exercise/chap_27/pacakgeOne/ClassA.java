package exercise.chap_27.pacakgeOne;

public class ClassA {
    //Publish
    public String publicStr;

    private String privateStr;
    //default 접근제어자를 정의하지 않으면 default
    String defaultStr;


    public void methodPublic(){}

    private void methodPrivate(){}

    void methodProtected(){}

    void testPrivate(){
        String str =privateStr;
        methodPrivate();


        }
    }

