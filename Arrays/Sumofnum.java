import java.util.*;

public class Sumofnum
{
	public static void main(String[] args) {
		System.out.println("Enter the number of elements in array-1: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int a1 [] = new int[n1];
		System.out.println("Enter the elements of array-1: ");
		for(int i=0; i<n1; i++){
		    a1[i] = sc.nextInt();
		}
		System.out.println("Enter the number of elements in array-2: ");
		int n2 = sc.nextInt();
		int a2 [] = new int[n2];
		System.out.println("Enter the elements of array-2: ");
		for(int i=0; i<n2; i++){
		    a2[i] = sc.nextInt();
		}
		sc.close();
		
		int sum [] = new int[n1>n2 ? n1 : n2];
		int carry =0;
		int i = a1.length-1;
		int j = a2.length-1;
		int k = sum.length -1;
		int d1 =0;
		
		while(k>=0){
		   d1 = carry;
		   if(i>=0){
		       d1 = d1 + a1[i];
		   }
		   i--;
		   if(j>=0){
		       d1 = d1 + a2[j];
		   }
		   j--;
		   carry = d1 / 10;
		   sum[k] = d1 % 10;
		   k--;
		}
		
		if(carry !=0){
		    System.out.println(carry);
		}
		
		for(int val: sum){
		    System.out.println(val);
		}
		
	}
}