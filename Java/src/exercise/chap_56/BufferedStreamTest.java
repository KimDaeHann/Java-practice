package exercise.chap_56;

import java.io.*;

public class BufferedStreamTest {

    public static void main(String[] args) {
        // FileReader -> FileWriter로 복사하는데 걸리는 시간
        try (FileReader fis = new FileReader("src/exercise/chap_56/test_long.txt");
             FileWriter fws = new FileWriter("src/exercise/chap_56/output_long.txt")
        ) {
            long start = System.currentTimeMillis();

            int data;
            //InputStream을 read를 통해 읽었고
            //while문을 통해 -1을 반환하기 전(문장이 끝날때까지)까지 출력

            while ((data = fis.read()) != -1) {
                fws.write((char) data);
                //char로 업 캐스팅을 해서 문자로 변환
            }

            long end = System.currentTimeMillis();

            System.out.println("Beuffered 적용 전, 파일 내용 복사하는데 " + (end-start) + "ms가 걸렸습니다.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ////////

        // FileReader -> FileWriter로 복사하는데 걸리는 시간
        try (BufferedReader bfr = new BufferedReader (new FileReader("src/exercise/chap_56/test_long.txt"));
             BufferedWriter bwr = new BufferedWriter(new FileWriter("src/exercise/chap_56/output_long.txt")
        )) {
            long start = System.currentTimeMillis();

            int data;
            //InputStream을 read를 통해 읽었고
            //while문을 통해 -1을 반환하기 전(문장이 끝날때까지)까지 출력

            while ((data = bfr.read()) != -1) {
                     bwr.write((char) data);
                //char로 업 캐스팅을 해서 문자로 변환
            }

            long end = System.currentTimeMillis();

            System.out.println("Beuffered 적용 후, 파일 내용 복사하는데 " + (end-start) + "ms가 걸렸습니다.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


