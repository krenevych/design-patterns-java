public class Main {

    enum Platform {
        Windows,
        Mac,
        Linux,
        Android
    }

    public static void main(String[] args) {

        GUIFactory factory = null;
        factory = new WinFactory();

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.setTitle("Натисни мене");
        button.press();

        checkbox.setChecked(true);
    }
}
