import java.util.*;
public class Sum {
    public static int calcSum(int n){
        if(n==0){
            return 0;
        }
        return n+ calcSum(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int result = calcSum(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + result);
        sc.close();
    }
}
