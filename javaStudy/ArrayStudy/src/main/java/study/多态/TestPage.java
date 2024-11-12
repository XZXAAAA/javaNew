package study.多态;

public class TestPage {
    public static void main(String[] args) {
        GeometricObject testObject = new Circle(4, "yellow", 20);
        if (testObject instanceof Circle){
            Circle circle = (Circle) testObject;
            circle.printType();
        }
        //使用父类变量接收了子类对象之后，我们不能调用子类拥有，而父类没有的方法
        //上面例子中使用的是printType方法（打印形状为圆形）
        //此时可以使用instanceof关键字查看是否属于某类型
    }
}
