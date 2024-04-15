import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcreteCollection implements IterableCollection {
    final private List<Element> elements = new ArrayList<>();

    public ConcreteCollection(Element... elements) {
        Collections.addAll(this.elements, elements);
    }

    public void add(Element element){
        elements.add(element);
    }

    @Override
    public String toString() {
        return "ConcreteCollection{" +
                "elements=" + elements +
                '}';
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public static class ConcreteIterator implements Iterator {
        final private ConcreteCollection collection;
        private int iterationState;

        public ConcreteIterator(ConcreteCollection collection) {
            this.collection = collection;
            iterationState = 0;
        }

        @Override
        public boolean hasMore() {
            int size = this.collection.elements.size();
            return iterationState < size;
        }

        @Override
        public Element getNext() {
            Element element = collection.elements.get(iterationState);
            iterationState++;
            return element;
        }
    }
}
