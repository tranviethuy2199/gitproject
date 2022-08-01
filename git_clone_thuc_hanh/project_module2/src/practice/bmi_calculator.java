package practice;

import java.util.Scanner;

public class bmi_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("weight");
         double weight = scanner.nextDouble() ;

        System.out.println("height");
        double height = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");


        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");

    }
}
