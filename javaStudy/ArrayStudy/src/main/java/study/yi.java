package study;

import java.util.Arrays;
//array
//就可以理解为多个数据的组合
//是程序中的容器：数组，集合框架
//数组存储的数据的特点：依次紧密排列的、有序的、可以重复的

//为什么数组要从0开始编号，而不是1
//ans：因为数组的索引表示了数组元素距离首地址的偏移量。因为第一个元素的地址与首地址相同
//所以偏移量为0

public class yi {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1,2, 2, 3, 3,4, 5};
        int[] arr3 = null;

        boolean result1 = arr1 == arr2;
        //这里比较的是地址值
        //System.out.println(result1);

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.binarySearch(arr2, 3));
        //binarySearch :查找arr2里面 值为3的第一个下标位置

        //sout 调出System.out.println
        exceptionOfArray.checkException(arr2); //调用exceptionOfArray里面的checkException static方法
        //如果选择使用的是arr3，也就是null，那么返回值是NullpointerException,因为数组为空
        //如果选择使用的是arr2，那么返回的值是ArrayIndexOutOfBoundsException，因为数组输入的下标超过了数组的长度
    }


}
