import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SingletonLazyThredSafe2 {

    private SingletonLazyThredSafe2() {
    }

    private static SingletonLazyThredSafe2 instance = null;

    private static final Lock lock = new ReentrantLock();

    public static SingletonLazyThredSafe2 getInstance() {

        if (instance == null){
            lock.lock();
            if (instance == null) {
                System.out.println("Creation SingletonLazy");
                instance = new SingletonLazyThredSafe2();
            }
            lock.unlock();
        }

        return instance;
    }

    private int data = 10;
    public void setData(int data) {
        this.data = data;
    }
    public int getData(){
        return data;
    }
    public void show() {
        System.out.println( "Singleton " + this + " {" +
                "data=" + data +
                '}');
    }

}
