package demo;

public class ArrayPractice {
    public static void main(String[] args) {

        String[] name = new String[5];

        name [0]= "Farhana";
        name [1]= "Farhana";
        name [2]= "Farhana";
        name [3]= "Farhana";
        name [4]= "Farhana";

        System.out.println("Student name is "+name[2]);

        for (String st: name){
            System.out.println("Students names are "+st);
        }

        String[][] stName= new String[3][4];
        stName[0][0]="First Name";
        stName[0][1]="Last Name";
        stName[0][2]="St Address";
        stName[0][3]="St ID # ";

        stName[1][0]="Farhana";
        stName[1][1]="Chowdhury";
        stName[1][2]="Warren, MI";
        stName[1][3]="100012";

        stName[2][0]="Alisha";
        stName[2][1]="Amira";
        stName[2][2]="Queens, NY";
        stName[2][3]="100002";

        for (String sts[]: stName){
            for (String stss: sts){
                System.out.print("       "+stss);
            }
            System.out.println();
        }






    }





    }

