public class ConcreteMemento implements Memento {
    private final String state;

    public ConcreteMemento(String state) {
        this.state = state;
    }

    public String getState(){
        return state;
    }
}
