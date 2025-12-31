import java.util.*;

class  FindMin{
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0]; 
        int min2 = 9999;
        for(int i=0; i<arr.length; i++){
            if(min>arr[i] && min2>arr[i]){
                min2 = min;
                min = arr[i];
            }
            else if(min!=arr[i] && min2>arr[i]){
                min2 = arr[i];
            }
        }
        System.out.println("First minimimum = "+ min+"\nSecond Minimum = "+min2);
        sc.close();
    }
}