package exercise.chap_25;

public class Teacher {
    //속성
    //학교 정보
    String schoolName;

    //과목
    Subject subject;
    //기본 정보
    String name;
    String gender;

    // 행위
    void teach(Student student,String subjectName){
        String studentName = student.name;
        System.out.printf("선생 %s 학생에게 %s 과목을 가르칩니다.",studentName,subjectName);
    }
}
