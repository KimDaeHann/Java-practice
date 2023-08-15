package exercise.chap_57;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        //TODO : 서버에 연결
        try (Socket socket = new Socket("localhost", 1234)) {//서버 연결

            // 서버로 데이터를 보내기 위한 OutputStream 생성
            OutputStream outputStream = socket.getOutputStream();
           ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            //TODO: 서버로부터 데이터를 받기 위한 InputStream 생성
            InputStream inputStream = socket.getInputStream();

            //속도 올려주는 보조 스트림맨 InputStreamReader 문자열로바꿔주는 스트림맨
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            Customer customer = new Customer("ID122" , "옹구");
            //서버에 메시지 전송
            objectOutputStream.writeObject(customer);
            objectOutputStream.flush();

            //TODO: 서버로부터 받은 응답 출력
            String responseLine = bufferedReader.readLine();
            System.out.println("서버의 응답(고객대기리스트): " + responseLine);

            System.out.println("클라이언트가 종료 되었다. 가라");

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
