import java.util.*;

public class InsertionSort{
    static void sort(int arr[]){
        for(int i=0; i< arr.length-1; i++){
            int j;
            int temp = arr[i+1];
            for(j=i; j>=0; j--){
                if(temp < arr[j]){
                    arr[j+1] = arr[j];
                }else{
                    break;    
                }
            }
            arr[j+1] = temp;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}