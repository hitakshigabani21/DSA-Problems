//leetcode
import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
       int index =0,i=0;
       while(i<nums.length){
        if(nums[i]!=0){
            nums[index] = nums[i];
            index++;
        }
        i++;
       }
       while(index<nums.length){
        nums[index] = 0;
        index++;
       }
    }

    // another approach:
    /* 
    public void moveZeroes(int[] nums) {
       int j=-1;
       for(int i=0; i<nums.length; i++){
        if(nums[i] == 0){
            j=i;
            break;
        }
       }

       for(int i=j+1; i<nums.length; i++){
        if(j==-1){
            break;      //no 0's in the array
        }
        if(nums[i]!=0){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            j++;
        }
       }
    }
  */

}

class Move0toend {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("After moving 0's to the end: ");
        Solution s = new Solution();
        s.moveZeroes(nums);
        for(int num: nums){
            System.out.print(num + " ");
        }
        sc.close();
    }
}