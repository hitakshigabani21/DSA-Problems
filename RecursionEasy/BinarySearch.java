import java.util.*;
class BinarySearch {
    public static int search(int low, int high, int key, int arr[]){
        if(low>high){
            return -1;
        }
        int mid = (low+high)/2;
    
        if(arr[mid] == key){
            return mid;
        }
        else if(arr[mid]>key){
            return search(low, mid-1, key, arr);
        }else{
            return search(mid+1, high, key, arr);
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of elements you want to enter: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search for: ");
        int key = sc.nextInt();
        int res= search(0, n, key, arr);
        if(res == -1){
            System.out.println("Element not found ");
        }else{
            System.out.println("Element found at: "+res);
        }
    }
}