package LuyenTap.CaseStudy.controller;

import java.util.Scanner;

public class StaffCheck {
    public void displayInformation() {
        Scanner sc = new Scanner(System.in);
        int choose;
        //        StaffInformation staffInformation = new StaffInformation();

        while (true) {
            System.out.println("Mời bạn chọn chức năng");
            System.out.println("1. Tạo mới sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Chỉnh sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Kết thúc");
            System.out.print("Hãy chọn chức năng: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:

                    break;
                case 2:
                    StaffInformation.showAll();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);

            }
        }
    }
}

