abstract public class Shape implements ClonableShape {
    private final int x;
    private final int y;
    private final String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    protected Shape(Shape shape) {
        x = shape.x;
        y = shape.y;
        color = shape.color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
