abstract public class Checkbox {

    public Checkbox(int id) {
        this.id = id;
        this.checked = false;
    }

    final private int id;
    private boolean checked;

    public void setChecked(boolean checked){
        this.checked = checked;
        System.out.printf("Checked '%s' is checked = %s\n", id, this.checked);
    }

}
