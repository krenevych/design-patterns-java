import java.awt.*;

public abstract class Shape {

    public Shape(ShapeColor shapeColor) {
        this.shapeColor = shapeColor;
    }

    private ShapeColor shapeColor;

    public void setShapeColor(ShapeColor shapeColor) {
        this.shapeColor = shapeColor;
    }

    public void draw(Graphics graphics){
        graphics.setColor(shapeColor.getShapeColor());
    }
}
