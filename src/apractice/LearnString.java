package apractice;

import java.util.Locale;

public class LearnString {
    String name="James";

    public static void main(String[] args) {
        String foodName="Biryani";
        System.out.println(foodName.length());
        System.out.println(foodName.equals("biryani"));
        System.out.println(foodName.equalsIgnoreCase("biryani"));
        System.out.println(foodName.charAt(5));
        char charCompare= foodName.charAt(3);
        System.out.println(charCompare);
        System.out.println(foodName.substring(3,5));
        System.out.println(foodName.toLowerCase(Locale.ROOT));
        System.out.println(foodName.toUpperCase(Locale.ROOT));
        System.out.println(foodName.contains("y"));

        String stID="101";
        String lastName=" William";
        System.out.println(stID.concat( lastName));

       LearnSingleton learn= LearnSingleton.getInstance();
        System.out.println(learn.collegeName);


    }
    String pizzaName;
    String toppingName;
    int qty;
    double price;
    public LearnString(){

    }
}
