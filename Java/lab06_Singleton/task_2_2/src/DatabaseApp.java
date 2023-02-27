public class DatabaseApp {

    private void addToDataBase(String key, String value){
        // TODO: реалізуйте метод додавання запису до бази даних
    }

    private void showInfoFromDB(){
        // TODO: реалізуйте метод виведення усіх записів бази даних
    }

    public static void main(String[] args) {

        DatabaseApp app = new DatabaseApp();

        app.addToDataBase("AA1234YY", "John Smith");
        app.addToDataBase("BB0932EE", "Barbara Liskov");
        app.addToDataBase("BI2582PO", "James Bond");
        app.addToDataBase("AA9311TM", "Peter Pan");

        app.showInfoFromDB();
    }
}
