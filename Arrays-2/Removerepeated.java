//leetcode - 26
import java.util.*;
class Solve {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int i =1;
        while(i<nums.length){
            if(nums[k] != nums[i]){
                k++;
                nums[k] = nums[i];
            }
            i++;
        }

        // extra
        for(int j=0; j<=k; j++){
            System.out.print(nums[j]+" ");
        }
        System.out.print("\n");
        return k+1;
    }
}

public class Removerepeated {
    public static void main(String args[]){
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Solve s = new Solve();
        int k = s.removeDuplicates(arr);
        System.out.println(k);
    }
}
