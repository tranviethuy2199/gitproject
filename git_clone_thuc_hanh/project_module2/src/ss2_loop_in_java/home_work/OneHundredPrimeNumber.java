package ss2_loop_in_java.home_work;

import java.util.Scanner;

public class OneHundredPrimeNumber {
    public static void main(String[] args) {
        System.out.println("Hiển thị 100 số nguyên tố ");

        for (int i = 2; i < 100 ; i++) {
            int count = 0;
            for (int j = 1; j <= i ; j++) {
                if (i%j == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println(i+"");
            }
        }
    }
}
