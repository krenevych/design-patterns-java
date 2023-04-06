public class TurnLightOffCommand implements Command {

    public TurnLightOffCommand(Lamp lamp) {
        this.lamp = lamp;
    }

    private final Lamp lamp;

    @Override
    public void execute() {
        lamp.lightOff();
    }
}
