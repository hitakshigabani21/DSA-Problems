//To find the subarray having maxlength which gives the sum k
import java.util.*;
public class Subarray {
    public static void main(String args[]){
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the sum: ");
        int sum = sc.nextInt();
        int sum2 = 0;
        int count =0, max =0;
        for(int i=0; i<n; i++){
            sum2 += arr[i];
            count++;
            if(sum2 == sum){
                if(max<=count){
                max = count;
                }
                count = 0;
                sum2 =0;
                i--;
            }
        }
        System.out.println(max);
        sc.close();

    }
}
