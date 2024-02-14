public class WindowsCheckButton implements CheckButton {
    @Override
    public void setChecked(Boolean checked) {
        System.out.println("WindowsCheckButton: checked = " + checked);
    }
}
