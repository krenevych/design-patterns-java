import java.util.Iterator;

public interface IteratorFactory {
    Iterator<Element> createIterator(ConcreteCollection collection);
}
