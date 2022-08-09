package ss7_Abstract.homework.Colorable.controller;

import ss7_Abstract.homework.Colorable.model.Shape;
import ss7_Abstract.homework.Colorable.model.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[1];
        shapes[0] = new Square(5);
        for (Shape shape: shapes){
//            shape.howToColor();
            System.out.println(shape.howToColor());
        }
    }
}
