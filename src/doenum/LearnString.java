package doenum;

public class LearnString {
    String name="James";

    public static void main(String[] args) {
        String food="burger";
        System.out.println(food.length());
        System.out.println(food.equals("burger"));
        System.out.println(food.equalsIgnoreCase("BURGER"));
        System.out.println(food.charAt(3));
        char charCompare=food.charAt(3);
        String name="James";
        System.out.println(food.substring(3));
        System.out.println(food.substring(1,4));
        System.out.println(food.toUpperCase());

        String stId="101";
        String lastName="William";
        System.out.println(stId.concat(lastName));

        try {
            System.out.println(food.charAt(12));
        } catch (Exception e){

            System.out.println("String Out of Boundary Exception");
        }
        System.out.println(food.contains("g"));

    }
}
