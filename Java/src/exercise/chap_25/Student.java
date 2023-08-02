package exercise.chap_25;

public class Student {
    //속성
    String schoolName; //학교
    int classYear;// 반
    int classRoomNumber; // 번
    int studentNumber; //번호


    //기본 정보
    String name;
    String gender;

    //행위
    void study(Teacher teacher , String subjectName){
        String teacherName = teacher.name;
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.",teacherName,subjectName);
    }
}
