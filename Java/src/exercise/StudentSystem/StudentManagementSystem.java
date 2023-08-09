package exercise.StudentSystem;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private int maxCapacity;
    private List<student> students;

    public StudentManagementSystem(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.students = new ArrayList<>();
    }


    public void addStudent1(student student) {
        if (students.size() < maxCapacity) {
            students.add(student);
            System.out.println("학생 추가: " + student.getName());
        } else {
            System.out.println("최대 저장 가능한 학생 수를 초과했습니다.");
        }
    }


    public void searchStudent(int studentNumber) {
        for (student student : students) {
            if (student.getStudentNumber() == studentNumber) {
                System.out.println("학생을 찾았습니다:");
                System.out.println("이름: " + student.getName());
                System.out.println("학번: " + student.getStudentNumber());
                System.out.println("전공: " + student.getSubject());
                System.out.println("학년: " + student.getClassRoomNumber());
                return;
            }
        }
        System.out.println("학생을 찾을 수 없습니다.");

    }

    public void removeStudent(student student) {

        if (students.remove(student)) {
            System.out.println("학생 삭제: " + student.getName());
        } else {
            System.out.println("해당 학생을 찾을 수 없습니다.");
        }
    }
}

