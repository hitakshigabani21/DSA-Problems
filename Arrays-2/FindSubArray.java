// To find the subarray having maxlength which gives the sum k - Using Hashing
// Using the hash array that stores the sum at inedexes
import java.util.*;

class FindSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int hash[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int sum =0, length=0, maxlength =0;
        for(int i=0; i<n; i++){
            sum += arr[i];
            if(sum == target){
                if(maxlength<i+1){
                    maxlength = i+1;
                }
            }
            hash[i] = sum;
            for(int j=0; j<i; j++){
                if(sum - target == hash[j]){
                    length = i-j;
                    break;
                }
            }
            if(maxlength<length){
                maxlength = length;
            }
        }
        System.out.println(maxlength);
        sc.close();
    }
}

// Using the Hash Map that stores indexes at sums position
/*
 
import java.util.*;

public class tUf {
    public static int getLongestSubarray(int []a, long k) {
        int n = a.length; // size of the array.

        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += a[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            long rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}


 */

 /* Optimum approach:  Two pointer method
  * import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int hash[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int sum = arr[0], length =0, maxLength = 0, left=0,right=0;
        while(right<arr.length){
            while(left<=right && sum>target ){
                sum = sum-arr[left];
                left++;
            }
            if(sum == target){
                length = right-left+1;
                if(maxLength < length){
                    maxLength = length;
                }
            }
            right++;
            if(right<arr.length){
                sum+=arr[right];
            }
        }
        System.out.println(maxLength);
    }
}
  */