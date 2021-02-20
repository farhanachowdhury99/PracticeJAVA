package arraylist;

import java.util.ArrayList;

public class LearnArrayList {

    ArrayList<String> stAddress= new ArrayList<>();
    public static ArrayList<Integer> mobileNumber= new ArrayList<>();

    public static void main(String[] args) {
        LearnArrayList learn= new LearnArrayList();
        learn.stAddress.add("Manhattn, NY");
        learn.stAddress.add("Queens, NY");
        learn.stAddress.add("Bronx, NY");
        learn.stAddress.add("Jamaica, NY");
        learn.stAddress.add("Upstate, NY");

        System.out.println(learn.stAddress.get(2));

        mobileNumber.add(125465);
        mobileNumber.add(2536);
        mobileNumber.add(2366);
        mobileNumber.add(226666);

       for (int number: mobileNumber){
           System.out.println("Student address is "+number);
        }

        System.out.println("******************************************");

        mobileNumber.remove(3);

        for (int number1: mobileNumber){
            System.out.println(number1);
        }



        System.out.println(mobileNumber.size());

        System.out.println("Addrsses are "+learn.stAddress);

    }

}
