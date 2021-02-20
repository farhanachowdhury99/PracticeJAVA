package demo;

import java.util.LinkedList;

public class LearnLinkedList {

    LinkedList<String> stAddress= new LinkedList();

    public static void main(String[] args) {
        LearnLinkedList learn= new LearnLinkedList();
        learn.stAddress.add("Michigan");
        learn.stAddress.add("New York");
        learn.stAddress.add("New Jersey");
        learn.stAddress.add("New Mexico");

        for (String sta: learn.stAddress){
            System.out.println("Student address is "+sta);

        }
    }
}
