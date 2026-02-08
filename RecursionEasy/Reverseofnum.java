import java.util.*;
public class Reverseofnum {
    public static int rev(int n, int m){
        if(m==0 || n%10 == n){
            return n;
        }
        return (n%10)*(int)(Math.pow(10, m))+rev(n/10, m-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int n = num;
        int digits = 0;
        while(n!=0){
            n= n/10;
            digits++;
        }
        
        int rev = rev(num, digits-1);
        System.out.println(rev);
    }
}
