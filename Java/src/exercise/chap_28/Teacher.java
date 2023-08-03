package exercise.chap_28;

public class Teacher {
    //속성
    //학교 정보
    String schoolName;

    //과목
    private Subject subject;
    //기본 정보
    private String name;
    private String gender;

    Teacher() {
    }

    //overrode 하기전 기본 생성자를 만들어야함

    //이렇게 하면 기존에 했듯 값을 일일이 추가 할 필요 없이 바로 생성 가능
    Teacher(String name, String gender, String subjectName, String subjectCode) {
        this.name = name;
        this.gender = gender;

        Subject newsubject = new Subject();
        newsubject.setSubjectName(subjectName);
        newsubject.setSubjectCode(subjectCode);

        subject = newsubject;
    }

    // 행위
    void teach(Student student, String subjectName) {
        String studentName = student.getName();
        System.out.printf("선생 %s 학생에게 %s 과목을 가르칩니다.\n", studentName, subjectName);
    }

    //getter
    public String getName() {
        return name;
    }
}
