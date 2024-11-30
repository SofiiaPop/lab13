package ua.edu.ucu.apps.Task3;

import java.util.HashMap;
import java.util.Map;

public class JSONObject {

    private final Map<String, Object> map;

    public JSONObject() {
        this.map = new HashMap<>();
    }

    public JSONObject(String text) {
        this();
        parseJSON(text);
    }

    private void parseJSON(String text) {
        text = text.trim();
        if (text.startsWith("{") && text.endsWith("}")) {
            text = text.substring(1, text.length() - 1);
            String[] pairs = text.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
            for (String pair : pairs) {
                String[] keyValue = pair.split(":(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
                if (keyValue.length == 2) {
                    String key = keyValue[0].trim().replace("\"", "");
                    String value = keyValue[1].trim().replace("\"", "");
                    map.put(key, value);
                }
            }
        } else {
            throw new IllegalArgumentException("Invalid JSON string: " + text);
        }
    }

    public void put(String key, Object value) {
        map.put(key, value);
    }

    public Object get(String key) {
        return map.get(key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        map.forEach((key, value) -> sb.append("\"").append(key).append("\":\"").append(value).append("\","));
        if (!map.isEmpty()) {
            sb.setLength(sb.length() - 1);
        }
        sb.append("}");
        return sb.toString();
    }

    public boolean hasKey(String key) {
        return map.containsKey(key);
    }

    public int size() {
        return map.size();
    }
}
