public class ConcreteMemento implements Memento {

    private final ConcreteOriginator originator;
    private final String state;

    public ConcreteMemento(ConcreteOriginator originator, String state) {
        this.originator = originator;
        this.state = state;
    }

    @Override
    public void restore() {
        originator.setState(state);
    }
}
