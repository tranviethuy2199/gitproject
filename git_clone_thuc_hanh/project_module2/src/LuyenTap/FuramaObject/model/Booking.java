package LuyenTap.FuramaObject.model;

public class Booking {
    private String tenDichVu;
    private String maBooking;
    private String ngayBatDau;
    private String ngayKetThuc;
    private String loaiDichVu;


    public Booking() {};

    public Booking(String tenDichVu ,String maBooking, String ngayBatDau, String ngayKetThuc,String loaiDichVu) {
        this.maBooking = maBooking;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.loaiDichVu = loaiDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getMaBooking() {
        return maBooking;
    }

    public void setMaBooking(String maBooking) {
        this.maBooking = maBooking;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(String loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "tenDichVu=" + tenDichVu + '\'' +
                "maBooking='" + maBooking + '\'' +
                ", ngayBatDau='" + ngayBatDau + '\'' +
                ", ngayKetThuc='" + ngayKetThuc + '\'' +
                ",loaiDichVu=" + loaiDichVu + '\'' +
                '}';
    }
}