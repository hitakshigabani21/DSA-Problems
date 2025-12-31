//Matrix median in a matrix havind sorted rows

import java.util.*;
public class Median {
    public static int upperBound(int []arr, int x){
        int low = 0; int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] > x){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }
    public static int findCount(int [][] arr, int n, int m, int x){
        int totalcount = 0;
        for(int i=0; i<n; i++){
            totalcount += upperBound(arr[i], x);
        }
        return totalcount;
    }

    public static int findMax(int [][] arr, int n, int m){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i][m-1] > max){
                max = arr[i][m-1];
            }
        }
        return max;
    }
    public static int findMin(int [][] arr, int n, int m){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i][0]< min){
                min = arr[i][0];
            }
        }
        return min;
    }
    public static int findMedian(int [][] arr, int n, int m){
        int low = findMin(arr, n, m);
        int high = findMax(arr, n, m);
        while(low<=high){
            int mid = (low + high) / 2;
            int count = findCount(arr, n, m, mid);
            if(count <= (n*m)/2){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }
    public static void main(String args[]){
        System.out.println("Enter the number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int m = sc.nextInt();
        int [][] arr = new int [n][m];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int median = findMedian(arr, n, m);
        System.out.println("The median is: " + median);
    }
}
