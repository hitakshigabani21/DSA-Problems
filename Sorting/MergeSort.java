// import java.util.*;
// public class MergeSort {

//    public static void mergeSort(int arr[], int start, int end) {
//         if (start >= end) {
//             return;
//         }

//         int mid = (start + end) / 2;

//         mergeSort(arr, start, mid);       // Left half
//         mergeSort(arr, mid + 1, end);     // Right half

//         merge(arr, start, mid, end);      // Merge both halves
//     }

//     public static void merge(int arr[], int start, int mid, int end){
//         int i=start, j=mid+1, k=0;
//         int nums[] = new int[end-start+1];
//         while(i!= mid+1 && j!= end+1){
//             if(arr[i] < arr[j]){
//                 nums[k] = arr[i];
//                 i++;
//                 k++;
//             }
//             else if(arr[i] > arr[j]){
//                 nums[k] = arr[j];
//                 j++;
//                 k++;
//             }
//         }

//         while(i <= mid){
//             nums[k++] = arr[i++];
//         }

//         while(j <= end){
//             nums[k++] = arr[j++];
//         }
        
//         for(int p = 0; p < nums.length; p++){
//             arr[start + p] = nums[p];
//         }
//     }

    
//     public static void main(String args[]){
//         int arr[]={5,4,3,2,1};
//         mergeSort(arr, 0, arr.length-1);
//         System.out.println(Arrays.toString(arr));
        
//     }
// }

import java.util.*;

class MergeSort {
    static void sort(int arr[], int start, int end){
        if(start >= end){
            return;
        }
        int mid = (start+end)/2;
        sort(arr, start, mid);
        sort(arr, mid+1, end);
        merge(arr, start, mid, end);
    }
    
    static void merge(int arr[], int start, int mid, int end){
        int i=start, j=mid+1, k=0;
        int sortedarr[] = new int[end-start+1];
        while(i<=mid && j<= end){
            if(arr[i]<arr[j]){
                sortedarr[k] = arr[i];
                i++;
            }else{
                sortedarr[k] = arr[j];
                j++;
            }
            k++;
        }
        
        
        while(i<=mid){
            sortedarr[k] = arr[i];
            i++;
            k++;
        }
        
        while(j<=end){
            sortedarr[k] = arr[j];
            j++;
            k++;
        }
        
        //copy the part to org array
        k=0;
        i=start;
        while(i<=end){
            arr[i] = sortedarr[k];
            k++;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
