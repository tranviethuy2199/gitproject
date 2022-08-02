package introduction_to_java.home_work;

import java.util.Scanner;

public class Show_greetings {

    public static class main {
        public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);      // khởi tạo và NHẬN MỘT DỮ LIỆU KHI NHẬP TỪ HỆ THỐNG


            System.out.println("Enter your name");   // dòng này có thể không hoặc có , vì dùng để mô tả dễ nhìn
                                                     // giống với prompt


            String name = sc.nextLine();             //phương thức nextLine() để tạo để nhập tên từ bàn phím.


            System.out.println("Hello" + name);
        }
    }
}
