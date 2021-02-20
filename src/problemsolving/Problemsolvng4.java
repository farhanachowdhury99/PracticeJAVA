package problemsolving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problemsolvng4 {

    //Write a Java program to find the common elements between two arrays of integers
    public static void main(String[] args) {


        int num1[] = {2, 4, 6, 3, 7, 5, 10};
        int num2[]={1,3,5,7,9,10,12,2,8};

        Set<Integer> number1= new HashSet<>();
        number1.addAll(Arrays.asList(new Integer[] {2, 4, 6, 3, 7, 5, 10}));

        Set<Integer> number2= new HashSet<>();
        number2.addAll(Arrays.asList(new Integer[] {1,3,5,7,9,10,12,2,8}));

        Set<Integer> intersection= new HashSet<>(number1);
        intersection.retainAll(number2);
        System.out.println("Common elements are "+intersection);

    }
}