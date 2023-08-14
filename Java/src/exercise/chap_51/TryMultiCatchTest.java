package exercise.chap_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryMultiCatchTest {

    public static void main(String[] args) {
        try{
            FileInputStream fs= new FileInputStream("src/exercise/chap_51/test");

            int i = 1;
            int data = 100/ i ;
            System.out.println(data);

            String str = "abc";
            System.out.println(str.toUpperCase());


            int index= 111 ;
            int[] intArr = new int[10];
            System.out.println(intArr[index]);

        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다");
            throw new RuntimeException(e);
        }
        //catch 묶어서 사용 가능
        catch (ArithmeticException | NullPointerException e){
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.println("Null pointer Exception이 발생 했습니다.");
            e.printStackTrace();
            //최종적으로 Exception 에 걸림
        }catch (Exception e){
            System.out.println("Exception : 마지막까지 오는군 내가 상대해주마 ");
        }
        System.out.println("메인 메소드가 종료 됩니다.");

    }
}
