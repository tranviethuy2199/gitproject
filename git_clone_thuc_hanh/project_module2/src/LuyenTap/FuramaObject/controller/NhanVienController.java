package LuyenTap.FuramaObject.controller;

import LuyenTap.FuramaObject.service.Interface.INhanVienService;
import LuyenTap.FuramaObject.service.impl.NhanVienService;

import java.io.IOException;
import java.util.Scanner;

public class NhanVienController {
    private static Scanner sc = new Scanner(System.in);
    private INhanVienService iNhanVienService = new NhanVienService();


    //1 Display list employees
//2	Add new employee
//3	Edit employee
//4	Return main menu
    public void nhanVienService() throws IOException {
        while (true) {
            System.out.println("--------------------------");
            System.out.println("Trang quản lí khách hàng ");         //Wellcome to Employee Manager
            System.out.println("1.Thêm mới nhân viên  ");                               // .Display list Employee
            System.out.println("2.Hiển thị danh sách nhân viên ");
            System.out.println("3.Chỉnh sửa thông tin nhân viên ");
            System.out.println("4.Trở lại menu");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1: {
                    iNhanVienService.addEmployee();
                    break;
                }
                case 2: {
                    iNhanVienService.displayAllEmployee();
                    break;
                }
                case 3: {
                    iNhanVienService.editEmployee();
                    break;
                }
                case 4: {
                    return;
                }
            }
        }
    }
}