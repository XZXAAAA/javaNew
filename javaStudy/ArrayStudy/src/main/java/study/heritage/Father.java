package study.heritage;

public class Father {

    public static void main(String[] args) {
        Father father = new Father();
        System.out.println(father.getClass().getSuperclass());
    }





    private int age;
    public int id;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Father(int age, int id) {
        this.age = age;
        this.id = id;
    }

    public Father(){}
}
