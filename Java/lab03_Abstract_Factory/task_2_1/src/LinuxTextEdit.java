public class LinuxTextEdit implements TextEdit {
    @Override
    public void setText(String text) {
        System.out.println("LinuxTextEdit: set text = " + text);
    }
}
