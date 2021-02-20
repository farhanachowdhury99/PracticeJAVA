package apractice;

import java.util.Scanner;

public class Practice6 {
   // Write a Java program that takes three numbers as input to calculate and print the average of the numbers

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter the first number");
        int firstNumber= input.nextInt();

        System.out.println("Please enter the second number");
        int secondNumber=input.nextInt();

        System.out.println("Please enter the third number");
        int thirdNumber= input.nextInt();

        System.out.println("The average of the numbers are "+(firstNumber+secondNumber+thirdNumber)/3);
        input.close();
    }

}
