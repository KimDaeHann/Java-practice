package exercise.chap_50;

import java.io.*;

public class TryCatchTest3 {

    public static void main(String[] args){
     try {
         FileReader fs = new FileReader("C:\\Users\\kbi31\\Desktop\\개발\\Java-practice\\Java\\src\\exercise\\chap_50\\test");
         BufferedReader br = new BufferedReader(fs);

         String line;
         while ((line = br.readLine()) !=null ){
             System.out.println(line);
         }
     }catch (FileNotFoundException e){
         System.out.println("파일을 찾을 수 없습니다.");
         //에러 나는 위치 확인
         e.printStackTrace();
     } catch (IOException e) {
         System.out.println("입출력 과정에서 문제가 생겼습니다.");
         e.printStackTrace();
     }
    }
}
