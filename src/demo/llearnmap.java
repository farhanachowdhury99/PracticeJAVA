package demo;

import java.util.HashMap;
import java.util.Map;

public class llearnmap {

    public static void main(String[] args) {
        Map<String, String> computer = new HashMap<>();
        computer.put("Brand", "HP");
        computer.put("icore", "7.0");
        computer.put("RAM", "12GB");
        computer.put("Color", "Silver");

        for (Map.Entry<String, String> string : computer.entrySet()) {
            System.out.println(string.getKey() + " : " + string.getValue());
        }

        for (String st: computer.keySet()){
            System.out.println(st+ " : "+computer.get(st));
        }
    }
}
