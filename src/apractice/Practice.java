package apractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice {

    public static void main(String[] args) {
       int num1[]={2,23,4,6,7,8,10,12};
       int num2[]={2,6,8,20,25,12,18,19};

        Set<Integer> number1= new HashSet<>();
        number1.addAll(Arrays.asList(new Integer[] {2,23,4,6,7,8,10,12}));

        Set<Integer> number2= new HashSet<>();
        number2.addAll(Arrays.asList(new Integer[]{2,6,8,20,25,12,18,19}));

        Set<Integer> union= new HashSet<>(number1);
        union.addAll(number2);
        System.out.println("Union of 2 sets are "+union);

        Set<Integer> intersection= new HashSet<>(number1);
        intersection.retainAll(number2);
        System.out.println("Intersection of the 2 numbers are "+intersection);

        Set<Integer> differentiate= new HashSet<>(number1);
        differentiate.removeAll(number2);
        System.out.println("The differentiate "+differentiate);


    }

}
