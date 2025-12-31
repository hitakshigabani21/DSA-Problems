//to find all the prime numbers from 1 to n
import java.util.*;

public class Primes
{
	public static void main(String[] args) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int flag =0;
		for(int i =2; i<=n; i++){
		    for(int j=2; j<i; j++){
		        if(i%j == 0){
		            flag = 1;
		            break;
		        }
		        else{
		            flag = 0;
		        }
		    }
		    if(flag == 0){
		        System.out.println(i);
		    }
		    
		}
		sc.close();
	}
}