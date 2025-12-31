import java.util.*;

class decimaltonum {
    public static int convert(int n, int base){
        int rem, count =0, newnum=0;
        while(n!=0){
            rem = n%base;
            newnum = newnum + rem*(int)Math.pow(10, count);
            count++;
            n = n/base;
        }
        return newnum;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the base to convert in: ");
        int base = sc.nextInt();
        System.out.println(convert(n,base));
        sc.close();
    }
}