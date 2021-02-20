package apractice;

public class LearnSingleton {
    String collegeName="Queens College";

    private LearnSingleton(){

    }
    public static LearnSingleton instance=new LearnSingleton();
    public static LearnSingleton getInstance(){
        return instance;

    }

    public static void main(String[] args) {
        LearnSingleton learn= new LearnSingleton();

    }
}
