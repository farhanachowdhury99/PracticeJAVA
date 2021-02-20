package datastructureandalgorithm;

public class Array {

    String name="James";

    static String[] students= new String[4];
    String [] addresses= new String[5];


    public static void main(String[] args) {
        students[0]="Jack";
        Array.students[0]="Jack";
        Array.students[1]="Jill";
        Array.students[2]="bill";
        Array.students[3]="Jony";


        System.out.println(Array.students[3]);

        int [] numbers = new int[5];
        numbers [0]=101;
        numbers[1]=102;
        numbers[2]=103;
        numbers[3]=104;
        System.out.println("Numbers "+numbers[2]);

      int[] stID={ 4,8,3,6,9 };

        System.out.println();

        for (int i=0; i<numbers.length;i++){
            System.out.println("Numbers are "+numbers[i]);
        }
        System.out.println("****************************************");

        for (int i=0; i<Array.students.length; i++)
            System.out.println("Students name are "+Array.students[i]);


        try {


            Array array = new Array();
            array.addresses[0] = "NY";
            array.addresses[1] = "NJ";
            array.addresses[2] = "MI";
            array.addresses[3] = "CO";
            array.addresses[4] = "CA";
            //array.addresses[5]="KS";

            System.out.println(array.addresses[2]);
        } catch (Exception e){
            System.out.println("Length is out of bound");
        }
       //System.out.println(array.stID[2]);


       // for (String st: array.addresses){
         //   System.out.println("Students addresses are "+st);
        }






    }



