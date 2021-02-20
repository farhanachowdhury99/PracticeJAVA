package apractice;

import java.util.Scanner;

public class PracticeSwitch {
    public static void main(String[] args) {
    PracticeSwitch.foodMenu();
    }

    public static void foodMenu(){

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the serial number");
        int serialNumber= input.nextInt();

        String foodName;

        switch (serialNumber){

            case 1:
                foodName="Burger";
                break;
            case 2:
                foodName= "French fries";
                break;
            case 3:
                foodName="pizza";
                break;
            case 4:
                foodName="Biryani";
                break;
            case 5:
                foodName="halim";
                break;
            case 6:
                foodName="chotpoti";
                String chotpotiType="Extra spicy";
                if (chotpotiType=="Extra spicy"){
                    System.out.println("You've selected extra spicy chotpoti");
                } else if (chotpotiType=="mild spicy"){
                    System.out.println("You've selcted mild spicy chotpoti");
                } else{
                    System.out.println("You did not select the spice level");
                }
                break;
            default:
                foodName="Invalid serial number";
                break;


        }
        System.out.println("Selected food name is "+foodName);
        input.close();
    }

}
