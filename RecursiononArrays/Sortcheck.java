import java.util.*;

public class Sortcheck {
    static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && isSorted(arr, i+1);
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

        if(isSorted(arr, 0)){
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
        sc.close();
    }
}
