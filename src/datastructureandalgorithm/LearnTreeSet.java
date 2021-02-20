package datastructureandalgorithm;

import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {
        TreeSet<String> iphoneModel= new TreeSet<>();
        iphoneModel.add("12 pro max");
        iphoneModel.add("12 pro ");
        iphoneModel.add("12");
        iphoneModel.add("11 pro max");
        iphoneModel.add("11 pro");
        iphoneModel.add("11");
        System.out.println(iphoneModel);
        iphoneModel.remove("11");
        System.out.println(iphoneModel);
        iphoneModel.pollFirst();
        System.out.println(iphoneModel);
        iphoneModel.pollLast();
        System.out.println(iphoneModel);
    }
}
