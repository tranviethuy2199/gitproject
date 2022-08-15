package CaseStudy_2.model;

public class Car extends Vehicle {
    private int choNgoi;
    private  String kieuXe;

    public Car() {}

    public Car(String BKS, int year, String CSH, int choNgoi, String kieuXe) {
        super(BKS, year, CSH);
        this.choNgoi = choNgoi;
        this.kieuXe = kieuXe;
    }

    public int getChoNgoi() {
        return choNgoi;
    }

    public void setChoNgoi(int choNgoi) {
        this.choNgoi = choNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "Car{" +
                "choNgoi=" + choNgoi +
                ", kieuXe='" + kieuXe + '\'' +
                '}';
    }
}
