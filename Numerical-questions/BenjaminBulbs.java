import java.util.*;
public class BenjaminBulbs
{
	public static void main(String[] args) {
		System.out.println("Enter the number of bulbs: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr [] = new int[n];
		//all bulbs are off -> 0
		for(int i=0; i<n; i++){
		    arr[i] = 0;
		}
		
		for(int i=1; i<=n; i++){
		    for(int j=1; j<=n; j++){
		        if(j%i==0){
		            if(arr[j-1]==1){
		                arr[j-1]=0;
		            }
		            else{
		                arr[j-1]=1;
		            }
		        }
		    }
		}
		
		for(int i=0; i<n; i++){
		    if(arr[i]==1){
		        System.out.print((i+1)+" ");
		    }
		}
		sc.close();
	}
}