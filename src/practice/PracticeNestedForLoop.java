package practice;

import java.util.Scanner;

public class PracticeNestedForLoop {

    public static void main(String[] args) {
        Scanner ForLoop= new Scanner(System.in);
        System.out.println("Enter your number");
        int number= ForLoop.nextInt();
         for (int i=1; i<=number;i++){
             for (int j=1; j<=i;j++){
                 System.out.print(j+" ");
             }
             System.out.println();
         }

    }
}
