package exercise.chap_56;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

    public static void main(String[] args) {
        //Console System.in

        int i;
        StringBuilder sb = new StringBuilder();
        try {
            while ((i = System.in.read()) != '\n') {
                sb.append((char) i);
            }
            System.out.println("String 출력: " + sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }


        int j;
        StringBuilder sb2 = new StringBuilder();
        try(InputStreamReader isr = new InputStreamReader(System.in)) {
            while ((j = isr.read()) != '\n') {
                sb2.append((char) j);
            }
            System.out.println("String 출력: " + sb2.toString());
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }
}