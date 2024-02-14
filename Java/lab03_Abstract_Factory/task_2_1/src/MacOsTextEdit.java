public class MacOsTextEdit implements TextEdit {
    @Override
    public void setText(String text) {
        System.out.println("MacOsTextEdit: set text = " + text);
    }
}
