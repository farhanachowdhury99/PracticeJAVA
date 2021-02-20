package demo;

import java.util.HashMap;
import java.util.Map;

public class PracticeListMap {

    public static void main(String[] args) {
        Map<String, Integer> stScore= new HashMap<>();

        Map<String, String> stInfo= new HashMap<>();

        stScore.put("Farhana", 95);
        stScore.put("Fahmida", 93);
        stScore.put("Alisha", 91);
        stScore.put("AMIRA", 90);
        stScore.put("Sanjana", 96);

        for (Map.Entry<String, Integer> score: stScore.entrySet() ){
            System.out.println(score.getKey()+" = "+score.getValue());
        }

        stInfo.put("Farhana","Science");
        stInfo.put("Fahmida","Commerce");
        stInfo.put("Alisha","Science");
        stInfo.put("Sanjana","Arts");

        for (String info: stInfo.keySet()){
            System.out.println(info+ " subject is "+ stInfo.get(info));

        }


    }
}
