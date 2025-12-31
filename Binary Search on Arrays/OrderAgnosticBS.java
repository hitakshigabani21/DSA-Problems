//Binary Search - Order Agnostic : When the order of sorting is unknown, find out which order it is sorted in  

import java.util.*;

public class OrderAgnosticBS {
    public static int search(int target, int arr[]){
        int start = 0, end = arr.length-1;


        //find out whether it is in ascending order or not
        boolean isAsc = (arr[start] < arr[end]);

        while(start<=end){
            //int mid = (start+end)/2;                  //    If the values of start and end are very large then might get some error because cannot be stored in an integer -> Formula : int mid = start+(end-start)/2
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else{
                if(isAsc){
                    if(arr[mid]>target){
                        end = mid-1;
                    }
                    else{
                        start = mid+1;
                    }
                }
                else{
                    if(arr[mid]>target){
                        start = mid+1;
                    }
                    else{
                        end = mid-1;
                    }
                }
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

