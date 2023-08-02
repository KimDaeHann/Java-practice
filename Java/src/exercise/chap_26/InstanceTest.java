package exercise.chap_26;



public class InstanceTest {

    public static  void  main(String[] args){
        //학생 타입 학생 4명 만듦
        Student student1 =new Student("멍청이",1,2,3,"얼간이","male");
        //학생 1 속성 정의

        //서로 다른 객체 정의
        Student student2 =new Student("멍청이",1,3,4,"영희","female");


        Student student3 =new Student();
        //디폴트 생성자를 사용하기에 String 기본값인 null 이 나옴
        System.out.println(student3.name);
        Student student4 =new Student();

        Teacher teacher = new Teacher("tom","Female","korean","ab001");





        System.out.println(teacher.name);
        System.out.println(teacher.gender);
        System.out.println(teacher.subject.subjectName);

    }
}
