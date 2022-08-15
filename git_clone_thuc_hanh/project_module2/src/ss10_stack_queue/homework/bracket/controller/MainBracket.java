package ss10_stack_queue.homework.bracket.controller;

import ss10_stack_queue.homework.bracket.model.Bracket;

import java.util.Scanner;

public class MainBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập biểu thức có dấu ngoặc");
        String string = sc.nextLine();
//        Bracket.checkBracket(string);
        System.out.println(Bracket.checkBracket( string)? "YES" : "NO");
    }
}
