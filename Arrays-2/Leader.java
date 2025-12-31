/* My Approach: 
import java.util.*;
class Leader{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result [] = new int[n];
        int i=0, j = i+1, k=0;
        while(i<arr.length && j<arr.length){
            if(arr[i] < arr[j] ){
                //i++; No need to recheck for the next subarray which starts from before j because in that subarray also the first element which is expected to be a leader won't be because in that array at position j there will be an element greater than it so instead we can directly jump to j.
                i=j;
                //j++; This does not ensures that everytime the leder is not found and we need to check for another possible subarray in which i must be at start and j must be right next to it initially, but if we do j++ , j can be at any loc.
                j=i+1;
            }
            else if(arr[i] > arr[j] ){
                if(j == arr.length-1){
                    result[k] = arr[i];
                    k++;
                    i++;
                    j = i+1;
                }
                //earlier wrote j++ without else , did not got correct output, if written outside else, j = i+2 instead of j=i thus, gives wrong ans
                else{
                    j++;
                }
            }
        }
        result[k] = arr[arr.length-1];

        for(int r=0; r<n; r++){
            System.out.print(result[r]+" ");
        }
        sc.close();
    }
}

*/
/*  Optimal approach: My code
import java.util.*;
class Leader{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the numbers: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result [] = new int[n];
        int k=0;
        result[k] = arr[n-1];
        k++;
        int j=n-1, i=j-1;
        while(i>=0){
            if(arr[i] < arr[j]){
                i--;
            }
            else{
                result[k] = arr[i];
                k++;
                j = i;
                i=j-1;
            }
        }
        
        for(int r=0; r<k; r++){
            System.out.print(result[r]+" ");
        }
        sc.close();
    }
}

*/ 
//Another way of optimal approach 

import java.util.*;
class Leader{

    public static ArrayList<Integer> 
                     printLeadersBruteForce(int[] arr, int n){
    
  ArrayList<Integer> ans= new ArrayList<>();
  
   // Last element of an array is always a leader,
   // push into ans array.
   int max = arr[n - 1];

    ans.add(arr[n-1]);
    
    // Start checking from the end whether a number is greater
    // than max no. from right, hence leader.
    for (int i = n - 2; i >= 0; i--)
      if (arr[i] > max) {
        ans.add(arr[i]);
        max = arr[i];
      }

  return ans;
   
}

public static void main(String args[]) 
{
  // Array Initialization.
  int n = 6;
  int arr[]=  {10, 22, 12, 3, 0, 6};


  ArrayList<Integer> ans= printLeadersBruteForce(arr,n);
  
  Collections.sort(ans, Collections.reverseOrder());
  
  for (int i = 0; i < ans.size(); i++) {
    System.out.print(ans.get(i)+" ");
  }

}
}



