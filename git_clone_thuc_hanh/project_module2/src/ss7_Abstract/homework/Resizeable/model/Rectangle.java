package ss7_Abstract.homework.Resizeable.model;

public class Rectangle extends Shape {
    double width, height;

    public Rectangle() {}
    // có thể khởi tạo các class giống nhau trong cùng jv

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.width += this.width*percent/100;
        this.height += this.height*percent/100;
    }
}
