package study.多态练习;

public class mainPage {

    public static void main(String[] args) {
        Person man = new Man();
        Person woman = new Woman();
        meeting(man);
        meeting(woman);
    }


    //因为这里使用了static 所以在main（）里面可以直接使用clss类里面声明的方法
    //meeting，并且使用instanceof来判断多态人的具体类型
    public static void meeting(Person ps){
        if (ps instanceof Man){
            ((Man) ps).smoke();
        }
        else if (ps instanceof Woman){
            ((Woman) ps).makeup();
        }
    }
}
