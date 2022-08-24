package ss16_Binary_Serialization.homework.product.untils;

import ss16_Binary_Serialization.homework.product.model.Product;

import java.io.*;
import java.util.List;

public class WriteFile {

    public static void writeToFile(String path, List<Product> productList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(productList);
            objectOutputStream.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
