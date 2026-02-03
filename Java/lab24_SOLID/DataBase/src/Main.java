public class Main {
    public static void main(String[] args) {
        MSDataBase dataBase = new MSDataBase();
        MSDataBaseClient client = new MSDataBaseClient(dataBase);
        client.work();
    }
}