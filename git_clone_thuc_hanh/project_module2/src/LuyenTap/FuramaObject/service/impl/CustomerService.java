package LuyenTap.FuramaObject.service.impl;

import LuyenTap.FuramaObject.model.Person.khachHang;
import LuyenTap.FuramaObject.service.Interface.ICustomerService;
import LuyenTap.FuramaObject.untils.customerFile.ReadFile;
import LuyenTap.FuramaObject.untils.customerFile.WriteFile;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static Scanner sc = new Scanner(System.in);
    private List<khachHang> customers = new LinkedList<>();

    static {
        try {
            ReadFile.readFile("src\\LuyenTap\\FuramaObject\\data\\customerFile");
        } catch (IOException e) {
            System.out.println("File rỗng , hãy nhập thông tin !");
        }
    }

    @Override
    public void displayAllCustomer() throws IOException {
        customers = ReadFile.readCustomerFile("src\\LuyenTap\\FuramaObject\\data\\customerFile");
        for (khachHang customer : customers) {
            System.out.println(customer);
        }
    }

    @Override
    public void addCustomer() throws IOException {
        customers = ReadFile.readCustomerFile("src\\LuyenTap\\FuramaObject\\data\\customerFile");
        khachHang customer = customerInfor();
        customers.add(customer);
        System.out.println("Thêm mới khách hàng thành công! ");
        WriteFile.writeCustomerFile("src\\LuyenTap\\FuramaObject\\data\\customerFile", customers);
    }

    private khachHang customerInfor() {
        System.out.println("--------------------------");
        System.out.println("nhập họ và tên");
        String hoVaTen;
        while (true) {
            try {
            hoVaTen = sc.nextLine();
            if (hoVaTen.matches("[A-Za-zvxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ ]{5,50}")) {
                break;
            } else {
                throw new InputMismatchException("Nhập sai định dạng của họ và tên ");
            }
        }catch (Exception e) {
                System.out.println(e.getMessage());
                //throw new InputMismatchException("không nên nhập ký tự số");
            }
        }

        System.out.println("nhập ngày sinh");
        String ngaySinh ;
        while (true) {
            try {
                ngaySinh = sc.nextLine();
                if (ngaySinh.matches("(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)")) {
                    break;
                } else {
                    throw new InputMismatchException("Nhập sai thời gian hoặc định dạng \n" +
                            "Hãy nhập theo dạng dd/MM/yyy ");
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
                //throw new InputMismatchException("không nên nhập ký tự số");
            }
        }

        System.out.println("nhập căn cước / chứng minh nhân dân ");
        int cmnd;
        while (true) {
            try {
                String cmnd1 = sc.nextLine();
                if (cmnd1.matches("[^A-Za-z]\\d{9}")) {
                    cmnd = Integer.parseInt(cmnd1);
                    break;
                } else {
                    throw new NumberFormatException(" Sai định dạng , không có ký tự chữ cái");
                }
            }catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("nhập số điện thoại : ");
        int sdt;
        while (true) {
            try {
                String sdt1 = sc.nextLine();
                if (sdt1.matches("[^A-Za-z]\\d{9}")) {
                    sdt = Integer.parseInt(sdt1);
                    break;
                } else {
                   throw new NumberFormatException("Sai định dạng , không có ký tự chữ cái");
                }
            }catch (Exception e) {}
        }
        System.out.println("nhập email : ");
        String email;
        while (true) {
            try {
                email = sc.nextLine();
                if (email.matches("^[A-Za-z0-9]*[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                    break;
                } else {
                    throw new InputMismatchException("Nhập sai định dạng của email ");
                }
            }catch (Exception e) {}
        }
        System.out.println("nhập mã khách hàng : ");
        String maKhachHang = sc.nextLine();
        System.out.println("chọn loại khách hàng \n  " +
                "1. Diamond \n" +
                "2. Platinium \n" +
                "3. Gold \n" +
                "4. Silver\n" +
                "5. Member ");
        String loaiKhachHang = null;
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                loaiKhachHang = "Diamond";
                break;
            case 2:
                loaiKhachHang = "Platinium";
                break;
            case 3:
                loaiKhachHang = "Gold";
                break;
            case 4:
                loaiKhachHang = "Silver ";
                break;
            case 5:
                loaiKhachHang = "Member ";
                break;
        }
        System.out.println("nhập địa chỉ ");
        String diaChi = sc.nextLine();

        return new khachHang(hoVaTen, ngaySinh, cmnd, sdt, email, maKhachHang,loaiKhachHang, diaChi);
    }

    @Override
    public void editCustomer() throws IOException {
        customers = ReadFile.readCustomerFile("src\\LuyenTap\\FuramaObject\\data\\customerFile");
        System.out.println("Nhập ID khách hàng cần chỉnh sửa: ");
        String idEdit = sc.nextLine();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getMaKhachHang().equals(idEdit)) {
                customers.set(i, this.customerInfor());
                return;
            }
        }
        System.out.println("không tìm thấy ");
    }
}

