package ss6.homework.Circle.Model;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return (3.14 * super.getArea());
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " chiều cao = " + height + "\t" +
                "thể tích = " + getVolume() +
//                super.toString() +
                '}';
    }
}
