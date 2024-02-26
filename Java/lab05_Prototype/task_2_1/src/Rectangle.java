public class Rectangle extends Shape {
    public Rectangle(int x, int y, String color, int width, int height) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle otherRectangle) {
        super(otherRectangle);
        this.width = otherRectangle.width;
        this.height = otherRectangle.height;
    }

    private final int width;
    private final int height;

    @Override
    public String toString() {
        return "Rectangle " + super.toString() + " {" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public Rectangle copy() {
        return new Rectangle(this);
    }
}
