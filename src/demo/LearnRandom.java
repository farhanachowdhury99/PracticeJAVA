package demo;

import java.util.Random;

public class LearnRandom {

    public static void main(String[] args) {
        int [] number= new int[7];
        Random random= new Random(50);

        for (int i=0; i<number.length;i++){
            number[i]= random.nextInt(200);
            System.out.println(number[i]);


        }
        System.out.println(Math.random()+"NY200");
    }
}
