package ss6_Inheriti.homework.Point_MoveablePoint.Model;

public class Point2d {
    private float x = 0.0f;
    private float y = 0.0f;


    public Point2d() {
    }

    ;

    public Point2d(float x, float y) {
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
        float[] array = new float[2];
        array[0] = this.getX();
        array[1] = this.getY();
        return array;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2d{" +

                // liệt kê mảng , lôi getXY đại diện cho mảng
//                Arrays.toString(getXY()) +

                // cách thứ 2
                getXY()[0] + "\t" + getXY()[1] +
                '}';
    }
}
