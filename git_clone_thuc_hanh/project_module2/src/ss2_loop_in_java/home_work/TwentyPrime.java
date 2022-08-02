package ss2_loop_in_java.home_work;

import java.util.Scanner;

public class TwentyPrime {
    public static void main(String[] args) {
        int a;
        int status = 1;
        int num = 3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to give 20 prime number:");
        // khai báo a để nhập số lượng nguyên tố
        a = scanner.nextInt();
        if (a == 2)
        {
            System.out.println(2);
        }

        for ( int i = 2 ; i <=20;  ) {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ ){
                if ( num%j == 0 ) {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 ) {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
}


