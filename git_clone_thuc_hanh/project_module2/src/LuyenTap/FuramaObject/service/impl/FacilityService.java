package LuyenTap.FuramaObject.service.impl;

import LuyenTap.FuramaObject.model.FurumaResort.House;
import LuyenTap.FuramaObject.model.FurumaResort.Resort;
import LuyenTap.FuramaObject.model.FurumaResort.Room;
import LuyenTap.FuramaObject.model.FurumaResort.Villa;
import LuyenTap.FuramaObject.service.Interface.IFacilityService;
import LuyenTap.FuramaObject.untils.facilityFile.ReadFile;
import LuyenTap.FuramaObject.untils.facilityFile.WriteFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static Scanner sc = new Scanner(System.in);
    private static List<Resort> resorts = new ArrayList<>();
    private static List<Villa> villas = new ArrayList<>();
    private static List<House> houses = new ArrayList<>();
    private static List<Room> rooms = new ArrayList<>();
    static {
        try {
            ReadFile.readFile("src\\LuyenTap\\FuramaObject\\data\\facilityFile");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    @Override
    public void addVilla() throws IOException {
        resorts = ReadFile.readFacilityFile("src\\LuyenTap\\FuramaObject\\data\\facilityFile");
        Villa villa = villaMenu();
        resorts.add(villa);
        System.out.println("them moi thanh cong");
        WriteFile.writeFacilityFile("src\\LuyenTap\\FuramaObject\\data\\facilityFile",resorts);
    }

    private Villa villaMenu() {
        System.out.println("----------------------");
        System.out.println("1. dien tich");
        String dienTich = sc.nextLine() ;
        System.out.println("2. chi phi");
        double chiPhi = Double.parseDouble(sc.nextLine());
        System.out.println("3. so luong nguoi");
        int soLuongNguoi = Integer.parseInt(sc.nextLine());
        System.out.println("4. kieu thue");
        String kieuThue = sc.nextLine();
        System.out.println("5. tieu chuan");
        String tieuChuan = sc.nextLine();
        System.out.println("6. dien tich ho boi");
        double dienTichHoBoi = Double.parseDouble(sc.nextLine());
        System.out.println("5. so tang");
        int soTang = Integer.parseInt(sc.nextLine());

        return new Villa(dienTich,chiPhi,soLuongNguoi,kieuThue,tieuChuan,dienTichHoBoi,soTang);
    }




    @Override
    public void addHouse() throws IOException {
//        resorts = ReadFile.readFacilityFile("src\\LuyenTap\\FuramaObject\\data\\facilityFile");
        House house = houseMenu();
        resorts.add(house);
        System.out.println("them moi thanh cong");
        WriteFile.writeFacilityFile("src\\LuyenTap\\FuramaObject\\data\\facilityFile",resorts);

    }


    private House houseMenu() {
        System.out.println("------------");
        System.out.println("1. dien tich");
        String dienTich ;
        while (true) {
            dienTich = sc.nextLine();
            if (dienTich.matches("\\d{3}[.]\\d{2}[m]")){
                break;
            }else {
                System.out.println("nhập sai định dạng ");
            }
        }
        System.out.println("2. chi phi");
        double chiPhi = Double.parseDouble(sc.nextLine());
        System.out.println("3. so luong nguoi");
        int soLuongNguoi = Integer.parseInt(sc.nextLine());
        System.out.println("4. kieu thue");
        String kieuThue = sc.nextLine();
        System.out.println("5. dich vu free");
        String dichVuFree = sc.nextLine();

        return new House(dienTich,chiPhi,soLuongNguoi,kieuThue,dichVuFree);
    }

    @Override
    public void addRoom() throws IOException {
//        resorts = ReadFile.readFacilityFile("src\\LuyenTap\\FuramaObject\\data\\facilityFile");
        Room room = roomMenu();
        resorts.add(room);
        System.out.println("them thanh cong");
        WriteFile.writeFacilityFile("src\\LuyenTap\\FuramaObject\\data\\facilityFile",resorts);
    }
    private Room roomMenu() {
        System.out.println("------------");
        System.out.println("1. dien tich");
        String dienTich ;
        while (true) {
            dienTich = sc.nextLine();
            if (dienTich.matches("\\d*[.]\\d*[m]")){
                break;
            }else {
                System.out.println("nhập sai định dạng , thêm (m) cuối cùng ");
            }
        }
        System.out.println("2. chi phi");
        double chiPhi = Double.parseDouble(sc.nextLine());
        System.out.println("3. so luong nguoi");
        int soLuongNguoi = Integer.parseInt(sc.nextLine());
        System.out.println("4. kieu thue");
        String kieuThue = sc.nextLine();
        System.out.println("5. tieu chuan");
        String tieuChuan = sc.nextLine();
        System.out.println("6.so tang");
        int soTang = Integer.parseInt(sc.nextLine());

        return new Room(dienTich,chiPhi,soLuongNguoi,kieuThue,tieuChuan,soTang);
    }

    @Override
    public void     displayFaclity() throws IOException {
        resorts = ReadFile.readFacilityFile("src\\LuyenTap\\FuramaObject\\data\\facilityFile");
        for (Resort resort : resorts) {
            System.out.println(resort);
        }
    }

    @Override
    public void displayMaintenace() {

    }




}
