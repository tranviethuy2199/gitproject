package LuyenTap.FuramaObject.model.Person;

import javax.swing.*;

public class Customer extends Person {
    private String maKhachHang;
    private String diaChi;


    public Customer() {};

    public Customer(String maKhachHang, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.diaChi = diaChi;
    }

    public Customer(String hoVaTen, String ngaySinh, int cmnd, int sdt, String email, String maKhachHang, String diaChi) {
        super(hoVaTen, ngaySinh, cmnd, sdt, email);
        this.maKhachHang = maKhachHang;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "maKhachHang='" + maKhachHang + '\'' +
                ", diaChi='" + diaChi + '\'' +
                super.toString() +
                '}';
    }
}
