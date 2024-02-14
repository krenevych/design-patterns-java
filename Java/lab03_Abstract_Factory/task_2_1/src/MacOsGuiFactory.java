public class MacOsGuiFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOsButton();
    }

    @Override
    public TextEdit createTextEdit() {
        return new MacOsTextEdit();
    }

    @Override
    public CheckButton createCheckButton() {
        return new MacOsCheckButton();
    }

    @Override
    public RadioButton createRadioButton() {
        return new MacOsRadioButton();
    }
}
