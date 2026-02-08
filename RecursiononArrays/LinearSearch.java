import java.util.*;

public class LinearSearch {
    static int findFirstIndex(int arr[], int i, int key){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return findFirstIndex(arr, i+1, key);
    }

    static int findLastIndex(int arr[], int i, int key){
        if(i == -1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }

        return findLastIndex(arr, i-1, key);
    }

    static boolean search(int arr[], int i, int key){
        if(i == arr.length){
            return false;
        }

        return arr[i] == key || search(arr, i+1, key);
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
        int firstIndex = findFirstIndex(arr, 0, key);        //returns the first occurence index
        if(firstIndex == -1){
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + firstIndex);
        }

        //approach-2 
        if(search(arr, 0, key)){
            System.out.println("Element found");
        }else{
            System.out.println("Element not found");
        }

        int lastIndex = findLastIndex(arr, arr.length-1, key);        //returns the last occurence index
        if(ans == -1){
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element was last found at: " + lastIndex);
        }
    }
}
