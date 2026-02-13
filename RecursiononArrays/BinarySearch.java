import java.util.*;
public class BinarySearch{
    static int binarySearch(int arr[], int target, int start, int end){
        int mid= (start+end)/2;
        if(start > end){
            return -1;
        }

        if(arr[mid] == target){
            return mid;
        }

        else if(target < arr[mid]){
            return binarySearch(arr, target, start, mid-1);
        }
        else{
            return binarySearch(arr, target, mid+1, end);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array in sorted order: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target = sc.nextInt();

        int position = binarySearch(arr, target, 0, n-1);
        if(position != -1){
            System.out.println("Element found at index: " + position);
        }
        else{
            System.out.println("Element not found in the array.");
        }
        sc.close();
    }
}