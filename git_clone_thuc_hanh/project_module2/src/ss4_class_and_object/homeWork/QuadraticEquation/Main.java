package ss4_class_and_object.homeWork.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("nhập số a :");
        double a = sc.nextDouble();

        System.out.println("nhập số b :");
        double b = sc.nextDouble();

        System.out.println("nhập số c :");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);


        double delta = quadraticEquation.getDiscriminant();


        if (delta >0) {
            System.out.println("phương trình tồn tại hai nghiệm là :");
            System.out.println("x1" + "= " +quadraticEquation.getRoot1() + "\n" +"x2"+"= "+ quadraticEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println(quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
