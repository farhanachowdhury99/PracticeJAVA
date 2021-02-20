package learnsort;

public class LeanInsertionSort {
    public static void main(String[] args) {

        int [] number= {5,8,4,3,1,9};

        for (int i=0;i<number.length;i++){
            int j=i-1;
            int point= number[i];
            while(j>=0 && number[j]>point) {
                number[j + 1] = number[j];
                j = j - 1;
            }
            number[j+1]=point;
            }
        for (int n=0; n<number.length;n++){
            System.out.print(number[n]+"  ");
        }
        }


    }

