package apractice;

import java.util.Scanner;

public class Practice5 {
    //Write a Java program that takes a number as input and prints its multiplication table upto 10

    public static void findNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number= input.nextInt();

        int num;
        for( int i=0;i<=10;i++){
            System.out.println(number+"x"+i+"="+(number*i));
        }

input.close();
    }

    public static void main(String[] args) {
        Practice5.findNum();
    }
}
