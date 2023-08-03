package exercise.chap_26;

public class Student {
    //속성
    String schoolName; //학교
    int classYear;// 반
    int classRoomNumber; // 번
    int studentNumber; //번호


    //기본 정보
    String name;
    String gender;

    //생성자
    Student() {

    }

    Student(String pname, String pgender) {
        name = pname;
        gender = pgender;
    }

    //자동으로 매핑이 되게 설정
    Student(String pSchoolName, int pClassYear, int pClassRoomNum, int pStudentNum, String pname, String pgender) {
        schoolName = pSchoolName;
        classYear = pClassYear;
        classRoomNumber = pClassRoomNum;
        studentNumber = pStudentNum;
        name = pname;
        gender = pgender;
    }

    //행위
    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.name;
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }

}
