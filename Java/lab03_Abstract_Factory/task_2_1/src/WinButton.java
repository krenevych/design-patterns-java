import java.awt.*;

public class WinButton extends Button {
    @Override
    public void press() {
        System.out.println("===== Windows ====");
        super.press();
    }
}
