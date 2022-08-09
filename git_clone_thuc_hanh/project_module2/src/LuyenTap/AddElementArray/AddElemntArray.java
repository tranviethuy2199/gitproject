package LuyenTap.AddElementArray;

import java.util.Arrays;
import java.util.Scanner;

public class AddElemntArray {
    public static void main(String[] args) {

        // thêm một số vào trong mảng vd : 1,2,3,4,5 ---> 1,2,5,3,4,5
//        int [] number ={1,2,3,4,5,6};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("input location number you want");
//        int value = sc.nextInt();
//        System.out.println("input number you want add");
//        int add = sc.nextInt();
//        for (int i =number.length-1; i >value ; i--) {
//            number[i]=number[i-1];
//            }
//        number[value] = add;
//        System.out.println(Arrays.toString(number));

        int n = 0;

        Scanner sc = new Scanner(System.in);

        // khởi tạo mảng chứa số lượng các số được nhập từ bàn phím
        do {
            System.out.println("input amount number in array you want !");
            n = sc.nextInt();
        }while (n<0);

        int[] array = new int[n];

        // sau khi tạo mảng thì nhập các phần tử cho mảng
        for (int i = 0; i <n ; i++) {
            System.out.println("input anything number you want to enter in array");
            array[i] = sc.nextInt();
        }

        System.out.println("input LOCATION OF NUMBER IN ARRAY you want");
        int value = sc.nextInt();
        System.out.println("input number you want add");
        int add = sc.nextInt();
        for (int i = array.length-1; i > value ; i--) {
            array[i] = array[i-1];
        }
        array[value] = add;
        System.out.println(Arrays.toString(array));

    }
}
