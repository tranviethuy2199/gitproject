package LuyenTap.FuramaObject.controller;

import LuyenTap.FuramaObject.service.Interface.IBookingService;
import LuyenTap.FuramaObject.service.impl.BookingService;

import java.io.IOException;
import java.util.Scanner;

public class BookingController {
    private static Scanner sc = new Scanner(System.in);
    private IBookingService iBookingService = new BookingService();

//1.	Add new booking
//2.	Display list booking
//3.	Create new constracts
//4.	Display list contracts
//5.	Edit contracts
//6.	Return main menu


    public void bookingService() throws IOException {
        while (true) {
            System.out.println("Wellcome to Furama Resort Manager");
            System.out.println("1.Đặt hẹn trước ");                // Add new booking
            System.out.println("2.Hiển thị lịch đã hẹn");          // 2.Display list booking
            System.out.println("3.Tạo hợp đồng mới");         // Create new contracts
            System.out.println("4.Hiển thị hợp đồng");        // Display list contracts
            System.out.println("5.Chỉnh sửa hợp đồng");        //Edit contracts
            System.out.println("6.Trở lại menu");
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1: {
                    iBookingService.addBooking();
                    break;
                }
                case 2: {
                    iBookingService.displayAllBooking();
                    break;
                }
                case 3: {
                    iBookingService.createConstracts();
                    break;
                }
                case 4: {
                    iBookingService.diplayConstracts();
                }
                case 5: {
                    iBookingService.editConstracts();
                }
                case 6: {
                    return;
                }
            }
        }
    }
}
