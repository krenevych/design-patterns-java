public class MacOsCheckButton implements CheckButton {
    @Override
    public void setChecked(Boolean checked) {
        System.out.println("MacOsCheckButton: checked = " + checked);
    }
}
