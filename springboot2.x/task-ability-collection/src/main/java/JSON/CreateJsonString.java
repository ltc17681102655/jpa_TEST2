package JSON;


import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class CreateJsonString {

    public static String createJsonString(Map<String, Object> kv) {
        JSONObject jsonObject = new JSONObject();
        kv.entrySet().stream().forEach(c -> jsonObject.put(c.getKey(), c.getValue()));
//        jsonObject.put(key, value);
        return jsonObject.toString();
    }

}

class Demo {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "ltc");
        map.put("age", "123");
        String jsonString = CreateJsonString.createJsonString(map);
        System.out.println(jsonString);
    }
}
