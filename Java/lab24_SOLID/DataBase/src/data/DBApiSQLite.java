package data;

import domain.DBApi;

public class DBApiSQLite implements DBApi {
    private SQLiteDataBase dataBase = new SQLiteDataBase();

    @Override
    public void getData() {
        dataBase.getDataFromSQLite();
    }

    @Override
    public void update() {
        dataBase.updateDataSQLite();
    }

    @Override
    public void addData() {
        dataBase.addDataSQLite();
    }
}
