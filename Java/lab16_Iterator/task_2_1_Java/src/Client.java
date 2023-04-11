import java.util.Iterator;

public class Client {

    public static void main(String[] args) {
        ConcreteCollection collection = new ConcreteCollection(
                new Element("112"),
                new Element("2s"),
                new Element("31231cs"),
                new Element("4")
        );

//        System.out.println(collection);

//        Iterator<Element> iterator = collection.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        collection.setIteratorFactory(ConcreteIterator::new);
        for (Element element : collection){
            System.out.println(element);
        }

//        for (Element element : collection.getElements()){
//            System.out.println(element);
//        }

//        collection.forEach(System.out::println);

    }

}
