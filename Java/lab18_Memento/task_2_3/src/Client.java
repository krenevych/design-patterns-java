public class Client {


    public static void main(String[] args) {
        final ConcreteOriginator originator = new ConcreteOriginator();
        final Caretaker caretaker = new Caretaker();

        caretaker.push(originator.save());
        originator.updateState("Hello");

        caretaker.push(originator.save());
        originator.updateState(", ");

        caretaker.push(originator.save());
        originator.updateState("World");

        caretaker.push(originator.save());
        originator.updateState("!");

        originator.printState();

        // TODO: perform undo
        caretaker.undo();
        originator.printState();

        // TODO: perform undo
        caretaker.undo();
        originator.printState();

        // TODO: perform undo
        caretaker.undo();
        originator.printState();

        // TODO: perform undo
        caretaker.undo();
        originator.printState();

        // TODO: perform undo
        caretaker.undo();
        originator.printState();

    }

}
