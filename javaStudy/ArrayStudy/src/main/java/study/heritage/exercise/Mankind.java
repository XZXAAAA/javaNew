package study.heritage.exercise;

public class Mankind {
    private int sex;
    private int salary;

    public void manOrWoman()
    {
        if(sex == 1)
        {
            System.out.println("Man");
        }
        else
        {
            System.out.println("Woman");
        }
    }

    public void employeed(){
        if(salary == 0)
        {
            System.out.println("Unemployed");
        }
        else
        {
            System.out.println("Employed");
        }
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }

    public int getSalary() {
        return salary;
    }
}
