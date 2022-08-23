package ss16_Binary_Serialization.practice.testFileStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args) throws IOException {

        try (FileOutputStream output = new FileOutputStream("temp.dat")) {
            for (int i = 1; i <= 10; i++)
                output.write(i);
        }
        try (
                FileInputStream input = new FileInputStream("temp.dat")) {
            int value;
            while ((value = input.read()) != -1)
                System.out.print(value + " ");
        }
    }
}
//    Chương trình sử dụng try-with-resources để khai báo và tạo các luồng
//     đầu vào và đầu ra để chúng sẽ tự động đóng lại sau khi chúng được sử dụng
