public class MSDataBaseClient {

    private MSDataBase dataBase;

    public MSDataBaseClient(MSDataBase dataBase) {
        this.dataBase = dataBase;
    }

    public void work() {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 1) {
                dataBase.addDataMS();
            } else if (i % 3 == 2) {
                dataBase.updateDataMS();
            } else {
                dataBase.getDataMS();
            }
        }
    }
}
