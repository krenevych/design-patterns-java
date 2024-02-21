public class Triangle implements ClonableObject {
    final private float a;
    final private float b;
    final private float c;

    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Triangle clone() {
        return new Triangle(a, b, c);
    }

//    public Triangle(Triangle triangle) {
//        this.a = triangle.a;
//        this.b = triangle.b;
//        this.c = triangle.c;
//    }

    @Override
    public String toString() {
        return "Triangle{" +
                "address=" + super.toString() +
                ": a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
