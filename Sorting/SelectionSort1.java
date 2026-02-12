import java.util.*;

public class SelectionSort1 {
    static int findMaxPos(int arr[], int end){
        int max = 0;
        for(int i=0; i<=end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int arr[], int pos1, int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }

    static void sort(int arr[], int end){
        if(end == 0){
            return;
        }
        int maxPos = findMaxPos(arr, end);
        swap(arr, maxPos, end);
        sort(arr, end-1);

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

        sort(arr, arr.length-1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
