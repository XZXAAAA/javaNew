package study.DianshangProject;
import java.util.*;

public class mainPage {
    public static void main(String[] args) {
        //初始化各种参数，totoalNum代表客户的数量，status表示主界面服务状态，customerList是客户列表
        int totalNum = 0;
        boolean status = true;
        Customer[] customerList = new Customer[100];

        while(status) {
            System.out.println("-----欢迎来到谢子潇编写的电商客户管理平台-----");
            System.out.println("请输入你要选择的服务：");
            System.out.println("1.添加客户");
            System.out.println("2.删除客户");
            System.out.println("3.修改客户信息");
            System.out.println("4.查看客户信息");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            //判断客户需要的服务
            switch (choice) {
                case 1:    //"1.添加客户"
                    System.out.println("===============");
                    System.out.println("添加客户编号");
                    int idNum = sc.nextInt();
                    System.out.println("添加客户姓名");
                    String name = sc.next();
                    System.out.println("添加客户性别");
                    String gender = sc.next();
                    System.out.println("添加客户年龄");
                    int age = sc.nextInt();
                    System.out.println("添加客户邮箱");
                    String emailAddress = sc.next();
                    Methods addProcedure = new Methods(customerList);
                    addProcedure.addCustomer(name, idNum, gender, age, emailAddress,totalNum);
                    totalNum++; //自己来判断事务是否完成，完成则客户数量加1
                    break;

                case 2:    //"2.删除客户"
                    System.out.println("===============");
                    System.out.println("输入想要删除的客户的姓名");

                    Methods deleteProcedure = new Methods(customerList);
                    String nameToDelete = sc.next();
                    deleteProcedure.dropCustomerByName(nameToDelete,customerList,totalNum);
                    totalNum--;
                    break;

                case 3:
                    System.out.println("===============");
                    System.out.println("输入想要修改的客户的姓名");
                    System.out.println("输入修改后的客户编号");
                    idNum = sc.nextInt();
                    System.out.println("输入修改后的客户姓名");
                    name = sc.next();
                    System.out.println("输入修改后的客户性别");
                    gender = sc.next();
                    System.out.println("输入修改后的客户年龄");
                   age = sc.nextInt();
                    System.out.println("输入修改后的客户邮箱");
                    emailAddress = sc.next();
                    Methods altProcedure = new Methods(customerList);
                    altProcedure.altCustomerByName(name, idNum, gender, age, emailAddress,customerList,totalNum);

                    break;
                case 4:
                    Methods showProcedure = new Methods(customerList);
                    showProcedure.showAllCustomer(customerList,totalNum);
                    break;

                case 5:
                    System.out.println("感谢使用，再见！");
                    status = false;
                    break;
            }
        }
    }
}
