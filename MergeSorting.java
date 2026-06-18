import java.util.Arrays;

public class MergeSorting {
    
    public static int[] msort(int [] arr, int [] brr){
        int al = arr.length;
        int bl = brr.length;
        int cl = al+bl;
        int [] crr = new int[cl];
        int i=0,j=0,k=0;

        while(i<al && j<bl){
            if(arr[i] < brr[j]){
                crr[k] = arr[i];
                i++;
                k++;
            }
            else{
                crr[k] = brr[j];
                j++;
                k++;
            }
        }

        while(i<al){
            crr[k] = arr[i];
            i++;
            k++;
        }

        while(j<bl){
            crr[k] = brr[j];
            j++;
            k++;
        }
        return crr;
    }

    public static void mergeSorting(int[] arr, int start, int mid, int end){
        int al = arr.length;
        int[] crr = new int[al];
        int i=start, j=mid, k=start;

        while(i<mid && j<end){
            if(arr[i] < arr[j]){
                crr[k] = arr[i];
                i++;
                k++;
            }
            else{
                crr[k] = arr[j];
                j++;
                k++;
            }
        }

        while(i<mid){
            crr[k] = arr[i];
            i++;
            k++;
        }

        while(j<end){
            crr[k] = arr[j];
            j++;
            k++;
        }
        for(int itr=start; itr<end; itr++){
            arr[itr] = crr[itr];
        }
    }

        public static void mergeSort(int[] arr, int start, int end){
        if(end-start == 1){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        mergeSorting(arr,start,mid,end);
    }

    public static void main(String [] args){
        int[] arr = {1,3,7,9};
        int[] brr = {1,2,5,6};
        System.out.print(Arrays.toString(msort(arr,brr)));

        int[] arrays = {1,4,7,8,17,3,6,15,24,27,28};
        int mid = arrays.length/2;
        mergeSorting(arrays,0,mid,arrays.length);
        System.out.println(Arrays.toString(arrays));

        int[] karray = {1,5,3,0,9,6};
        mergeSort(karray,0,karray.length);
        System.out.println(Arrays.toString(karray));
    }
}
