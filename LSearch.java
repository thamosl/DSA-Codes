import java.util.Arrays;

class LinearSearch{
    public static int find(int [] arr , int target){
        for(int i=0;i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(int [] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }

    public static int find(String s, char target){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == target){
                return i;
            }
        }
        return -1;
    }

    public static boolean contains(String s, char target){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == target){
                return true;
            }
        }
        return false;
    }

    public static int [] find(int [][] arr , int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static boolean contains(int [][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
}



public class LSearch {
    public static void main(String [] args){
        int [] arr = {5,4,8,2,4,1,9};
        int target = 1;

        String s = "Thamotharan";

        int [][] arr2d = {
            {5,8},
            {1,9,3},
            {0}
        };

        System.out.println(LinearSearch.find(arr,target));
        System.out.println(LinearSearch.contains(arr,target));
        System.out.println(LinearSearch.find(s,'n'));
        System.out.println(LinearSearch.contains(s,'t'));
        System.out.println(Arrays.toString(LinearSearch.find(arr2d,9)));
        System.out.println(LinearSearch.contains(arr2d,9));
    }
}
