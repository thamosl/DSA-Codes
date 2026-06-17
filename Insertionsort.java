import java.util.Arrays;

public class Insertionsort {
    
    public static void sort(int [] arr){
        for(int i=1; i<arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String [] args){
        int [] arr = {2,5,7,9,4,3,0};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
