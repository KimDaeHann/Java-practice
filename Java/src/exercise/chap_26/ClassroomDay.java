package exercise.chap_26;

public class ClassroomDay {

    public static void main(String[] args){
        //
        Student student1 = new Student("school",1,2,3,"징징이","male");
        Student student2 = new Student("school",2,3,4,"다람이","female");
        Student student3 = new Student("school",4,5,2,"뚱이","male");
        Student student4 = new Student("school",3,1,5,"진주","female");


        Teacher teacher =new Teacher("말숙이","Female","Science","AB010");

        //subjectName 객체 생성
        String subjectName = "korean";

        teacher.teach(student1,subjectName);
        student1.study(teacher,subjectName);

        teacher.teach(student2,subjectName);
        student2.study(teacher,subjectName);

        teacher.teach(student3,subjectName);
        student3.study(teacher,subjectName);

        teacher.teach(student4,subjectName);
        student4.study(teacher,subjectName);

    }
}
