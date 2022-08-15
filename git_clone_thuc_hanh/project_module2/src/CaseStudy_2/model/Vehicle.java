package CaseStudy_2.model;

public class Vehicle {
    private String BKS;
    private int year;
    private String CSH;

    public Vehicle() {};

    public Vehicle(String BKS, int year, String CSH) {
        this.BKS = BKS;
        this.year = year;
        this.CSH = CSH;
    }

    public String getBKS() {
        return BKS;
    }

    public void setBKS(String BKS) {
        this.BKS = BKS;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCSH() {
        return CSH;
    }

    public void setCSH(String CSH) {
        this.CSH = CSH;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "BKS='" + BKS + '\'' +
                ", year=" + year +
                ", CSH='" + CSH + '\'' +
                '}';
    }
}
