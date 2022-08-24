package ss16_Binary_Serialization.homework.product.service.impl;

import ss16_Binary_Serialization.homework.product.model.Product;
import ss16_Binary_Serialization.homework.product.service.iterface.IProduct;
import ss16_Binary_Serialization.homework.product.untils.ReadFile;
import ss16_Binary_Serialization.homework.product.untils.WriteFile;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IProduct {
    private static Scanner sc = new Scanner(System.in);
    private static List<Product> productList ;
    static {
        try{
        productList = ReadFile.readDataFromFile("src\\ss16_Binary_Serialization\\homework\\data\\product.dat");
    }catch (Exception e) {
        e.printStackTrace();
        }
    }
    private static final String PATH = "src\\ss16_Binary_Serialization\\homework\\data\\product.dat";




    @Override
    public void addProduct() {
        productList = ReadFile.readDataFromFile("src\\ss16_Binary_Serialization\\homework\\data\\product.dat");
        Product product = productInfo();
        productList.add(product);
        System.out.println("thêm mới thành công");
        WriteFile.writeToFile("src\\ss16_Binary_Serialization\\homework\\data\\product.dat",productList);

    }
    private Product productInfo() {
        System.out.print("nhập mã sản phẩm :  ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("nhập tên sản phẩm  :  ");
        String name = sc.nextLine();
        System.out.print("nhập hãng sản xuất : ");
        String mannufacturer = sc.nextLine();
        System.out.println("nhập giá : ");
        double price = Double.parseDouble(sc.nextLine());
        return new Product(id,name,mannufacturer,price);


    }

    @Override
    public void displayProduct() {
        productList = ReadFile.readDataFromFile("src\\ss16_Binary_Serialization\\homework\\data\\product.dat");
        for (Product product : productList) {
            System.out.println(product);
        }

    }

    @Override
    public void findProduct() {
        productList = ReadFile.readDataFromFile("src\\ss16_Binary_Serialization\\homework\\data\\product.dat");
       Product product = this.findId();
        System.out.println(product);


    }

    private Product findId() {
        System.out.println("nhập id hàng hóa ");
        int findId = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == findId) {
                System.out.println(" ID :" + productList.get(i));
                return productList.get(i);
            }
        }
        return null;

    }


}
