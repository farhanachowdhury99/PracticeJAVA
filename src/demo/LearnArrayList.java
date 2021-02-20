package demo;

import java.util.ArrayList;

public class LearnArrayList {

    ArrayList<String> studentsName = new ArrayList<>();

    public static void main(String[] args) {

        LearnArrayList learn= new LearnArrayList();
        learn.studentsName.add("Farhana");
        learn.studentsName.add("Alisha Amira");
        learn.studentsName.add("Sanjana");
        learn.studentsName.add("Samia");

        System.out.println(learn.studentsName);

        System.out.println(learn.studentsName.get(2));

        for (String st: learn.studentsName){
            System.out.println("Students Name: "+st);
        }

        learn.studentsName.remove("Alisha Amira");
        for (String st: learn.studentsName){
            System.out.println("Students Name after removing: "+st);
        }
    }

}
