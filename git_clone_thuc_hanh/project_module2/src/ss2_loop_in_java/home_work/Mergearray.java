package ss2_loop_in_java.home_work;

import java.util.Arrays;

public class Mergearray {
    public static void main(String[] args) {
        int []number = {1,2,3,4,5};
        int []numberOne = {4,5,6,7,8};

        // khai báo độ dài của hai mảng
        int length = number.length+numberOne.length;
        int [] arr = new int[length];
        int value = 0;
        for (int index : number) {
            arr[value] = index;
            value++;
        }
        for (int index : numberOne) {
            arr[value] = index;
            value++;
        }
        System.out.println(Arrays.toString(arr));



    }
}
