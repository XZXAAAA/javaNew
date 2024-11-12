package study;

//递归方法包含了一种隐式的循环
//递归方法在调用自身时，会消耗栈空间，当栈空间耗尽时，就会抛出StackOverflowError异常
//递归方法会耗费CPU资源，因为每次递归都会产生新的栈帧，而栈帧的创建和销毁都需要时间，所以递归方法效率不高。
public class digui {
    public static void main(String[] args) {
        int time = 10;
        digui.sayHello(time);
    }

    public static void sayHello(int time){
       if (time >= 0){
           System.out.println("hello world");
           sayHello(time-1);
       }
       else {
           System.out.println("finished");
       }


    }




}
