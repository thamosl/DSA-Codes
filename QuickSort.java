
import java.util.Arrays;

public class QuickSort {
  public static int partition(int[] arr, int low, int high) {
      int pivot = arr[low];
      int i = low;
      int j = high;
      while (i < j) {
          while (i <= high && arr[i] <= pivot) {
              i++;
          }
          while (j >= low && arr[j] > pivot) {
              j--;
          }
          if (i < j) {
              swap(arr, i, j);
          }
      }
      swap(arr, j, low);
      return j;
  }

  public static void swap(int[] arr, int i, int j) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
  }

  public static void quickSort(int[] arr, int low, int high) {
      if (low < high) {
          int pivot = partition(arr, low, high);
          quickSort(arr, low, pivot - 1);
          quickSort(arr, pivot + 1, high);
      }
  }

  public static void main(String[] args) {
      int[] arr = {5, 3, 8, 4, 2, 7, 1, 10};
      quickSort(arr, 0, arr.length - 1);
      System.out.println(Arrays.toString(arr));
  }
}
