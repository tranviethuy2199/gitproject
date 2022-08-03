package ss3_arrays_and_methods.homeWork;

import java.util.Scanner;

public class FindMaxInTwoArray {
    public static void main(String[] args) {
        //tìm giá trị lớn nhất trong mảng
     Scanner sc = new Scanner(System.in);
        System.out.println("nhập giá trị từng mảng ");

        double[][] array = new double[2][5];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array.length ; j++) {
                if (max<array[i][j]){
                    max = (int) array[i][j]; }

            }

        }
        System.out.println(max);
    }
}
