package exercise.chap_56;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInReaderTest {

    public static void main(String[] args) {
        // FileInputStream
        try(FileReader fis = new FileReader("src/exercise/chap_56/test_korea")) {

        int i ;
        //InputStream을 read를 통해 읽었고
            //while문을 통해 -1을 반환하기 전(문장이 끝날때까지)까지 출력
        while ((i = fis.read()) != -1){
            //char로 업 캐스팅을 해서 문자로 변환
            System.out.print((char) i);
        }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        } ;
    }

}
