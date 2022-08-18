package ss13_sortAlgorithm.practice.settingAlgorthm;

import java.util.Scanner;

public class settingAlgorthm {
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;

        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;

                    needNextPass = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong phan tu trong mang");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("nhap phan tu");
        for (int i = 0; i < n ; i++) {
                arr[i] = sc.nextInt();
        }
       bubbleSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
