public class LinuxGuiFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextEdit createTextEdit() {
        return new LinuxTextEdit();
    }

    @Override
    public CheckButton createCheckButton() {
        return new LinuxCheckButton();
    }

    @Override
    public RadioButton createRadioButton() {
        return new LinuxRadioButton();
    }
}
