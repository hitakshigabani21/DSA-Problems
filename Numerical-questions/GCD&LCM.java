import java.util.*;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
        int onum1 = num1;
        int onum2 = num2;
		int gcd = 0;
		int r=0;
		while(num1 % num2 !=0){
		    r = num1%num2;
		    num1 = num2;
		    num2 = r;
		}
		gcd = num2;
		System.out.println(gcd);
        int lcm = (onum1*onum2)/gcd;
        System.out.println(lcm);
	}
}