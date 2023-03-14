import java.awt.*;

public class CircleDecorator implements Drawable {

    final private Drawable wrappee;

    public CircleDecorator(Drawable wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void draw(Graphics graphics) {
        wrappee.draw(graphics);
    }
}
