public class LinuxCheckButton implements CheckButton {
    @Override
    public void setChecked(Boolean checked) {
        System.out.println("LinuxCheckButton: checked = " + checked);
    }
}
