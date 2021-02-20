package apractice;

import java.util.Scanner;

public class Practice1 {

   String name;
   String address;
   int age;
   int phoneNumber;

   public Practice1(){

   }

   public Practice1(String name){
       System.out.println("Student name is "+name);

   }
    public Practice1(String name, String address){
        System.out.println("Student name is "+name+" address is "+address);
   }
    public Practice1(String name, String address, int age, int phoneNumber){
       System.out.println("Student name is "+name+" address is "+address+ " age is "+age+" Phone number is "+phoneNumber);
   }

    public static void main(String[] args) {
       Practice1 prac= new Practice1("Farhana", "Warren",25,2535);

    }

}