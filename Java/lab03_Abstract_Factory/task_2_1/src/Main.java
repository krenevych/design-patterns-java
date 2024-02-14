public class Main {

    public static String OPERATION_SYSTEM_WINDOWS = "WINDOWS";
    public static String OPERATION_SYSTEM_LINUX = "LINUX";
    public static String OPERATION_SYSTEM_MAC_OS = "MAC_OS";


    public static void main(String[] args) {

//        String current_os = OPERATION_SYSTEM_WINDOWS; // Визначається якимось чином яка операційна система використовується
//        String current_os = OPERATION_SYSTEM_LINUX; // Визначається якимось чином яка операційна система використовується
        String current_os = OPERATION_SYSTEM_MAC_OS; // Визначається якимось чином яка операційна система використовується
        GUIFactory factory;
        if (current_os.equals(OPERATION_SYSTEM_WINDOWS)){
            factory = new WindowsGuiFactory();
        } else if (current_os.equals(OPERATION_SYSTEM_LINUX)) {
            factory = new LinuxGuiFactory();
        } else {
            factory = new MacOsGuiFactory();
        }

        Button button = factory.createButton();                  // Додати Button
        TextEdit textEdit = factory.createTextEdit();            // Додати Text Edit
        CheckButton checkButton = factory.createCheckButton();   // Додати Check Button
        RadioButton radioButton = factory.createRadioButton();   // Додати Radio Button

        button.press();                 // Натиснути Button
        textEdit.setText("Hello");      // Ввести текст "Hello" Text Edit
        checkButton.setChecked(true);   // Натиснути Check Button
        radioButton.switchButton();     // Натиснути Radio Button
    }
}
