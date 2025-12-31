import java.util.*;
public class Search
{
	public static void main(String[] args) {
		System.out.println("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int [n];
		System.out.println("Enter the elements: ");
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be searched: ");
		int x = sc.nextInt();
		for(int i=0; i<n; i++){
		    if(x == arr[i]){
		        System.out.println("Element found at: "+i);
		        break;
		    }
		    else if(i==n-1 && x!=arr[i]){
		        System.out.println("Element not found!");
		    }
		}
		sc.close();
	}
}