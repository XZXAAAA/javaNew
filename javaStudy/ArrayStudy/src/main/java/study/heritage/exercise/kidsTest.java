package study.heritage.exercise;

public class kidsTest {
    public static void main(String[] args) {
        Mankind kid = new Kids();
        kid.setSalary(0);
        kid.setSex(1);
        kid.employeed();

        Kids kidd = (Kids)kid;
        kidd.uniqueBehaveOfChild();
    }
}
