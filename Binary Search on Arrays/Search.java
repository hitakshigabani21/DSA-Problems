//Binary Search using recursion 
/*import java.util.*;

public class Search {
    public static int search(int target, int arr[], int start, int end){
        if(start>end){
            return -1;
        }
        
            int mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(target< arr[mid]){
                return search(target, arr, start, mid-1);
            }
            else{
                return search(target, arr, mid+1, end);
            }
        
    }
    public static void main(String args[]){
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search for: ");
        int element = sc.nextInt();
        int start = 0, end = arr.length-1;
        int index = search(element, arr, start, end);
        System.out.println(index);
        sc.close();
    }
}*/

//Binary Search - Normal

import java.util.*;

public class Search {
    public static int search(int target, int arr[]){
        int start = 0, end = arr.length-1;
        while(start<=end){
            //int mid = (start+end)/2;                  //    If the values of start and end are very large then might get some error because cannot be stored in an integer -> Formula : int mid = start+(end-start)/2
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in asc order: ");  //has to be sorted -> Binary Search works only in sorted arrays
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search for: ");
        int element = sc.nextInt();
        int index = search(element, arr);
        System.out.println(index);
        sc.close();
    }
}