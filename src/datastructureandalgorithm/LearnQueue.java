package datastructureandalgorithm;



import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

    public static void main(String[] args) {
        Queue<String> stName= new LinkedList<>();
        stName.add("Farhana");
        stName.add("Alisha");
        stName.add("Maria");
        stName.add("Sanjana");
        stName.add("Samayra");

        for (String st: stName){
            System.out.println("Student name is "+st);
        }

        stName.remove("Maria");
        for (String st: stName){
            System.out.println("Student name is "+st);
        }

        System.out.println("**********************************************");
        System.out.println(stName.element());
        System.out.println("**********************************************");

        System.out.println(stName.poll());
        for (String st: stName){
            System.out.println("Student name is "+st);
        }

        System.out.println(stName.peek());
        for (String st: stName){
            System.out.println("Student name is "+st);
        }
        System.out.println("**********************************************");
        System.out.println(stName.remove());
        System.out.println(stName.poll());
        System.out.println(stName.peek());
        for (String st: stName) {
            System.out.println("Student name is " + st);
        }
    }
}
