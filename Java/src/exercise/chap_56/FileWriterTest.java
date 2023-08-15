package exercise.chap_56;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

    public static void main(String[] args) {


        String content ="죽은 자의 온기가 서려있는 곳입니다.";
        //append true 추가하면 이어붙이기가 됨
        try (FileWriter ops = new FileWriter("src/exercise/chap_56/output_Korean.txt ", true)) {

            byte[] bytes = content.getBytes();
            ops.write(content);
            System.out.println("txt 파일이 생성되었습니다.");
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



