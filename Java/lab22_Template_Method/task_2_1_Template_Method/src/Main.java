public class Main {
    public static void main(String[] args) {
        AbstractClass obj1 = new ConcreteClass1();
        obj1.templateMethod();

        System.out.println("============");
        AbstractClass obj2 = new ConcreteClass2(11);
        obj2.templateMethod();
        System.out.println("============");
        AbstractClass obj3 = new ConcreteClass2(22);
        obj3.templateMethod();
    }
}
