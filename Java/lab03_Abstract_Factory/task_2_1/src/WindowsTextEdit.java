public class WindowsTextEdit implements TextEdit {
    @Override
    public void setText(String text) {
        System.out.println("WindowsTextEdit: set text = " + text);
    }
}
