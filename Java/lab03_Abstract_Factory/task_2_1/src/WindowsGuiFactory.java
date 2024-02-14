public class WindowsGuiFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public TextEdit createTextEdit() {
        return new WindowsTextEdit();
    }

    @Override
    public CheckButton createCheckButton() {
        return new WindowsCheckButton();
    }

    @Override
    public RadioButton createRadioButton() {
        return new WindowsRadioButton();
    }
}
