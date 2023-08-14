package exercise.chap_52;

import java.util.Optional;

public class OptionalDefaultTest {

    public static void main(String[] args) {
        String str = "abc";
        Optional<String> optionalS = Optional.ofNullable(str);
        //orElseGet : null 일때 기본값을 취하겠다. ""빈 String 값 을 추출
        int length = optionalS.orElseGet(()-> "").length();

        System.out.println(length);
    }
}
