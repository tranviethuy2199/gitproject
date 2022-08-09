package ss7_Abstract.homework.Resizeable.model;

public class Circle extends Shape {
        private double radius;
        private String color;

        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }
        public Circle(double radius) {
            this.radius = radius;
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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }


    @Override
    public void resize(double percent) {
            this.radius += this.radius * percent/100;

    }
}
