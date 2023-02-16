public class WinCheckbox extends Checkbox {
    public WinCheckbox(int id) {
        super(id);
    }

    @Override
    public void setChecked(boolean checked) {
        System.out.println("===== Windows ====");
        super.setChecked(checked);
    }
}
