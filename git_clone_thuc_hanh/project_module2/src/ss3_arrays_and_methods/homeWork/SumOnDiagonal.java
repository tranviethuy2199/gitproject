package ss3_arrays_and_methods.homeWork;

import java.util.Scanner;

public class SumOnDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row,col;
        System.out.println("nhập số lượng mảng");
        row = Integer.parseInt(sc.nextLine());

        double[][] array = new double[row][];

        for (int i = 0; i <array.length ; i++) {
            System.out.println("mảng có bao nhiêu phần tử :" + i );
            col = Integer.parseInt(sc.nextLine());
            array[i] = new double[col];
            for (int j = 0; j <array.length ; j++) {
                System.out.println("nhập : " + j );
                array[i][j] = Double.parseDouble(sc.nextLine());
            }
        }
        int sum = 0 ;

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                if (i== j) {
                    sum += array[i][j];

                }

            }

        }
        System.out.println("tổng của đường chéo là : " + sum);

    }
}
