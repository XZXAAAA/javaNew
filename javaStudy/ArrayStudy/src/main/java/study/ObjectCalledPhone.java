package study;

//快捷键构造get set方法和constructor  alt+insert
public class ObjectCalledPhone {
    int sequenceNum;
    String name;
    double price;

    public ObjectCalledPhone(){}

    public ObjectCalledPhone(int sequenceNum, String name, double price) {
        this.sequenceNum = sequenceNum;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSequenceNum() {
        return sequenceNum;
    }

    public void setSequenceNum(int sequenceNum) {
        this.sequenceNum = sequenceNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void getAllInfo(){
        System.out.println("序列号："+sequenceNum+"，商品名："+name+"，价格："+price);
    }
}
