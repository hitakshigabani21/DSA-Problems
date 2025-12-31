import java.util.*;
public class multiplication
{
    public static int add(int n1, int n2, int base){
        int d1=0 ,d2=0, carry =0, sum =0, count=0, result=0;
        while(n1!=0 || n2!=0 || carry !=0){
            d1 = n1%10;
            d2 = n2%10;
            sum = d1+d2+carry;
            carry = sum / base;
            result = result + (sum % base)*(int)Math.pow(10, count);
            count++;
            n1 = n1/10;
            n2 = n2/10;
        }
        return result;
    }
    
    public static int multiply(int n1, int d2, int base){
        int d1=0, mul = 0, carry =0, result =0, count=0;
        while(n1!=0 || carry !=0){
            d1 = n1%10;
            mul = d1*d2 + carry;
            carry = mul / base;
            result = result + (mul % base)*(int)Math.pow(10, count);
            count++;
            n1 = n1/10;
        }
        return result;
    }
    
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Enter the base: ");
		int base = sc.nextInt();
		int result  =0, count =0, res=0;
		while(n2!=0){
		    int d2 = n2%10;
		    res = multiply(n1, d2, base)*(int)Math.pow(10, count);
		    result = add(result,res,base);
		    count++;
		    n2 = n2/10;
		}
		System.out.println(result);
        sc.close();
	}
}