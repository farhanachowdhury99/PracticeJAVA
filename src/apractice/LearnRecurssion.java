package apractice;

import learnsort.LearnRecursion;

public class LearnRecurssion {
    static int count=0;
    public static void tvDisplay(){
        count++;
        if(count<10){
            System.out.println("This is Tv display");
            tvDisplay();
        }


    }

    public static void main(String[] args) {
        LearnRecursion.tvDisplay();
    }
}
