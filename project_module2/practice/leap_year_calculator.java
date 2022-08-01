package practice;

import java.util.Scanner;

public class leap_year_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("enter a year");
        int year = scanner.nextInt();
        String y  = ( year % 4 == 0 && !(year % 100 == 0 && year % 400 == 0) )? "is not a leap year" : "leap year";
        System.out.println(y);
    }
}
