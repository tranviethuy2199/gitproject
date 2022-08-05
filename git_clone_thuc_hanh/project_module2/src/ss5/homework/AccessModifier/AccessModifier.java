package ss5.homework.AccessModifier;

public class AccessModifier {
    private double radius;
    private String color;

    AccessModifier() {
        radius = 1.0;
        color = "RED";
    }
    AccessModifier(double radius) {
        this.radius = radius;
        this.color = "RED";
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }


}
