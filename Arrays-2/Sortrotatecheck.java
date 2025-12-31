import java.util.*;

class Solution {
    public boolean check(int[] nums) {
        int pos =0, flag=0;
        for(int i=0; i< nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                pos = i+1;
                break;
            }
        }
        int b[] = new int[nums.length];
        int i=0, x = pos;
        while(pos<nums.length){
            b[i] = nums[pos];
            i++;
            pos++;
        }
        int j=0;
        while(j<x){
            b[i] = nums[j];
            i++;
            j++;
        }
        for(int k=0; k<nums.length-1; k++){
            if(b[k]> b[k+1]){
               flag = 1; 
               break;
            }
        }
        if(flag == 1){
            return false;
        }
        else{
            return true;
        }
    }
}
public class Sortrotatecheck {
    public static void main(String args[]){
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Solution s = new Solution();
        boolean result = s.check(arr);
        System.out.println(result);
    }
}
