package exercise.chap_57;

import java.io.*;

public class SerializeExampleTest {

    public static void main(String[] args) {
        //직렬화
        Person person = new Person("탱구", "Male", 23, "Korea", "로봇");

        byte[] serializedDate = null;

        try (ByteArrayOutputStream bao = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(bao);
        ) {
            objectOutputStream.writeObject(person);
            objectOutputStream.flush();
            //직렬화
            serializedDate = bao.toByteArray();
            System.out.println("Person 직렬화 후 : " + new String(serializedDate));

        } catch (IOException e) {
            e.printStackTrace();
        }

        //역직렬화 중
        try (ByteArrayInputStream bio = new ByteArrayInputStream(serializedDate);
             ObjectInputStream objectInputStream = new ObjectInputStream(bio);

        ) {
            //역 직렬화
            Person person1 = (Person) objectInputStream.readObject();
            System.out.println("직렬화된 Data가 다시 Person 역직렬화 후: " + person1);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
