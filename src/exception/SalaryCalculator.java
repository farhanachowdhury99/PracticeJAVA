package exception;

public class SalaryCalculator {

    public static void main(String[] args) {
        SalaryCalculator.doDivision(20,0);
    }

    public static int doDivision (int num1, int num2){
    int result =0;
        try{
            int result1=num1/num2;
            System.out.println("Division value is result "+result);

        } catch (Exception e){
           // e.printStackTrace();
            System.out.println("This is Arithmetic Exception");
        }

        return result;
    }
}
