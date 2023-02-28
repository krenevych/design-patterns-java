public class SingletonLazyThredSafe {

    private SingletonLazyThredSafe() {
    }

    private static SingletonLazyThredSafe instance = null;

    synchronized public static SingletonLazyThredSafe getInstance() {

        if (instance == null){
            System.out.println("Creation SingletonLazy");
            instance = new SingletonLazyThredSafe();
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
