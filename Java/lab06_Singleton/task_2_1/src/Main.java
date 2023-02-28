public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello!");
//
//        Singleton.getInstance().show();
//        Singleton.getInstance().setData(189);
//        Singleton.getInstance().show();
//
//
//        UseCaseSingleton useCaseSingleton = new UseCaseSingleton();
//        useCaseSingleton.setDataForSingleton(19900);
//        Singleton.getInstance().show();
//
//        Singleton singleton = Singleton.getInstance();
//        singleton.show();
//        System.out.println("===================");
//
//        SingletonLazy.getInstance().show();
//        SingletonLazy.getInstance().setData(100500);
//        SingletonLazy.getInstance().show();
//        SingletonLazy.getInstance().setData(100);
//        SingletonLazy.getInstance().show();
//        SingletonLazy.getInstance().setData(500);
//        SingletonLazy.getInstance().show();
//        SingletonLazy.getInstance().show();
//        SingletonLazy.getInstance().show();

//        Thread thread1 = new Thread(() -> {
//            SingletonLazy instance = SingletonLazy.getInstance();
//            instance.setData(100);
//            instance.show();
//        });
//
//        Thread thread2 = new Thread(() -> {
//            SingletonLazy instance = SingletonLazy.getInstance();
//            instance.setData(500);
//            instance.show();
//        });
//
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        SingletonLazy.getInstance().show();

        Thread thread1 = new Thread(() -> {
            SingletonLazyThredSafe instance = SingletonLazyThredSafe.getInstance();
            instance.setData(100);
            instance.show();
        });

        Thread thread2 = new Thread(() -> {
            SingletonLazyThredSafe instance = SingletonLazyThredSafe.getInstance();
            instance.setData(500);
            instance.show();
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        SingletonLazyThredSafe.getInstance().show();


    }
}
