//My approach: Using Linear Search
/* 
import java.util.*;

public class AggressiveCows {
    public static boolean possible(int arr[], int mindistance, int cows){
        int i=0, j=1, count=1;
        while(j < arr.length){
            if(arr[j]- arr[i] >= mindistance){
                count++;
                i = j;
                j++;
            }
            else{
                j++;
            }
        }
        if(count>=cows){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of shops: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter their positions: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of cows: ");
        int k = sc.nextInt();
        int result = -1;
        for(int i=1; i<arr.length; i++){
            int mindistance = arr[i] - arr[0];
            if(possible(arr, mindistance, k)){
                if(result < mindistance){
                    result = mindistance;
                }
            }
        }
        System.out.println(result);
        sc.close(); 1
    }

}
*/

// My approach: Using BS - only thing that is needed is that the positions of the shops must be sorted order
/* 
import java.util.*;

public class AggressiveCows {
    public static boolean possible(int arr[], int mindistance, int cows){
        int i=0, j=1, count=1;
        while(j < arr.length){
            if(arr[j]- arr[i] >= mindistance){
                count++;
                i = j;
                j++;
            }
            else{
                j++;
            }
        }
        if(count>=cows){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of shops: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter their positions: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of cows: ");
        int k = sc.nextInt();
        int low = 0, high = arr.length-1, ans =-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(possible(arr, arr[mid]-arr[0], k)){
                ans = arr[mid]-arr[0];
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(ans);
        sc.close();
    }

}
*/

//Mistakes in my approach is the range: the range of distances that should be checked is from 1 to max-min in the array because that is where the last stall is present ans the farthest a cow can be after cow-1
//Correct Linear Search: 
/* 
import java.util.*;

public class AggressiveCows {
    public static boolean possible(int arr[], int mindistance, int cows){
        int i=0, j=1, count=1;
        while(j < arr.length){
            if(arr[j]- arr[i] >= mindistance){
                count++;
                i = j;
                j++;
            }
            else{
                j++;
            }
        }
        if(count>=cows){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of shops: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter their positions: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of cows: ");
        int k = sc.nextInt();
        //Sort the array:
        Arrays.sort(arr);

        //Find minimum and maximum in the array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int result = -1;
        for(int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        //Start from distance = 1 and find the minimum maximum distance 
        for(int i=1; i<= max-min; i++){
            if(possible(arr, i, k)){
                continue;           // If a distance is possible find the next possible maximum distance 
            }
            else{
                result = i-1;      //If a distance is not possible the since the array is sorted and all the distances further are greater , none of them can be the answer, so the distance just previous to it for which it was possible to place all the cows is the maximum minimum distance, no need to check further
                break;
            }
        }
        System.out.println(result);
        sc.close(); 
    }

}*/


//Using BS correct approach:
import java.util.*;
public class AggressiveCows {
    public static boolean possible(int arr[], int mindistance, int cows){
        int i=0, j=1, count=1;
        while(j < arr.length){
            if(arr[j]- arr[i] >= mindistance){
                count++;
                i = j;
                j++;
            }
            else{
                j++;
            }
        }
        if(count>=cows){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of shops: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter their positions: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of cows: ");
        int k = sc.nextInt();
        //Sort the array:
        Arrays.sort(arr);

        //Find minimum and maximum in the array - No need min = arr[0] and max = arr[n-1] as the array is now sorted
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // int result = -1;
        for(int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        int low = 1, high = arr[n-1]-arr[0];
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(arr, mid, k)){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println(high);   //as high was earlier at not possible side finally it will be the result i.e the last and max possible minimum distance and low will be the first impossible value
        sc.close();
    }

}