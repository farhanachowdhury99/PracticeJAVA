package demo;

import java.util.ArrayList;
import java.util.LinkedList;

public class DemoArrayList {

    public static void main(String[] args) {
        ArrayList<String> stInfo= new ArrayList<>();
        stInfo.add("Michigan");
        stInfo.add("New York");
        stInfo.add("New Jersey");
        stInfo.add("New Mexico");

        System.out.println(stInfo.get(2));

        for (String st: stInfo){
            System.out.println("Students are from "+st);
        }

        LinkedList<String> stScore= new LinkedList<>();
        stScore.add("90");
        stScore.add("85");
        stScore.add("80");
        stScore.add("87");
        stScore.add("88");

        for (String score: stScore){
            System.out.println("Students scores are "+score);
        }
    }
}
