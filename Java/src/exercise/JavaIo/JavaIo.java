
package exercise.JavaIo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavaIo {
    public static void main(String[] args) throws Exception {
        // 키보드로부터 한줄씩 입력받고, 한줄씩 화면에 출력하시오.
        // 키보드 : System.in (InputStream 주인공 )
        // 화면에출력 : System.out (PrintStream 주인공 )
        // 키보드로 입력받는다는건 문자로 입력받는 것 : char 단위 입출력
        // char 단위 입출력 클래스는 Reader, Writer
        // 한줄 읽기: BufferedReader라는 클래스는 readLine이라는 메소드를 가지고 있다.
        //           더 이상 읽어들일것이 없으면 (EOF) null을 변환
        //           장식! 주인공 없음 사용 못 함
        //           주인공은 어디에 읽은것인가 쓸것인가
        // 한줄 쓰기: PrintStream , PrintWriter
        //추상 클래스를 받아들이는거는 어미가 아닌 자손이 받아야됨

        // bufferedReader x
        // CharReader x - 문자로 읽어들인다.
        // FilterReader x -장식 Reader를 넣어줘야함
        // InputStreamReader(InputStream in) -장식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = br.readLine()) != null){ //한줄 입력 받는다.
            System.out.println("읽어들인값: " + line);
        }
        br.readLine(); //한 줄입력
    }
}
