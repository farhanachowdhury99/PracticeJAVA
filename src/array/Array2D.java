package array;

public class Array2D {

    static String [][] stInfo={
            {"stName", "stAddress", "stID", "stScore"},
            {"farhana", "Michigan", "10001", "100"},
            {"Alisha", "New York",  "10002", "90"},
            {"Istihaque", "Michigan", "10003",  "95"}

    };

    public static void main(String[] args) {

        System.out.println("Student info "+stInfo[2][1]);
         for (String info[]: stInfo){
             for(String sinfo: info){
                 System.out.print("   "+sinfo);
             }
             System.out.println();
         }


        String[][] Name = new String[3][3];
        System.out.println(Name.length);

        Name[0][0] = "serial number";
        Name[0][1] = "First Name";
        Name[0][2] = "Last Name";


        Name[1][0] = "10100000";
        Name[1][1] = "Jameses";
        Name[1][2] = "william";

        Name[2][0] = "2000000";
        Name[2][1] = "Jonathan";
        Name[2][2] = "Sovravski";

        for (String stName[]: Name){
            for(String st: stName){
                System.out.print(st+"   ");

            }
            System.out.println();
        }





       // for (int row1 = 0; row1 < 3; row1++) {
         //   for (int coulum1 = 0; coulum1 < 3; coulum1++) {
           //     System.out.print("  " + Name[row1][coulum1]);
           // }
           // System.out.println();


        //}

    }
}