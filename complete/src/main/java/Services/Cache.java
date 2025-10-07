package Services;

import java.util.HashMap;
import java.util.Map;

public class Cache {

    private static Cache instance;
    private final Map<String, String> translations;

    private Cache() {
        translations = new HashMap<>();
    }

    public static Cache getInstance() {
        if (instance == null) {
            instance = new Cache();
        }
        return instance;
    }

    public String get(String key) {
        return translations.get(key);
    }

    public void put(String key, String value) {
        translations.put(key, value);
    }
}
