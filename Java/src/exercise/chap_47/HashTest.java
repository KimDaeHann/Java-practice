package exercise.chap_47;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Objects;

public class HashTest {


    public static String hashString(String input) {
        try {
            //MessageDigest 인스턴스 생성(해시 알고리즘으로 SHA-256 선택)
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            //입력 문자열을 바이트 배열로 변환하여 해시 함수에 전달
            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            //Base64로 인코딩하여 해시된 문자열 변환
            return Base64.getEncoder().encodeToString(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }
    public static void main(String[] args){
        String password = "q1w2e3r4t5";
        String hashPassword = hashString(password);

        System.out.println("원본 :" + password);
        System.out.println("후 :" + hashPassword);

        //Data 검색을 위한 Hash
        long hashCode =  Objects.hashCode(password);
        long hashCode2 = Objects.hashCode(2244);
        long cutomer = Objects.hash(new Customer("민철"));
        long cutomer2 = Objects.hash(new VIPCustomer("철민"));
        //hashCode는 정수값이나옴 long
        //String이든 객체든 ..
        System.out.println("Objects HashCode: " + hashCode);
        System.out.println("Objects HashCode: " + hashCode2);
        System.out.println("Objects HashCode: " + cutomer);
        System.out.println("Objects HashCode: " + cutomer2);
    }
}
