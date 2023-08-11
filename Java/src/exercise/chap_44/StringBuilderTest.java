package exercise.chap_44;

public class StringBuilderTest {
    public static void main(String[] args) {
        // +=
        String str = "";

        long startTime = System.currentTimeMillis();

        for(int i=0; i < 5000; i++){
            str += "Cat";
        }
        System.out.println(str);

        long endTime = System.currentTimeMillis();

        System.out.println("걸린 시간:" + (endTime- startTime));

        //////////////////////////////////////////////////////////////////////
        //시간이 훨씬 단축
        StringBuilder sb = new StringBuilder();

        long startTime2 = System.currentTimeMillis();

        for(int i=0; i < 5000; i++){
            sb.append("Cat");
        }
        String output = sb.toString();
        System.out.println(output);

        long endTime2 = System.currentTimeMillis();

        System.out.println("걸린 시간:" + (endTime2- startTime2));
    }
}
