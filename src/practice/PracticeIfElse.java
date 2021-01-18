package practice;

public class PracticeIfElse {

    public static void main (String [] args){
        int number=26;

        if (number==24){
            System.out.println("number is 24");
        } else{
            System.out.println("number is not 24");

        }

        int age = 56;
        if (age >= 18 && age <= 21) {
            System.out.println("You are adult but cant drink");
        } else {
            System.out.println("You are not adult");
        }

        String gender="Female";
        if (gender=="Female" || age >=50){
            System.out.println("You do not have to buy ticket");

        } else {
            System.out.println("You have to buy ticket");
        }


    }
}
