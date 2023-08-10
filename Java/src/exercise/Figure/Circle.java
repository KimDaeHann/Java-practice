package exercise.Figure;

//    기본 원 색상: 기본색
//    기본 원 차원: 2
//    원 반지름: 5.0
//    원 지름: 10.0
//    원 둘레: 31.41592653589793
//    원 면적: 78.53981633974483
//    원 색상: 빨강



public class Circle extends  Abstract {
    //
    private int radius;
    public Circle(double v) {
        super();
    }



    //원 지름
    public double calculateDiameter() {
        return (double) (getRadius() * 2);

    }
    //원 반지름
    public double getRadius() {
        return (double) 5.0;
    }

    //원 차원
    @Override
    public long getDimension() {
        return super.getDimension();
    }
    //원 면적
    @Override
    public double calculateArea() {
        return getRadius() * getRadius() * Math.PI;
    }


    @Override
    public void setColor(String color) {
        super.setColor("빨강");
    }

    //원 둘레
    @Override
    public double calculatePerimeter() {
        return getRadius() * Math.PI *2;
    }
}
