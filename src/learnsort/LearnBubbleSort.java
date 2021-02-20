package learnsort;

public class LearnBubbleSort {
    public static void main(String[] args) {
        int stId[]={5,8,6,2,10,12};

        LearnBubbleSort.bubbleSort(stId);
        System.out.println();


    }

    public static void bubbleSort(int num[]){
        int length= num.length;
        int temp=0;
        for (int i=0;i<num.length;i++){
            for (int j=1;j<(num.length-1);j++){
                if(num[j-1]>num[j]){
                    temp=num[j-1];
                    num[j-1]=num[j];
                    num[j]=temp;


                }
            }
        }

    }
}
