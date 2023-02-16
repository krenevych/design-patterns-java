public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    static int currentId = 0;
    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox(currentId++);
    }
}
