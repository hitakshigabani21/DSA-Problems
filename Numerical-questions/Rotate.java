import java.util.*;

public class Rotate
{
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("Enter the number of times you want to rotate: ");
		int k = sc.nextInt();
		int dig =0, count =0, x = n;
		while(x!=0){
		    count++;
		    x = x/10;
		}
		while(k>0){
		    dig = n%10;
		    n = n/10;
		    n = n + dig * (int)Math.pow(10, count-1);
		    k --;
		}
		System.out.println(n);
		sc.close();
	}
}
