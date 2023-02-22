public class Circle extends Shape {

    public Circle(int x, int y, String color, int radius) {
        super(x, y, color);
        this.radius = radius;
    }

    private final int radius;

    @Override
    public String toString() {
        return "Circle " + super.toString() + " {" +
                "radius=" + radius +
                '}';
    }
}
