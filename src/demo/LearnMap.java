package demo;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {


        Map<String, String> stateMap = new HashMap<>();
        stateMap.put("USA","NY");
        stateMap.put("UK","London");
        stateMap.put("CANADA","ONtario");
        stateMap.put("BD","Sylhet");

        System.out.println(stateMap.get("BD"));

        for (Map.Entry<String, String> string: stateMap.entrySet()){
            System.out.println(string.getKey()+ " : "+string.getValue());
        }

        for (String st: stateMap.keySet()){
            System.out.println(st+"  : "+stateMap.get(st));
        }
    }
}
