package study.多态;

public class Circle extends GeometricObject{
    double radius;

    public Circle(double radius, String color, double weight){
        super(color, weight);
        this.radius = radius;

    }

    public double findArea(){
        return Math.PI * radius * radius;
    }

    public void printType(){
        System.out.println("这是一个圆");
    }
}
