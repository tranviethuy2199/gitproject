package LuyenTap.FuramaObject.controller;

import java.util.Scanner;

public class FurumaController {
    Scanner sc = new Scanner(System.in);
    ResortController resortController = new ResortController();
    NhanVienController nhanVienController = new NhanVienController();
    CustomerController customerController = new CustomerController();
    BookingController bookingController = new BookingController();
    FacilityController facilityController = new FacilityController();
    PromotionController promotionController = new PromotionController();


    public void generalManagement() {
        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Wellcome to Furama Resort DaNang");
            System.out.println("1.Employee Management");        // quản lí nhân viên
            System.out.println("2.Customer Management");        // quản lí khách hàng
            System.out.println("3.Booking Management");         // quản lí book phòng
            System.out.println("4.Promotion Management");      // quản lí khuyến mãi
            System.out.println("5.Facility Management ");      // quản lí cơ sở
            System.out.println("6.Exit");
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
                    System.out.println("Please enter again !");
            }
        }
    }
}
