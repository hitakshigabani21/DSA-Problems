import java.util.*;

class digitfrequency {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter a digit: ");
        int digit = sc.nextInt();
        int count =0, dig;
        while(n !=0){
            dig = n%10;
            if(dig == digit){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
        sc.close();
    }
}