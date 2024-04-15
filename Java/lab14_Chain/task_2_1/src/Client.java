public class Client {
    public static void main(String[] args) throws InterruptedException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hello world");
            }
        };


        Thread thread = new Thread(runnable);
        thread.start();
        thread.join();
//
//        Request[] requests = {
//                new RequestType1(),
//                new RequestType2(),
//                new RequestType1(),
//                new RequestType3(),
//                new RequestType4(),
//                new RequestType2(),
//                new RequestType4(),
//                new RequestType1(),
//                new Request() {
//                    @Override
//                    public String toString() {
//                        return "BrendNewRequest" +
//                                ", id=" + getId() +
//                                '}';
//                    }
//                }
//        };
//
//
//        Handler handler1 = new HandlerType1();
//        Handler handler2 = new HandlerType2();
//        Handler handler3 = new HandlerType3();
//        Handler handler4 = new HandlerType4();
//        Handler handler5 = new Handler() {
//            @Override
//            public void handle(Request request) {
//                System.out.println("New request " + request);
//                super.handle(request);
//            }
//        };
//
//        handler1.setNext(handler2);
//        handler2.setNext(handler3);
//        handler3.setNext(handler4);
//        handler4.setNext(handler5);
//
//
//        for (Request request : requests) {
//            handler1.handle(request);
//        }


    }
}
