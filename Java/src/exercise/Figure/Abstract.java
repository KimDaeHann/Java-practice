package exercise.Figure;

public class Abstract {
    //Dimension (차원)
    private long dimension=2;
    private String color = "기본색";




    public long getDimension(int i) {
        return getDimension();
    }

    public void setDimension(long dimension) {
        this.dimension = dimension;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getDimension() {
        return dimension;
    }

    public String getColor() {
        return color;
    }


    //둘레 길이
    public double calculatePerimeter() {

        return 0;
    }
    //면적
    public double calculateArea() {

        return 0;
    }
}
