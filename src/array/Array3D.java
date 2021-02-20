package array;

public class Array3D {

    public static void main(String[] args) {

        String [][][] pizza= new String[2][3][3];

        pizza[0][0][0]= "Order number";
        pizza[0][0][1]= "pizza name";
        pizza[0][0][2]= "pizza price";

        pizza[0][1][0]= "100";
        pizza[0][1][1]= "Cheese pizza";
        pizza[0][1][2]= "25";

        pizza[0][2][0]= "200";
        pizza[0][2][1]= "Chicken pizza";
        pizza[0][2][2]= "30";

        pizza[1][0][0]= "300";
        pizza[1][0][1]= "Chicpizza";
        pizza[1][0][2]= "25";



        System.out.println("Pizza info "+pizza[0][1][1]);

        for (String pizz[][]: pizza){
            for (String piz[]: pizz){
                for (String pi: piz){
                    System.out.print(pi+ "   ");
                }
                System.out.println();
            }

        }

    }
}
