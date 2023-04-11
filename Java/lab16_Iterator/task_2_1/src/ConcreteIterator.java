import java.util.List;

public class ConcreteIterator implements Iterator {

    private final List<Element> collection;
    private int iterationState;

    public ConcreteIterator(ConcreteCollection collection) {
        this.collection = collection.getElements();
        iterationState = 0;
    }

    @Override
    public Element getNext() {
        return collection.get(iterationState++);
    }

    @Override
    public boolean hasMore() {
        return iterationState < collection.size();
    }
}
