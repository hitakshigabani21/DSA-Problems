import java.util.*;
public class Span
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
		sc.close();
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
		    if(max < arr[i]){
		        max = arr[i];
		    }
		}
		int min = arr[0];
		for(int i=1; i<n; i++){
		    if(min > arr[i]){
		        min = arr[i];
		    }
		}
		System.out.println("max = "+ max);
		System.out.println("min = "+ min);
		System.out.println("span = "+(max-min));
	}
}