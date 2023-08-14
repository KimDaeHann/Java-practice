package exercise.chap_50;

public class TryCatchTest1 {

    public static void main(String[] args) {
        System.out.println("메인 메소드 실행합니다");
        //위 try catch 문으로 통해 아래 로직 실행
        //에러가 나올 경우
        // System.out.println("0 으로는 못나누지 않냐? ");
        // System.out.println("data: " + 0); 실행
        try {  int i = 0;
            int data = 50 / i;

            System.out.println("data: " + data);

        }catch (ArithmeticException e){

            System.out.println("0 으로는 못나누지 않냐? ");
            System.out.println("data: " + 0);
            //에러 발생 확인
            e.printStackTrace();
        }

        //위 로직 에러 때문에 아래 로직 실행이 안됨
        System.out.println("메인 메소드 종료합니다");
    }
}
