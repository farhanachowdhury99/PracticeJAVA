package apractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LearnUnionIntersection {

    public static void main(String[] args) {
        int num1[]={2,8,5,3,4,6,10,12,13};
        int num2[]={2,4,10,12,15,19,20,6};

        Set<Integer> number1= new HashSet<>();
        number1.addAll(Arrays.asList(new Integer[] {2,8,5,3,4,6,10,12,13} ));

        Set<Integer> number2= new HashSet<>();
        number2.addAll(Arrays.asList(new Integer[] {2,4,10,12,15,19,20,6}));

        Set<Integer> union= new HashSet<>(number1);
        union.addAll(number2);
        System.out.println("Union of 2 sets "+union);

        Set<Integer> intersection= new HashSet<>(number1);
        intersection.retainAll(number2);
        System.out.println("Insersection is "+intersection);

        Set<Integer> difference = new HashSet<>(number1);
        difference.removeAll(number2);
        System.out.println("Difference of two set "+difference);


    }
}
