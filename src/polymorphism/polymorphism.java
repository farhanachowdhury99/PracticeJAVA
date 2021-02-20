package polymorphism;

public class polymorphism {

    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 60;
        doSum(23,25);
        polymorphism.doSum(20,30,40);
    }
        public static void doSum(){

        }

        public static void doSum(int num1, int num2){
        int total=num1+num2;
            System.out.println("Total is "+total);

        }

        public static void doSum(int num1, int num2, int num3){
        int total=num1+num2+num3;
            System.out.println("Total sum is "+total);
        }
    }

