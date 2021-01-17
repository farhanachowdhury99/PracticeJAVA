package practice;

public class PracticeMethod {


    public int doSum() {

        int num1 = 10;
        int num2 = 20;
        int total = num1 + num2;
        System.out.println("Total number is " + total);
        return num1 + num2;

    }

    public int doSubtarction() {
        int num1 = 50;
        int num2 = 30;
        System.out.println("Subtraction is " + (num1 - num2));

        return num1 - num2;

    }

    public int doSubtract(int number1, int number2) {


    int num1 = number1;
    int num2 = number2;
    int total = num1 - num2;
    System.out.println("Total is "+total);
    return total;
}

public int doSubs(int num1, int num2, int num3){
        System.out.println("Total is " +(num1-num2-num3));
                return num1-num2-num3;


}

    public static void seeDisplay(){

        System.out.println("Method");

    }

    public void studentInfo(){
        String name="james";
        String address= "New York";
        System.out.println("STudent name is "+name+ " address is "+address);

    }

    public void doSums(int num3, int num4){
        int result=num3+num4;
        System.out.println("Result is "+result);

    }

    public static void main(String[] args) {
        PracticeMethod.seeDisplay();
        PracticeMethod method=new PracticeMethod();
        method.doSum();
        method.doSubtract(65,55);
        method.doSubs(200,50,40);
        method.studentInfo();
        method.doSums(34,56);



    }
}
