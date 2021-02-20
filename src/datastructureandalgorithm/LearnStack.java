package datastructureandalgorithm;

import java.util.Iterator;
import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {
        Stack<String> clotingBrand = new Stack<>();
        clotingBrand.push("Nike");
        clotingBrand.push("Michael Kors");
        clotingBrand.push("Calvin Klein");
        clotingBrand.push("Tommy hilfiger");
        clotingBrand.push("Guess");
        clotingBrand.push("Louis Vuitton");
        System.out.println(clotingBrand.contains(" Michael Kors"));
        System.out.println(clotingBrand);
        System.out.println(clotingBrand.push("DKNY"));
        System.out.println(clotingBrand);
        System.out.println(clotingBrand.pop());
        System.out.println(clotingBrand);

        Stack<String> clothingId = new Stack<>();
        for (int i = 0; i < 7; i++) {
            clothingId.push("ID" + i);
        }
            System.out.println(clothingId);

        Iterator it= clothingId.iterator();
        while(it.hasNext()){
            System.out.println("pop value "+clothingId.pop());
        }

        Stack<Integer> priceList= new Stack<>();
        priceList.push(230);
        priceList.push(250);
        priceList.push(240);
        priceList.push(260);
        priceList.push(220);

        }

        }

