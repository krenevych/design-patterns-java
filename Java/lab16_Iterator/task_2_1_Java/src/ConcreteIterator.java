import java.util.Iterator;
import java.util.List;

public class ConcreteIterator implements Iterator<Element> {

    private final List<Element> collection;
    private int iterationState;

    public ConcreteIterator(ConcreteCollection collection) {
        this.collection = collection.getElements();
        iterationState = 0;
    }

    @Override
    public boolean hasNext() {
        return iterationState < collection.size();
    }

    @Override
    public Element next() {
        return collection.get(iterationState++);
    }


}
