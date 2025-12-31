import java.util.*;

class anybasetodec {
    public static int convert(int n, int base){
        int rem, count =0, newnum=0;
        while(n!=0){
            rem = n%10;
            newnum = newnum + rem*(int)Math.pow(base, count);
            count++;
            n = n/10;
        }
        return newnum;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the base of the number: ");
        int base = sc.nextInt();
        System.out.println(convert(n,base));
        sc.close();
    }
}


