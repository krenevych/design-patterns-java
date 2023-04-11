import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteCollection implements Iterable<Element> {

    public ConcreteCollection(Element... elements) {
        this.elements.addAll(List.of(elements));
    }

    private final List<Element> elements = new ArrayList<>();

    List<Element> getElements() {
        return elements;
    }

    public void add(Element element) {
        elements.add(element);
    }

    private IteratorFactory iteratorFactory;

    public void setIteratorFactory(IteratorFactory iteratorFactory) {
        this.iteratorFactory = iteratorFactory;
    }

    @Override
    public String toString() {
        return "ConcreteCollection{" +
                "elements=" + elements +
                '}';
    }

    @Override
    public Iterator<Element> iterator() {
        assert iteratorFactory != null;
        return iteratorFactory.createIterator(this);
    }
}
