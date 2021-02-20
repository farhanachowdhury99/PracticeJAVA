package apractice;

import java.util.Stack;

public class PracticeStack {

    public static void main(String[] args) {
        Stack<String> clothingList= new Stack<>();
        clothingList.push("Dress");
        clothingList.push("Belt");
        clothingList.push("Shoes");
        clothingList.push("Skirt");
        clothingList.push("pants");

        System.out.println(clothingList);

        System.out.println(clothingList.pop());
        System.out.println(clothingList.push("Apron"));
        System.out.println(clothingList.peek());
    }
}
