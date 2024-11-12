package study.多态;

public class GeometricObject {
    String color;
    double weight;

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public GeometricObject(){}

    public double findArea(){
        return 0;
    }
}
