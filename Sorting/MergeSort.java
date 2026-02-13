import java.util.*;
public class MergeSort {

   public static void mergeSort(int arr[], int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);       // Left half
        mergeSort(arr, mid + 1, end);     // Right half

        merge(arr, start, mid, end);      // Merge both halves
    }

    public static void merge(int arr[], int start, int mid, int end){
        int i=start, j=mid+1, k=0;
        int nums[] = new int[end-start+1];
        while(i!= mid+1 && j!= end+1){
            if(arr[i] < arr[j]){
                nums[k] = arr[i];
                i++;
                k++;
            }
            else if(arr[i] > arr[j]){
                nums[k] = arr[j];
                j++;
                k++;
            }
        }

        while(i <= mid){
            nums[k++] = arr[i++];
        }

        while(j <= end){
            nums[k++] = arr[j++];
        }
        
        for(int p = 0; p < nums.length; p++){
            arr[start + p] = nums[p];
        }
    }

    
    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        
    }
}
