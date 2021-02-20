package learnsort;

public class LearnRecursion {
    static int count=0;
    public static void tvDisplay(){
        count++;
        if(count<10){
            System.out.println("This is TV display");
            tvDisplay();
        }
    }

    public static void main(String[] args) {
       LearnRecursion.tvDisplay();
    }

}
