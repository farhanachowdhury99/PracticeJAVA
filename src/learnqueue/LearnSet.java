package learnqueue;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set<String> clotingBrand= new HashSet<>();

       clotingBrand.add("DKNY");
       clotingBrand.add("MK");
       clotingBrand.add("CK");
       clotingBrand.add("Gucchi");
       clotingBrand.add("Coach");
        System.out.println(clotingBrand);
        System.out.println(clotingBrand.remove("Gucchi"));
        System.out.println(clotingBrand);
        System.out.println(clotingBrand.contains("MK"));


    }
}
