package apractice;

public class Practice2 {
    public static void main(String[] args) {
        int num1=25;
        int num2=60;
        if(num1==num2){
            System.out.println("Numbers are equal");

        } else{
            System.out.println("Numbers are not equal");
        }
        if (num1==25 && num2==50){
            System.out.println("We are comparing two number");
        } else{
            System.out.println("We are not comparing two number");
        }

        int age=35;
        if (age<=24 && age>=40){
            System.out.println("Your age age is less than or greater than 24)");
        } else if(age>=40 && age<=50){
            System.out.println("Your age is not 24");
        } else{
            System.out.println("You are under 24");
        }
    }
}
