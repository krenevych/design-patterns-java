public class Main {
    public static DB db = new DB("DB");

    public static void main(String[] args) {

        DBProvider provider = new DBProvider();
        provider.addToDb("Hello");
        provider.addToDb("World");
        System.out.println(db);

    }
}