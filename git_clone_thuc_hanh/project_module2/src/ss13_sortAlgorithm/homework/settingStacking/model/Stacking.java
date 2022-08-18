package ss13_sortAlgorithm.homework.settingStacking.model;

import java.util.Arrays;
import java.util.Scanner;

public class Stacking {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = 0;
            int x = array[i];
            for ( j = i - 1; j >= 0 && array[j] > x; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử ");
        int n = sc.nextInt();
        int[] array = new int[n];

        System.out.println("nhập phần tử ");
        for (int i = 0; i < n ; i++) {
            array[i] = sc.nextInt();

        }
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
