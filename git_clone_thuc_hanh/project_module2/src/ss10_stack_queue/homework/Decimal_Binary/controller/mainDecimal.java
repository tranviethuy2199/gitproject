package ss10_stack_queue.homework.Decimal_Binary.controller;

import ss10_stack_queue.homework.Decimal_Binary.model.DecimalBinary;

import java.util.Scanner;

public class mainDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số chuyển đổi");
        int number = Integer.parseInt(sc.nextLine());

        DecimalBinary.transfer(number);;

    }
}
