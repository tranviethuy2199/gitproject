package ss12_LinearSearch.homework.SettingLinearSearch.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchBinary {
     public static int binarySearch(int[] arr, int k, int left, int right) {
        int mid = (left + right)/2;

        // trường hợp bằng
        if (arr[mid] == k) {
            return mid;
        }

        // trường hợp value lớn hơn
        if (k > arr[mid]) {
            return binarySearch(arr, k,  mid +1,right);
        }

        // trường hợp nhỏ hơn
        if (k < arr[mid]) {
            return binarySearch(arr, k , left,mid - 1);
        }
        return -1;
    }

    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }


}
