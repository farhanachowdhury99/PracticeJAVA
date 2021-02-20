package array;

public class ForEachLoop {

    public static void main(String[] args) {


        String[] names = {"Farhana", "Istihaque", "Farjana"};
        int[] number={10,20,30,40,50};
        int sum=0;

        for (int num : number) {
            sum = sum + num;
        }
            System.out.println("Numbers are "+ sum);

        }
    }

