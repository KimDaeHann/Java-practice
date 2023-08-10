package exercise.StudentSystem;

public class SearchSystem {

        public static void main(String[] args) {
            // 학생 정보 관리 시스템 객체 생성 (최대 2명 저장 가능)
            StudentManagementSystem system = new StudentManagementSystem(2);

            // 학생 추가
            student student1 = new student(3, 12345, "홍길동", "컴퓨터공학");
            system.addStudent1(student1);

            // 학생 추가
            student student2 = new student(2, 67890, "이순신", "수학");
            system.addStudent1(student2);

            System.out.println("학생 검색 시작하겠습니다.");
            // 학생 검색
            system.searchStudent(12345);

            System.out.println("학생 검색 삭제하겠습니다.");
            // 학생 삭제
            system.removeStudent(student1);

            System.out.println("학생 검색 시작하겠습니다.");
            // 학생 검색 (삭제된 학생)
            system.searchStudent(12345);
        }
    }
