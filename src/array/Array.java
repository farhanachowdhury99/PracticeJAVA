package array;

public class Array {
    public static void main(String[] args) {

        int [] number= new int[5];
        int [] number2= new int[6];


        number[0]=10;
        number[1]=20;
        number[2]=10;
        number[3]=10;
        number[4]=10;

        int len= number.length;
        System.out.println(len);

        int sum=number[0]+number[1]+number[2]+number[3]+number[4];
        System.out.println("Total sum is "+sum);

        System.out.println("Number is "+number[2]);


    }
}
