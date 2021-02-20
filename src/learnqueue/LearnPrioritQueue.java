package learnqueue;

import java.util.PriorityQueue;

public class LearnPrioritQueue {
    public static void main(String[] args) {


        PriorityQueue<Integer> stID = new PriorityQueue<>();
        stID.add(105);
        stID.add(104);
        stID.add(103);
        stID.add(106);
        stID.add(107);

        System.out.println(stID.peek());
      PriorityQueue<String> productName= new PriorityQueue<>();
      productName.add("Shirt");
      productName.add("Belt");
      productName.add("Kimono");
      productName.add("Cardigan");
      productName.add("Pant");
      productName.add("Skirt");
        System.out.println(productName.peek());


    }
}