package ss6_Inheriti.homework.Point_MoveablePoint.Model;

import java.util.Arrays;

public class Point3d extends Point2d {
    private float z = 0.0f;

    public Point3d() {};

    public Point3d(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array1 = new float[3];
        array1[0] = super.getX();
        array1[1] = super.getY();
        array1[2] = this.getZ();
        return array1;
    }

    public void setXYZ(float x, float y, float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3d{" +
                Arrays.toString(getXYZ()) +
                '}';
    }
}
