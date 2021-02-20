package demo;

import java.util.Random;

public class LearnRandomNumber {

    public static void main(String[] args) {

        int[] num = new int[5];
        Random random = new Random(10);
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(100);
            System.out.println(num[i]);


        }

    }
}
