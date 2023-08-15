package exercise.chap_56;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {

    public static void main(String[] args) {


        String content = "This is content of 2";
        //append true 추가하면 이어붙이기가 됨
        try (FileOutputStream ops = new FileOutputStream("src/exercise/chap_56/output.txt ", true)) {

            byte[] bytes = content.getBytes();
            ops.write(bytes);
            System.out.println("txt 파일이 생성되었습니다.");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



