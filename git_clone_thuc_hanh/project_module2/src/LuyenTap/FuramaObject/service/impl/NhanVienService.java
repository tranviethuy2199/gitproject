package LuyenTap.FuramaObject.service.impl;

import LuyenTap.FuramaObject.model.Person.NhanVien;
import LuyenTap.FuramaObject.service.Interface.INhanVienService;
import LuyenTap.FuramaObject.untils.nhanVienFile.ReadFile;
import LuyenTap.FuramaObject.untils.nhanVienFile.WriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class NhanVienService implements INhanVienService {
    private static Scanner sc = new Scanner(System.in);
    private static List<NhanVien> nhanViens = new ArrayList<>();

    static {
        try {
            ReadFile.readFile("src\\LuyenTap\\FuramaObject\\data\\nhanVienFile");
        } catch (IOException e) {
            System.out.println("File rỗng , hãy nhập thông tin !");
        }
    }

    @Override
    public void displayAllEmployee() throws IOException {
        nhanViens = ReadFile.readNhanVienFile("src\\LuyenTap\\FuramaObject\\data\\nhanVienFile");
        for (NhanVien nhanVien : nhanViens) {
            System.out.println(nhanVien);
        }
    }

    @Override
    public void addEmployee() throws IOException {
        nhanViens = ReadFile.readNhanVienFile("src\\LuyenTap\\FuramaObject\\data\\nhanVienFile");
        NhanVien nhanVien = nhanVienInfor();
        nhanViens.add(nhanVien);
        System.out.println("Thêm mới nhân viên thành công! ");
        WriteFile.writeNhanVienFile("src\\LuyenTap\\FuramaObject\\data\\nhanVienFile", nhanViens);

    }

    private NhanVien nhanVienInfor() {
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
            }
        }
        System.out.println("nhập ngày sinh");
        String ngaySinh;
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

            }
        }
        System.out.println("nhập căn cước / chứng minh nhan dan ");
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
        System.out.println("nhập mã nhân viên : ");
        String maNhanVien = sc.nextLine();
        System.out.println("nhập trình độ nhân viên\n  " +
                "1. trung cấp \n" +
                "2. cao đẳng \n" +
                "3. đại học \n" +
                "4. sau đại học\n");
        String trinhDo = null;
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                trinhDo = "trung cấp";
                break;
            case 2:
                trinhDo = "cao đẳng";
                break;
            case 3:
                trinhDo = "đại học ";
                break;
            case 4:
                trinhDo = "sau đại học ";
                break;
        }
        System.out.println("nhập vị trí \n" +
                "1. lễ tân \n" +
                "2. phục vụ  \n" +
                "3. chuyên viên \n" +
                "4. giám sát \n" +
                "5. quản lý \n" +
                "6. giám đốc  \n");
        String viTri = null;
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                viTri = "lễ tân";
                break;
            case 2:
                viTri = "phục vụ";
                break;
            case 3:
                viTri = "chuyên viên";
                break;
            case 4:
                viTri = "giám sát";
                break;
            case 5:
                viTri = "quản lý";
                break;
            case 6:
                viTri = "giám đốc";
                break;
        }

        System.out.println("nhập lương ");
        String luong = sc.nextLine();
        return new NhanVien(hoVaTen, ngaySinh, cmnd, sdt, email, maNhanVien, trinhDo, viTri, luong);
    }


    @Override
    public void editEmployee() throws IOException {
        nhanViens = ReadFile.readNhanVienFile("src\\LuyenTap\\FuramaObject\\data\\nhanVienFile");
        System.out.println("Nhập ID khách hàng cần chỉnh sửa: ");
        String idEdit = sc.nextLine();
        for (int i = 0; i < nhanViens.size(); i++) {
            if (nhanViens.get(i).getMaNhanVien().equals(idEdit)) {
                nhanViens.set(i, this.nhanVienInfor());
                return;
            }
        }
        System.out.println("không tìm thấy ");
        }
    }


