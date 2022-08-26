package LuyenTap.FuramaObject.model.Person;

import javax.swing.*;

public class khachHang extends Person   {
    private String maKhachHang;
    private String diaChi;
    private String loaiKhachHang;



    public khachHang() {};

    public khachHang(String maKhachHang, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.diaChi = diaChi;
    }

    public khachHang(String hoVaTen, String ngaySinh, int cmnd, int sdt, String email, String maKhachHang,String loaiKhachHang, String diaChi) {
        super(hoVaTen, ngaySinh, cmnd, sdt, email);
        this.maKhachHang = maKhachHang;
        this.diaChi = diaChi;
        this.loaiKhachHang = loaiKhachHang;
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

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    @Override
    public String toString() {
//        return "khachHang{" +
//                "maKhachHang='" + maKhachHang + '\'' +
//                ", diaChi='" + diaChi + '\'' +
//                super.toString() +
//                '}';
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",this.getHoVaTen(),getNgaySinh(),getCmnd(),getSdt(),getEmail(),getMaKhachHang(),getLoaiKhachHang(),getDiaChi());
    }
}
