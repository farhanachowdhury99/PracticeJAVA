package apractice;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PracticQueue {

    public static void main(String[] args) {
        Queue<String> name= new LinkedList<>();
        name.add("Farhana");
        name.add("Alisha");
        name.add("Sanjana");
        name.add("Mehek");
        System.out.println(name.poll());

        for (String st: name){
            System.out.println("Student names are "+st);
        }
        System.out.println(name.peek());
        for (String st: name){
            System.out.println("Student names are "+st);
        }
        System.out.println(name.poll());
        for (String st: name){
            System.out.println("Student names are "+st);
        }
        System.out.println(name.remove());
        for (String st: name){
            System.out.println("Student names are "+st);
        }
    }
}
