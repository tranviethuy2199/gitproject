package ss11_collectionFramework.homework.controller;

import ss11_collectionFramework.homework.service.IProduct;
import ss11_collectionFramework.homework.service.impl.ProductService;

import java.util.Scanner;

public class ProductController {
    private static Scanner sc = new Scanner(System.in);
    private IProduct product = new ProductService();

    public void studentInformation() {
        while (true) {
            System.out.println("-----------------------------");
            System.out.println("商品管理 ");
            System.out.println("1. 新品を追加 : " );
            System.out.println("2 商品をなおす: ");
            System.out.println("3. 商品を決する: ");
            System.out.println("4. 商品を見せる : ");
            System.out.println("5. 商品を探す : ");
            System.out.println("6. 商品を並べる : ");
            System.out.println("7. 出口 ");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1 :
                   product.addProduct();
                    break;
                case 2 :
                  product.editProduct();
                    break;
                case 3 :
                   product.deleteProduct();
                    break;
                case 4 :
                    product.showProduct();
                    break;
                case 5 :
                    product.findProduct();
                    break;
                case 6 :
                    product.sortProduct();
                    break;
                case 7 :
                    return;
                default:
                    System.out.println("もう一回書いてください");
            }

        }
    }
}
