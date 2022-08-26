package LuyenTap.FuramaObject.model.FurumaResort;

public abstract class Resort {
    private String dienTich;
    private double chiPhi;
    private int soLuongNguoi;
    private String kieuThue;

    public Resort() {};

    public Resort(String dienTich, double chiPhi, int soLuongNguoi, String kieuThue) {
        this.dienTich = dienTich;
        this.chiPhi = chiPhi;
        this.soLuongNguoi = soLuongNguoi;
        this.kieuThue = kieuThue;
    }

    public String getDienTich() {
        return dienTich;
    }

    public void setDienTich(String dienTich) {
        this.dienTich = dienTich;
    }

    public double getChiPhi() {
        return chiPhi;
    }

    public void setChiPhi(double chiPhi) {
        this.chiPhi = chiPhi;
    }

    public int getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(int soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
//        return "Resort{" +
//                "dienTich='" + dienTich + '\'' +
//                ", chiPhi=" + chiPhi +
//                ", soLuongNguoi=" + soLuongNguoi +
//                ", kieuThue='" + kieuThue + '\'' +
//                '}';
        return String.format("%s,%s,%s,%s",this.getDienTich(),getChiPhi(),getSoLuongNguoi(),getKieuThue());
    }
}
