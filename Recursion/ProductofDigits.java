import java.util.*;
public class ProductofDigits {
    public static int product(int n){
        // if(n==0){
        //     return 1;
        // }
        if(n%10 == n){
            return n;
        }
        return (n%10) * product(n/10);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int result = product(n);
        System.out.println("Product of digits of " + n + " is: " + result);
    }
}
