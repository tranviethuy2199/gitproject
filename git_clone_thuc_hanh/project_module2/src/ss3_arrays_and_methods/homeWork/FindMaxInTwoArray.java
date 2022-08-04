package ss3_arrays_and_methods.homeWork;

import java.util.Scanner;

public class FindMaxInTwoArray {
    public static void main(String[] args) {
        //tìm giá trị lớn nhất trong mảng
//     Scanner sc = new Scanner(System.in);
//        System.out.println("nhập giá trị từng mảng ");
//
//        double[][] array = new double[2][5];
//        for (int i = 0; i <array.length ; i++) {
//            for (int j = 0; j <array[i].length ; j++) {
//                array[i][j] = sc.nextInt();
//            }
//        }
//        int max = 0;
//        for (int i = 0; i <array.length ; i++) {
//            for (int j = 0; j <array.length ; j++) {
//                if (max<array[i][j]){
//                    max = (int) array[i][j]; }
//
//            }
//
//        }
//        System.out.println(max);
        Scanner sc = new Scanner(System.in);
        int row, col;
        System.out.println("nhập số mảng ");
        row = Integer.parseInt(sc.nextLine());
        double[][] array = new double[row][];


        for (int i = 0; i < array.length; i++) {
            System.out.println("nhập số lượng phần tử có trong mảng: [" + i + "]");
            col = Integer.parseInt(sc.nextLine());
            array[i] = new double[col];
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("nhấp :" + j);
                array[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (max < array[i][j]) {
                    max = (int) array[i][j];
                }

            }
        }
        System.out.println("số lớn nhất là :" + max);
    }
}
