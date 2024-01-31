package domain;

import data.MSDataBase;

public class MSDataBaseClient {

    private final DBApi dataBase;

    public MSDataBaseClient(DBApi dataBase) {
        this.dataBase = dataBase;
    }

    public void work() {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 1) {
                dataBase.addData();
            } else if (i % 3 == 2) {
                dataBase.update();
            } else {
                dataBase.getData();
            }
        }
    }
}
