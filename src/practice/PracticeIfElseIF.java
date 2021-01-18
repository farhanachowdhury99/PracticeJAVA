package practice;

import java.util.Scanner;

public class PracticeIfElseIF {

    public static void main(String[] args) {
        PracticeIfElseIF.retiremenentCalculator();

    }

    public static void retiremenentCalculator() {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=input.nextInt();


        int yourAge = 25;
        if (age<=20 && age <=28){
            System.out.println("your age is more than 20");

        } else if (age>=28 && age<=50){
            System.out.println("your age is more than 40");

        } else {
            System.out.println("Its not time to retire");
        }
    }
}
