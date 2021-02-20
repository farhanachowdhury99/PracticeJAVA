package apractice;

import java.util.TreeSet;

public class LearnTreeSet {

    public static void main(String[] args) {
        TreeSet<String> iphoneModel= new TreeSet<>();
        iphoneModel.add("12 Pro Max");
        iphoneModel.add("12 Pro ");
        iphoneModel.add("12 ");
        iphoneModel.add("11 Pro Max");
        iphoneModel.add("11 Pro ");
        iphoneModel.add("11");
        System.out.println(iphoneModel);

        iphoneModel.remove("11 Pro ");
        System.out.println(iphoneModel);
        iphoneModel.pollFirst();
        System.out.println(iphoneModel);
        iphoneModel.pollLast();
        System.out.println(iphoneModel);
        System.out.println(iphoneModel.contains("12"));
    }
}
