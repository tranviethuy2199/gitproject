package LuyenTap.FuramaObject.model.FurumaResort;

import LuyenTap.FuramaObject.model.FurumaResort.Resort;

public class Villa extends Resort {
    private String tieuChuan;
    private double dienTichHoBoi;
    private int soTang;

    public Villa() {} ;

    public Villa(String tieuChuan, double dienTichHoBoi, int soTang) {
        this.tieuChuan = tieuChuan;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public Villa(String dienTich, double chiPhi, int soLuongNguoi, String kieuThue, String tieuChuan, double dienTichHoBoi, int soTang) {
        super(dienTich, chiPhi, soLuongNguoi, kieuThue);
        this.tieuChuan = tieuChuan;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuan() {
        return tieuChuan;
    }

    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    public double getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(double dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
//        return "Villa{" +
//                "tieuChuan='" + tieuChuan + '\'' +
//                ", dienTichHoBoi=" + dienTichHoBoi +
//                ", soTang=" + soTang +
//                '}';
        return String.format("%s,%s,%s,%s,%s,%s,%s",this.getDienTich(),getChiPhi(),getSoLuongNguoi(),getKieuThue(),getTieuChuan(),getDienTichHoBoi(),getSoTang());
    }
}
