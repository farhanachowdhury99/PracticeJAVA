package apractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class LearnBubbleSort {

    public static void main(String[] args) {
        int stId[] ={2,3,4,1,8,9,7,6};
        Arrays.sort(stId);
        for (Integer in: stId){
            System.out.print(in+"  ");
        }
        ArrayList<String> name= new ArrayList<>();
        name.add("farhana");
        name.add("Lisa");
        name.add("Sanjana");
        name.add("Armani");
        Collections.sort(name);
        System.out.println("Names are"+name);

    }


}
