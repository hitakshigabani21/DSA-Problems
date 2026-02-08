import java.util.*;

public class LinearSearch {
    static int search(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return search(arr, i+1, key);
    }

    static boolean search2(int arr[], int i, int key){
        if(i == arr.length){
            return false;
        }

        return arr[i] == key || search2(arr, i+1, key);
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
        System.out.println("Enter the element to be searched:");
        int key = sc.nextInt();
        int ans = search(arr, 0, key);
        if(ans == -1){
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + ans);
        }

        //approach-2 
        if(search2(arr, 0, key)){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }
    }
}
