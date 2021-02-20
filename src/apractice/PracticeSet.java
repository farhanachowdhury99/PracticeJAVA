package apractice;

import java.util.HashSet;
import java.util.Set;

public class PracticeSet {

    public static void main(String[] args) {
        Set<String> mobilebrand= new HashSet<>();
        mobilebrand.add("iphone");
        mobilebrand.add("samsung");
        mobilebrand.add("Nokia");
        mobilebrand.add("LG");
        System.out.println(mobilebrand);
        System.out.println(mobilebrand.contains("LG"));
    }

}
