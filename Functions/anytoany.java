import java.util.*;

class anytoany {
    public static int converttodec(int n, int base){
        int rem, count =0, newnum=0;
        while(n!=0){
            rem = n%10;
            newnum = newnum + rem*(int)Math.pow(base, count);
            count++;
            n = n/10;
        }
        return newnum;
    }
    
    public static int converttoany(int n, int base){
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
        System.out.println("Enter the base of the number: ");
        int base = sc.nextInt();
        System.out.println("Enter the base to convert in: ");
        int base2 = sc.nextInt();
        int num = converttodec(n, base);
        int reqnum = converttoany(num, base2);
        System.out.println(reqnum);
        sc.close();
    }
}

//or
/*
import java.util.*;

class Main {
    public static int convert(int n, int base, int base2){
        int rem, count =0, num=0;
        while(n!=0){
            rem = n%10;
            num = num + rem*(int)Math.pow(base, count);
            count++;
            n = n/10;
        }
        rem =0; count =0;
        n = num;
        int reqnum =0;
        while(n!=0){
            rem = n%base2;
            reqnum = reqnum + rem*(int)Math.pow(10, count);
            count++;
            n = n/base2;
        }
        return reqnum;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter the base of the number: ");
        int base = sc.nextInt();
        System.out.println("Enter the base to convert in: ");
        int base2 = sc.nextInt();
        System.out.println(convert(n, base, base2));
    }
}
*/