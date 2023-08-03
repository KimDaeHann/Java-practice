package exercise.chap_28;

public class Student {
    //속성
    private String schoolName; //학교
    private int classYear;// 반
    private int classRoomNumber; // 번
    private int studentNumber; //번호


    //기본 정보
    private String name;
    private String gender;

    //생성자
    Student() {

    }

    Student(String name, String gender) {
        this("School", 1, 3, -1, "name", gender);
    }

    //자동으로 매핑이 되게 설정
    Student(String schoolName, int classYear, int classRoomNumber, int studentNumber, String name, String gender) {
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classRoomNumber = classRoomNumber;
        this.studentNumber = studentNumber;
        this.name = name;
        this.gender = gender;
    }

    //행위
    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.getName();
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }

    //getter
    public String getName() {
        return name;
    }

}
