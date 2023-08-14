package exercise.chap_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PushExceptionTest {

    public static void main(String[] args) {
        //Main단에서는 무조건 처리
        try {
            printFile("src/exercise/chap_51/test");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e ){
            e.printStackTrace();
        }
       //중간에 Try - Catch를 쓰게 되면 상단에 쓸 필요가 없음
        }
        static void printFile (String filename) throws FileNotFoundException, IOException {
            FileInputStream fs = getFileStream(filename);

            int i;

            while ((i = fs.read()) != -1) {
                System.out.write(i);

            }
        }

        static FileInputStream getFileStream (String filename) throws FileNotFoundException {
            // FileNotFoundException 을 나중에 미뤄서 처리
            FileInputStream fs = new FileInputStream(filename);
            return fs;
        }
    }
