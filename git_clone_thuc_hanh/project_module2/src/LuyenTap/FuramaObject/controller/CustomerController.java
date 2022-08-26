package LuyenTap.FuramaObject.controller;

import LuyenTap.FuramaObject.service.Interface.ICustomerService;
import LuyenTap.FuramaObject.service.impl.CustomerService;

import java.io.IOException;
import java.util.Scanner;

public class CustomerController {
    private static Scanner sc = new Scanner(System.in);
    private ICustomerService icustomerService = new CustomerService();

    public void customerService() throws IOException {
        while (true) {
            System.out.println("-----------------------------");
            System.out.println(" Trang quản lí khách hàng");
            System.out.println("1.Thêm khách hàng mới ");       // add new customer
            System.out.println("2.Hiển thị danh sách ");        // display customer list
            System.out.println("3.Chỉnh sửa thông tin khách hàng");     // edit customer list
            System.out.println("4.Trở lại menu");               // return menu
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1: {
                    icustomerService.addCustomer();
                    break;
                }
                case 2: {
                    icustomerService.displayAllCustomer();
                    break;
                }
                case 3: {
                    icustomerService.editCustomer();
                    break;
                }
                case 4: {
                    return;
                }
            }
        }
    }
}
