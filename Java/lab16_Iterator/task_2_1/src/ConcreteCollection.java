import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcreteCollection implements IterableCollection {

    public ConcreteCollection(Element... elements) {
        this.elements.addAll(List.of(elements));
    }

    private final List<Element> elements = new ArrayList<>();

    List<Element> getElements() {
        return elements;
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
}
