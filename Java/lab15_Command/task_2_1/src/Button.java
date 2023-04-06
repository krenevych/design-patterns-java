public class Button implements Invoker {

    public Button(String buttonName) {
        this.buttonName = buttonName;
    }

    private Command command;
    final private String buttonName;

    public void setCommand(Command command) {
        this.command = command;
    }

    void press(){
        command.execute(this);
    }

    @Override
    public String getWho() {
        return buttonName;
    }
}
