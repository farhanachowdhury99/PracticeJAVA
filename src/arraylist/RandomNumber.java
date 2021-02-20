package arraylist;

import java.util.Random;

public class RandomNumber {

    public static void main(String[] args) {
        double[] stID= new double[6];
        Random random= new Random(10);

        for (int i=0; i<stID.length; i++){
            stID[i]=random.nextInt(300);
            System.out.println(stID[i]);
        }
        System.out.println(Math.random());
        System.out.println(("NY201"+Math.random()));
    }
}
