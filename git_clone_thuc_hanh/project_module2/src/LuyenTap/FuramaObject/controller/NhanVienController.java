package LuyenTap.FuramaObject.controller;

import LuyenTap.FuramaObject.service.Interface.INhanVienService;
import LuyenTap.FuramaObject.service.impl.NhanVienService;

import java.util.Scanner;

public class NhanVienController {
    private static Scanner sc = new Scanner(System.in);
    private INhanVienService iNhanVienService = new NhanVienService();


    //1 Display list employees
//2	Add new employee
//3	Edit employee
//4	Return main menu
    public void nhanVienService() {
        while (true) {
            System.out.println("Wellcome to Employee Manager");
            System.out.println("1.Display list Employee");
            System.out.println("2. Add new Employee");
            System.out.println("3.Edit employee");
            System.out.println("4.Return main menu");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1: {
                    iNhanVienService.displayAllEmployee();
                    break;
                }
                case 2: {
                    iNhanVienService.addEmployee();
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