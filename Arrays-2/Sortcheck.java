import java.util.*;

public class Sortcheck {
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
        int flag =0;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                flag =1;
                break;
            }
            else{
                flag =0;
            }
        }
        if(flag == 1){
            System.out.println("Not sorted");
        }
        else{
            System.out.println("Sorted");
        }
    }
}

//Another approach:
/*
 import java.util.*;

public class Main {
    public static boolean sortcheck(int []arr){
        for(int i=1; i<arr.length; i++){
            if(arr[i] >= arr[i-1]){
                
            }
            else{
                return false;
            }
        }
        return true;
    }
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
        System.out.println(sortcheck(arr));
    }
}

 */
