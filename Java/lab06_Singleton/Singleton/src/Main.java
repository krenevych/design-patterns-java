public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            Singleton instance = Singleton.getInstance();
            System.out.println(instance);
        });

        Thread thread2 = new Thread(() -> {
            Singleton instance = Singleton.getInstance();
            System.out.println(instance);
        });

        thread1.start();
        thread2.start();


    }
}