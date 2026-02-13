import java.util.*;
public class RotatedBS {
    static int search(int arr[], int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = (start+end)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[start] <= arr[mid]){
            if(target >= arr[start] && target <= arr[mid]){
                return search(arr, target, start, mid-1);
            }else{
                return search(arr, target, mid+1, end);
            }
        }else{
            if(target >= arr[mid] && target<= arr[end]){
                return search(arr, target, mid+1, end);
            }else{
                return search(arr, target, start, mid-1);
            }
        }

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        int target = sc.nextInt();
        int result = search(arr, target, 0, n-1);
        if(result == -1){
            System.out.println("Element not found in the array."); 
        }else{
            System.out.println("Element found at index: " + result);
        }
        sc.close();

    }
}
