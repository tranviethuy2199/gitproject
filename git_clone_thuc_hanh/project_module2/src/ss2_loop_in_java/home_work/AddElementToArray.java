package ss2_loop_in_java.home_work;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int [] number ={1,2,3,4,5,6};     // 1,5,3,4,5,6
        Scanner sc = new Scanner(System.in);
        System.out.println("input location number you want");
        int value = sc.nextInt();
        System.out.println("input number you want add");
        int add = sc.nextInt();
        for (int i =number.length-1; i >value ; i--) {
            number[i]=number[i-1];
            }
        number[value] = add;
        System.out.println(Arrays.toString(number));

    }
}
