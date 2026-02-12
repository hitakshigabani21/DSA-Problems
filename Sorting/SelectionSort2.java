import java.util.*;
public class SelectionSort2 {
    static void sort(int arr[]){
        int max = 0;
        for(int i=0; i<arr.length; i++){
            //reinitialising max so that we can find new max which in subarray which will be smaller than prev. max in larger array
            max = 0;
            //finding the max element position in the unsorted array
            for(int j=0; j<arr.length-i; j++){
                if(arr[max] < arr[j]){
                    max = j;
                }
            }

            //swapping and placing the max element at the end of the unsorted or beg. of sorted array
            int temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[max];
            arr[max] = temp;
        }
    }

    static int findMaxPos(int arr[], int lastIndex){
        int max = 0;
        for(int i=0; i<=lastIndex; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void sort2(int arr[]){
        for(int i=0; i< arr.length; i++){
            int lastIndex = arr.length-1-i;
            int maxPos = findMaxPos(arr, lastIndex);
            swap(arr, maxPos, lastIndex);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //approach-1
        // sort(arr);
        // System.out.println("Sorted array: " + Arrays.toString(arr));
        //approach-2
        sort2(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
