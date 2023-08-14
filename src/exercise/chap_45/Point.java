package exercise.chap_45;


//extends Number을 함으로써 T,V 에 넣을 값을 제한함
public class Point<T extends Number, V extends Number> {

    private T x;
    private V y;

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }

    public Double calculateDistance() {
        // (X**2 + y**2) ^1/2


        Double num1 = this.x.doubleValue();
        Double num2 = this.y.doubleValue();

        return Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
    }


}
