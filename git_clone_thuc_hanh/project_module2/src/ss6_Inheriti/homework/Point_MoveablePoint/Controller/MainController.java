package ss6_Inheriti.homework.Point_MoveablePoint.Controller;

import ss6_Inheriti.homework.Point_MoveablePoint.Model.MovablePoint;
import ss6_Inheriti.homework.Point_MoveablePoint.Model.Point;

public class MainController {
    public static void main(String[] args) {
        Point object1 = new Point(5.5f,6.7f);
        System.out.println(object1.toString());

        MovablePoint object2 = new MovablePoint(1,1,1,3);
        object2.move();
        System.out.println(object2.toString());
    }
}
