package study.heritage;

public class Son extends Father{

    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.getClass().getSuperclass());
    }




    public int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setAge(int age){
        // this.age = age;
        //子类获取父类所有的属性和方法
        //由于封装性，子类无法直接访问父类的私有属性
    }

}
