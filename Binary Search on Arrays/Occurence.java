import java.util.*;
//To find the number of occurences, we can find the first and the last occurence and the difference between their indices will give the count as the array is sorted all the elements which are same will be together
public class Occurence {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element: ");
        int element = sc.nextInt();
        int start=0, end= arr.length-1, count =0, first=-1, last=-1;
        // find the first occurence
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == element){
                first = mid;
                end = mid-1;
            }
            else if(arr[mid]<element){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        
        // finding the last occurence
        start=0; end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid] == element){
                last = mid;
                start = mid+1;
            }
            else if(arr[mid]<element){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        count = (last - first)+1;
        System.out.println(count);
        sc.close();
    }
}
