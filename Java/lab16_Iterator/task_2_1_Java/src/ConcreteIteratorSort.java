import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class ConcreteIteratorSort implements Iterator<Element> {

    private final List<Element> collection;
    private int iterationState;

    public ConcreteIteratorSort(ConcreteCollection collection) {
        this.collection = collection.getElements();
        this.collection.sort(Comparator.comparingInt(element -> element.getId().length()));
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
