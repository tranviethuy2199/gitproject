package ss2_loop_in_java.home_work;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeleteInArray {
    public static void main(String[] args) {
        int[] number = {10, 4, 6, 7, 8, 6, 5, 4};
        Scanner sc = new Scanner(System.in);
        System.out.println("input value you want delete !?");
        int value = sc.nextInt();
//        System.out.println(number + " first number");
        for (int i = 0; i <number.length ; i++) {
            if (value==number[i]) {
                for (int j = i; j <number.length-1 ; j++) {
                    number[j]=number[j+1];
                }
                number[number.length-1]=0;
                break;
            }
        }
        System.out.println(Arrays.toString(number));

    }
}
