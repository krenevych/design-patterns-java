import java.util.Stack;

public class Caretaker {

    private final Originator originator;
        private final Stack<Originator.Memento> history = new Stack<>();

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void doSomething(String toUpdate){
        final Originator.Memento memento = originator.save();
        history.push(memento);

        originator.updateState(toUpdate);
    }

    public void undo(){
        if (history.empty()){
            return;
        }

        final Originator.Memento memento = history.pop();
        originator.restore(memento);
    }

}
