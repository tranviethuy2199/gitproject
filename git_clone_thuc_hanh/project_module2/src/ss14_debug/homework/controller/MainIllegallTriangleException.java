package ss14_debug.homework.controller;

import ss14_debug.homework.model.Triangle;

import java.util.Scanner;

public class MainIllegallTriangleException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập cách cạnh của tam giác ABC");
        Triangle triangle;
        while (true) {
            try{
                double a = Double.parseDouble(sc.nextLine());
                double b = Double.parseDouble(sc.nextLine());
                double c = Double.parseDouble(sc.nextLine());
                triangle = new Triangle(a,b,c);
                break;
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }catch (Exception e) {};
        }
        System.out.println(triangle);

    }

}
