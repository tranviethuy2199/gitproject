package LuyenTap.FuramaObject.controller;

import LuyenTap.FuramaObject.service.Interface.IFacilityService;
import LuyenTap.FuramaObject.service.impl.FacilityService;

import java.io.IOException;
import java.util.Scanner;

public class FacilityController {
    private static Scanner sc = new Scanner(System.in);
    private IFacilityService iFacilityService = new FacilityService();


    public void facilityService() throws IOException {
        while (true) {
            System.out.println("----------------------------");
            System.out.println("Trang quản lí cơ sở ");
            System.out.println("1.Thêm cơ sở mới  \n" +         // add new facility
                    "--------------------------- \n" +                // add new villa
                    "1.Thêm villa mới  \n" +                    // add new villa
                    "2.Thêm mới nhà \n" +                       // add new house
                    "3.Thêm mới phòng \n" +                     // add new room
                    "4.Back to menu");
            System.out.println("--------------------");
            System.out.println("2.Hiển thị danh sách");        // Display facility
            System.out.println("3.Danh sách bảo trì");     // Display maintenance
            System.out.println("4.Trở lại menu");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    switch (choose) {
                        case 1:
                            iFacilityService.addVilla();
                            break;
                        case 2:
                            iFacilityService.addHouse();
                            break;
                        case 3:
                            iFacilityService.addRoom();
                            break;
                    }
                    break;
                case 2:
                    iFacilityService.displayFaclity();
                    break;
                case 3:
                    iFacilityService.displayMaintenace();
                    break;
                case 4:
                    return;
            }
        }
    }
}
