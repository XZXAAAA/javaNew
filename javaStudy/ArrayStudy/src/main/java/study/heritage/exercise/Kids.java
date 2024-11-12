package study.heritage.exercise;

public class Kids extends Mankind{
    private int yearsOld;

    public void printAge(){
        System.out.println("Kids age is " + yearsOld);
    }


    //下面这个符号代表了override或者叫overwrite
    //其中箭头向上表示的是重写了父类中的内容
    //箭头向下表示的是重写了父类的子类的方法
    public void employeed(){

        super.employeed();
        System.out.println("but kids should study and no job");
    }
    //子类不能重写父类为private修饰的方法
    //子类重写的方法的权限修饰符不小于父类被重写的方法的权限修饰符

    public void uniqueBehaveOfChild(){

    }
}
