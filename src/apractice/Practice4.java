package apractice;

import java.util.Scanner;

public class Practice4 {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your score");
        int score= input.nextInt();

        if(score>=90){
            System.out.println("You got an A");
            if(score>=95 && score<=96) {
                System.out.println("You are excellent. You got an A");
            } else {
                if (score>=97 && score<=100){
                    System.out.println("You are awesome. You got an A");
                }
            }
        } else if (score>=80 && score<=89){
            System.out.println("You got a B");
        } else if (score>=70 && score<=79){
            System.out.println("You got a C");
            if(score >=75 && score<=79){
                System.out.println("You are doing better");
            } else {
                if (score>=70 && score<=74){
                    System.out.println("You need to study more");
                }

            }
        } else if (score >=60 && score<=69){
            System.out.println("You got a D");
        } else{
            System.out.println("You failed the class");
        }
input.close();
    }

}
