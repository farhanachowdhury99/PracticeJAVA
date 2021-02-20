package practice;

public class PracticeForLoop {
    public static void main(String[] args) {

        for (int i = 6; i < 10; i++) {
            System.out.println("Hello " + i);
        }

        for (int i = 8; i < 12; i++) {
            System.out.println("QA enginner");
            int num1 = 40;
            int num2 = 25;
            int total = num1 + num2;
            System.out.println("total " + total);

        }

        // for (int i = 8; i >4; --i) {

        //        System.out.println("Hi");
        //  }
        for (int i = 2; i <= 4; i++) {
            System.out.println("I love to eat");
            for (int j = 3; j <= 5; j++) {
                System.out.println("I love to eat biryani " + j);
            }
        }

        PracticeForLoop.learnJAva();
    }


    public static void learnJAva() {
        for (int i = 2; i <= 6; i++) {
            System.out.println("Learn Java");
        }
    }


}