public class Singleton {
    private Singleton() {
    }

    final private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
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
