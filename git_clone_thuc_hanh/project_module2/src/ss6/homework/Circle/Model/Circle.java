package ss6.homework.Circle.Model;

public class Circle {

    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle() {}

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return (radius * radius * 3.14);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "bán kính =" + radius + "\t" +
                " màu sắc  ='" + color + '\'' +
                '}';
    }
}
