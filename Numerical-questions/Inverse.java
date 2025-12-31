import java.util.*;

public class Inverse
{
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
        int count =0, x=n;

        while(x !=0){
            count++;
            x = x/10;
        }
        
        int inv = 0;
		int op = 1;
        while(n !=0){
            int od = n%10;
            if(od> count){
                System.out.println("Invalid Number! Inverse does not exist");
                break;
            }
            else{
                int id = op;
		        int ip = od;
		        inv = inv + id*(int)Math.pow(10, ip-1);
		        n = n/10;
		        op++;
            }
        }
		System.out.println(inv);
        sc.close();
	}
}
