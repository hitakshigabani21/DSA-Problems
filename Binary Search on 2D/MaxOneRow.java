import java.util.*;
public class MaxOneRow
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		System.out.println(" Enter the number of columns: ");
		int m = sc.nextInt();
		int matrix[][] = new int[n][m];
		System.out.println("Enter the matrix: ");
		for(int i=0; i< n; i++){
		    for(int j=0; j<m; j++){
		        matrix[i][j] = sc.nextInt();
		    }
		}
		
		System.out.println("The matrix is as follows: ");
		for(int i=0; i< n; i++){
		    for(int j=0; j<m; j++){
		        System.out.print(matrix[i][j]+ " ");
		    }
		    System.out.println();
		}
		int count = 0, max=-1, max_index=-1;
		for(int i=0; i<n; i++){
		    int low = 0, high = matrix[i].length-1;
		    while(low<=high){
		        int mid = (low + high)/2;
		        if(matrix[i][mid] == 1){
		            count = matrix[i].length - mid;
		            high = mid-1;
		        }
		        else{
		            low= mid+1;
		        }
		    }
		    if(count > max){
		        max = count;
		        max_index = i;
		    }
		}
		System.out.println("The row containing maximum 1's is: "+max_index);
		sc.close();
	}
}