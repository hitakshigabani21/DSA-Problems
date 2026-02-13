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

    public static int countZero2(int n, int count){
        if(n == 0){
            return count;
        }

        if(n%10 == 0){
            return countZero2(n/10, count+1);
        }else{
            return countZero2(n/10, count);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        countZero(num);
        System.out.println(count);

        int result = countZero2(num, 0);
        System.out.println(result);
        sc.close();
    }
}
