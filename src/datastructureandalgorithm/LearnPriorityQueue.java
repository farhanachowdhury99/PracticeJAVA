package datastructureandalgorithm;

import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> productName= new PriorityQueue<>();
        productName.add("Shoes");
        productName.add("dresses");
        productName.add("apple");
        productName.add("belts");
        productName.add("purse");

        System.out.println(productName.peek());

        for (String st: productName) {
            System.out.println("Products are " + st);
        }

            System.out.println(productName.peek());

            PriorityQueue<Integer> productID= new PriorityQueue<>();
            productID.add(201);
            productID.add(202);
            productID.add(203);
            productID.add(204);
            productID.add(198);
            System.out.println(productID.peek());
        for (Integer sts: productID) {
            System.out.println("Products are " + sts);

        }

        System.out.println(productID.poll());
        for (Integer sts: productID) {
            System.out.println("Products are " + sts);

        }for (Integer sts: productID) {
            System.out.println("Products are " + sts);

        }
        }
    }

