import java.util.*;

public class SelectionSort {
    public static int findMax(int arr[], int j){
        int max = 0; 
        for(int i=0; i<=j; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }
    public static void sort(int arr[]){
       for(int i=arr.length-1; i>0; i--){
            int maxpos = findMax(arr, i);
            if(maxpos!= i){
                int temp = arr[maxpos];
                arr[maxpos] = arr[i];
                arr[i] = temp;
            }
       }
    }
// using recursion
    public static void sort2(int arr[], int i){
        if(i==0){
            return;
        }
        int maxpos = findMax(arr, i);
        if(maxpos!= i){
            int temp = arr[maxpos];
            arr[maxpos] = arr[i];
            arr[i] = temp;
        }
        sort2(arr, i-1);
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        sort2(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
