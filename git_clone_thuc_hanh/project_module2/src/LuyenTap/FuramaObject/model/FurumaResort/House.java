package LuyenTap.FuramaObject.model.FurumaResort;

public class House extends Villa {
    private String dichVuFree;

    public House() {};

    public House(String dichVuFree) {
        this.dichVuFree = dichVuFree;
    }

    public House(String tieuChuan, double dienTichHoBoi, int soTang, String dichVuFree) {
        super(tieuChuan, dienTichHoBoi, soTang);
        this.dichVuFree = dichVuFree;
    }

    public House(String dienTich, double chiPhi, int soLuongNguoi, String kieuThue, String tieuChuan, double dienTichHoBoi, int soTang, String dichVuFree) {
        super(dienTich, chiPhi, soLuongNguoi, kieuThue, tieuChuan, dienTichHoBoi, soTang);
        this.dichVuFree = dichVuFree;
    }
}
