package LuyenTap.FuramaObject.model.Person;

import ss10_stack_queue.homework.Palindrome.model.Palindrome;

public abstract class Person {
    private String hoVaTen;
    private String ngaySinh;
    private int cmnd;
    private int sdt;
    private String email;

    public Person() {};

    public Person(String hoVaTen, String ngaySinh, int cmnd, int sdt, String email) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.cmnd = cmnd;
        this.sdt = sdt;
        this.email = email;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", cmnd=" + cmnd +
                ", sdt=" + sdt +
                ", email='" + email + '\'' +
                '}';
    }

//    public abstract int indexOf(NhanVien temp);
}
