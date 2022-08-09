package ss7_Abstract.homework.Resizeable.controller;

import ss7_Abstract.homework.Resizeable.model.Circle;
import ss7_Abstract.homework.Resizeable.model.Rectangle;
import ss7_Abstract.homework.Resizeable.model.Shape;
import ss7_Abstract.homework.Resizeable.model.Square;

public class InterfaceResizeableTest {

    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5,"blue");
        shapes[1] = new Rectangle(5,5);
        shapes[2] = new Square(6);
        System.out.println();
        for (Shape shape : shapes) {
           shape.resize(50);
            System.out.println(shape);
        }
    }
}
