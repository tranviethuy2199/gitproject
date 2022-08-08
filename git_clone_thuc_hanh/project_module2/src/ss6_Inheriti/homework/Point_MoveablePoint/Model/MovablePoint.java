package ss6.homework.Point_MoveablePoint.Model;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {} ;

    public MovablePoint(float xSpeed, float ySpeed, float x, float y) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float array1[] = new float[2];
        array1[0] = this.xSpeed;
        array1[1] = this.ySpeed;
        return array1;
    }

    public void setSpeed(float xSpeed, float ySpeed) {}

    public MovablePoint move() {
        super.setX(this.getX()+xSpeed);
        super.setY(this.getY()+ySpeed);

        // tạo một đối tượng mới để mang phương thúc ở dòng 41 và 42
        // sau kkhi nhập xy mới , sẽ đươc trỏ tới Movable có 2 phương thức kia

        MovablePoint m1 = new MovablePoint();
        return m1;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed = " + xSpeed +
                ", ySpeed = " + ySpeed + "\t" +
                super.toString() +
                '}';
    }
}

