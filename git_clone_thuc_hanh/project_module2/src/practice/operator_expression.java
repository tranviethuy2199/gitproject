package practice;

import java.util.Scanner;

public class operator_expression {
    public static void main(String[] args) {
        float width ;
        float height;

        Scanner scanner = new Scanner(System.in);   // khai báo đối tượng để nhận thông tin khi nhập

        System.out.println("enter width");
        width = scanner.nextFloat();

        System.out.printf("enter height");
        height = scanner.nextFloat();

        float area = width*height;
        System.out.printf("Area is :" + area);
    }
}
