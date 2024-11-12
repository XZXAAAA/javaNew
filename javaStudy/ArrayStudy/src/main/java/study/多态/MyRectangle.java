package study.多态;

public class MyRectangle extends GeometricObject{
    double width;
    double height;

    public MyRectangle(double width,double height, String color, double weight) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double findArea() {
        return width * height;
    }
}
