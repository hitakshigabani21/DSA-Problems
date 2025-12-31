import java.util.*;
public class bargraph
{
	public static void main(String[] args) {
		System.out.println("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int[n];
		int max=0;
		System.out.println("Enter the elements: ");
		for(int i=0; i<n; i++){
		    arr[i] = sc.nextInt();
		    if(max<arr[i]){
		        max = arr[i];
		    }
		}
		for(int i=max; i>=1; i--){
		    for(int j=0; j<n; j++){
		        if(arr[j]>=i){
		            System.out.print("* ");
		        }
		        else{
		            System.out.print("  ");
		        }
		    }
		    System.out.print("\n");
		}
		sc.close();
	}
}