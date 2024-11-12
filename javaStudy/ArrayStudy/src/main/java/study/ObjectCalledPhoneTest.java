package study;

public class ObjectCalledPhoneTest {
    public static void main(String[] args) {
        ObjectCalledPhone phone = new ObjectCalledPhone();
        ObjectCalledPhone phone2 = phone;

        phone.setName("IPhone");
        phone.setSequenceNum(114514);
        phone.setPrice(5999.0);

        phone2.setPrice(9999.0);
        System.out.println(phone2.price);

        phone.getAllInfo();

    }



}
