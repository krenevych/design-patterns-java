import java.util.ArrayList;
import java.util.List;

public class DB {
    public DB(String name) {
        this.name = name;
    }

    final private String name;
    private final List<String> dbList = new ArrayList<>();

    public void add(String data){
        dbList.add(data);
    }

    @Override
    public String toString() {
        return "DB{" +
                "name = " + name +
                ", dbList=" + dbList +
                '}';
    }
}
