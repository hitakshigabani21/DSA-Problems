//Using Linear Search

// import java.util.*;

// public class LowerBound {
//     public static void main(String args[]){
//         System.out.println("Enter the number of elements: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         System.out.println("Enter the elements: ");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println("Enter the element: ");
//         int el = sc.nextInt();
//         sc.close();
//         int i=0, pos=0;
//         while(i<arr.length){
//             if(arr[i]<=el){
//                 pos = i;
//                 break;
//             }
//             i++;
//         }
//         if(pos==0){
//             pos = -1;
//         }
//         System.out.println(pos);
//     }
// }

//Using Binary Search: 

//To find the smallest index such that element at that index is >= element
/* 
import java.util.*;

public class LowerBound {
    public static void main(String args[]){
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element: ");
        int el = sc.nextInt();
        sc.close();
        
        int start=0, end = arr.length-1, pos=9999;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == el){
                pos = mid;                            //if the element i found then no need to iterate further just return the position where it is found - ERROR!!!
                                                    //In BS it is not necessary that if the element is found it is at the first occurence i.e. smallest index, thus there is still a possibility of the same element to appear on the left of the mid.
                break;
            }
            else if(arr[mid]>el){
                if(pos>mid){                  // if the mid found is smaller then the previous mid then reset position
                    pos = mid;                 
                }
                end = mid - 1;           // If we found a mid, the element at mid is greater than the element, then we will again search for a mid at which the element will be gretaer or equal to the element as we want to find the smallest index of greater or equal value element, the smallest index will be in the left half.
            }
            else{
                start = mid+1;
            }
        }
        if(pos == 9999){
            pos=arr.length;
        }
        System.out.println(pos);
    }
}

*/

//Updated and correct approach:

import java.util.*;

public class LowerBound {
    public static void main(String args[]){
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element: ");
        int el = sc.nextInt();
        sc.close();
        int start=0, end = arr.length-1, pos=arr.length;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>=el){
                pos = mid;
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        System.out.println(pos);
    }
}
