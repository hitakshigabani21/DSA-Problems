// assumption num1 i.e arr1 represents greater number
import java.util.*;
public class Diffofnum
{
	public static void main(String[] args) {
		System.out.println("Enter the number of elements in array-1: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int arr1 [] = new int[n1];
		System.out.println("Enter the elements of array-1: ");
		for(int i=0; i<n1; i++){
		    arr1[i] = sc.nextInt();
		}
		System.out.println("Enter the number of elements of array-2: ");
		int n2 = sc.nextInt();
		int arr2 [] = new int[n2];
		System.out.println("Enter the elements of array-2: ");
		for(int i=0; i<n2; i++){
		    arr2[i] = sc.nextInt();
		}
		int sub [] = new int[n1>n2? n1:n2];
		int i = arr1.length-1;
		int j = arr2.length-1;
		int k = sub.length-1;
		int borrow = 0;
		
		while(k>=0){
		    if(borrow != 0){
		        arr1[i] = arr1[i] - borrow;
		        borrow = 0;
		    }
		    if(i>=0 && j>=0){
		        if(arr1[i] < arr2[j]){
		        borrow = 1;
		        arr1[i] = 10 + arr1[i];
		    }
		        sub[k] = arr1[i] - arr2[j];
		    }
		    else if(i<0 && j>=0){
		        sub[k] = (10-borrow)-arr2[j];
		    }
		    else if(i>=0 && j<0){
		        sub[k] = arr1[i] - borrow;
		    }
		    i--;
		    j--;
		    k--;
		}
		for(int val: sub){
		    System.out.println(val);
		}
		sc.close();
	}
}