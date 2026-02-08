import java.util.*;

public class Sortcheck {
    static boolean isSorted(int arr[], int i, int n){
        if(i== n-1){
            return true;
        }
        if(arr[i] < arr[i+1]){
            return isSorted(arr, i+1, n);
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        if(isSorted(arr, 0, n-1)){
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }

    }
}
