package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnLists {
    public static void main(String[] args) {


        List<String> stateName = new ArrayList<>();

        stateName.add("New York");
        stateName.add("New Jersey");
        stateName.add("New Mexico");
        stateName.add("New York");

        for (String st: stateName){
            System.out.println(st);

            Iterator it= stateName.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }

        }
    }
}