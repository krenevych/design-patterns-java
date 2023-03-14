import java.awt.*;

public class GreenDecorator extends CircleDecorator {
    public GreenDecorator(Drawable wrappee) {
        super(wrappee);
    }

    @Override
    public void draw(Graphics graphics) {
        Color color = graphics.getColor();
        graphics.setColor(Color.GREEN);
        super.draw(graphics);
        graphics.setColor(color);
    }
}
