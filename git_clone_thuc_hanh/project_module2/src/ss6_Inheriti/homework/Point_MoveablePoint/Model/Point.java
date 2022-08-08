package ss6.homework.Point_MoveablePoint.Model;

import java.util.Arrays;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    Point(){};

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float array[] = new float[2];
        array[0] = this.getX();
        array[1] = this.getY();
        return array;
    }
    public void setXY(float x, float y) {}

    @Override
    public String toString() {
        return "Point {" +
//                Arrays.toString(getXY()) +
                getXY()[0] + "\t" +  getXY()[1] +
                '}';
    }
}
