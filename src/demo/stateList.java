package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class stateList {

    public static void main(String[] args) {
        List<String> stateName= new ArrayList<>();

        stateName.add("New York");
        stateName.add("New Jersey");
        stateName.add("New Mexico");
        stateName.add("Virginia");
        stateName.add("New York");

        System.out.println(stateName);

       // for (String state: stateName){
        //    System.out.println("State Names are "+state);
       // }

        Iterator it= stateName.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        stateName.remove("Virginia");
        Iterator it1 = stateName.iterator();
        while(it.hasNext()){
            System.out.println("After remove "+it1.next());
        }




    }
}
