public class HandlersManager {

    public Handler getHandler() {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();
        Handler handler4 = new ConcreteHandler4();

        handler1.setNext(handler2);
        handler2.setNext(handler3);
//        handler3.setNext(handler4);

        return handler1;
    }

}
