package demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LearnListHashMap {

    public static void main(String[] args) {
        List<String> stateName= new LinkedList<>();
        stateName.add("New York");
        stateName.add("New Jersey");
        stateName.add("New Mexico");
        stateName.add("Michigan");

        List<String> stateNameOfCanada= new LinkedList<>();
        stateNameOfCanada.add("Toronto");
        stateNameOfCanada.add("Ontario");
        stateNameOfCanada.add("Montrell");
        stateNameOfCanada.add("Victoria");

        Map<String, List<String>> stMap= new HashMap<>();
        stMap.put("USA",stateName);
        stMap.put("Canada",stateNameOfCanada);

        for (Map.Entry<String, List<String>> entry: stMap.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        for (String st: stMap.keySet()){
            System.out.println(st+ " : "+stMap.get(st));
        }

    }
}
