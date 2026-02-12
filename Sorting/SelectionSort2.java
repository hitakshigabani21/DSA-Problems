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
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
