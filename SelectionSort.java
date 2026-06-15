import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int min = arr[i];
            int index_min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<min){
                    min = arr[j];
                    index_min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index_min];
            arr[index_min] = temp;
        } 
    }
    public static void main(String [] args){
        int [] arr = {5,4,3,8,1,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
}
