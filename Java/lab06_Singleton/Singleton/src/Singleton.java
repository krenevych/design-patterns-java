import java.util.concurrent.locks.ReentrantLock;

public class Singleton {

    private Singleton() {
    }

    private static Singleton instance = null;
    private static ReentrantLock mutex = new ReentrantLock();
    public static Singleton getInstance() {
        if (instance == null){
            mutex.lock();
            if (instance == null)
                instance =  new Singleton();
            mutex.unlock();
        }

        return instance;
    }

}
