package doenum;

public class LearnSingleton {
    String collegeName="Queens College";

    private LearnSingleton(){


    }

        public static LearnSingleton ls=new LearnSingleton();
    public static LearnSingleton singleton(){
        return ls;
    }

    public static void main(String[] args) {
        LearnSingleton learn= new LearnSingleton();

    }
}
