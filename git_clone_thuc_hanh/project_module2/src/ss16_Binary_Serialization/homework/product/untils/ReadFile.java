package ss16_Binary_Serialization.homework.product.untils;

import ss16_Binary_Serialization.homework.product.model.Product;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch(Exception ex){
            System.out.println("hiện tại không có sản phẩm , hãy nhập sản phẩm mới ");
        }
        return products;
    }
}
