package practice;

public class Ifelse {

    public static void main(String[] args) {

       for (int i=1; i<=5;i++){
           System.out.println("Welcome to JAVA class");

        }
       for (int i=1; i<=10;i++){
           System.out.println("This is for loop");
           for(int j=1; j<=4;j++){
               System.out.println("This is nested class");
               for (int k=2; k<=12; k=k+2){
                   System.out.println(k);
               }
           }
       }
       for(int x=1; x<=6; x++){
           for (int y=5; y<=10;y++){
               System.out.print(" X ");
           }
       }
    }
}
