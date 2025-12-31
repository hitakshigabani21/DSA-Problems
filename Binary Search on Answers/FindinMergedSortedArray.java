import java.util.*;
public class FindinMergedSortedArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in nums1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the number of elements in nums2: ");
        int n2 = sc.nextInt();
        int nums1[] = new int[n1];
        int nums2[] = new int[n2];
        System.out.println("Enter the elements of array-1: ");
        for(int i=0; i<n1; i++){
            nums1[i] = sc.nextInt();
        }
        
        System.out.println("Enter the elements of array-2: ");
        for(int i=0; i<n2; i++){
            nums2[i] = sc.nextInt();
        }
        System.out.println("Enter the index: ");
        int index = sc.nextInt();

        int merged[] = new int[n1+n2];
        int j=0, k=0;
        for(int i=0; i<n1+n2; i++){
            if(j==n1){
                merged[i] = nums2[k];
                k++;
            }
            else if(k==n2){
                merged[i] = nums1[j];
                j++;
            }
            else if(nums1[j] < nums2[k]){
                merged[i] = nums1[j];
                j++;
            }
            else{
                merged[i] = nums2[k];
                k++;
            }
        }

        System.out.println(merged[index-1]);
        sc.close();
    }
}
