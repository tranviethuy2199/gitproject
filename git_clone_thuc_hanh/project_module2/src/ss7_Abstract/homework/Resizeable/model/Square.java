package ss7_Abstract.homework.Resizeable.model;

public class Square extends Shape {
    double height;

    public Square() {} ;

    public Square(double height) {
       this.height = height ;
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                '}';
    }

    @Override
    public void resize(double percent) {
        this.height += this.height * percent/100;
    }
}
