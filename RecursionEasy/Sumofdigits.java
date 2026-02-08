import java.util.*;
public class Sumofdigits {
    public static int sumofDigits(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + sumofDigits(n/10);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int result = sumofDigits(n);
        System.out.println("Sum of digits of " + n + " is: " + result);
    }
}
