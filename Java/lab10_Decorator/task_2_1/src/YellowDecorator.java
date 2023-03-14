import java.awt.*;

public class YellowDecorator extends CircleDecorator {
    public YellowDecorator(Drawable wrappee) {
        super(wrappee);
    }

    @Override
    public void draw(Graphics graphics) {
        Color color = graphics.getColor();
        graphics.setColor(Color.YELLOW);
        super.draw(graphics);
        graphics.setColor(color);
    }
}
