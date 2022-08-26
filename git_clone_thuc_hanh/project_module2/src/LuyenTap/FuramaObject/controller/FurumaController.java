package LuyenTap.FuramaObject.controller;

import java.io.IOException;
import java.util.Scanner;

public class FurumaController {
    Scanner sc = new Scanner(System.in);
    ResortController resortController = new ResortController();
    NhanVienController nhanVienController = new NhanVienController();
    CustomerController customerController = new CustomerController();
    BookingController bookingController = new BookingController();
    FacilityController facilityController = new FacilityController();
    PromotionController promotionController = new PromotionController();


    public void generalManagement() throws IOException {
        while (true) {
            System.out.println("---------------------------------------");
            System.out.println("Chào mừng đến với  Furama Resort DaNang");
            System.out.println("1.Quản lí nhân viên ");         // Employee Management
            System.out.println("2.Quản lí khách hàng");        // customer Management
            System.out.println("3.Quản lí dịch vụ ");         //Booking Management
            System.out.println("4.Quản lí khuyến mãi");      // Promotion Management
            System.out.println("5.Quản lí cơ sở ");         // Facility Management
            System.out.println("6.Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 :
                   nhanVienController.nhanVienService();
                    break;
                case 2 :
                    customerController.customerService();
                    break;
                case 3 :
                   bookingController.bookingService();
                    break;
                case 4 :
                    promotionController.promotionService();
                    break;
                case 5 :
                    facilityController.facilityService();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Vui lòng nhập lại !");
            }
        }
    }
}
