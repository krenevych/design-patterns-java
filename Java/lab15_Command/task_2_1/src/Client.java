public class Client {

    public static void main(String[] args) {

        Command commandOk = new CommandOk();
        Command commandCancel = new CommandCancel();

        Button buttonOk = new Button("buttonOk");
        buttonOk.setCommand(commandOk);

        Button buttonOk2 = new Button("buttonOk2");
        buttonOk2.setCommand(commandOk);

        Button buttonCancel = new Button("buttonCancel");
        buttonCancel.setCommand(commandCancel);

        buttonOk.press();
        buttonCancel.press();
        buttonOk2.press();


    }
}
