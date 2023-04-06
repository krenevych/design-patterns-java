public class TurnLightOnCommand implements Command {

    public TurnLightOnCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    private final Lamp lamp;

    @Override
    public void execute() {
        lamp.lightOn();
    }
}
