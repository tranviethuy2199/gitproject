package LuyenTap.FuramaObject.service.impl;

import LuyenTap.FuramaObject.model.Person.NhanVien;
import LuyenTap.FuramaObject.service.Interface.INhanVienService;
import LuyenTap.FuramaObject.untils.nhanVienFile.ReadFile;
import LuyenTap.FuramaObject.untils.nhanVienFile.WriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhanVienService implements INhanVienService {
    private static Scanner sc = new Scanner(System.in);
    private static List<NhanVien> nhanViens = new ArrayList<>();

    static {
        try {
            ReadFile.readFile("src\\LuyenTap\\FuramaObject\\data\\nhanVienFile");
        } catch (IOException e) {
            e.printStackTrace();
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
            hoVaTen = sc.nextLine();
            if (hoVaTen.toLowerCase().matches("[A-Za-zvxyỳọáầảấờễàạằệếýộậốũứĩõúữịỗìềểẩớặòùồợãụủíỹắẫựỉỏừỷởóéửỵẳẹèẽổẵẻỡơôưăêâđ ]{5,50}")) {
                break;
            } else {
                System.out.println("mời nhập lại");
            }
        }
        System.out.println("nhập ngày sinh");
        String ngaySinh = sc.nextLine();
        System.out.println("nhập chứng minh nhan dan ");
        int cmnd;
        while (true) {
            String cmnd1 = sc.nextLine();
            if (cmnd1.matches("[^A-Za-z]\\d{9}")) {
                cmnd = Integer.parseInt(cmnd1);

                break;
            }else {
                System.out.println("mời nhập lại");
            }
        }
        System.out.println("nhập sdt");
        int sdt ;
        while (true) {
            String sdt1 = sc.nextLine();
            if (sdt1.matches("[^A-Za-z]\\d{9}")) {
                sdt = Integer.parseInt(sdt1);
                break;
            }else {
                System.out.println("mời nhập lại");
            }
        }
        System.out.println("nhập email");
        String email ;
        while (true) {
            email = sc.nextLine();
            if (email.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$")) {
                break;
            } else {
                System.out.println("mời nhập lại");
            }
        }
        System.out.println("nhập mã nv");
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
        NhanVien temp = null;
        NhanVien nhanVien = null;
        for (NhanVien nhanVien1 : nhanViens) {
            if (nhanVien.getMaNhanVien() == idEdit) {
                temp = nhanVien;
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
                System.out.println("nhập mã nv");
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
                        "1. phục vụ  \n" +
                        "1. chuyên viên \n" +
                        "1. giám sát \n" +
                        "1. quản lý \n" +
                        "1. giám đốc  \n");
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

                System.out.println("Chỉnh sửa nhân viên thành công! ");
                nhanVien1 = new NhanVien(hoVaTen, ngaySinh, cmnd, sdt, email, maNhanVien, trinhDo, viTri, luong);
                break;
            }
        }
        if (temp != null) {
            int index = nhanViens.indexOf(temp);
            nhanViens.set(index, nhanVien);
        }
    }
}
