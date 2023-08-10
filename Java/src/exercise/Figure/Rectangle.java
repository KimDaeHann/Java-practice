package exercise.Figure;

public class Rectangle extends Abstract {

    private long height;
    private long weight;

    public Rectangle(double v, double v1) {
        super();
    }

    //행위

    //세로 길이
    public double getWeight() {
        return (double) 4.0;
    }

    //가로 길이
    public double getHeight() {
        return (double) 6.0;
    }

    //대각선 길이
    public double calculateDiagonal() {
        return Math.sqrt(getHeight()*getHeight() + getWeight()*getWeight());
    }

    //직사각형 차원
    @Override
    public long getDimension() {
        return super.getDimension();
    }

    //면적 계산
    @Override
    public double calculateArea() {
        return (double) getWeight() * getHeight();
    }
    //둘레 계산
    @Override
    public double calculatePerimeter() {
       return (double) (getWeight() + getHeight()) *2;
    }

    @Override
    public void setColor(String color) {
        super.setColor("파랑");
    }
}
