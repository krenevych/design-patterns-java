public class Circle extends Shape {

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(Circle other) {
        super(other);
        this.radius = other.radius;
    }

    private final int radius;

    @Override
    public String toString() {
        return "Circle " + super.toString() + " {" +
                "radius=" + radius +
                '}';
    }

    @Override
    public Circle clone() {
        return new Circle(this);
    }
}
