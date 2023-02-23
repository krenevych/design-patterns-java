abstract public class Shape implements Cloneable{
    private final int x;
    private final int y;
    private final String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(Shape other) {
        this.x = other.x;
        this.y = other.y;
        this.color = other.color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public abstract Shape clone();
}
