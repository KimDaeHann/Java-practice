package exercise.chap_51;

import java.io.*;

public class FinallyCloseTest {

    public static void main(String[] args){
        System.out.println("메인 메소드를 실행합니다.");

     try {
        FileInputStream fs =new FileInputStream("src/exercise/chap_51/test");
        int i;
        while ((i=fs.read()) != -1){
            System.out.println(i);
         }
        //끝났다 !
        fs.close();
     }catch (FileNotFoundException e){
         System.out.println("파일을 찾을 수 없습니다.");
         //에러 나는 위치 확인
         e.printStackTrace();
     } catch (IOException e) {
         System.out.println("입출력 과정에서 문제가 생겼습니다.");
         e.printStackTrace();
     }
        System.out.println("메인 메소드를 종료합니다.");
    }
}
