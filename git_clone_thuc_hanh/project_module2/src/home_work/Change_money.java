package home_work;

import java.util.Scanner;

public class Change_money {
    public static void main(String[] args) {
        double VND = 23000 ;
        double USD ;
        double change;

        Scanner sc = new Scanner(System.in);
        System.out.println("how much money do you want to exchange ?");
        USD = sc.nextDouble();
        change = USD*VND;
        System.out.println("after changed" + change);


    }
}
