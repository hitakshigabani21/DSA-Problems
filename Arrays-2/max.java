import java.util.*;

public class max {
    public static void main(String args[]){
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        int max = arr[0];
        for(int i=0; i<n; i++){
            if(max< arr[i]){
                max = arr[i];
            }
        }
        System.out.println("The largest element in the array is : "+ max);
        int max2 = arr[0];

        for(int i=0; i<n ; i++){
            if(max2 < arr[i] && arr[i]!= max){
                max2 = arr[i];
            }
        }
        System.out.println("The second largest element in the array is: "+ max2);
    }
}

//optimal approach: 

/*import java.util.*;

public class Main {
    public static void main(String args[]){
        System.out.println("Enter the number of elements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0], max2 = -1;
        for(int i=0; i<n; i++){
            if(max< arr[i] && max2 < arr[i]){
                max2 = max;
                max = arr[i];
            }
            else if(max2<arr[i] && max>arr[i] ){
                max2 = arr[i];
            }
        }
        System.out.println(max2);
        
    }
}
 */

