package data;

import domain.DBApi;

public class DBApiMS implements DBApi {
    private MSDataBase dataBase = new MSDataBase();

    @Override
    public void getData() {
        dataBase.getDataMS();
    }

    @Override
    public void update() {
        dataBase.updateDataMS();
    }

    @Override
    public void addData() {
        dataBase.addDataMS();
    }
}
