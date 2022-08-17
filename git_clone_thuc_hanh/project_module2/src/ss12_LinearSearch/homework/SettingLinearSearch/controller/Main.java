package ss12_LinearSearch.homework.SettingLinearSearch.controller;

import ss12_LinearSearch.homework.SettingLinearSearch.model.SearchBinary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//         int[] arr = {2,3,5,6,7,8,10,15,250,350,9};
//        System.out.println(SearchBinary.binarySearch(arr,15,0,arr.length-1));
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số phần tử của mảng ");
        int number = sc.nextInt();
        int[] arr = new int[number];

        System.out.println("nhập phần tử ");
        for (int i = 0; i < number ; i++) {
            arr[i] = sc.nextInt();
        };

        System.out.println("nhập số cần tìm trong mảng");
        int number1 = sc.nextInt();

        SearchBinary.sortASC(arr);
        System.out.println(arr);
        System.out.println(SearchBinary.binarySearch(arr,number1,0,arr.length-1));
    }
}
