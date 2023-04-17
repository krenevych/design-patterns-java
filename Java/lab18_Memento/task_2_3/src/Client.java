public class Client {


    public static void main(String[] args) {
        final Originator originator = new Originator();

        originator.updateState("Hello");
        originator.updateState(", ");
        originator.updateState("World");
        originator.updateState("!");
        originator.printState();

        // TODO: perform undo
        originator.printState();

        // TODO: perform undo
        originator.printState();

        // TODO: perform undo
        originator.printState();

        // TODO: perform undo
        originator.printState();

        // TODO: perform undo
        originator.printState();

    }

}
