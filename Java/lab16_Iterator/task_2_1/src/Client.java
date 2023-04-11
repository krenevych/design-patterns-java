public class Client {

    public static void main(String[] args) {
        ConcreteCollection collection = new ConcreteCollection(
                new Element("1"),
                new Element("2"),
                new Element("3"),
                new Element("4")
        );

//        System.out.println(collection);

        Iterator iterator = collection.createIterator();
        while (iterator.hasMore()){
            System.out.println(iterator.getNext());
        }

//        for (Element element : collection){
//            System.out.println(element);
//        }

    }

}
