package apractice;

public class Practice3 {

    public static int doSummation(int number1, int number2){

        System.out.println("Total is "+(number1+number2));
        return number1+number2;
    }

    public int doSubtraction(int number1, int number2){
        int num1=number1;
        int num2=number2;
        int total= num1+num2;
        System.out.println("Number difference is "+total);
        return total;
    }

    public static void main(String[] args) {
        Practice3.doSummation(50,60);
        Practice3 practice = new Practice3();
       practice.doSubtraction(25,30);

    }
}
