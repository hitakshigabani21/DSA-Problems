//Using Linear Search

// import java.util.*;

// public class UpperBound {
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
//             if(arr[i]>=el){
//                 pos = i;
//                 break;
//             }
//             i++;
//         }
//         if(pos==0){
//             pos = arr.length;
//         }
//         System.out.println(pos);
//     }
// }

//Using Binary Search: 

//Find the element which is at the smallest index and is strictly greater than the target.
import java.util.*;

public class UpperBound {
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
            if(arr[mid]>el){
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
