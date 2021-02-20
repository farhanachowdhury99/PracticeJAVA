package learnqueue;

import java.util.Iterator;
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack<String> name = new Stack<>();
        name.add("Sanjana");
        name.add("Alia");
        name.add("Farhana");
        name.add("Samayra");
        System.out.println(name);
        System.out.println(name.pop());
        for (String st : name) {
            System.out.println(st);
        }
        //System.out.println(name.push("Dalal"));
        System.out.println("*****************************");
        System.out.println(name.pop());
        for (String st : name) {
            System.out.println(st);
        }

        Stack<String> clotingID = new Stack<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Dress00" + i);
        }
        Iterator it = clotingID.iterator();
        while (it.hasNext()) {
            System.out.println("pop value: " + clotingID.pop());
        }
        System.out.println("**************************");
        for (String st : clotingID) {
            System.out.println(st);
        }

        Stack<Integer> priceList= new Stack<>();
        priceList.add(101);
        priceList.add(106);
        priceList.add(222);
        priceList.add(235);
        LearnStack.stackSearch(priceList, 222);
    }
        public static void stackSearch(Stack<Integer> sta, int element){
        Integer position=sta.search(element);
        if (position==-1){
            System.out.println("Element not found");
        } else{
            System.out.println("Element found at position "+position);
        }

        }

}