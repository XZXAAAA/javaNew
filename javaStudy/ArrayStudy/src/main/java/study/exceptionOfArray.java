package study;

import java.util.Arrays;

public class exceptionOfArray{
    public static void checkException(int[] arr){
            try {
                System.out.println(arr[arr.length+5]);
            } catch (Exception e) {
                System.out.println(e.getClass());
            }
        }
    }



