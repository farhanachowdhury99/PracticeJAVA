package datastructureandalgorithm;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LearnUnionIntersectin {
    public static void main(String[] args) {

        int num1[]={1,2,20,25,26,86,28,};
        int num2[]={2,20,28,29,86,21,22};

        Set<Integer> number1= new HashSet<>();
        number1.addAll(Arrays.asList(new Integer[]{1,2,20,25,26,86,28,} ));

        Set<Integer> number2= new HashSet<>();
        number2.addAll(Arrays.asList(new Integer[]{2,20,28,29,86,21,22} ));

        Set<Integer> union= new HashSet<>(number1);
        union.addAll(number2);
        System.out.println("Union of two set "+union);

        Set<Integer> intersection= new HashSet<>(number1);
        intersection.retainAll(number2);





    }






}
