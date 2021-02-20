package apractice;

public class AlternativeInsertionSort {

    public static void main(String[] args) {
        int array[]= {5,6,2,1,3,9};

        for (int i=0;i<array.length;i++){
            int key= array[i];
            int position= i;
            while(position>0 && array[position-1]>key){
                array[position]=array[position-1];
                position--;

            }
            array[position]= key;

        }
        for(int n=0;n<array.length;n++){
            System.out.print(array[n]+ " ");
        }
    }
}
