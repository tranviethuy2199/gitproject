package LuyenTap.FuramaObject.model.Person;

public class NhanVien extends Person {
    private String maNhanVien;
    private String trinhDo;
    private String viTri;
    private String luong;

    public NhanVien() {};

    public NhanVien(String maNhanVien, String trinhDo, String viTri, String luong) {
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }

    public NhanVien(String hoVaTen, String ngaySinh, int cmnd, int sdt, String email, String maNhanVien, String trinhDo, String viTri, String luong) {
        super(hoVaTen, ngaySinh, cmnd, sdt, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.viTri = viTri;
        this.luong = luong;
    }


}
