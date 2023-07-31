package exercise.chap_14;

public class Encoding {

    public static void main(String[] args) {
        // 'Z' -> int
        char ch1 = 'Z';
        System.out.println(ch1);
        System.out.println((int) ch1);

        //int -> char
        //참고 65~90 A~Z , 96~122 :a~z
        int num = 66;
        System.out.println(num);
        System.out.println((char) num); //B

        //대소 비교
        char smallA = 'a';
        char largeA = 'A';

        boolean result = smallA > largeA; // 96 > 65
        System.out.println(result);

        //UNICODE 형식 한글
        char hangul1 ='\uAC00';
        System.out.println(hangul1);

        //특수 문자 "\t" , "\n", "\'"

        //들여쓰기
        char special1 = '\t';
        System.out.println("안녕하세요" + special1+"저는 xxx 입니다.");
        //줄바꾸기
        char special2 = '\n';
        System.out.println("안녕하세요" +special2+"저는 xxx 입니다.");
        //작은 따옴표 문자열로 치환
        char special3 = '\'';
        System.out.println(special3);
    }
}
