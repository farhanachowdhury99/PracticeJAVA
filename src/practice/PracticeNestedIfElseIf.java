package practice;

public class PracticeNestedIfElseIf {
    public static void main(String[] args) {

        int price = 1200;
        if (price>=1700){
            System.out.println("I am not buying the product");
            if (price>=1800 ){
                System.out.println("I might ask my sister");
            } else if  (price>=1850){
                   System.out.println("I will buy is next month");
               }
        } else if (price <=1600){
            System.out.println("I might buy the product");
        } else if (price<=1000){
            System.out.println("I will buy the product");
        } else {
            System.out.println("I will definitely buy the product");
        }
    }
}
