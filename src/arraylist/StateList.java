package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StateList {
    public static void main(String[] args) {
        List<String> StateName= new ArrayList<>();
        List<String> StateName1= new LinkedList<>();

        StateName.add("MI");
        StateName.add("NY");
        StateName.add("CA");
        StateName.add("CO");
        StateName.add("MA");

      //  for (String state: StateName){
      //      System.out.println("States are "+state);
       // }

        Iterator it= StateName.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Iterator ite= StateName.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }


   }
}
