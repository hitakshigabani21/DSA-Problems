import java.util.*;
class NumberTriangle {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(m+" ");
                m++;
            }
            System.out.print("\n");
        }
        sc.close();
    }
}