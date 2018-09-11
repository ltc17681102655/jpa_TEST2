package JSON;

import com.alibaba.fastjson.JSON;

import java.util.HashMap;
import java.util.Map;

public class JsonTools {

    public static Object getPerson(String jsonstring, Class cls) {
        Object t = null;
        try {
            t = JSON.parseObject(jsonstring, cls);
        } catch (Exception e) {
            // TODO: handle exception
        }
        return t;
    }

}

class demo {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "ltc");
        map.put("age", "123");
        String jsonString = CreateJsonString.createJsonString(map);
        System.out.println(jsonString);

        /**
         *
         */
        Object person = JsonTools.getPerson(jsonString, new Person().getClass());
        System.out.println(person);
    }
}
