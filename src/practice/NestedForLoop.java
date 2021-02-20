package practice;

import java.util.Scanner;

public class NestedForLoop {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your number");

        int Number=input.nextInt();

         for (int i=10; i>=Number; i--){
             for (int j=10; j>=i;j--){
                 System.out.print(" * ");

                 }
             }
             System.out.println();
         }

    }

