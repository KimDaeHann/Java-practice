package mission;

class MyPoint3 {
    int x;
    int y;

   MyPoint3(int x , int y){
       this.x = x;
       this.y = y;
   }

    //Object클래스의 toString()을 오버라이딩
    public String toString() {
        return "x: " + x + ", y: " + y;

    }
}

public class OverrideTest {
    public static void main(String[] args) {
        MyPoint3 myPoint3 = new MyPoint3(3,5);

        System.out.println(myPoint3);

    }
}
