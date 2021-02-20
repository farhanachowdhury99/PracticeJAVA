package map;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LearnListHashMap {

    public static void main(String[] args) {
        List<String> stateNameofUSA= new LinkedList<>();
        stateNameofUSA.add("New York");
        stateNameofUSA.add("New Jersey");
        stateNameofUSA.add("New Mexico");
        stateNameofUSA.add("New Hempshire");

        List<String> stateNameofCanada= new LinkedList<>();

        stateNameofCanada.add("Ontario");
        stateNameofCanada.add("Montreal");
        stateNameofCanada.add("Tornoto");
        stateNameofCanada.add("Victoria");

        Map<String,List<String>> stMap= new HashMap<>();
        stMap.put("USA", stateNameofUSA);
        stMap.put("Canada", stateNameofCanada);

        for (Map.Entry<String,List<String>> State: stMap.entrySet()){
            System.out.println(State.getKey()+ " : "+State.getValue());
        }
        for (Map.Entry<String, List<String>> entry: stMap.entrySet()){
            System.out.println("Country : "+stMap.get(stMap));
        }


    }
}
