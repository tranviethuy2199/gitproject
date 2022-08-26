package LuyenTap.FuramaObject.service.impl;

import LuyenTap.FuramaObject.model.Booking;
import LuyenTap.FuramaObject.service.Interface.IBookingService;
import LuyenTap.FuramaObject.service.Interface.ICustomerService;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookingService implements IBookingService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Booking> bookings = new ArrayList<>();
    private ICustomerService customerService = new CustomerService();

//    public static void main(String[] args) {
//        System.out.println(isDataValid("202c-01-01"));
//    }
//     static boolean isDataValid(String target) {
//        try {
//            LocalDate.parse(target);
//            return true;
//        }catch (DateTimeParseException ex) {
//            return false;
//        }
//    }

    @Override
    public void addBooking() throws IOException {
      Booking booking = bookingInfo();
      bookings.add(booking);
        System.out.println("thêm mới thành công");
    }
//    mã booking, ngày bắt đầu, ngày kết thúc,
//    mã khách hàng, tên dịch vụ, loại dịch vụ.(tour , gia đình , cặp đôi , một mình)
    private Booking bookingInfo() throws IOException {
        System.out.println("-------------------");
        customerService.displayAllCustomer();
        System.out.println("-------------------");
        System.out.println("Tên dịch vụ ");
        String tenDichVu = sc.nextLine();
        System.out.println("Nhập mã booking");
        String maBooking = sc.nextLine();
        System.out.println("Ngày bắt đầu yyyy-MM-dd");
        String ngayBatDau;
        LocalDate nBBD;
        while (true) {
            try {
                ngayBatDau = sc.nextLine();
                 nBBD = LocalDate.parse(ngayBatDau);
                if (!ngayBatDau.matches("(^(((0[1-9]|1[0-9]|2[0-8])[\\\\/](0[1-9]|1[012]))|((29|30|31)[\\\\/](0[13578]|1[02]))|((29|30)[\\\\/](0[4,6,9]|11)))[\\\\/](19|[2-9][0-9])\\\\d\\\\d$)|(^29[\\\\/]02[\\\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)\"")) {
                    break;
                }else {
                    throw new InputMismatchException("Nhập sai thời gian hoặc định dạng \n" +
                            "Hãy nhập theo dạng yy-MM-dd ");
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
                //throw new InputMismatchException("không nên nhập ký tự số");
            }
        }
        System.out.println("Ngày kết thúc yyyy-MM-dd ");
        String ngayKetThuc;
        LocalDate nKT;
        while (true) {
            try {
                ngayKetThuc = sc.nextLine();
                if (!ngayKetThuc.matches("(^(((0[1-9]|1[0-9]|2[0-8])[\\\\/](0[1-9]|1[012]))|((29|30|31)[\\\\/](0[13578]|1[02]))|((29|30)[\\\\/](0[4,6,9]|11)))[\\\\/](19|[2-9][0-9])\\\\d\\\\d$)|(^29[\\\\/]02[\\\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)\"")) {
                    nKT = LocalDate.parse(ngayKetThuc);
                    if (nKT.isBefore(nBBD)) {
                        System.out.println("nhập sai, mời nhập lại");
                    } else {
                        System.out.println("----- ");
                        break;
                    }
                }else {
                    throw new InputMismatchException("Nhập sai thời gian hoặc định dạng \n" +
                            "Hãy nhập theo dạng dd-MM-yyy ");
                }

            }catch (Exception e) {
                System.out.println(e.getMessage());
                //throw new InputMismatchException("không nên nhập ký tự số");
            }
        }
        System.out.println("Lựa chọn dịch vụ \n" +
                "1.Tour \n" +
                "2.Gia đình \n" +
                "3.Couple \n" +
                "4.Một mình");
        String loaiDichVu = null;
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                loaiDichVu = "Tour";
                break;
            case 2:
                loaiDichVu = "Gia đình";
                break;
            case 3:

                loaiDichVu = "Couple";
                break;
            case 4:
                loaiDichVu = "Một mình";
                break;

        }
        return new Booking(tenDichVu,maBooking,ngayBatDau,ngayKetThuc,loaiDichVu);
    };


    @Override
    public void displayAllBooking() {

    }

    @Override
    public void createConstracts() {

    }

    @Override
    public void diplayConstracts() {

    }

    @Override
    public void editConstracts() {

    }
}
