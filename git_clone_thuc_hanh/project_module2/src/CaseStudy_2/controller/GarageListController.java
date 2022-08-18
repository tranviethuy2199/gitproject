package CaseStudy_2.controller;

import CaseStudy_2.service.impl.CarService;
import CaseStudy_2.service.impl.MotobikeService;
import CaseStudy_2.service.impl.TruckService;

import java.util.Scanner;

public class GarageListController {
    Scanner sc = new Scanner(System.in);
    CarController carController = new CarController();
    TruckController truckController = new TruckController();
    MotobikeController motobikeController = new MotobikeController();

    public void menuManager() {
        while (true) {
            System.out.println("---------------------");
            System.out.println("Police Garage");
            System.out.println("1.Add Vehicle");
            System.out.println("2.Show Vehicle");
            System.out.println("3.Delete Vehicle");
            System.out.println("4.Find Vehicle");
            System.out.println("Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 :
                    switch (choice) {
                        case 1 :
                            CarService.addCar();
                            break;
                        case 2 :
                            TruckService.addTruck();
                            break;
                        case 3 :
                            MotobikeService.addMotobike();
                    }
                case 2 :
                    switch (choice) {
                        case 1 :
                            CarService.showCar();
                            break;
                        case 2 :
                            TruckService.showTruxck();
                            break;
                        case 3 :
                            MotobikeService.showMotobike();
                            break;
                    }
                case 3:
                    switch (choice) {
                    case 1 :
                        CarService.deleteCar();
                        break;
                    case 2 :
                        TruckService.deleteTruxck();
                        break;
                    case 3 :
                        MotobikeService.deleteMotobike();
                        break;
                }
                case 4 :
                   GarageListController.displayAllBienSo();
            }
        }
    }

    private static void displayAllBienSo() {
    }
}
