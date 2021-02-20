package problemsolving;

import array.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ProblemSolving3 {
    //Write a Java program to remove a specific element from an array
    public static void main(String[] args) {
        ArrayList<Integer> num= new ArrayList<>();
        num.add(20);
        num.add(40);
        num.add(30);
        num.add(50);
        num.add(60);

        System.out.println(num.remove(3));


    }
}
