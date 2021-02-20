package learnqueue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LearnUnionandIntersection {
    public static void main(String[] args) {
        int num1[]={2,8,10,56,86,25,23,58,24};
        int num2[]={6,8,10,26,86,35,23,538,24};

        Set<Integer> number1= new HashSet<>();
        number1.addAll(Arrays.asList(new Integer[]{2,8,10,56,86,25,23,58,24} ));

        Set<Integer> number2= new HashSet<>();
        number2.addAll(Arrays.asList(new Integer[] {6,8,10,26,86,35,23,538,24}));

        Set<Integer> union= new HashSet<>(number1);
        union.addAll(number2);
        System.out.println("Union of 2 set= "+union);

        Set<Integer> intersection= new HashSet<>(number1);
        intersection.retainAll(number2);
        System.out.println("Intersection of 2 set : "+intersection);

        Set<Integer> difference= new HashSet<>(number1);
        difference.removeAll(number2);
        System.out.println("Difference of 2 set"+difference);

        Set<Integer> difference1= new HashSet<>(number2);
        difference1.removeAll(number1);
        System.out.println("Difference of 2 set"+difference1);
    }
}
