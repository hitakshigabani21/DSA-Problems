import java.util.*;
public class BubbleSort {
    static void bubble(int arr[]){
        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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

        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}
