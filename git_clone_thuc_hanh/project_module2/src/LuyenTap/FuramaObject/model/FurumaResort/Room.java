package LuyenTap.FuramaObject.model.FurumaResort;

public class Room extends Villa {
    private String tieuChuan;
    private int soTang;

    public Room() {};

    public Room(String tieuChuan, int soTang) {
        this.tieuChuan = tieuChuan;
        this.soTang = soTang;
    }

    public Room(String tieuChuan, double dienTichHoBoi, int soTang, String tieuChuan1, int soTang1) {
        super(tieuChuan, dienTichHoBoi, soTang);
        this.tieuChuan = tieuChuan1;
        this.soTang = soTang1;
    }

    public Room(String dienTich, double chiPhi, int soLuongNguoi, String kieuThue, String tieuChuan, double dienTichHoBoi, int soTang, String tieuChuan1, int soTang1) {
        super(dienTich, chiPhi, soLuongNguoi, kieuThue, tieuChuan, dienTichHoBoi, soTang);
        this.tieuChuan = tieuChuan1;
        this.soTang = soTang1;
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
        return "Room{" +
                "tieuChuan='" + tieuChuan + '\'' +
                ", soTang=" + soTang +
                '}';
    }
}
