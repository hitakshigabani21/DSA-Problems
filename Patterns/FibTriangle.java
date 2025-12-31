import java.util.*;
class FibTriangle {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0, b=1, sum =0;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                sum = a+b;
                System.out.print(a+" ");
                a = b;
                b = sum;
            }
            System.out.print("\n");
        }
        sc.close();
    }
}