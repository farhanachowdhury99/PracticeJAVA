package quiz;

import java.util.Scanner;

public class Ques1 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Input first number: ");
        int number1= input.nextInt();

        System.out.print("Input second number: ");
        int number2= input.nextInt();

        System.out.print("Input third number: ");
        int number3= input.nextInt();

        if (number1 < number2 && number2 < number3)
        {
            System.out.println("Increasing order");
        }
        else if (number1 > number2 && number2 > number3)
        {
            System.out.println("Decreasing order");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
