package ss6_ke_thua.bai_tap.point2D_va_point3D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    Point3D() {

    }

    Point3D(float z) {
        this.z = z;
    }

    Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x);
        setY(y);
        setZ(z);
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    @Override
    public String toString() {
        return "Point3D"
                + Arrays.toString(getXYZ());

    }
}
