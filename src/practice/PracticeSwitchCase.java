package practice;

import java.util.Scanner;

public class PracticeSwitchCase {

    public static void main(String[] args) {
        PracticeSwitchCase.foodMenu();
    }
    public static void foodMenu() {

        Scanner food=new Scanner(System.in);
        System.out.println("Enter your food serial number");

        int foodSerial=food.nextInt();

        String foodName;

        switch (foodSerial) {

            case 1:
                foodName = "tea";
                String teaType="herbal";
                if (teaType=="herbal") {

                    System.out.println("Your selected tea is herbal");
                } else {
                    System.out.println("you did not select any type");
                }
                break;

            case 2:
                foodName = "Soup";
                break;

            case 3:
                foodName = "Rice";
                break;

            case 4:
                foodName = "Pasta";
                break;

            default:
                foodName = "invalid food name selected";
                break;
        }

                System.out.println("Your food selection is "+foodName);




        }
    }


