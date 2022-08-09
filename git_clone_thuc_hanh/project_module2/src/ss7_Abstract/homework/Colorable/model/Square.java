package ss7_Abstract.homework.Colorable.model;

public class Square extends Shape implements InterfaceColorable {
    double side;

    public Square() {} ;

    public Square(double side) {
        this.side = side ;
    }
    public double getArea() {
        return (side * side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side + "\t" +
                "Area " + getArea() + 
                '}';
    }

    @Override
    public String howToColor() {
        return "Color all four sides..";
    }
}
