import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
//        List<String> strings = new ArrayList<>();
//        strings.add("Hello");
//        strings.add("World");
//        strings.add("!");
//
//        for (String string : strings) {
//            System.out.println("================");
//            System.out.println(string);
//            System.out.println("================");
//            for (String inner: strings){
//                System.out.println(inner);
//            }
//        }

        IterableCollection collection = new ConcreteCollection(
                new Element("1"),
                new Element("2"),
                new Element("3"),
                new Element("4")
        );

        System.out.println(collection);

        Iterator iterator = collection.createIterator();
        while (iterator.hasMore()){
//            System.out.println("================");
//            Iterator iterator1 = collection.createIterator();
//            while (iterator1.hasMore()){
//                Element element = iterator1.getNext();
//                System.out.println(element);
//            }
//            System.out.println("================");

            Element element = iterator.getNext();
            System.out.println(element);
        }

//        for (Element element: collection){
//            System.out.println(element);
//        }



    }

}
