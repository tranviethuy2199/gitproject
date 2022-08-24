package LuyenTap.FuramaObject.controller;

import LuyenTap.FuramaObject.service.Interface.IFacilityService;
import LuyenTap.FuramaObject.service.impl.FacilityService;

import java.util.Scanner;

public class FacilityController {
    private static Scanner sc = new Scanner(System.in);
    private IFacilityService iFacilityService = new FacilityService();


    public void facilityService() {
        while (true) {
            System.out.println("----------------------------");
            System.out.println("Wellcome to Facility Manager");
            System.out.println("1.Add new Facility \n" +
                    "1.Add new Villa \n" +
                    "2.Add new House \n" +
                    "3.Add new Room \n" +
                    "3.Back to menu");
            System.out.println("1.Display facility ");        // danh sách hiển thị
            System.out.println("1.Display maintenance");     // danh sach bảo trì
            System.out.println("4.Return main menu");
            int choose = Integer.parseInt(sc.nextLine());
            int choice = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    switch (choice) {
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
