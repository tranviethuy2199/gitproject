package ss3_arrays_and_methods.homeWork;

import java.util.Scanner;

public class TotalNumberInColumn {
    public static void main(String[] args) {
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
        int sum = 0;
        int input;
        System.out.println("nhâp cột muốn xóa : ");
        input = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == input) {
                    sum += array[i][j];
                }

            }
        }
        System.out.println("tổng của cột là :" + sum);

    }

}
