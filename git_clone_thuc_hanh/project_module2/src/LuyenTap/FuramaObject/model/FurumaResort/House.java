package LuyenTap.FuramaObject.model.FurumaResort;

public class House extends Villa {
    private String dichVuFree;

    public House(String dienTich, double chiPhi, int soLuongNguoi, String kieuThue, String dichVuFree) {};

    public House(String dichVuFree) {
        this.dichVuFree = dichVuFree;
    }
    public House(String dienTich, double chiPhi, int soLuongNguoi, String kieuThue, String tieuChuan, String dichVuFree) {
        this.dichVuFree = dichVuFree;
    }

    @Override
    public String toString() {
        return "House{" +
                "dichVuFree='" + dichVuFree + '\'' +
                super.toString() +
                '}';
    }
}
