package problemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProblemSolving1 {

   // Write a Java program to sort a numeric array and a string array.

    public static void main(String[] args) {

        int num[]={2,3,1,6,4,5,8,7};
        Arrays.sort(num);
        System.out.print("Sorted numbers are ");
        for (Integer in: num){
            System.out.print(in+"  ");
        }
        System.out.println();
        ArrayList<String> Name= new ArrayList<>();
        Name.add("Farhana");
        Name.add("Sanjana");
        Name.add("Mehek");
        Name.add("Aleya");

        Collections.sort(Name);

        //Arrays.sort(name);
        System.out.print("Students name are "+Name);

//        for(String st: Name){
//            System.out.print(Name+" ");
//        }




    }
}
