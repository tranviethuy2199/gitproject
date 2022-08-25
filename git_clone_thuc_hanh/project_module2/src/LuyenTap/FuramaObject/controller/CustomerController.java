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
            System.out.println("Wellcome to Customer Manager");
            System.out.println("1.Add new Customer");
            System.out.println("2.Display list Customer");
            System.out.println("3.Edit Customer");
            System.out.println("4.Return main menu");
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
