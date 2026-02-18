//The basic approach: literal meaning of mergesort
import java.util.*;
public class MergeSort2{
    static int[] sort(int arr[]){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;
        int arr1[] = sort(Arrays.copyOfRange(arr, 0, mid));
        int arr2[] = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(arr1, arr2);
    }

    static int[] merge(int first[], int second[]){
        int newArr[] = new int[first.length+second.length];
        int i=0, j=0, k=0;
        while(i< first.length && j < second.length){
            if(first[i] < second[j]){
                newArr[k] = first[i];
                i++;
            }else{
                newArr[k] = second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
            newArr[k] = first[i];
            i++;
            k++;
        }

        while(j<second.length){
            newArr[k] = second[j];
            j++;
            k++;
        }

        return newArr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        arr = sort(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
}