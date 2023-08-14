package exercise.chap_30;

import org.w3c.dom.ls.LSOutput;

public class StaticTest {


    public static void main(String[] args) {

        //클래스 변수
        int num =Student.getSerialNum();
        String city = Student.city;

        System.out.println(num);
        System.out.println(city);

        Student.setSerialNum(10);


        // 4명 만들어보기
        Student student1 = new Student("patrick", "female");
        Student student2 = new Student("징징이", "male");
        Student student3 = new Student("집게사장", "male");
        Student student4 = new Student("스폰지밥", "male");

        int num4 =Student.getSerialNum();
        System.out.println(num4);

        student1.printMyInfo();
        student2.printMyInfo();
        student3.printMyInfo();
        student4.printMyInfo();
    }
}
