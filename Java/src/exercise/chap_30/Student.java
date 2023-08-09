package exercise.chap_30;

import exercise.chap_28.Teacher;

public class Student {
    private static int serialNum = 1;
    static String city = "Seoul";
    //속성
    private String schoolName; //학교
    private int classYear;// 반
    private int classRoomNumber; // 번
    private int studentNumber; //번호

    private int studentID; //student 고유 ID


    //기본 정보
    private String name;
    private String gender;

    //정적 메소드
    public static int getSerialNum(){
        return serialNum;
    }
    //static 변수는 instance 에 접근이 불가능 this (X)
    public static void setSerialNum(int num){
        serialNum = num;
    }//this 안됨 인스턴스 이기 때문

    //생성자
    Student() {

    }

    Student(String name, String gender) {
        this("School", 1, 3, -1,name, gender);
    }

    //자동으로 매핑이 되게 설정
    //생성자에 static 추가
    Student(String schoolName, int classYear, int classRoomNumber, int studentNumber, String name, String gender) {
        this.studentID = serialNum++;
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classRoomNumber = classRoomNumber;
        this.studentNumber = studentNumber;
        this.name = name;
        this.gender = gender;

    }

    public void printMyInfo() {
        System.out.printf("[Student] schoolName : %s , classYear: %d," +
                        " classRoomNumber : %d , studentNumber: %d ,studentID: %d ,name: %s , gender: %s\n",
                this.schoolName, this.classYear, this.classRoomNumber, this.studentNumber, this.studentID,
                this.name, this.gender);
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
