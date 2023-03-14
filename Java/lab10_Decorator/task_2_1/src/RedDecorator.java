import java.awt.*;

public class RedDecorator extends CircleDecorator {
    public RedDecorator(Drawable wrappee) {
        super(wrappee);
    }

    @Override
    public void draw(Graphics graphics) {
        Color color = graphics.getColor();
        graphics.setColor(Color.RED);
        super.draw(graphics);
        graphics.setColor(color);
    }
}
