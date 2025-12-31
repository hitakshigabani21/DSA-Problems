/*import java.util.*;

public class FloorCeil{
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
        int start=0, end = arr.length-1;
        int floor=0, ceil=0;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == el ){
                floor= ceil = mid;
                break;
            }
            else if(el>arr[mid]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        if(start>end){
            int pos = 0;
            for(int i=0; i<arr.length; i++){
                if(el < arr[i]){
                    pos = i;
                    break;
                }
            }
            floor = pos-1;
            ceil = pos;
        }
        
        System.out.println(arr[floor]+" "+arr[ceil]);
        sc.close();
    }
}*/

//Using Upper Bound method, can find the ceil and the complete opposite i.e. to find the element smaller than the target but at greatest index we can find floor , and if we found the element no matter what the index is we just have to return the same element.
import java.util.*;

public class FloorCeil{
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
        int start=0, end = arr.length-1;
        int floor=-1, ceil=-1;
        //finding ceil first
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == el ){
                ceil = mid;
                break;
            }
            else if(el>arr[mid]){
                start = mid+1;
            }
            else{
                ceil = mid;
                end = mid-1;
            }
        }

        //finding floor
        start = 0; end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == el ){
                floor = mid;
                break;
            }
            else if(el<arr[mid]){
                end = mid-1;
            }
            else{
                floor = mid;
                start = mid+1;
            }
        }
        if(floor == -1 || ceil == -1){
             System.out.println(floor+" "+ceil);
        }
        else{
            System.out.println(arr[floor]+" "+arr[ceil]);
        }
        
        sc.close();
    }
}