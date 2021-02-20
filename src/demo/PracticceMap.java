package demo;

import java.util.HashMap;
import java.util.Map;

public class PracticceMap {

    public static void main(String[] args) {
        Map<String, String> USmap= new HashMap<>();
        USmap.put("Michigan","Warren");
        USmap.put("New York","Queens");
        USmap.put("New Jersey","Victoria");
        USmap.put("New York","Buffalo");

        System.out.println(USmap.get("New York"));

        for (Map.Entry<String, String> map: USmap.entrySet()){
            System.out.println(map.getKey()+ ":"+map.getValue());

        }
    }
}
