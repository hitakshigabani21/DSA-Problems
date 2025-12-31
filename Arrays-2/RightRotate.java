import java.util.Scanner;

class Solution {
    //Brute-Force approach: 
    /* 
    public void rotateright(int[] nums, int k) {
        k=k % nums.length;
        int arr[] = new int[k];
        int index = nums.length-1;
        for(int i=arr.length-1; i>=0; i--){
            arr[i] = nums[index];
            index--;
        }
        for(int j=nums.length-k-1; j>=0; j--){
            nums[j+k] = nums[j];
        }
        for(int i=0; i<k; i++){
            nums[i] = arr[i];
        }
    }
    */
    //optimal approach: 
    public void reverse(int [] nums, int start, int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotateright(int[] nums, int k) {
        int n = nums.length;
        k = k%nums.length;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
        
    }
}
public class RightRotate {
    public static void main(String args[]){
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of times you want to rotate the array: ");
        int k = sc.nextInt();
        sc.close();
        Solution s = new Solution();
        s.rotateright(arr, k);
        System.out.println("Array after rotation: ");
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
