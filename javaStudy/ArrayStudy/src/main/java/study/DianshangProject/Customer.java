package study.DianshangProject;

//创建的customer类 alt+insert 快捷创建set和get、constructor
public class Customer {
    private int idNum;
    private String name;
    private String gender;
    private int age;
    private String emailAddress;

    public Customer(String name, int idNum, String gender, int age, String emailAddress) {
        this.name = name;
        this.idNum = idNum;
        this.gender = gender;
        this.age = age;
        this.emailAddress = emailAddress;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

}
