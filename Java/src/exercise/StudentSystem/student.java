package exercise.StudentSystem;

public class student {

    private int classRoomNumber;
    private int studentNumber;

    private String name;
    private String subject;

    student() {

    }

    public student(int classRoomNumber, int studentNumber, String name, String subject) {
        this.classRoomNumber = classRoomNumber;
        this.studentNumber = studentNumber;
        this.name = name;
        this.subject = subject;
    }




    public int getClassRoomNumber() {
        return classRoomNumber;
    }


    public int getStudentNumber() {
        return studentNumber;
    }


    public String getName() {
        return name;
    }


    public String getSubject() {
        return subject;
    }


}
