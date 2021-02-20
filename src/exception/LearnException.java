package exception;

public class LearnException {
    public static void main(String[] args) {


        try {
            int x = 10;
            int y = 0;
            int total = x / y;
            System.out.println("Total is " + total);
        } catch (Exception e){
            System.out.println("Artimatic exception");

        }
        System.out.println("Done");
    }
}
