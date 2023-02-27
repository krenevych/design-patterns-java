import java.util.HashMap;
import java.util.Map;

public class DataBase<K, V> {

    private final Map<K, V> data = new HashMap<>();

    public void init() {
        data.clear();
    }

    public void insertData(K key, V value) {
        data.put(key, value);
    }

    public V selectData(K key) {
        return data.get(key);
    }

    public void showContent(){
        for (Map.Entry<K, V> entry : data.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            System.out.printf("%s: %s" , key, value);
        }

    }

}
