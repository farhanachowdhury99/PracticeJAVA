package apractice;

import java.util.PriorityQueue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<String> subject= new PriorityQueue<>();
        subject.add("Science");
        subject.add("Arts");
        subject.add("Commerce");
        subject.add("Biology");
        subject.add("Geography");

        System.out.println(subject.peek());

        System.out.println(subject.poll());

        for (String sub: subject){
            System.out.println(sub);
        }
        System.out.println(subject.poll());

        for (String sub: subject){
            System.out.println(sub);
        }




    }
}
