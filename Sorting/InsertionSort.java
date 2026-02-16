import java.util.*;

public class InsertionSort{

    // static void swap(int arr[], int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    // }
    static void sort(int arr[]){
        for(int i=0; i< arr.length-1; i++){
            int temp = arr[i+1];
            for(int j=i; j>=0; j--){
                if(temp < arr[j]){
                    int temp2 = arr[j];
                    arr[j] = temp;
                    temp = temp2;
                }else{
                    break;    //all the elements further on tthe left side need not to be checked
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

        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}