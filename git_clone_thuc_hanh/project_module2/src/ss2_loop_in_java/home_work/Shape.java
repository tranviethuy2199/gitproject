package ss2_loop_in_java.home_work;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args) {
        menu();
    }
    static void printRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input width");
        System.out.println("input height");
        int width = sc.nextInt();
        int height = sc.nextInt();
        for (int i = 1; i <=width ; i++) {
            for (int j = 1; j <=height ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void printSquareTriangle(){
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" input heightTriangle");
//        int heightTriangle = sc.nextInt();
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 7; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
    static void printIsoscelesTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("input heightIsosceles");
        int heightIsosceles = sc.nextInt();
        for (int i = 1; i <=heightIsosceles*2 ; i+=2) {
            for (int j = 0; j <(heightIsosceles*2-i) ; j++) {
                System.out.println("");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }
        }
    }
    static void menu(){
        Scanner sc = new Scanner(System.in);
//        int chose = sc.nextInt();
       while (true) {
           System.out.println("input number you want print");
           System.out.println("1. print triangle");
           System.out.println("2. print square triangle");
           System.out.println("3. print isosceles triangle");
           int chose = sc.nextInt();                    // tránh để vòng lặp vô hạn , khai báo chose
           switch (chose) {
               case 1:
                   printRectangle();
                   break;
               case 2:
                   printSquareTriangle();
                   break;
               case 3:
                   printIsoscelesTriangle();
                   break;
           }

       }
    }
}
