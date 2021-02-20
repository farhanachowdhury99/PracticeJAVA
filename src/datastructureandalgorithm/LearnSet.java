package datastructureandalgorithm;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {
    public static void main(String[] args) {
        Set<String> mobileBrand= new HashSet<>();
        mobileBrand.add("iphone");
        mobileBrand.add("Samsung");
        mobileBrand.add("Motorolla");
        mobileBrand.add("Blackberry");
        mobileBrand.add("Nokia");

        System.out.println(mobileBrand);
        System.out.println(mobileBrand.remove("Motorolla"));
        System.out.println(mobileBrand);
        System.out.println(mobileBrand.contains("Samsung"));
    }
}
