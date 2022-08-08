package ss6.homework.Point_MoveablePoint.Controller;

import ss6.homework.Point_MoveablePoint.Model.MovablePoint;

public class MovablePointTest {
    public static void main(String[] args) {
       MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        movablePoint.move();
        System.out.println(movablePoint);

    }
}
