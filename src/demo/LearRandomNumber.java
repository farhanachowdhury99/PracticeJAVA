package demo;

import java.util.Random;

public class LearRandomNumber {

    public static void main(String[] args) {
        int [] lotteryNum= new int[12];
        Random random= new Random(10);


        for (int i=0; i<lotteryNum.length; i++){
           lotteryNum[i]= random.nextInt(200);
            System.out.println(lotteryNum[i]);
        }
    }
}
