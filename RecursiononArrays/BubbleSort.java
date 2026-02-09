import java.util.*;
public class BubbleSort {
    static void bubbleSort(int arr[], int i, int j){
        if(j == arr.length-1){
            return;
        }

        if(i == arr.length-1){
            bubbleSort(arr, 0, j+1);
            return;
        }

        if(arr[i] > arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        bubbleSort(arr, i+1, j);
    }
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        bubbleSort(arr,0, 0);
        System.out.println(Arrays.toString(arr));
    }
}
