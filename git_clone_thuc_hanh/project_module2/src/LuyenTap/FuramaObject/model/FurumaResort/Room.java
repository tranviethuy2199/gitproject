package LuyenTap.FuramaObject.model.FurumaResort;

public class Room extends Villa {
    private String tieuChuan;
    private int soTang;

    public Room() {};

    public Room(String tieuChuan, int soTang) {
        this.tieuChuan = tieuChuan;
        this.soTang = soTang;
    }


    public Room(String dienTich, double chiPhi, int soLuongNguoi, String kieuThue, String tieuChuan, int soTang) {
        this.tieuChuan = tieuChuan;
        this.soTang = soTang;
    }


    public String getTieuChuan() {
        return tieuChuan;
    }

    public void setTieuChuan(String tieuChuan) {
        this.tieuChuan = tieuChuan;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
//        return "Room{" +
//                "tieuChuan='" + tieuChuan + '\'' +
//                ", soTang=" + soTang +
//                '}';
        return String.format("%s,%s,%s,%s,%s,%s",this.getDienTich(),getChiPhi(),getSoLuongNguoi(),getKieuThue(),getTieuChuan(),getSoTang());
    }
}
