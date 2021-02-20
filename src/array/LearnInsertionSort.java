package array;

public class LearnInsertionSort {
    public static void main(String[] args) {

        int [] number= {2,8,1,10,5,7};

        for (int i=0; i< number.length;i++) {

            int point = number[i];
            int j = i - 1;

            while (j >= 0 && number[j] > point) {
                number[j + 1] = number[j];
                j = j - 1;
            }
            number[j + 1] = point;
        }
        for (int n=0; n<number.length;n++){
            System.out.print(number[n]+"   ");

            }
        System.out.println();

        int num[]={5,10,1,20,15};

        for (int i=0;i<num.length;i++){
            int point= number[i];
            int j=i-1;
            while(j>=0 && number[j]>point){
                number[j+1]= number[j];
                j=j-1;
            }
            number[j+1]= point;

        }
        for (int n=0;n<num.length;n++){
            System.out.print(num[n]+ "  ");
        }
        }
    }


