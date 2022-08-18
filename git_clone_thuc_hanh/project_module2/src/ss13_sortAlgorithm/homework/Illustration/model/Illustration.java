package ss13_sortAlgorithm.homework.Illustration.model;

import java.util.Arrays;
import java.util.Scanner;

public class Illustration {
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = 0;
            int a = arr[i];
            System.out.println("số bị hoán đổi là : " + a );
            for (j = i - 1; j >= 0 && arr[j] > a; j--) {
                arr[j + 1] = arr[j];
                System.out.println("đã hoán đổi với số : " + arr[j]);
            }
            arr[j+1] = a;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("nhập phần tử ");
        for (int i = 0; i < n ; i++) {
            array[i] = scanner.nextInt();

        }
        System.out.println("mảng đã nhập là " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("mảng sau khi được sắp xếp " +Arrays.toString(array));
    }
}
