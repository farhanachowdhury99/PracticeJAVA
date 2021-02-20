package demo;

import java.util.HashMap;
import java.util.Map;

public class MapLearn {

    public static void main(String[] args) {
        Map<String, String> stInfo= new HashMap<>();
        stInfo.put("Farhana","100");
        stInfo.put("Farana","110");
        stInfo.put("Fahana","120");
        stInfo.put("Frhana","150");

        for (Map.Entry<String,String> st: stInfo.entrySet()){
            System.out.println(st.getKey()+" : "+st.getValue());
        }
        for (String sts: stInfo.keySet()){
            System.out.println(sts+ "  :  "+stInfo.get(sts));

}
    }
}
