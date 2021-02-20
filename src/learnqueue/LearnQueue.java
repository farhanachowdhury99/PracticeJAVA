package learnqueue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

    public static void main(String[] args) {

        Queue<String> name= new LinkedList<>();
        name.add("Farhana");
        name.add("Fahmida");
        name.add("Alisha");
        name.add("Maria");
        name.add("Sanjana");

        System.out.println(name);
        System.out.println(name.remove("Fahmida"));
        System.out.println("Name is "+name);
        System.out.println(name.peek());
        System.out.println("Name is "+name);
        System.out.println(name.poll());
        for (String st: name){
            System.out.println("Name is "+st);
        }
        System.out.println(name.peek());
        for (String st: name){
            System.out.println("Name is "+st);
        }
        System.out.println(name.poll());
        for (String st: name){
            System.out.println("Name is "+st);
        }

    }
}
