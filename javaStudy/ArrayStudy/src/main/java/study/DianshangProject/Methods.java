package study.DianshangProject;

public class Methods {
    Customer[] customerList;


    public Methods(Customer[] customerList) {
        this.customerList = customerList;

    }

    public void addCustomer(String name, int idNum, String gender, int age, String emailAddress,int totalNum){
        Customer tempCustomer = new Customer(name, idNum, gender, age, emailAddress);
        customerList[totalNum] = tempCustomer;
    }

    public void dropCustomerByName(String name, Customer[] customerList,int totalNum){
        this.customerList = customerList;
        boolean isExist = false;
        for(int i = 0; i < totalNum; i++){
            if(customerList[i].getName().equals(name)){
                isExist = true;
                for(int j = i; j < totalNum - 1; j++){
                    customerList[j] = customerList[j+1];
                }
                break;
            }
        }
        if (!isExist){
            System.out.println("抱歉，不存在该顾客");
        }
    }

    public void altCustomerByName(String name, int idNum, String gender, int age, String emailAddress, Customer[] customerList,int totalNum){
        this.customerList = customerList;
        boolean isExist = false;
        for(int i = 0; i < totalNum; i++){
            if(customerList[i].getName().equals(name)){
                isExist = true;
                customerList[i].setName(name);
                customerList[i].setIdNum(idNum);
                customerList[i].setGender(gender);
                customerList[i].setAge(age);
                customerList[i].setEmailAddress(emailAddress);
                System.out.println("修改成功！");
            }
        }
        if (!isExist){
            System.out.println("抱歉，不存在该顾客");
        }
    }
    public void showAllCustomer(Customer[] customerList,int totalNum){
        this.customerList = customerList;
        if (totalNum == 0){
            System.out.println("目前数据库里面没有顾客，请先去添加顾客");
        }
        else {
            System.out.println("编号\t\t\t\t姓名\t\t\t\t性别\t\t\t\t年龄\t\t\t\t邮箱地址");
            for (int i = 0; i < totalNum; i++) {
                String oneOutput = "";
                oneOutput += customerList[i].getIdNum() + "\t\t" + customerList[i].getName() + "\t\t" + customerList[i].getGender() + "\t\t" + customerList[i].getAge() + "\t\t" + customerList[i].getEmailAddress();
                System.out.println(oneOutput);
            }
        }
    }



}
