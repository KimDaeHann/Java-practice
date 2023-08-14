package exercise.chap_52;




import java.util.Optional;

public class OptionalThrowTest {
    public static void main(String[] args) {
        String str = "abc";

        //한번 Wrapper 를 함
        Optional<String> stringOptional = Optional.ofNullable(str);
        //람다식
        int length = stringOptional.orElseThrow( () -> {throw new CustomException("CustomException이 발생했습니다");})
                .length();

        System.out.println(length);
    }
}
