/*import java.util.*;
public class BookAllocation {
    public static  boolean canAllocate(int arr[], int max_pages, int students){
        int sum = 0, count = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum > max_pages){
                count++;
                sum = arr[i];
            }
        } 
        count++;             //This is needed to count the last book, but if we start from the second book and count = 1 then this is not needed
        if(count <= students){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the pages: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of students: ");
        int students = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
            sum+=arr[i];
        }
        int result = -1;
        if(arr.length < students){
            System.out.println(-1);
        }

        for(int i=max; i<=sum; i++){
            if(canAllocate(arr, i, students)){
                result = i;
                break;

            }
        }
        
        System.out.println(result);
    }
}
*/
// Another way of doing the same thing
/* 
import java.util.*;
public class BookAllocation {
    public static  int canAllocate(int arr[], int max_pages){
        int sum = 0, count = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum > max_pages){
                count++;
                sum = arr[i];
            }
        }
        count++;
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the pages: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of students: ");
        int students = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
            sum+=arr[i];
        }
        int result = -1;
        if(arr.length < students){
            System.out.println(result);
        }

        for(int i=max; i<=sum; i++){
            int allocated = canAllocate(arr, i);
            if(allocated <= students){                            //allocated == students is wrong check, Because it is not necessary that every student must be allocated some pages it is just that the maximum number of pages must be minimum and if the students are less than or equal to the students then that can be the answer, but if the student count exceeds then it says the pages are very minimum, the pages must increase.
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
*/
// Using Binary Search: 
import java.util.*;
public class BookAllocation {
    public static  int canAllocate(int arr[], int max_pages){
        int sum = 0, count = 1;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum > max_pages){
                count++;
                sum = arr[i];
            }
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the pages: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of students: ");
        int students = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
            sum+=arr[i];
        }
        int result = -1;
        if(arr.length < students){
            System.out.println(result);
        }

        int low = max, high = sum;
        while(low<=high){
            int mid = (low+high)/2;
            if(canAllocate(arr, mid) <= students){      //There should not be count == students as for some cases it may not give the correct ans, and if the student count<= students present then it can be the answer, we just need minimum so move left
                result = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        System.out.println(result);     //or return low
        sc.close();
    }
}




