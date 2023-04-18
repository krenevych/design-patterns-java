public class Client {


    public static void main(String[] args) {
        final Originator originator = new Originator();
        final Caretaker caretaker = new Caretaker(originator);


        caretaker.doSomething("Hello");
        caretaker.doSomething(", ");
        caretaker.doSomething("World");
        caretaker.doSomething("!");

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
