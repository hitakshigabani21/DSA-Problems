import java.util.*;

public class LinearSearch{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the elements you are searching for: ");
        int x = sc.nextInt();
        int flag = 0;

        for(int i=0; i<n; i++){
            if(arr[i] == x){
                flag=1;
                System.out.println("Element found at : "+ (i));
                break;
            }
        }
        if(flag ==0){
            System.out.println("Element not found!");
        }
        sc.close();
    }
}