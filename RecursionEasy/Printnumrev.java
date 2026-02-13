import java.util.*;

public class Printnumrev {
    public static void printrev(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printrev(n-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        printrev(n);
        sc.close();
    }
}
