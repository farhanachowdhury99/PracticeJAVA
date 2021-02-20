package array;

public class ArrayWithMethod {

    public static void main(String[] args) {

        int[] number = {23, 15, 20, 56, 20, 25, 25};
        ArrayWithMethod.minNumber(number);
        ArrayWithMethod.getArray();


    }

        static void minNumber( int num[]){

            int min=num[0];
            for (int i=0;i<num.length;i++){

                if (min>num[i]){
                    min=num[i];

                }
            }
            System.out.println("Minimun number is " + min);

        }


        static int [] getArray(){
        return new int[]{86,25,50,86,98};

        }

    }

