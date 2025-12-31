//My approach: Using Linear Search
/* 
import java.util.*;
public class PaintersPartition {
    public static boolean possible(int arr[], int painters, int max_time, int B){
        int sum = 0, count=1;
        for(int i=0; i<arr.length; i++){
            if((sum + arr[i])*B <= max_time){      //checking if the max_time is not exceeded, the total time = (total lengths of the board -> board lengths)* (time taken to paint 1 unit-> B) taken to paint all the boards assigned to a painter
                sum += arr[i];
            }
            else{
                count++;
                sum = arr[i];
            }
        }
        if(count <= painters){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of boards: ");
        int n = sc.nextInt();
        System.out.println("Enter the length of the boards: ");
        int C[] = new int [n];
        for(int i=0; i<n; i++){
            C[i] = sc.nextInt();
        }
        System.out.println("Enter the number of painters: ");
        int A = sc.nextInt();
        System.out.println("Enter the time taken to paint 1 unit of board: ");
        int B = sc.nextInt();
        //Range = max(arr)*B to sum(arr)*B, as if the painters were greater than or equal to the number of boards, then the minimum time required will be the (maximum from the array)*B 
        
            // eg- A=10, B=1, C= [1, 8, 11, 3]
            // here since the painters are 10
            // the boards must be allocated like:
            // 1. A painter can be assigned contigous boards
            // 2. The boards cannot be spilted means the same board cannot be assigned to two or more painters
            // So, in the above case, since the painters are more each painter can be assigned a single board, thus the minimum time will be the max(array)*B

         

        //Finding the max(arr) and sum(arr)
        int max =  Integer.MIN_VALUE, sum = 0;
        for(int i=0; i<n; i++){
            max = Math.max(max, C[i]);
            sum += C[i];
        }
        int min_time = -1;
        if(A >= C.length) {
            min_time = max*B;
        }
        else{
            for(int i=max*B; i<=sum*B; i++){
                if(possible(C, A, i, B)){            //Here in the function i will only be passed as in the for loop already multiplied with B
                    min_time = i;                      //Similarly i = (time taken to paint 1 unit of board(B))*length of the board(C[i])
                    break;
                }
            }
        }
        
        System.out.println(min_time);
    }
}
*/ 

import java.util.*;
public class PaintersPartition {
    public static boolean possible(int arr[], int painters, int max_time, int B){
        int sum = 0, count=1;
        for(int i=0; i<arr.length; i++){
            if((sum + arr[i])*B <= max_time){      //checking if the max_time is not exceeded, the total time = (total lengths of the board -> board lengths)* (time taken to paint 1 unit-> B) taken to paint all the boards assigned to a painter
                sum += arr[i];
            }
            else{
                count++;
                sum = arr[i];
            }
        }
        if(count <= painters){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of boards: ");
        int n = sc.nextInt();
        System.out.println("Enter the length of the boards: ");
        int C[] = new int [n];
        for(int i=0; i<n; i++){
            C[i] = sc.nextInt();
        }
        System.out.println("Enter the number of painters: ");
        int A = sc.nextInt();
        System.out.println("Enter the time taken to paint 1 unit of board: ");
        int B = sc.nextInt();
        //Range = max(arr)*B to sum(arr)*B, as if the painters were greater than or equal to the number of boards, then the minimum time required will be the (maximum from the array)*B 
        /*
            eg- A=10, B=1, C= [1, 8, 11, 3]
            here since the painters are 10
            the boards must be allocated like:
            1. A painter can be assigned contigous boards
            2. The boards cannot be spilted means the same board cannot be assigned to two or more painters
            So, in the above case, since the painters are more each painter can be assigned a single board, thus the minimum time will be the max(array)*B

         */

        //Finding the max(arr) and sum(arr)
        int max =  Integer.MIN_VALUE, sum = 0;
        for(int i=0; i<n; i++){
            max = Math.max(max, C[i]);
            sum += C[i];
        }
        // int min_time = -1;
        int low = max*B, high= sum*B;
        while(low<=high){
            int mid =(low+high)/2;
            if(possible(C, A, mid, B)){
                // min_time = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        //System.out.println(min_time);
        //or 
        System.out.println(low);
        sc.close();
    }
}

