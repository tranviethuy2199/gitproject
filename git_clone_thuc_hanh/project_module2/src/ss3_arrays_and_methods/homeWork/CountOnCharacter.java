package ss3_arrays_and_methods.homeWork;

import java.util.Scanner;

public class CountOnCharacter {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String chain;
        System.out.println("nhập chuỗi kí tự ");
        chain = sc.nextLine();  // dùng để nhập chuỗi kí tự

        System.out.println("nhập kí tự bạn muốn tìm");
        char wold = sc.nextLine().charAt(0);
        int count = 0 ;

        for (int i = 0; i < chain.length() ; i++) {
            if (wold == chain.charAt(i)){
                count++;
            }

        }
        System.out.println("số lượng kí tự bạn tìm có trong mảng là :" + count);


    }

}
