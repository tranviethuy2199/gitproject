package ss10_stack_queue.homework.Palindrome.controller;

import ss10_stack_queue.homework.Palindrome.model.Palindrome;

import java.util.Scanner;

public class MainPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi");
        String string = sc.nextLine();

        Palindrome.reversePalindrome(string);
    }
}
