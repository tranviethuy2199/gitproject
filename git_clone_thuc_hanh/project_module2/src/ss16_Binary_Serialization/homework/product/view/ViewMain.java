package ss16_Binary_Serialization.homework.product.view;

import ss16_Binary_Serialization.homework.product.controller.ProductController;

public class ViewMain {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.productInfo();
    }
}
