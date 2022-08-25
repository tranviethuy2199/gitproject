package LuyenTap.FuramaObject.service.impl;

import LuyenTap.FuramaObject.model.Person.Customer;
import LuyenTap.FuramaObject.service.Interface.ICustomerService;
import LuyenTap.FuramaObject.untils.customerFile.ReadFile;
import LuyenTap.FuramaObject.untils.customerFile.WriteFile;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static Scanner sc = new Scanner(System.in);
    private List<Customer> customers = new LinkedList<>();
    static {
        try {
            ReadFile.readFile("src\\LuyenTap\\FuramaObject\\data\\customerFile");
        } catch (IOException e) {
            e.printStackTrace();
        }
}

    @Override
    public void displayAllCustomer() throws IOException {
        customers = ReadFile.readCustomerFile("src\\LuyenTap\\FuramaObject\\data\\customerFile");
        for (Customer customer : customers){
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() throws IOException {
        customers = ReadFile.readCustomerFile("src\\LuyenTap\\FuramaObject\\data\\customerFile");
        Customer customer = customerInfor();
        customers.add(customer);
        System.out.println("Thêm mới khách hàng thành công! ");
        WriteFile.writeCustomerFile("src\\LuyenTap\\FuramaObject\\data\\customerFile",customers);
    }

    private Customer customerInfor() {
        System.out.println("--------------------------");
        System.out.println("nhập họ và tên");
        String hoVaTen = sc.nextLine();
        System.out.println("nhập ngày sinh");
        String ngaySinh = sc.nextLine();
        System.out.println("nhập chứng minh nhan dan ");
        int cmnd = Integer.parseInt(sc.nextLine());
        System.out.println("nhập sdt");
        int sdt = Integer.parseInt(sc.nextLine());
        System.out.println("nhập email");
        String email = sc.nextLine();
        System.out.println("nhập mã khách hàng");
        String maKhachHang = sc.nextLine();
        System.out.println("chọn loại khách hàng \n  " +
                "1. Diamond \n" +
                "2. Platinium \n" +
                "3. Gold \n" +
                "4. Silver\n" +
                "5. Member ");
        String khacHang = null;
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                khacHang = "Diamond";
                break;
            case 2:
                khacHang = "Platinium";
                break;
            case 3:
                khacHang = "Gold";
                break;
            case 4:
                khacHang = "Silver ";
                break;
            case 5:
                khacHang = "Member ";
                break;
        }
        System.out.println("nhập địa chỉ ");
        String diaChi = sc.nextLine();

        return new Customer(hoVaTen, ngaySinh, cmnd, sdt, email, maKhachHang, diaChi);
    }

    @Override
    public void editCustomer() throws IOException {
        customers = ReadFile.readCustomerFile("src\\LuyenTap\\FuramaObject\\data\\customerFile");
        System.out.println("Nhập ID khách hàng cần chỉnh sửa: ");
        String idEdit = sc.nextLine();
        Customer temp = null;
        Customer customer = null;
        for (Customer customer1 : customers) {
            if (customer.getMaKhachHang() == idEdit) {
                temp = customer;
                System.out.println("--------------------------");
                System.out.println("nhập họ và tên");
                String hoVaTen = sc.nextLine();
                System.out.println("nhập ngày sinh");
                String ngaySinh = sc.nextLine();
                System.out.println("nhập chứng minh nhan dan ");
                int cmnd = Integer.parseInt(sc.nextLine());
                System.out.println("nhập sdt");
                int sdt = Integer.parseInt(sc.nextLine());
                System.out.println("nhập email");
                String email = sc.nextLine();
                System.out.println("nhập mã khách hàng");
                String maKhachHang = sc.nextLine();
                System.out.println("chọn loại khách hàng \n  " +
                        "1. Diamond \n" +
                        "2. Platinium \n" +
                        "3. Gold \n" +
                        "4. Silver\n" +
                        "5. Member ");
                String khacHang = null;
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        khacHang = "Diamond";
                        break;
                    case 2:
                        khacHang = "Platinium";
                        break;
                    case 3:
                        khacHang = "Gold";
                        break;
                    case 4:
                        khacHang = "Silver ";
                        break;
                    case 5:
                        khacHang = "Member ";
                        break;
                }
                System.out.println("nhập địa chỉ ");
                String diaChi = sc.nextLine();
                System.out.println("Chỉnh sửa khách hàng thành công! ");
                customer1 = new Customer(hoVaTen,ngaySinh,cmnd,sdt,email,maKhachHang,diaChi);
                break;
            }
        }
        if (temp!=null){
            int index=customers.indexOf(temp);
            customers.set(index,customer);
        }
    }

}