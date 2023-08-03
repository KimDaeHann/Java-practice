package exercise.chap_28;

public class Person {

    //
    private String name;
    private String gender;
    private int age;

    public void showMySelf(){
        System.out.printf("Person 인스턴스: name %s, gender: %s, age% d\n",this.name,this.gender,this.age);
    }


    //계속 하위로 호출을 하는 것을 볼 수 있음 결국엔 맨 마지막 함수 호출
    public Person(String name){
        this(name,"Unknown");
    }

    //다른  12번째줄 함수가 16번째 함수를 불러냄
    public Person(String name , String gender){
        this(name , gender , -1);
    }
    //생성자 단축키로 생성
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    //내 자신을 내보냄 !
    public Person returnMySelf(){
        return this ;
    }
}
