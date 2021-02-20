package map;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {

    String name= "james";

    public static void main(String[] args) {
        Map<String, String> stateMap= new HashMap<>();
        stateMap.put("USA","New York");
        stateMap.put("UK","London");
        stateMap.put("CANADA","Montreal");
        stateMap.put("Bangladesh","Sylhet");
        stateMap.put("Armenia","Alji");

        System.out.println(stateMap.get("UK"));

        for (Map.Entry<String, String> entry: stateMap.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }

        for(String state: stateMap.keySet()){
            System.out.println(state+ " :" +stateMap.get(state));
        }

    }


}
