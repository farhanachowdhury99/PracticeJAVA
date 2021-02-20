package demo;

public class DemoArray {
    public static void main(String[] args) {


         String [] name = new String[3];
         name[0]="Farhana";
         name[1]="Farha";
         name[2]="Farhana";

        System.out.println("Student name is "+name[2]);

        String [][] score= new String[2][3];
        score[0][0]= "St Name";
        score[0][1]= "St address";
        score[0][2]= "St score";

        score[1][0]= "Farhanha";
        score[1][1]= "Michigan";
        score[1][2]= "1000";

        System.out.println("Student info "+score[1][1]);

        for (String [] st: score){
            System.out.print(st+"  ");
            for(String sts: st){
                System.out.print(sts+" ");
            }
            System.out.println();
        }
        System.out.println("**********************************************************");
        int [][][] number= new int[2][3][3];
        number[0][0][0]=1234;
        number[0][0][1]=5678;
        number[0][0][2]=91011;

        number[0][1][0]=1001;
        number[0][1][1]=1002;
        number[0][1][2]=1003;

        number[0][2][0]=20001;
        number[0][2][1]=20002;
        number[0][2][2]=20003;

        number[1][0][0]=30003;
        number[1][0][1]=30003;
        number[1][0][2]=30003;

        number[1][1][0]=40003;
        number[1][1][1]=40003;
        number[1][1][2]=40003;

        number[1][2][0]=50003;
        number[1][2][1]=50003;
        number[1][2][2]=50003;


        System.out.println(number[0][2][1]);
        for (int[][] numb: number){
            for(int [] num: numb){
                for (int nu: num){
                    System.out.println("Numbers are "+nu);
                }
            }


        }



    }
}
