public class SingletonLazy {

    private SingletonLazy() {
    }

    private static SingletonLazy instance = null;

    public static SingletonLazy getInstance() {

        if (instance == null){
            System.out.println("Creation SingletonLazy");
            instance = new SingletonLazy();
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
