public class Vector {

    private double x;
    private double y;
    private double z;

    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double calculateVectorLength() {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double scalarProduct(Vector vector) {
        return (x * vector.x + y * vector.y + z * vector.z);
    }

    public Vector vectorProduct(Vector vector) {
        return new Vector((y * vector.z - z * vector.y), (z * vector.x - x * vector.z), (x * vector.y * y * vector.x));
    }

    public double cosDefinition(Vector vector) {
        return (scalarProduct(vector)/(Math.abs(calculateVectorLength()) * Math.abs(vector.calculateVectorLength())));
    }
}
