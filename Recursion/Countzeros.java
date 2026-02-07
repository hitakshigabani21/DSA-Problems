import java.util.*;
public class Countzeros {
    static int count = 0;
    public static void countZero(int n){
        if(n == 0){
            return;
        }

        int rem = n%10;
        if(rem == 0){
            count++;
        }
        countZero(n/10);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        countZero(num);
        System.out.println(count);
    }
}
