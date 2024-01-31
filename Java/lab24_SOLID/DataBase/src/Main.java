import data.DBApiSQLite;
import domain.DBApi;
import domain.MSDataBaseClient;

public class Main {
    public static void main(String[] args) {
        DBApi dataBase = new DBApiSQLite();
        MSDataBaseClient client = new MSDataBaseClient(dataBase);
        client.work();
    }
}