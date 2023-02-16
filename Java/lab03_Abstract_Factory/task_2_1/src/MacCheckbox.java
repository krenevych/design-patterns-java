public class MacCheckbox extends Checkbox {
    public MacCheckbox(int id) {
        super(id);
    }

    @Override
    public void setChecked(boolean checked) {
        System.out.println("===== Mac ====");
        super.setChecked(checked);
    }
}
