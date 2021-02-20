package demo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ListHashmap {
    public static void main(String[] args) {

        List<String> smartTV= new LinkedList<>();
        smartTV.add("Samsung");
        smartTV.add("Apple");
        smartTV.add("Panasonic");
        smartTV.add("Sony");

        List<String> smartPhone= new LinkedList<>();
        smartPhone.add("iphone");
        smartPhone.add("Samsung");
        smartPhone.add("Motorolla");

        List<String> computer= new LinkedList<>();
        computer.add("Aceno");
        computer.add("Dell");
        computer.add("Microsoft");
        computer.add("Lenovo");

        Map<String, List<String>> electronics= new HashMap<>();
        electronics.put("computerName ",computer);
        electronics.put("Mobile",smartPhone);
        electronics.put("computerName",computer);

        for (Map.Entry<String, List<String>> myelectronics: electronics.entrySet()){
            System.out.println(myelectronics.getKey()+" : "+myelectronics.getValue());
        }



    }

}
