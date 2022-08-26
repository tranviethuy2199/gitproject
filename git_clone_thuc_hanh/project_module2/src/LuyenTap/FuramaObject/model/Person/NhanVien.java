package LuyenTap.FuramaObject.model.Person;

public class NhanVien extends Person {
    private String maNhanVien;
    private String trinhDo;
    private String viTri;
    private String luong;

    public NhanVien() {
    }

    ;

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

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
//        return "NhanVien{" +
//                "maNhanVien=" + maNhanVien +
//                ", trinhDo=" + trinhDo +
//                ", viTri=" + viTri +
//                ", luong=" + luong +
//                super.toString() +
//                '}';
//    }
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s",this.getHoVaTen(),getNgaySinh(),getCmnd(),getSdt(),getEmail(),getMaNhanVien(),getTrinhDo(),getViTri(),getLuong());
    }
}

