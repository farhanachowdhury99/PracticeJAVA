package apractice;

public class exceptionHandling {
    public static void main(String[] args) {

        try {
            int num1 = 20;
            int num2 = 0;
            int total = num1 / num2;
            System.out.println("Total is "+total);

        }   catch(Exception e){
            //e.printStackTrace();
            System.out.println("This is arithmetic exception");
        }
     //exceptionHandling.doDivision(20,0);
        try {
            exceptionHandling.doDivision(20, 0);

        } catch(Exception f){
            System.out.println("This is also an arithmetic exception");
            } finally {
            System.out.println("This must print");
        }
        System.gc();
        }
        static final int number=24;




        public static int doDivision(int num1, int num2) throws  Exception{
        int div=num1/num2;
        return div;
        }




    }
