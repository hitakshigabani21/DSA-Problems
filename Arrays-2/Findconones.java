import java.util.*;
class Solution {
    /*public int findMaxConsecutiveOnes(int[] nums) {
        int arr[] = new int [nums.length];
        int count=0,index=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                arr[index] = count;
                count = 0;
                index++;
            }
            else if(nums[i] == 1){
                count++;
            }
            arr[index] = count;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }*/
    // Same thing can be done in a better way without using array:

    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0, max =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                if(max < count){
                    max = count;
                }
                count = 0;
            }
            else{
                count++;
            }
        }
        if(max<count){
            max = count;
        }
        return max;
    }

}
class Findconones {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []nums = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        Solution s = new Solution();
        int num = s.findMaxConsecutiveOnes(nums);
        System.out.println(num);
        sc.close();
    }
}
