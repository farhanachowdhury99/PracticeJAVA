package doenum;

public class PracticeSIngle {

    String pizzaName;
    String toppingName;
    int qty;
    double price;

    public PracticeSIngle(){


    }
    public static void main(String[] args) {
        LearnSingleton ls= LearnSingleton.singleton();
        System.out.println(ls.collegeName);

    }
}
