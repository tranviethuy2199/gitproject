package ss16_Binary_Serialization.homework.product.controller;

import ss16_Binary_Serialization.homework.product.service.impl.ProductService;
import ss16_Binary_Serialization.homework.product.service.iterface.IProduct;

import java.util.Scanner;

public class ProductController {
    private static Scanner sc = new Scanner(System.in);
    private static IProduct product = new ProductService();

    public void productInfo() {
        while (true) {
            System.out.println("-----------------------------");
            System.out.println("1. add new product : ");
            System.out.println("2. display product ");
            System.out.println("3. find product");
            System.out.println("4. Exit ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    product.addProduct();
                    break;
                case 2:
                    product.displayProduct();
                    break;
                case 3:
                    product.findProduct();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("input again");
            }
        }
    }
}
