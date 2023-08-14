package exercise.chap_54;

import exercise.chap_52.CustomException;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalLambdaTest {

    public static void main(String[] args){

        String str = null;

        Optional<String> stringOptional =Optional.ofNullable(str);

//        Supplier<String> stringSupplier = ()-> "default";
        String str2 = stringOptional.orElseGet(()-> {
            throw new CustomException("customerException 입니다"); } ).toUpperCase();


        System.out.println(str2);
    }
}
