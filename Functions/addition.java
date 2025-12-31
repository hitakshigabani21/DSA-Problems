import java.util.*;

class addition {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("Enter the base: ");
        int base = sc.nextInt();
        sc.close();
        int sum =0, count =0, result =0, carry=0;
        while(n1 !=0 && n2 !=0 || carry!=0){
            int d1 = n1%10;
            int d2 = n2%10;
            sum = d1+d2+carry;
            carry = sum/base;
            int rem = sum % base;
            result = result+ rem*(int)Math.pow(10, count);
            count++;
            n1 = n1/10;
            n2 = n2/10;
        }
        System.out.println(result);
        sc.close();
    }
}